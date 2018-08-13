/**
 * ExpressTokenRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.messages.safetypay;

public class ExpressTokenRequest  implements java.io.Serializable {
    private java.lang.String apiKey;

    private java.lang.String requestDateTime;

    private java.lang.String currencyID;

    private java.math.BigDecimal amount;

    private java.lang.String merchantSalesID;

    private api.mws.schema.safetypay.LanguageCodeType language;

    private java.lang.String trackingCode;

    private java.math.BigInteger expirationTime;

    private java.lang.String filterBy;

    private java.lang.String transactionOkURL;

    private java.lang.String transactionErrorURL;

    private java.math.BigInteger transactionExpirationTime;

    private java.lang.String customMerchantName;

    private java.lang.String shopperEmail;

    private java.lang.String localizedCurrencyID;

    private java.math.BigInteger productID;

    private api.mws.schema.safetypay.ShopperFieldType[] shopperInformation;

    private java.lang.String signature;

    public ExpressTokenRequest() {
    }

    public ExpressTokenRequest(
           java.lang.String apiKey,
           java.lang.String requestDateTime,
           java.lang.String currencyID,
           java.math.BigDecimal amount,
           java.lang.String merchantSalesID,
           api.mws.schema.safetypay.LanguageCodeType language,
           java.lang.String trackingCode,
           java.math.BigInteger expirationTime,
           java.lang.String filterBy,
           java.lang.String transactionOkURL,
           java.lang.String transactionErrorURL,
           java.math.BigInteger transactionExpirationTime,
           java.lang.String customMerchantName,
           java.lang.String shopperEmail,
           java.lang.String localizedCurrencyID,
           java.math.BigInteger productID,
           api.mws.schema.safetypay.ShopperFieldType[] shopperInformation,
           java.lang.String signature) {
           this.apiKey = apiKey;
           this.requestDateTime = requestDateTime;
           this.currencyID = currencyID;
           this.amount = amount;
           this.merchantSalesID = merchantSalesID;
           this.language = language;
           this.trackingCode = trackingCode;
           this.expirationTime = expirationTime;
           this.filterBy = filterBy;
           this.transactionOkURL = transactionOkURL;
           this.transactionErrorURL = transactionErrorURL;
           this.transactionExpirationTime = transactionExpirationTime;
           this.customMerchantName = customMerchantName;
           this.shopperEmail = shopperEmail;
           this.localizedCurrencyID = localizedCurrencyID;
           this.productID = productID;
           this.shopperInformation = shopperInformation;
           this.signature = signature;
    }


    /**
     * Gets the apiKey value for this ExpressTokenRequest.
     * 
     * @return apiKey
     */
    public java.lang.String getApiKey() {
        return apiKey;
    }


    /**
     * Sets the apiKey value for this ExpressTokenRequest.
     * 
     * @param apiKey
     */
    public void setApiKey(java.lang.String apiKey) {
        this.apiKey = apiKey;
    }


    /**
     * Gets the requestDateTime value for this ExpressTokenRequest.
     * 
     * @return requestDateTime
     */
    public java.lang.String getRequestDateTime() {
        return requestDateTime;
    }


    /**
     * Sets the requestDateTime value for this ExpressTokenRequest.
     * 
     * @param requestDateTime
     */
    public void setRequestDateTime(java.lang.String requestDateTime) {
        this.requestDateTime = requestDateTime;
    }


    /**
     * Gets the currencyID value for this ExpressTokenRequest.
     * 
     * @return currencyID
     */
    public java.lang.String getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this ExpressTokenRequest.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.lang.String currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the amount value for this ExpressTokenRequest.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ExpressTokenRequest.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the merchantSalesID value for this ExpressTokenRequest.
     * 
     * @return merchantSalesID
     */
    public java.lang.String getMerchantSalesID() {
        return merchantSalesID;
    }


    /**
     * Sets the merchantSalesID value for this ExpressTokenRequest.
     * 
     * @param merchantSalesID
     */
    public void setMerchantSalesID(java.lang.String merchantSalesID) {
        this.merchantSalesID = merchantSalesID;
    }


    /**
     * Gets the language value for this ExpressTokenRequest.
     * 
     * @return language
     */
    public api.mws.schema.safetypay.LanguageCodeType getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this ExpressTokenRequest.
     * 
     * @param language
     */
    public void setLanguage(api.mws.schema.safetypay.LanguageCodeType language) {
        this.language = language;
    }


    /**
     * Gets the trackingCode value for this ExpressTokenRequest.
     * 
     * @return trackingCode
     */
    public java.lang.String getTrackingCode() {
        return trackingCode;
    }


    /**
     * Sets the trackingCode value for this ExpressTokenRequest.
     * 
     * @param trackingCode
     */
    public void setTrackingCode(java.lang.String trackingCode) {
        this.trackingCode = trackingCode;
    }


    /**
     * Gets the expirationTime value for this ExpressTokenRequest.
     * 
     * @return expirationTime
     */
    public java.math.BigInteger getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this ExpressTokenRequest.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(java.math.BigInteger expirationTime) {
        this.expirationTime = expirationTime;
    }


    /**
     * Gets the filterBy value for this ExpressTokenRequest.
     * 
     * @return filterBy
     */
    public java.lang.String getFilterBy() {
        return filterBy;
    }


    /**
     * Sets the filterBy value for this ExpressTokenRequest.
     * 
     * @param filterBy
     */
    public void setFilterBy(java.lang.String filterBy) {
        this.filterBy = filterBy;
    }


    /**
     * Gets the transactionOkURL value for this ExpressTokenRequest.
     * 
     * @return transactionOkURL
     */
    public java.lang.String getTransactionOkURL() {
        return transactionOkURL;
    }


    /**
     * Sets the transactionOkURL value for this ExpressTokenRequest.
     * 
     * @param transactionOkURL
     */
    public void setTransactionOkURL(java.lang.String transactionOkURL) {
        this.transactionOkURL = transactionOkURL;
    }


    /**
     * Gets the transactionErrorURL value for this ExpressTokenRequest.
     * 
     * @return transactionErrorURL
     */
    public java.lang.String getTransactionErrorURL() {
        return transactionErrorURL;
    }


    /**
     * Sets the transactionErrorURL value for this ExpressTokenRequest.
     * 
     * @param transactionErrorURL
     */
    public void setTransactionErrorURL(java.lang.String transactionErrorURL) {
        this.transactionErrorURL = transactionErrorURL;
    }


    /**
     * Gets the transactionExpirationTime value for this ExpressTokenRequest.
     * 
     * @return transactionExpirationTime
     */
    public java.math.BigInteger getTransactionExpirationTime() {
        return transactionExpirationTime;
    }


    /**
     * Sets the transactionExpirationTime value for this ExpressTokenRequest.
     * 
     * @param transactionExpirationTime
     */
    public void setTransactionExpirationTime(java.math.BigInteger transactionExpirationTime) {
        this.transactionExpirationTime = transactionExpirationTime;
    }


    /**
     * Gets the customMerchantName value for this ExpressTokenRequest.
     * 
     * @return customMerchantName
     */
    public java.lang.String getCustomMerchantName() {
        return customMerchantName;
    }


    /**
     * Sets the customMerchantName value for this ExpressTokenRequest.
     * 
     * @param customMerchantName
     */
    public void setCustomMerchantName(java.lang.String customMerchantName) {
        this.customMerchantName = customMerchantName;
    }


    /**
     * Gets the shopperEmail value for this ExpressTokenRequest.
     * 
     * @return shopperEmail
     */
    public java.lang.String getShopperEmail() {
        return shopperEmail;
    }


    /**
     * Sets the shopperEmail value for this ExpressTokenRequest.
     * 
     * @param shopperEmail
     */
    public void setShopperEmail(java.lang.String shopperEmail) {
        this.shopperEmail = shopperEmail;
    }


    /**
     * Gets the localizedCurrencyID value for this ExpressTokenRequest.
     * 
     * @return localizedCurrencyID
     */
    public java.lang.String getLocalizedCurrencyID() {
        return localizedCurrencyID;
    }


    /**
     * Sets the localizedCurrencyID value for this ExpressTokenRequest.
     * 
     * @param localizedCurrencyID
     */
    public void setLocalizedCurrencyID(java.lang.String localizedCurrencyID) {
        this.localizedCurrencyID = localizedCurrencyID;
    }


    /**
     * Gets the productID value for this ExpressTokenRequest.
     * 
     * @return productID
     */
    public java.math.BigInteger getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this ExpressTokenRequest.
     * 
     * @param productID
     */
    public void setProductID(java.math.BigInteger productID) {
        this.productID = productID;
    }


    /**
     * Gets the shopperInformation value for this ExpressTokenRequest.
     * 
     * @return shopperInformation
     */
    public api.mws.schema.safetypay.ShopperFieldType[] getShopperInformation() {
        return shopperInformation;
    }


    /**
     * Sets the shopperInformation value for this ExpressTokenRequest.
     * 
     * @param shopperInformation
     */
    public void setShopperInformation(api.mws.schema.safetypay.ShopperFieldType[] shopperInformation) {
        this.shopperInformation = shopperInformation;
    }


    /**
     * Gets the signature value for this ExpressTokenRequest.
     * 
     * @return signature
     */
    public java.lang.String getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this ExpressTokenRequest.
     * 
     * @param signature
     */
    public void setSignature(java.lang.String signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpressTokenRequest)) return false;
        ExpressTokenRequest other = (ExpressTokenRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apiKey==null && other.getApiKey()==null) || 
             (this.apiKey!=null &&
              this.apiKey.equals(other.getApiKey()))) &&
            ((this.requestDateTime==null && other.getRequestDateTime()==null) || 
             (this.requestDateTime!=null &&
              this.requestDateTime.equals(other.getRequestDateTime()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.merchantSalesID==null && other.getMerchantSalesID()==null) || 
             (this.merchantSalesID!=null &&
              this.merchantSalesID.equals(other.getMerchantSalesID()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.trackingCode==null && other.getTrackingCode()==null) || 
             (this.trackingCode!=null &&
              this.trackingCode.equals(other.getTrackingCode()))) &&
            ((this.expirationTime==null && other.getExpirationTime()==null) || 
             (this.expirationTime!=null &&
              this.expirationTime.equals(other.getExpirationTime()))) &&
            ((this.filterBy==null && other.getFilterBy()==null) || 
             (this.filterBy!=null &&
              this.filterBy.equals(other.getFilterBy()))) &&
            ((this.transactionOkURL==null && other.getTransactionOkURL()==null) || 
             (this.transactionOkURL!=null &&
              this.transactionOkURL.equals(other.getTransactionOkURL()))) &&
            ((this.transactionErrorURL==null && other.getTransactionErrorURL()==null) || 
             (this.transactionErrorURL!=null &&
              this.transactionErrorURL.equals(other.getTransactionErrorURL()))) &&
            ((this.transactionExpirationTime==null && other.getTransactionExpirationTime()==null) || 
             (this.transactionExpirationTime!=null &&
              this.transactionExpirationTime.equals(other.getTransactionExpirationTime()))) &&
            ((this.customMerchantName==null && other.getCustomMerchantName()==null) || 
             (this.customMerchantName!=null &&
              this.customMerchantName.equals(other.getCustomMerchantName()))) &&
            ((this.shopperEmail==null && other.getShopperEmail()==null) || 
             (this.shopperEmail!=null &&
              this.shopperEmail.equals(other.getShopperEmail()))) &&
            ((this.localizedCurrencyID==null && other.getLocalizedCurrencyID()==null) || 
             (this.localizedCurrencyID!=null &&
              this.localizedCurrencyID.equals(other.getLocalizedCurrencyID()))) &&
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.shopperInformation==null && other.getShopperInformation()==null) || 
             (this.shopperInformation!=null &&
              java.util.Arrays.equals(this.shopperInformation, other.getShopperInformation()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getApiKey() != null) {
            _hashCode += getApiKey().hashCode();
        }
        if (getRequestDateTime() != null) {
            _hashCode += getRequestDateTime().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getMerchantSalesID() != null) {
            _hashCode += getMerchantSalesID().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getTrackingCode() != null) {
            _hashCode += getTrackingCode().hashCode();
        }
        if (getExpirationTime() != null) {
            _hashCode += getExpirationTime().hashCode();
        }
        if (getFilterBy() != null) {
            _hashCode += getFilterBy().hashCode();
        }
        if (getTransactionOkURL() != null) {
            _hashCode += getTransactionOkURL().hashCode();
        }
        if (getTransactionErrorURL() != null) {
            _hashCode += getTransactionErrorURL().hashCode();
        }
        if (getTransactionExpirationTime() != null) {
            _hashCode += getTransactionExpirationTime().hashCode();
        }
        if (getCustomMerchantName() != null) {
            _hashCode += getCustomMerchantName().hashCode();
        }
        if (getShopperEmail() != null) {
            _hashCode += getShopperEmail().hashCode();
        }
        if (getLocalizedCurrencyID() != null) {
            _hashCode += getLocalizedCurrencyID().hashCode();
        }
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getShopperInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShopperInformation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShopperInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpressTokenRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">ExpressTokenRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ApiKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "RequestDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantSalesID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "MerchantSalesID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "LanguageCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "TrackingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ExpirationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "FilterBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionOkURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "TransactionOkURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionErrorURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "TransactionErrorURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionExpirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "TransactionExpirationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customMerchantName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "CustomMerchantName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ShopperEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizedCurrencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "LocalizedCurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ShopperInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShopperFieldType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ShopperFieldType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "Signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
