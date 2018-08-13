package api.mws.contract.safetypay;

public class MerchantExpressApiOperationsProxy implements api.mws.contract.safetypay.MerchantExpressApiOperations {
  private String _endpoint = null;
  private api.mws.contract.safetypay.MerchantExpressApiOperations merchantExpressApiOperations = null;
  
  public MerchantExpressApiOperationsProxy() {
    _initMerchantExpressApiOperationsProxy();
  }
  
  public MerchantExpressApiOperationsProxy(String endpoint) {
    _endpoint = endpoint;
    _initMerchantExpressApiOperationsProxy();
  }
  
  private void _initMerchantExpressApiOperationsProxy() {
    try {
      merchantExpressApiOperations = (new api.mws.contract.safetypay.SafetypayInterfaceServiceLocator()).getMerchantExpressApiPort();
      if (merchantExpressApiOperations != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)merchantExpressApiOperations)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)merchantExpressApiOperations)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (merchantExpressApiOperations != null)
      ((javax.xml.rpc.Stub)merchantExpressApiOperations)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public api.mws.contract.safetypay.MerchantExpressApiOperations getMerchantExpressApiOperations() {
    if (merchantExpressApiOperations == null)
      _initMerchantExpressApiOperationsProxy();
    return merchantExpressApiOperations;
  }
  
  public api.mws.messages.safetypay.TestResponse communicationTest(api.mws.messages.safetypay.TestRequest request) throws java.rmi.RemoteException{
    if (merchantExpressApiOperations == null)
      _initMerchantExpressApiOperationsProxy();
    return merchantExpressApiOperations.communicationTest(request);
  }
  
  public api.mws.messages.safetypay.ShippedOrderResponse confirmShippedOrders(api.mws.messages.safetypay.ShippedOrderRequest request) throws java.rmi.RemoteException{
    if (merchantExpressApiOperations == null)
      _initMerchantExpressApiOperationsProxy();
    return merchantExpressApiOperations.confirmShippedOrders(request);
  }
  
  public api.mws.messages.safetypay.ExpressTokenResponse createExpressToken(api.mws.messages.safetypay.ExpressTokenRequest request) throws java.rmi.RemoteException{
    if (merchantExpressApiOperations == null)
      _initMerchantExpressApiOperationsProxy();
    return merchantExpressApiOperations.createExpressToken(request);
  }
  
  public api.mws.messages.safetypay.ExpressTokenReverseResponse createExpressTokenReverse(api.mws.messages.safetypay.ExpressTokenReverseRequest request) throws java.rmi.RemoteException{
    if (merchantExpressApiOperations == null)
      _initMerchantExpressApiOperationsProxy();
    return merchantExpressApiOperations.createExpressTokenReverse(request);
  }
  
  public api.mws.messages.safetypay.RefundProcessResponse createRefund(api.mws.messages.safetypay.RefundProcessRequest request) throws java.rmi.RemoteException{
    if (merchantExpressApiOperations == null)
      _initMerchantExpressApiOperationsProxy();
    return merchantExpressApiOperations.createRefund(request);
  }
  
  public api.mws.messages.safetypay.RefundProcessResponse createGenericRefund(api.mws.messages.safetypay.GenericRefundProcessRequest request) throws java.rmi.RemoteException{
    if (merchantExpressApiOperations == null)
      _initMerchantExpressApiOperationsProxy();
    return merchantExpressApiOperations.createGenericRefund(request);
  }
  
  public api.mws.messages.safetypay.OperationResponse getNewOperationActivity(api.mws.messages.safetypay.OperationActivityRequest request) throws java.rmi.RemoteException{
    if (merchantExpressApiOperations == null)
      _initMerchantExpressApiOperationsProxy();
    return merchantExpressApiOperations.getNewOperationActivity(request);
  }
  
  public api.mws.messages.safetypay.OperationActivityNotifiedResponse confirmNewOperationActivity(api.mws.messages.safetypay.OperationActivityNotifiedRequest request) throws java.rmi.RemoteException{
    if (merchantExpressApiOperations == null)
      _initMerchantExpressApiOperationsProxy();
    return merchantExpressApiOperations.confirmNewOperationActivity(request);
  }
  
  public api.mws.messages.safetypay.OperationResponse getOperation(api.mws.messages.safetypay.OperationRequest request) throws java.rmi.RemoteException{
    if (merchantExpressApiOperations == null)
      _initMerchantExpressApiOperationsProxy();
    return merchantExpressApiOperations.getOperation(request);
  }
  
  public api.mws.messages.safetypay.CustomTransactionResponse createCustomTransaction(api.mws.messages.safetypay.CustomTransactionRequest request) throws java.rmi.RemoteException{
    if (merchantExpressApiOperations == null)
      _initMerchantExpressApiOperationsProxy();
    return merchantExpressApiOperations.createCustomTransaction(request);
  }
  
  public api.mws.messages.safetypay.TransactionSpecIdentifierResponse voidTransaction(api.mws.messages.safetypay.TransactionSpecIdentifierRequest request) throws java.rmi.RemoteException{
    if (merchantExpressApiOperations == null)
      _initMerchantExpressApiOperationsProxy();
    return merchantExpressApiOperations.voidTransaction(request);
  }
  
  
}