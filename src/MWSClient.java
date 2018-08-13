import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;

import api.mws.contract.safetypay.MerchantExpressApiOperations;
import api.mws.contract.safetypay.MerchantExpressApiOperationsProxy;
import api.mws.messages.safetypay.ExpressTokenRequest;
import api.mws.messages.safetypay.ExpressTokenResponse;


public class MWSClient {
	public static void main(String[] args)  
    {  
		
        String ApiKey = "";
		String RequestDateTime = "2018-01-25T19:49:57";
		String SignatureKey = "";
		String CurrencyID = "PEN";
		Double Ammoun = 12.8;
		String MerchantSalesID = "TEST";
		String TrakingCode = "";
		int ExpirationTime = 120;
		String FilterBy = "";
		String TransactionOkURL = "#";
		String TransacErrorURL = "#";
		int TransactionExpirationTime = 120;
		String CustomMerchantName = "M_TEST";
		String ShopperEmail = "gflores@safetypay.com";
		String LocalizedCurrencyID = "PEN";
		int ProductID = 1;
		
		
		// creates empty builder, capacity 16
		StringBuilder sb = new StringBuilder();
		sb.append(RequestDateTime);
		sb.append(CurrencyID);
		sb.append(Ammoun);
		sb.append(MerchantSalesID);
		sb.append(api.mws.schema.safetypay.LanguageCodeType.ES);
		sb.append(TrakingCode);
		sb.append(ExpirationTime);
		sb.append(TransactionOkURL);
		sb.append(TransactionOkURL);
		sb.append(SignatureKey);
		
		api.mws.schema.safetypay.ShopperFieldType[] shopperInformation = new api.mws.schema.safetypay.ShopperFieldType[5]; 
		api.mws.schema.safetypay.ShopperFieldType shopperFieldType = new api.mws.schema.safetypay.ShopperFieldType();
		shopperFieldType.setKey("Email");
		shopperFieldType.setValue("gflores@safetypay.com");
		shopperInformation[0] = shopperFieldType;
		shopperFieldType = new api.mws.schema.safetypay.ShopperFieldType();
		shopperFieldType.setKey("FirstName");
		shopperFieldType.setValue("Galois");
		shopperInformation[1] = shopperFieldType;
		shopperFieldType = new api.mws.schema.safetypay.ShopperFieldType();
		shopperFieldType.setKey("LastName");
		shopperFieldType.setValue("Flores");
		shopperInformation[2] = shopperFieldType;
		shopperFieldType = new api.mws.schema.safetypay.ShopperFieldType();
		shopperFieldType.setKey("Skype");
		shopperFieldType.setValue("gflores_safetypay");
		shopperInformation[3] = shopperFieldType;
		shopperFieldType = new api.mws.schema.safetypay.ShopperFieldType();
		shopperFieldType.setKey("Address");
		shopperFieldType.setValue("Ate");
		shopperInformation[4] = shopperFieldType;
		
		//Parametros para Request
		ExpressTokenRequest expRequest = new ExpressTokenRequest();
		 expRequest.setApiKey(ApiKey);
		 expRequest.setRequestDateTime(RequestDateTime);	
		 expRequest.setCurrencyID(CurrencyID);
		 expRequest.setAmount(BigDecimal.valueOf(Ammoun));
		 expRequest.setMerchantSalesID(MerchantSalesID);
		 expRequest.setLanguage(api.mws.schema.safetypay.LanguageCodeType.ES);
		 expRequest.setTrackingCode(TrakingCode);
		 expRequest.setExpirationTime(BigInteger.valueOf(ExpirationTime));
		 expRequest.setFilterBy(FilterBy);
		 expRequest.setTransactionOkURL(TransactionOkURL);
		 expRequest.setTransactionErrorURL(TransactionOkURL);
		 expRequest.setTransactionExpirationTime(BigInteger.valueOf(TransactionExpirationTime));
		 expRequest.setCustomMerchantName(CustomMerchantName);
		 expRequest.setProductID(BigInteger.valueOf(ProductID));
		 expRequest.setLocalizedCurrencyID(CurrencyID);
		 expRequest.setSignature(sha256(sb.toString()));
		 expRequest.setShopperInformation(shopperInformation);
						
		try {
			
			System.setProperty("https.protocols", "TLSv1.0,TLSv1.1,TLSv1.2");
			  
			MerchantExpressApiOperations mwsClient = new MerchantExpressApiOperationsProxy("https://sandbox-mws2.safetypay.com/express/ws/v.3.0/");
			  
			//System.out.println(mwsClient);
			  			  
			ExpressTokenResponse expressTokenResponse = mwsClient.createExpressToken(expRequest);
			System.out.println(expressTokenResponse);
			if(expressTokenResponse.getErrorManager().getErrorNumber().toString().equals("0")) {
				System.out.println("Success");
			}
			
			System.out.println("End execution");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
    }
	
	public static String sha256(String base) {
	    try{
	        MessageDigest digest = MessageDigest.getInstance("SHA-256");
	        byte[] hash = digest.digest(base.getBytes("UTF-8"));
	        StringBuffer hexString = new StringBuffer();

	        for (int i = 0; i < hash.length; i++) {
	            String hex = Integer.toHexString(0xff & hash[i]);
	            if(hex.length() == 1) hexString.append('0');
	            hexString.append(hex);
	        }

	        return hexString.toString();
	    } catch(Exception ex){
	       throw new RuntimeException(ex);
	    }
	}
}
