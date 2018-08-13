/**
 * OperationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.messages.safetypay;

public class OperationResponse  implements java.io.Serializable {
    private java.lang.String responseDateTime;

    private api.mws.schema.safetypay.OperationType[] listOfOperations;

    private java.lang.String signature;

    private api.mws.schema.safetypay.ErrorManagerType errorManager;

    public OperationResponse() {
    }

    public OperationResponse(
           java.lang.String responseDateTime,
           api.mws.schema.safetypay.OperationType[] listOfOperations,
           java.lang.String signature,
           api.mws.schema.safetypay.ErrorManagerType errorManager) {
           this.responseDateTime = responseDateTime;
           this.listOfOperations = listOfOperations;
           this.signature = signature;
           this.errorManager = errorManager;
    }


    /**
     * Gets the responseDateTime value for this OperationResponse.
     * 
     * @return responseDateTime
     */
    public java.lang.String getResponseDateTime() {
        return responseDateTime;
    }


    /**
     * Sets the responseDateTime value for this OperationResponse.
     * 
     * @param responseDateTime
     */
    public void setResponseDateTime(java.lang.String responseDateTime) {
        this.responseDateTime = responseDateTime;
    }


    /**
     * Gets the listOfOperations value for this OperationResponse.
     * 
     * @return listOfOperations
     */
    public api.mws.schema.safetypay.OperationType[] getListOfOperations() {
        return listOfOperations;
    }


    /**
     * Sets the listOfOperations value for this OperationResponse.
     * 
     * @param listOfOperations
     */
    public void setListOfOperations(api.mws.schema.safetypay.OperationType[] listOfOperations) {
        this.listOfOperations = listOfOperations;
    }


    /**
     * Gets the signature value for this OperationResponse.
     * 
     * @return signature
     */
    public java.lang.String getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this OperationResponse.
     * 
     * @param signature
     */
    public void setSignature(java.lang.String signature) {
        this.signature = signature;
    }


    /**
     * Gets the errorManager value for this OperationResponse.
     * 
     * @return errorManager
     */
    public api.mws.schema.safetypay.ErrorManagerType getErrorManager() {
        return errorManager;
    }


    /**
     * Sets the errorManager value for this OperationResponse.
     * 
     * @param errorManager
     */
    public void setErrorManager(api.mws.schema.safetypay.ErrorManagerType errorManager) {
        this.errorManager = errorManager;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationResponse)) return false;
        OperationResponse other = (OperationResponse) obj;
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
            ((this.listOfOperations==null && other.getListOfOperations()==null) || 
             (this.listOfOperations!=null &&
              java.util.Arrays.equals(this.listOfOperations, other.getListOfOperations()))) &&
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
        if (getListOfOperations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfOperations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfOperations(), i);
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
        new org.apache.axis.description.TypeDesc(OperationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">OperationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ResponseDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfOperations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ListOfOperations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "Operation"));
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
