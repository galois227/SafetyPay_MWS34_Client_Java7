/**
 * TransactionInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.schema.safetypay;

public class TransactionInfoType  implements java.io.Serializable {
    private java.lang.String creationDateTime;

    private java.lang.String salesOperationID;

    private java.lang.String transactionIdentifier;

    private java.lang.String merchantSalesID;

    private java.lang.String customMerchantName;

    private java.lang.String currencyID;

    private java.math.BigDecimal amount;

    private api.mws.schema.safetypay.PayableAmountType[] payableAmounts;

    private java.math.BigInteger expirationTime;

    public TransactionInfoType() {
    }

    public TransactionInfoType(
           java.lang.String creationDateTime,
           java.lang.String salesOperationID,
           java.lang.String transactionIdentifier,
           java.lang.String merchantSalesID,
           java.lang.String customMerchantName,
           java.lang.String currencyID,
           java.math.BigDecimal amount,
           api.mws.schema.safetypay.PayableAmountType[] payableAmounts,
           java.math.BigInteger expirationTime) {
           this.creationDateTime = creationDateTime;
           this.salesOperationID = salesOperationID;
           this.transactionIdentifier = transactionIdentifier;
           this.merchantSalesID = merchantSalesID;
           this.customMerchantName = customMerchantName;
           this.currencyID = currencyID;
           this.amount = amount;
           this.payableAmounts = payableAmounts;
           this.expirationTime = expirationTime;
    }


    /**
     * Gets the creationDateTime value for this TransactionInfoType.
     * 
     * @return creationDateTime
     */
    public java.lang.String getCreationDateTime() {
        return creationDateTime;
    }


    /**
     * Sets the creationDateTime value for this TransactionInfoType.
     * 
     * @param creationDateTime
     */
    public void setCreationDateTime(java.lang.String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }


    /**
     * Gets the salesOperationID value for this TransactionInfoType.
     * 
     * @return salesOperationID
     */
    public java.lang.String getSalesOperationID() {
        return salesOperationID;
    }


    /**
     * Sets the salesOperationID value for this TransactionInfoType.
     * 
     * @param salesOperationID
     */
    public void setSalesOperationID(java.lang.String salesOperationID) {
        this.salesOperationID = salesOperationID;
    }


    /**
     * Gets the transactionIdentifier value for this TransactionInfoType.
     * 
     * @return transactionIdentifier
     */
    public java.lang.String getTransactionIdentifier() {
        return transactionIdentifier;
    }


    /**
     * Sets the transactionIdentifier value for this TransactionInfoType.
     * 
     * @param transactionIdentifier
     */
    public void setTransactionIdentifier(java.lang.String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }


    /**
     * Gets the merchantSalesID value for this TransactionInfoType.
     * 
     * @return merchantSalesID
     */
    public java.lang.String getMerchantSalesID() {
        return merchantSalesID;
    }


    /**
     * Sets the merchantSalesID value for this TransactionInfoType.
     * 
     * @param merchantSalesID
     */
    public void setMerchantSalesID(java.lang.String merchantSalesID) {
        this.merchantSalesID = merchantSalesID;
    }


    /**
     * Gets the customMerchantName value for this TransactionInfoType.
     * 
     * @return customMerchantName
     */
    public java.lang.String getCustomMerchantName() {
        return customMerchantName;
    }


    /**
     * Sets the customMerchantName value for this TransactionInfoType.
     * 
     * @param customMerchantName
     */
    public void setCustomMerchantName(java.lang.String customMerchantName) {
        this.customMerchantName = customMerchantName;
    }


    /**
     * Gets the currencyID value for this TransactionInfoType.
     * 
     * @return currencyID
     */
    public java.lang.String getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this TransactionInfoType.
     * 
     * @param currencyID
     */
    public void setCurrencyID(java.lang.String currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the amount value for this TransactionInfoType.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransactionInfoType.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the payableAmounts value for this TransactionInfoType.
     * 
     * @return payableAmounts
     */
    public api.mws.schema.safetypay.PayableAmountType[] getPayableAmounts() {
        return payableAmounts;
    }


    /**
     * Sets the payableAmounts value for this TransactionInfoType.
     * 
     * @param payableAmounts
     */
    public void setPayableAmounts(api.mws.schema.safetypay.PayableAmountType[] payableAmounts) {
        this.payableAmounts = payableAmounts;
    }


    /**
     * Gets the expirationTime value for this TransactionInfoType.
     * 
     * @return expirationTime
     */
    public java.math.BigInteger getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this TransactionInfoType.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(java.math.BigInteger expirationTime) {
        this.expirationTime = expirationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionInfoType)) return false;
        TransactionInfoType other = (TransactionInfoType) obj;
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
            ((this.salesOperationID==null && other.getSalesOperationID()==null) || 
             (this.salesOperationID!=null &&
              this.salesOperationID.equals(other.getSalesOperationID()))) &&
            ((this.transactionIdentifier==null && other.getTransactionIdentifier()==null) || 
             (this.transactionIdentifier!=null &&
              this.transactionIdentifier.equals(other.getTransactionIdentifier()))) &&
            ((this.merchantSalesID==null && other.getMerchantSalesID()==null) || 
             (this.merchantSalesID!=null &&
              this.merchantSalesID.equals(other.getMerchantSalesID()))) &&
            ((this.customMerchantName==null && other.getCustomMerchantName()==null) || 
             (this.customMerchantName!=null &&
              this.customMerchantName.equals(other.getCustomMerchantName()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.payableAmounts==null && other.getPayableAmounts()==null) || 
             (this.payableAmounts!=null &&
              java.util.Arrays.equals(this.payableAmounts, other.getPayableAmounts()))) &&
            ((this.expirationTime==null && other.getExpirationTime()==null) || 
             (this.expirationTime!=null &&
              this.expirationTime.equals(other.getExpirationTime())));
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
        if (getSalesOperationID() != null) {
            _hashCode += getSalesOperationID().hashCode();
        }
        if (getTransactionIdentifier() != null) {
            _hashCode += getTransactionIdentifier().hashCode();
        }
        if (getMerchantSalesID() != null) {
            _hashCode += getMerchantSalesID().hashCode();
        }
        if (getCustomMerchantName() != null) {
            _hashCode += getCustomMerchantName().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getPayableAmounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayableAmounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayableAmounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpirationTime() != null) {
            _hashCode += getExpirationTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "TransactionInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "CreationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesOperationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "SalesOperationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "TransactionIdentifier"));
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
        elemField.setFieldName("customMerchantName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "CustomMerchantName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payableAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "PayableAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "PayableAmountType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "PayableAmount"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ExpirationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
