/**
 * OperationRefundType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.schema.safetypay;

public class OperationRefundType  implements java.io.Serializable {
    private java.lang.String creationDateTime;

    private java.lang.String operationID;

    private java.lang.String merchantRefundID;

    private java.math.BigDecimal refundAmount;

    private java.lang.String currency;

    private java.lang.String refundType;

    private api.mws.schema.safetypay.RefundStatusType refundStatus;

    public OperationRefundType() {
    }

    public OperationRefundType(
           java.lang.String creationDateTime,
           java.lang.String operationID,
           java.lang.String merchantRefundID,
           java.math.BigDecimal refundAmount,
           java.lang.String currency,
           java.lang.String refundType,
           api.mws.schema.safetypay.RefundStatusType refundStatus) {
           this.creationDateTime = creationDateTime;
           this.operationID = operationID;
           this.merchantRefundID = merchantRefundID;
           this.refundAmount = refundAmount;
           this.currency = currency;
           this.refundType = refundType;
           this.refundStatus = refundStatus;
    }


    /**
     * Gets the creationDateTime value for this OperationRefundType.
     * 
     * @return creationDateTime
     */
    public java.lang.String getCreationDateTime() {
        return creationDateTime;
    }


    /**
     * Sets the creationDateTime value for this OperationRefundType.
     * 
     * @param creationDateTime
     */
    public void setCreationDateTime(java.lang.String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }


    /**
     * Gets the operationID value for this OperationRefundType.
     * 
     * @return operationID
     */
    public java.lang.String getOperationID() {
        return operationID;
    }


    /**
     * Sets the operationID value for this OperationRefundType.
     * 
     * @param operationID
     */
    public void setOperationID(java.lang.String operationID) {
        this.operationID = operationID;
    }


    /**
     * Gets the merchantRefundID value for this OperationRefundType.
     * 
     * @return merchantRefundID
     */
    public java.lang.String getMerchantRefundID() {
        return merchantRefundID;
    }


    /**
     * Sets the merchantRefundID value for this OperationRefundType.
     * 
     * @param merchantRefundID
     */
    public void setMerchantRefundID(java.lang.String merchantRefundID) {
        this.merchantRefundID = merchantRefundID;
    }


    /**
     * Gets the refundAmount value for this OperationRefundType.
     * 
     * @return refundAmount
     */
    public java.math.BigDecimal getRefundAmount() {
        return refundAmount;
    }


    /**
     * Sets the refundAmount value for this OperationRefundType.
     * 
     * @param refundAmount
     */
    public void setRefundAmount(java.math.BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }


    /**
     * Gets the currency value for this OperationRefundType.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OperationRefundType.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the refundType value for this OperationRefundType.
     * 
     * @return refundType
     */
    public java.lang.String getRefundType() {
        return refundType;
    }


    /**
     * Sets the refundType value for this OperationRefundType.
     * 
     * @param refundType
     */
    public void setRefundType(java.lang.String refundType) {
        this.refundType = refundType;
    }


    /**
     * Gets the refundStatus value for this OperationRefundType.
     * 
     * @return refundStatus
     */
    public api.mws.schema.safetypay.RefundStatusType getRefundStatus() {
        return refundStatus;
    }


    /**
     * Sets the refundStatus value for this OperationRefundType.
     * 
     * @param refundStatus
     */
    public void setRefundStatus(api.mws.schema.safetypay.RefundStatusType refundStatus) {
        this.refundStatus = refundStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationRefundType)) return false;
        OperationRefundType other = (OperationRefundType) obj;
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
            ((this.merchantRefundID==null && other.getMerchantRefundID()==null) || 
             (this.merchantRefundID!=null &&
              this.merchantRefundID.equals(other.getMerchantRefundID()))) &&
            ((this.refundAmount==null && other.getRefundAmount()==null) || 
             (this.refundAmount!=null &&
              this.refundAmount.equals(other.getRefundAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.refundType==null && other.getRefundType()==null) || 
             (this.refundType!=null &&
              this.refundType.equals(other.getRefundType()))) &&
            ((this.refundStatus==null && other.getRefundStatus()==null) || 
             (this.refundStatus!=null &&
              this.refundStatus.equals(other.getRefundStatus())));
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
        if (getMerchantRefundID() != null) {
            _hashCode += getMerchantRefundID().hashCode();
        }
        if (getRefundAmount() != null) {
            _hashCode += getRefundAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getRefundType() != null) {
            _hashCode += getRefundType().hashCode();
        }
        if (getRefundStatus() != null) {
            _hashCode += getRefundStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationRefundType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationRefundType"));
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
        elemField.setFieldName("merchantRefundID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "MerchantRefundID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "RefundAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "RefundType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "RefundStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "RefundStatusType"));
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
