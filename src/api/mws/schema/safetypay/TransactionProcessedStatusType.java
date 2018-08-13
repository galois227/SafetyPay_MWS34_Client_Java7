/**
 * TransactionProcessedStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.schema.safetypay;

public class TransactionProcessedStatusType  implements java.io.Serializable {
    private java.lang.String transactionIdentifier;

    private java.lang.String operationID;

    private java.lang.String merchantSalesID;

    private api.mws.schema.safetypay.ProcessStatusType processStatus;

    public TransactionProcessedStatusType() {
    }

    public TransactionProcessedStatusType(
           java.lang.String transactionIdentifier,
           java.lang.String operationID,
           java.lang.String merchantSalesID,
           api.mws.schema.safetypay.ProcessStatusType processStatus) {
           this.transactionIdentifier = transactionIdentifier;
           this.operationID = operationID;
           this.merchantSalesID = merchantSalesID;
           this.processStatus = processStatus;
    }


    /**
     * Gets the transactionIdentifier value for this TransactionProcessedStatusType.
     * 
     * @return transactionIdentifier
     */
    public java.lang.String getTransactionIdentifier() {
        return transactionIdentifier;
    }


    /**
     * Sets the transactionIdentifier value for this TransactionProcessedStatusType.
     * 
     * @param transactionIdentifier
     */
    public void setTransactionIdentifier(java.lang.String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }


    /**
     * Gets the operationID value for this TransactionProcessedStatusType.
     * 
     * @return operationID
     */
    public java.lang.String getOperationID() {
        return operationID;
    }


    /**
     * Sets the operationID value for this TransactionProcessedStatusType.
     * 
     * @param operationID
     */
    public void setOperationID(java.lang.String operationID) {
        this.operationID = operationID;
    }


    /**
     * Gets the merchantSalesID value for this TransactionProcessedStatusType.
     * 
     * @return merchantSalesID
     */
    public java.lang.String getMerchantSalesID() {
        return merchantSalesID;
    }


    /**
     * Sets the merchantSalesID value for this TransactionProcessedStatusType.
     * 
     * @param merchantSalesID
     */
    public void setMerchantSalesID(java.lang.String merchantSalesID) {
        this.merchantSalesID = merchantSalesID;
    }


    /**
     * Gets the processStatus value for this TransactionProcessedStatusType.
     * 
     * @return processStatus
     */
    public api.mws.schema.safetypay.ProcessStatusType getProcessStatus() {
        return processStatus;
    }


    /**
     * Sets the processStatus value for this TransactionProcessedStatusType.
     * 
     * @param processStatus
     */
    public void setProcessStatus(api.mws.schema.safetypay.ProcessStatusType processStatus) {
        this.processStatus = processStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionProcessedStatusType)) return false;
        TransactionProcessedStatusType other = (TransactionProcessedStatusType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionIdentifier==null && other.getTransactionIdentifier()==null) || 
             (this.transactionIdentifier!=null &&
              this.transactionIdentifier.equals(other.getTransactionIdentifier()))) &&
            ((this.operationID==null && other.getOperationID()==null) || 
             (this.operationID!=null &&
              this.operationID.equals(other.getOperationID()))) &&
            ((this.merchantSalesID==null && other.getMerchantSalesID()==null) || 
             (this.merchantSalesID!=null &&
              this.merchantSalesID.equals(other.getMerchantSalesID()))) &&
            ((this.processStatus==null && other.getProcessStatus()==null) || 
             (this.processStatus!=null &&
              this.processStatus.equals(other.getProcessStatus())));
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
        if (getTransactionIdentifier() != null) {
            _hashCode += getTransactionIdentifier().hashCode();
        }
        if (getOperationID() != null) {
            _hashCode += getOperationID().hashCode();
        }
        if (getMerchantSalesID() != null) {
            _hashCode += getMerchantSalesID().hashCode();
        }
        if (getProcessStatus() != null) {
            _hashCode += getProcessStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionProcessedStatusType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "TransactionProcessedStatusType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "TransactionIdentifier"));
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
        elemField.setFieldName("processStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ProcessStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ProcessStatusType"));
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
