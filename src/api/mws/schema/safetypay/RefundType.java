/**
 * RefundType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.schema.safetypay;

public class RefundType  implements java.io.Serializable {
    private java.lang.String operationID;

    private java.lang.String creationDateTime;

    private java.lang.String salesOperationID;

    private java.math.BigDecimal amountToRefund;

    private java.lang.String currencyIDToRefund;

    private java.math.BigInteger totalPartial;

    private java.math.BigInteger reason;

    private java.lang.String comments;

    private java.lang.String merchantRefundId;

    private api.mws.schema.safetypay.ShopperFieldType[] shopperInformation;

    public RefundType() {
    }

    public RefundType(
           java.lang.String operationID,
           java.lang.String creationDateTime,
           java.lang.String salesOperationID,
           java.math.BigDecimal amountToRefund,
           java.lang.String currencyIDToRefund,
           java.math.BigInteger totalPartial,
           java.math.BigInteger reason,
           java.lang.String comments,
           java.lang.String merchantRefundId,
           api.mws.schema.safetypay.ShopperFieldType[] shopperInformation) {
           this.operationID = operationID;
           this.creationDateTime = creationDateTime;
           this.salesOperationID = salesOperationID;
           this.amountToRefund = amountToRefund;
           this.currencyIDToRefund = currencyIDToRefund;
           this.totalPartial = totalPartial;
           this.reason = reason;
           this.comments = comments;
           this.merchantRefundId = merchantRefundId;
           this.shopperInformation = shopperInformation;
    }


    /**
     * Gets the operationID value for this RefundType.
     * 
     * @return operationID
     */
    public java.lang.String getOperationID() {
        return operationID;
    }


    /**
     * Sets the operationID value for this RefundType.
     * 
     * @param operationID
     */
    public void setOperationID(java.lang.String operationID) {
        this.operationID = operationID;
    }


    /**
     * Gets the creationDateTime value for this RefundType.
     * 
     * @return creationDateTime
     */
    public java.lang.String getCreationDateTime() {
        return creationDateTime;
    }


    /**
     * Sets the creationDateTime value for this RefundType.
     * 
     * @param creationDateTime
     */
    public void setCreationDateTime(java.lang.String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }


    /**
     * Gets the salesOperationID value for this RefundType.
     * 
     * @return salesOperationID
     */
    public java.lang.String getSalesOperationID() {
        return salesOperationID;
    }


    /**
     * Sets the salesOperationID value for this RefundType.
     * 
     * @param salesOperationID
     */
    public void setSalesOperationID(java.lang.String salesOperationID) {
        this.salesOperationID = salesOperationID;
    }


    /**
     * Gets the amountToRefund value for this RefundType.
     * 
     * @return amountToRefund
     */
    public java.math.BigDecimal getAmountToRefund() {
        return amountToRefund;
    }


    /**
     * Sets the amountToRefund value for this RefundType.
     * 
     * @param amountToRefund
     */
    public void setAmountToRefund(java.math.BigDecimal amountToRefund) {
        this.amountToRefund = amountToRefund;
    }


    /**
     * Gets the currencyIDToRefund value for this RefundType.
     * 
     * @return currencyIDToRefund
     */
    public java.lang.String getCurrencyIDToRefund() {
        return currencyIDToRefund;
    }


    /**
     * Sets the currencyIDToRefund value for this RefundType.
     * 
     * @param currencyIDToRefund
     */
    public void setCurrencyIDToRefund(java.lang.String currencyIDToRefund) {
        this.currencyIDToRefund = currencyIDToRefund;
    }


    /**
     * Gets the totalPartial value for this RefundType.
     * 
     * @return totalPartial
     */
    public java.math.BigInteger getTotalPartial() {
        return totalPartial;
    }


    /**
     * Sets the totalPartial value for this RefundType.
     * 
     * @param totalPartial
     */
    public void setTotalPartial(java.math.BigInteger totalPartial) {
        this.totalPartial = totalPartial;
    }


    /**
     * Gets the reason value for this RefundType.
     * 
     * @return reason
     */
    public java.math.BigInteger getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this RefundType.
     * 
     * @param reason
     */
    public void setReason(java.math.BigInteger reason) {
        this.reason = reason;
    }


    /**
     * Gets the comments value for this RefundType.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this RefundType.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the merchantRefundId value for this RefundType.
     * 
     * @return merchantRefundId
     */
    public java.lang.String getMerchantRefundId() {
        return merchantRefundId;
    }


    /**
     * Sets the merchantRefundId value for this RefundType.
     * 
     * @param merchantRefundId
     */
    public void setMerchantRefundId(java.lang.String merchantRefundId) {
        this.merchantRefundId = merchantRefundId;
    }


    /**
     * Gets the shopperInformation value for this RefundType.
     * 
     * @return shopperInformation
     */
    public api.mws.schema.safetypay.ShopperFieldType[] getShopperInformation() {
        return shopperInformation;
    }


    /**
     * Sets the shopperInformation value for this RefundType.
     * 
     * @param shopperInformation
     */
    public void setShopperInformation(api.mws.schema.safetypay.ShopperFieldType[] shopperInformation) {
        this.shopperInformation = shopperInformation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefundType)) return false;
        RefundType other = (RefundType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operationID==null && other.getOperationID()==null) || 
             (this.operationID!=null &&
              this.operationID.equals(other.getOperationID()))) &&
            ((this.creationDateTime==null && other.getCreationDateTime()==null) || 
             (this.creationDateTime!=null &&
              this.creationDateTime.equals(other.getCreationDateTime()))) &&
            ((this.salesOperationID==null && other.getSalesOperationID()==null) || 
             (this.salesOperationID!=null &&
              this.salesOperationID.equals(other.getSalesOperationID()))) &&
            ((this.amountToRefund==null && other.getAmountToRefund()==null) || 
             (this.amountToRefund!=null &&
              this.amountToRefund.equals(other.getAmountToRefund()))) &&
            ((this.currencyIDToRefund==null && other.getCurrencyIDToRefund()==null) || 
             (this.currencyIDToRefund!=null &&
              this.currencyIDToRefund.equals(other.getCurrencyIDToRefund()))) &&
            ((this.totalPartial==null && other.getTotalPartial()==null) || 
             (this.totalPartial!=null &&
              this.totalPartial.equals(other.getTotalPartial()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.merchantRefundId==null && other.getMerchantRefundId()==null) || 
             (this.merchantRefundId!=null &&
              this.merchantRefundId.equals(other.getMerchantRefundId()))) &&
            ((this.shopperInformation==null && other.getShopperInformation()==null) || 
             (this.shopperInformation!=null &&
              java.util.Arrays.equals(this.shopperInformation, other.getShopperInformation())));
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
        if (getOperationID() != null) {
            _hashCode += getOperationID().hashCode();
        }
        if (getCreationDateTime() != null) {
            _hashCode += getCreationDateTime().hashCode();
        }
        if (getSalesOperationID() != null) {
            _hashCode += getSalesOperationID().hashCode();
        }
        if (getAmountToRefund() != null) {
            _hashCode += getAmountToRefund().hashCode();
        }
        if (getCurrencyIDToRefund() != null) {
            _hashCode += getCurrencyIDToRefund().hashCode();
        }
        if (getTotalPartial() != null) {
            _hashCode += getTotalPartial().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getMerchantRefundId() != null) {
            _hashCode += getMerchantRefundId().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RefundType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "RefundType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("amountToRefund");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "AmountToRefund"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyIDToRefund");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "CurrencyIDToRefund"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPartial");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "TotalPartial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "Reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantRefundId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "MerchantRefundId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShopperInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShopperFieldType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShopperField"));
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
