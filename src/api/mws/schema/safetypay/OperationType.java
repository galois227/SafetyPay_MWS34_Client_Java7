/**
 * OperationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.schema.safetypay;

public class OperationType  implements java.io.Serializable {
    private java.lang.String creationDateTime;

    private java.lang.String operationID;

    private java.lang.String merchantSalesID;

    private java.lang.String merchantOrderID;

    private java.math.BigDecimal amount;

    private java.lang.String currencyID;

    private java.math.BigDecimal shopperAmount;

    private java.lang.String shopperCurrencyID;

    /* AuthorizationCode + ExpiredDateCode + Random */
    private java.lang.String authorizationCode;

    private api.mws.schema.safetypay.OperationActivityType[] operationActivities;

    private java.lang.String paymentReferenceNo;

    private api.mws.schema.safetypay.OperationRefundType[] refundsRelated;

    public OperationType() {
    }

    public OperationType(
           java.lang.String creationDateTime,
           java.lang.String operationID,
           java.lang.String merchantSalesID,
           java.lang.String merchantOrderID,
           java.math.BigDecimal amount,
           java.lang.String currencyID,
           java.math.BigDecimal shopperAmount,
           java.lang.String shopperCurrencyID,
           java.lang.String authorizationCode,
           api.mws.schema.safetypay.OperationActivityType[] operationActivities,
           java.lang.String paymentReferenceNo,
           api.mws.schema.safetypay.OperationRefundType[] refundsRelated) {
           this.creationDateTime = creationDateTime;
           this.operationID = operationID;
           this.merchantSalesID = merchantSalesID;
           this.merchantOrderID = merchantOrderID;
           this.amount = amount;
           this.currencyID = currencyID;
           this.shopperAmount = shopperAmount;
           this.shopperCurrencyID = shopperCurrencyID;
           this.authorizationCode = authorizationCode;
           this.operationActivities = operationActivities;
           this.paymentReferenceNo = paymentReferenceNo;
           this.refundsRelated = refundsRelated;
    }


    /**
     * Gets the creationDateTime value for this OperationType.
     * 
     * @return creationDateTime
     */
    public java.lang.String getCreationDateTime() {
        return creationDateTime;
    }


    /**
     * Sets the creationDateTime value for this OperationType.
     * 
     * @param creationDateTime
     */
    public void setCreationDateTime(java.lang.String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }


    /**
     * Gets the operationID value for this OperationType.
     * 
     * @return operationID
     */
    public java.lang.String getOperationID() {
        return operationID;
    }


    /**
     * Sets the operationID value for this OperationType.
     * 
     * @param operationID
     */
    public void setOperationID(java.lang.String operationID) {
        this.operationID = operationID;
    }


    /**
     * Gets the merchantSalesID value for this OperationType.
     * 
     * @return merchantSalesID
     */
    public java.lang.String getMerchantSalesID() {
        return merchantSalesID;
    }


    /**
     * Sets the merchantSalesID value for this OperationType.
     * 
     * @param merchantSalesID
     */
    public void setMerchantSalesID(java.lang.String merchantSalesID) {
        this.merchantSalesID = merchantSalesID;
    }


    /**
     * Gets the merchantOrderID value for this OperationType.
     * 
     * @return merchantOrderID
     */
    public java.lang.String getMerchantOrderID() {
        return merchantOrderID;
    }


    /**
     * Sets the merchantOrderID value for this OperationType.
     * 
     * @param merchantOrderID
     */
    public void setMerchantOrderID(java.lang.String merchantOrderID) {
        this.merchantOrderID = merchantOrderID;
    }


    /**
     * Gets the amount value for this OperationType.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this OperationType.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the currencyID value for this OperationType.
     * 
     * @return currencyID
     */
    public java.lang.String getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this OperationType.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.lang.String currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the shopperAmount value for this OperationType.
     * 
     * @return shopperAmount
     */
    public java.math.BigDecimal getShopperAmount() {
        return shopperAmount;
    }


    /**
     * Sets the shopperAmount value for this OperationType.
     * 
     * @param shopperAmount
     */
    public void setShopperAmount(java.math.BigDecimal shopperAmount) {
        this.shopperAmount = shopperAmount;
    }


    /**
     * Gets the shopperCurrencyID value for this OperationType.
     * 
     * @return shopperCurrencyID
     */
    public java.lang.String getShopperCurrencyID() {
        return shopperCurrencyID;
    }


    /**
     * Sets the shopperCurrencyID value for this OperationType.
     * 
     * @param shopperCurrencyID
     */
    public void setShopperCurrencyID(java.lang.String shopperCurrencyID) {
        this.shopperCurrencyID = shopperCurrencyID;
    }


    /**
     * Gets the authorizationCode value for this OperationType.
     * 
     * @return authorizationCode   * AuthorizationCode + ExpiredDateCode + Random
     */
    public java.lang.String getAuthorizationCode() {
        return authorizationCode;
    }


    /**
     * Sets the authorizationCode value for this OperationType.
     * 
     * @param authorizationCode   * AuthorizationCode + ExpiredDateCode + Random
     */
    public void setAuthorizationCode(java.lang.String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }


    /**
     * Gets the operationActivities value for this OperationType.
     * 
     * @return operationActivities
     */
    public api.mws.schema.safetypay.OperationActivityType[] getOperationActivities() {
        return operationActivities;
    }


    /**
     * Sets the operationActivities value for this OperationType.
     * 
     * @param operationActivities
     */
    public void setOperationActivities(api.mws.schema.safetypay.OperationActivityType[] operationActivities) {
        this.operationActivities = operationActivities;
    }


    /**
     * Gets the paymentReferenceNo value for this OperationType.
     * 
     * @return paymentReferenceNo
     */
    public java.lang.String getPaymentReferenceNo() {
        return paymentReferenceNo;
    }


    /**
     * Sets the paymentReferenceNo value for this OperationType.
     * 
     * @param paymentReferenceNo
     */
    public void setPaymentReferenceNo(java.lang.String paymentReferenceNo) {
        this.paymentReferenceNo = paymentReferenceNo;
    }


    /**
     * Gets the refundsRelated value for this OperationType.
     * 
     * @return refundsRelated
     */
    public api.mws.schema.safetypay.OperationRefundType[] getRefundsRelated() {
        return refundsRelated;
    }


    /**
     * Sets the refundsRelated value for this OperationType.
     * 
     * @param refundsRelated
     */
    public void setRefundsRelated(api.mws.schema.safetypay.OperationRefundType[] refundsRelated) {
        this.refundsRelated = refundsRelated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationType)) return false;
        OperationType other = (OperationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creationDateTime==null && other.getCreationDateTime()==null) || 
             (this.creationDateTime!=null &&
              this.creationDateTime.equals(other.getCreationDateTime()))) &&
            ((this.operationID==null && other.getOperationID()==null) || 
             (this.operationID!=null &&
              this.operationID.equals(other.getOperationID()))) &&
            ((this.merchantSalesID==null && other.getMerchantSalesID()==null) || 
             (this.merchantSalesID!=null &&
              this.merchantSalesID.equals(other.getMerchantSalesID()))) &&
            ((this.merchantOrderID==null && other.getMerchantOrderID()==null) || 
             (this.merchantOrderID!=null &&
              this.merchantOrderID.equals(other.getMerchantOrderID()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.shopperAmount==null && other.getShopperAmount()==null) || 
             (this.shopperAmount!=null &&
              this.shopperAmount.equals(other.getShopperAmount()))) &&
            ((this.shopperCurrencyID==null && other.getShopperCurrencyID()==null) || 
             (this.shopperCurrencyID!=null &&
              this.shopperCurrencyID.equals(other.getShopperCurrencyID()))) &&
            ((this.authorizationCode==null && other.getAuthorizationCode()==null) || 
             (this.authorizationCode!=null &&
              this.authorizationCode.equals(other.getAuthorizationCode()))) &&
            ((this.operationActivities==null && other.getOperationActivities()==null) || 
             (this.operationActivities!=null &&
              java.util.Arrays.equals(this.operationActivities, other.getOperationActivities()))) &&
            ((this.paymentReferenceNo==null && other.getPaymentReferenceNo()==null) || 
             (this.paymentReferenceNo!=null &&
              this.paymentReferenceNo.equals(other.getPaymentReferenceNo()))) &&
            ((this.refundsRelated==null && other.getRefundsRelated()==null) || 
             (this.refundsRelated!=null &&
              java.util.Arrays.equals(this.refundsRelated, other.getRefundsRelated())));
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
        if (getCreationDateTime() != null) {
            _hashCode += getCreationDateTime().hashCode();
        }
        if (getOperationID() != null) {
            _hashCode += getOperationID().hashCode();
        }
        if (getMerchantSalesID() != null) {
            _hashCode += getMerchantSalesID().hashCode();
        }
        if (getMerchantOrderID() != null) {
            _hashCode += getMerchantOrderID().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getShopperAmount() != null) {
            _hashCode += getShopperAmount().hashCode();
        }
        if (getShopperCurrencyID() != null) {
            _hashCode += getShopperCurrencyID().hashCode();
        }
        if (getAuthorizationCode() != null) {
            _hashCode += getAuthorizationCode().hashCode();
        }
        if (getOperationActivities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperationActivities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationActivities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentReferenceNo() != null) {
            _hashCode += getPaymentReferenceNo().hashCode();
        }
        if (getRefundsRelated() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRefundsRelated());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRefundsRelated(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "CreationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantSalesID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "MerchantSalesID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantOrderID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "MerchantOrderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShopperAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperCurrencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShopperCurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "AuthorizationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationActivities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationActivities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationActivityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationActivity"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentReferenceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "PaymentReferenceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundsRelated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "RefundsRelated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationRefundType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "RefundItem"));
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
