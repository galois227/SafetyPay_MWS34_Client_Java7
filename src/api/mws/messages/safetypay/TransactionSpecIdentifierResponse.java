/**
 * TransactionSpecIdentifierResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.messages.safetypay;

public class TransactionSpecIdentifierResponse  implements java.io.Serializable {
    private java.lang.String responseDateTime;

    private api.mws.schema.safetypay.TransactionProcessedStatusType[] listOfTransactionsProcessedStatus;

    private java.lang.String signature;

    private api.mws.schema.safetypay.ErrorManagerType errorManager;

    public TransactionSpecIdentifierResponse() {
    }

    public TransactionSpecIdentifierResponse(
           java.lang.String responseDateTime,
           api.mws.schema.safetypay.TransactionProcessedStatusType[] listOfTransactionsProcessedStatus,
           java.lang.String signature,
           api.mws.schema.safetypay.ErrorManagerType errorManager) {
           this.responseDateTime = responseDateTime;
           this.listOfTransactionsProcessedStatus = listOfTransactionsProcessedStatus;
           this.signature = signature;
           this.errorManager = errorManager;
    }


    /**
     * Gets the responseDateTime value for this TransactionSpecIdentifierResponse.
     * 
     * @return responseDateTime
     */
    public java.lang.String getResponseDateTime() {
        return responseDateTime;
    }


    /**
     * Sets the responseDateTime value for this TransactionSpecIdentifierResponse.
     * 
     * @param responseDateTime
     */
    public void setResponseDateTime(java.lang.String responseDateTime) {
        this.responseDateTime = responseDateTime;
    }


    /**
     * Gets the listOfTransactionsProcessedStatus value for this TransactionSpecIdentifierResponse.
     * 
     * @return listOfTransactionsProcessedStatus
     */
    public api.mws.schema.safetypay.TransactionProcessedStatusType[] getListOfTransactionsProcessedStatus() {
        return listOfTransactionsProcessedStatus;
    }


    /**
     * Sets the listOfTransactionsProcessedStatus value for this TransactionSpecIdentifierResponse.
     * 
     * @param listOfTransactionsProcessedStatus
     */
    public void setListOfTransactionsProcessedStatus(api.mws.schema.safetypay.TransactionProcessedStatusType[] listOfTransactionsProcessedStatus) {
        this.listOfTransactionsProcessedStatus = listOfTransactionsProcessedStatus;
    }


    /**
     * Gets the signature value for this TransactionSpecIdentifierResponse.
     * 
     * @return signature
     */
    public java.lang.String getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this TransactionSpecIdentifierResponse.
     * 
     * @param signature
     */
    public void setSignature(java.lang.String signature) {
        this.signature = signature;
    }


    /**
     * Gets the errorManager value for this TransactionSpecIdentifierResponse.
     * 
     * @return errorManager
     */
    public api.mws.schema.safetypay.ErrorManagerType getErrorManager() {
        return errorManager;
    }


    /**
     * Sets the errorManager value for this TransactionSpecIdentifierResponse.
     * 
     * @param errorManager
     */
    public void setErrorManager(api.mws.schema.safetypay.ErrorManagerType errorManager) {
        this.errorManager = errorManager;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionSpecIdentifierResponse)) return false;
        TransactionSpecIdentifierResponse other = (TransactionSpecIdentifierResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseDateTime==null && other.getResponseDateTime()==null) || 
             (this.responseDateTime!=null &&
              this.responseDateTime.equals(other.getResponseDateTime()))) &&
            ((this.listOfTransactionsProcessedStatus==null && other.getListOfTransactionsProcessedStatus()==null) || 
             (this.listOfTransactionsProcessedStatus!=null &&
              java.util.Arrays.equals(this.listOfTransactionsProcessedStatus, other.getListOfTransactionsProcessedStatus()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.errorManager==null && other.getErrorManager()==null) || 
             (this.errorManager!=null &&
              this.errorManager.equals(other.getErrorManager())));
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
        if (getResponseDateTime() != null) {
            _hashCode += getResponseDateTime().hashCode();
        }
        if (getListOfTransactionsProcessedStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfTransactionsProcessedStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfTransactionsProcessedStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getErrorManager() != null) {
            _hashCode += getErrorManager().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionSpecIdentifierResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">TransactionSpecIdentifierResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ResponseDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfTransactionsProcessedStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ListOfTransactionsProcessedStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "TransactionProcessedStatusType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "TransactionProcessedStatus"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "Signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ErrorManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ErrorManagerType"));
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
