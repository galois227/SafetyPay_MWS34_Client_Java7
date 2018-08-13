/**
 * CustomTransactionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.messages.safetypay;

public class CustomTransactionRequest  implements java.io.Serializable {
    private java.lang.String apiKey;

    private java.lang.String requestDateTime;

    private java.lang.String transactionIdentifier;

    private java.lang.String countryID;

    private java.lang.String currencyID;

    private java.math.BigDecimal amount;

    private java.lang.String[] shopperCurrencies;

    private java.lang.String merchantSalesID;

    private api.mws.schema.safetypay.LanguageCodeType language;

    private java.lang.String trackingCode;

    private java.math.BigInteger expirationTime;

    private java.lang.String customMerchantName;

    private java.lang.String transactionOkURL;

    private java.lang.String transactionErrorURL;

    private java.lang.String shopperEmail;

    private java.lang.String signature;

    public CustomTransactionRequest() {
    }

    public CustomTransactionRequest(
           java.lang.String apiKey,
           java.lang.String requestDateTime,
           java.lang.String transactionIdentifier,
           java.lang.String countryID,
           java.lang.String currencyID,
           java.math.BigDecimal amount,
           java.lang.String[] shopperCurrencies,
           java.lang.String merchantSalesID,
           api.mws.schema.safetypay.LanguageCodeType language,
           java.lang.String trackingCode,
           java.math.BigInteger expirationTime,
           java.lang.String customMerchantName,
           java.lang.String transactionOkURL,
           java.lang.String transactionErrorURL,
           java.lang.String shopperEmail,
           java.lang.String signature) {
           this.apiKey = apiKey;
           this.requestDateTime = requestDateTime;
           this.transactionIdentifier = transactionIdentifier;
           this.countryID = countryID;
           this.currencyID = currencyID;
           this.amount = amount;
           this.shopperCurrencies = shopperCurrencies;
           this.merchantSalesID = merchantSalesID;
           this.language = language;
           this.trackingCode = trackingCode;
           this.expirationTime = expirationTime;
           this.customMerchantName = customMerchantName;
           this.transactionOkURL = transactionOkURL;
           this.transactionErrorURL = transactionErrorURL;
           this.shopperEmail = shopperEmail;
           this.signature = signature;
    }


    /**
     * Gets the apiKey value for this CustomTransactionRequest.
     * 
     * @return apiKey
     */
    public java.lang.String getApiKey() {
        return apiKey;
    }


    /**
     * Sets the apiKey value for this CustomTransactionRequest.
     * 
     * @param apiKey
     */
    public void setApiKey(java.lang.String apiKey) {
        this.apiKey = apiKey;
    }


    /**
     * Gets the requestDateTime value for this CustomTransactionRequest.
     * 
     * @return requestDateTime
     */
    public java.lang.String getRequestDateTime() {
        return requestDateTime;
    }


    /**
     * Sets the requestDateTime value for this CustomTransactionRequest.
     * 
     * @param requestDateTime
     */
    public void setRequestDateTime(java.lang.String requestDateTime) {
        this.requestDateTime = requestDateTime;
    }


    /**
     * Gets the transactionIdentifier value for this CustomTransactionRequest.
     * 
     * @return transactionIdentifier
     */
    public java.lang.String getTransactionIdentifier() {
        return transactionIdentifier;
    }


    /**
     * Sets the transactionIdentifier value for this CustomTransactionRequest.
     * 
     * @param transactionIdentifier
     */
    public void setTransactionIdentifier(java.lang.String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }


    /**
     * Gets the countryID value for this CustomTransactionRequest.
     * 
     * @return countryID
     */
    public java.lang.String getCountryID() {
        return countryID;
    }


    /**
     * Sets the countryID value for this CustomTransactionRequest.
     * 
     * @param countryID
     */
    public void setCountryID(java.lang.String countryID) {
        this.countryID = countryID;
    }


    /**
     * Gets the currencyID value for this CustomTransactionRequest.
     * 
     * @return currencyID
     */
    public java.lang.String getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this CustomTransactionRequest.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.lang.String currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the amount value for this CustomTransactionRequest.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CustomTransactionRequest.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the shopperCurrencies value for this CustomTransactionRequest.
     * 
     * @return shopperCurrencies
     */
    public java.lang.String[] getShopperCurrencies() {
        return shopperCurrencies;
    }


    /**
     * Sets the shopperCurrencies value for this CustomTransactionRequest.
     * 
     * @param shopperCurrencies
     */
    public void setShopperCurrencies(java.lang.String[] shopperCurrencies) {
        this.shopperCurrencies = shopperCurrencies;
    }


    /**
     * Gets the merchantSalesID value for this CustomTransactionRequest.
     * 
     * @return merchantSalesID
     */
    public java.lang.String getMerchantSalesID() {
        return merchantSalesID;
    }


    /**
     * Sets the merchantSalesID value for this CustomTransactionRequest.
     * 
     * @param merchantSalesID
     */
    public void setMerchantSalesID(java.lang.String merchantSalesID) {
        this.merchantSalesID = merchantSalesID;
    }


    /**
     * Gets the language value for this CustomTransactionRequest.
     * 
     * @return language
     */
    public api.mws.schema.safetypay.LanguageCodeType getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this CustomTransactionRequest.
     * 
     * @param language
     */
    public void setLanguage(api.mws.schema.safetypay.LanguageCodeType language) {
        this.language = language;
    }


    /**
     * Gets the trackingCode value for this CustomTransactionRequest.
     * 
     * @return trackingCode
     */
    public java.lang.String getTrackingCode() {
        return trackingCode;
    }


    /**
     * Sets the trackingCode value for this CustomTransactionRequest.
     * 
     * @param trackingCode
     */
    public void setTrackingCode(java.lang.String trackingCode) {
        this.trackingCode = trackingCode;
    }


    /**
     * Gets the expirationTime value for this CustomTransactionRequest.
     * 
     * @return expirationTime
     */
    public java.math.BigInteger getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this CustomTransactionRequest.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(java.math.BigInteger expirationTime) {
        this.expirationTime = expirationTime;
    }


    /**
     * Gets the customMerchantName value for this CustomTransactionRequest.
     * 
     * @return customMerchantName
     */
    public java.lang.String getCustomMerchantName() {
        return customMerchantName;
    }


    /**
     * Sets the customMerchantName value for this CustomTransactionRequest.
     * 
     * @param customMerchantName
     */
    public void setCustomMerchantName(java.lang.String customMerchantName) {
        this.customMerchantName = customMerchantName;
    }


    /**
     * Gets the transactionOkURL value for this CustomTransactionRequest.
     * 
     * @return transactionOkURL
     */
    public java.lang.String getTransactionOkURL() {
        return transactionOkURL;
    }


    /**
     * Sets the transactionOkURL value for this CustomTransactionRequest.
     * 
     * @param transactionOkURL
     */
    public void setTransactionOkURL(java.lang.String transactionOkURL) {
        this.transactionOkURL = transactionOkURL;
    }


    /**
     * Gets the transactionErrorURL value for this CustomTransactionRequest.
     * 
     * @return transactionErrorURL
     */
    public java.lang.String getTransactionErrorURL() {
        return transactionErrorURL;
    }


    /**
     * Sets the transactionErrorURL value for this CustomTransactionRequest.
     * 
     * @param transactionErrorURL
     */
    public void setTransactionErrorURL(java.lang.String transactionErrorURL) {
        this.transactionErrorURL = transactionErrorURL;
    }


    /**
     * Gets the shopperEmail value for this CustomTransactionRequest.
     * 
     * @return shopperEmail
     */
    public java.lang.String getShopperEmail() {
        return shopperEmail;
    }


    /**
     * Sets the shopperEmail value for this CustomTransactionRequest.
     * 
     * @param shopperEmail
     */
    public void setShopperEmail(java.lang.String shopperEmail) {
        this.shopperEmail = shopperEmail;
    }


    /**
     * Gets the signature value for this CustomTransactionRequest.
     * 
     * @return signature
     */
    public java.lang.String getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this CustomTransactionRequest.
     * 
     * @param signature
     */
    public void setSignature(java.lang.String signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomTransactionRequest)) return false;
        CustomTransactionRequest other = (CustomTransactionRequest) obj;
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
            ((this.transactionIdentifier==null && other.getTransactionIdentifier()==null) || 
             (this.transactionIdentifier!=null &&
              this.transactionIdentifier.equals(other.getTransactionIdentifier()))) &&
            ((this.countryID==null && other.getCountryID()==null) || 
             (this.countryID!=null &&
              this.countryID.equals(other.getCountryID()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.shopperCurrencies==null && other.getShopperCurrencies()==null) || 
             (this.shopperCurrencies!=null &&
              java.util.Arrays.equals(this.shopperCurrencies, other.getShopperCurrencies()))) &&
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
            ((this.customMerchantName==null && other.getCustomMerchantName()==null) || 
             (this.customMerchantName!=null &&
              this.customMerchantName.equals(other.getCustomMerchantName()))) &&
            ((this.transactionOkURL==null && other.getTransactionOkURL()==null) || 
             (this.transactionOkURL!=null &&
              this.transactionOkURL.equals(other.getTransactionOkURL()))) &&
            ((this.transactionErrorURL==null && other.getTransactionErrorURL()==null) || 
             (this.transactionErrorURL!=null &&
              this.transactionErrorURL.equals(other.getTransactionErrorURL()))) &&
            ((this.shopperEmail==null && other.getShopperEmail()==null) || 
             (this.shopperEmail!=null &&
              this.shopperEmail.equals(other.getShopperEmail()))) &&
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
        if (getTransactionIdentifier() != null) {
            _hashCode += getTransactionIdentifier().hashCode();
        }
        if (getCountryID() != null) {
            _hashCode += getCountryID().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getShopperCurrencies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShopperCurrencies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShopperCurrencies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getCustomMerchantName() != null) {
            _hashCode += getCustomMerchantName().hashCode();
        }
        if (getTransactionOkURL() != null) {
            _hashCode += getTransactionOkURL().hashCode();
        }
        if (getTransactionErrorURL() != null) {
            _hashCode += getTransactionErrorURL().hashCode();
        }
        if (getShopperEmail() != null) {
            _hashCode += getShopperEmail().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomTransactionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">CustomTransactionRequest"));
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
        elemField.setFieldName("transactionIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "TransactionIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "CountryID"));
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
        elemField.setFieldName("shopperCurrencies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ShopperCurrencies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShopperCurrencyID"));
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
        elemField.setFieldName("customMerchantName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "CustomMerchantName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionOkURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "TransactionOkURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionErrorURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "TransactionErrorURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
