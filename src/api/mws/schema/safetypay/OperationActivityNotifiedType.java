/**
 * OperationActivityNotifiedType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.schema.safetypay;

public class OperationActivityNotifiedType  implements java.io.Serializable {
    private java.lang.String creationDateTime;

    private java.lang.String operationID;

    private java.lang.String merchantSalesID;

    private java.lang.String merchantOrderID;

    private java.lang.String operationStatus;

    public OperationActivityNotifiedType() {
    }

    public OperationActivityNotifiedType(
           java.lang.String creationDateTime,
           java.lang.String operationID,
           java.lang.String merchantSalesID,
           java.lang.String merchantOrderID,
           java.lang.String operationStatus) {
           this.creationDateTime = creationDateTime;
           this.operationID = operationID;
           this.merchantSalesID = merchantSalesID;
           this.merchantOrderID = merchantOrderID;
           this.operationStatus = operationStatus;
    }


    /**
     * Gets the creationDateTime value for this OperationActivityNotifiedType.
     * 
     * @return creationDateTime
     */
    public java.lang.String getCreationDateTime() {
        return creationDateTime;
    }


    /**
     * Sets the creationDateTime value for this OperationActivityNotifiedType.
     * 
     * @param creationDateTime
     */
    public void setCreationDateTime(java.lang.String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }


    /**
     * Gets the operationID value for this OperationActivityNotifiedType.
     * 
     * @return operationID
     */
    public java.lang.String getOperationID() {
        return operationID;
    }


    /**
     * Sets the operationID value for this OperationActivityNotifiedType.
     * 
     * @param operationID
     */
    public void setOperationID(java.lang.String operationID) {
        this.operationID = operationID;
    }


    /**
     * Gets the merchantSalesID value for this OperationActivityNotifiedType.
     * 
     * @return merchantSalesID
     */
    public java.lang.String getMerchantSalesID() {
        return merchantSalesID;
    }


    /**
     * Sets the merchantSalesID value for this OperationActivityNotifiedType.
     * 
     * @param merchantSalesID
     */
    public void setMerchantSalesID(java.lang.String merchantSalesID) {
        this.merchantSalesID = merchantSalesID;
    }


    /**
     * Gets the merchantOrderID value for this OperationActivityNotifiedType.
     * 
     * @return merchantOrderID
     */
    public java.lang.String getMerchantOrderID() {
        return merchantOrderID;
    }


    /**
     * Sets the merchantOrderID value for this OperationActivityNotifiedType.
     * 
     * @param merchantOrderID
     */
    public void setMerchantOrderID(java.lang.String merchantOrderID) {
        this.merchantOrderID = merchantOrderID;
    }


    /**
     * Gets the operationStatus value for this OperationActivityNotifiedType.
     * 
     * @return operationStatus
     */
    public java.lang.String getOperationStatus() {
        return operationStatus;
    }


    /**
     * Sets the operationStatus value for this OperationActivityNotifiedType.
     * 
     * @param operationStatus
     */
    public void setOperationStatus(java.lang.String operationStatus) {
        this.operationStatus = operationStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationActivityNotifiedType)) return false;
        OperationActivityNotifiedType other = (OperationActivityNotifiedType) obj;
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
            ((this.operationStatus==null && other.getOperationStatus()==null) || 
             (this.operationStatus!=null &&
              this.operationStatus.equals(other.getOperationStatus())));
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
        if (getOperationStatus() != null) {
            _hashCode += getOperationStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationActivityNotifiedType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationActivityNotifiedType"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationStatus"));
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
