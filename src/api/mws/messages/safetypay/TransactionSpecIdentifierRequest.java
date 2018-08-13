/**
 * TransactionSpecIdentifierRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.messages.safetypay;

public class TransactionSpecIdentifierRequest  implements java.io.Serializable {
    private java.lang.String apiKey;

    private java.lang.String requestDateTime;

    private api.mws.schema.safetypay.IdentifierSearchType[] listOfIdentifiersSearch;

    private java.lang.String signature;

    public TransactionSpecIdentifierRequest() {
    }

    public TransactionSpecIdentifierRequest(
           java.lang.String apiKey,
           java.lang.String requestDateTime,
           api.mws.schema.safetypay.IdentifierSearchType[] listOfIdentifiersSearch,
           java.lang.String signature) {
           this.apiKey = apiKey;
           this.requestDateTime = requestDateTime;
           this.listOfIdentifiersSearch = listOfIdentifiersSearch;
           this.signature = signature;
    }


    /**
     * Gets the apiKey value for this TransactionSpecIdentifierRequest.
     * 
     * @return apiKey
     */
    public java.lang.String getApiKey() {
        return apiKey;
    }


    /**
     * Sets the apiKey value for this TransactionSpecIdentifierRequest.
     * 
     * @param apiKey
     */
    public void setApiKey(java.lang.String apiKey) {
        this.apiKey = apiKey;
    }


    /**
     * Gets the requestDateTime value for this TransactionSpecIdentifierRequest.
     * 
     * @return requestDateTime
     */
    public java.lang.String getRequestDateTime() {
        return requestDateTime;
    }


    /**
     * Sets the requestDateTime value for this TransactionSpecIdentifierRequest.
     * 
     * @param requestDateTime
     */
    public void setRequestDateTime(java.lang.String requestDateTime) {
        this.requestDateTime = requestDateTime;
    }


    /**
     * Gets the listOfIdentifiersSearch value for this TransactionSpecIdentifierRequest.
     * 
     * @return listOfIdentifiersSearch
     */
    public api.mws.schema.safetypay.IdentifierSearchType[] getListOfIdentifiersSearch() {
        return listOfIdentifiersSearch;
    }


    /**
     * Sets the listOfIdentifiersSearch value for this TransactionSpecIdentifierRequest.
     * 
     * @param listOfIdentifiersSearch
     */
    public void setListOfIdentifiersSearch(api.mws.schema.safetypay.IdentifierSearchType[] listOfIdentifiersSearch) {
        this.listOfIdentifiersSearch = listOfIdentifiersSearch;
    }


    /**
     * Gets the signature value for this TransactionSpecIdentifierRequest.
     * 
     * @return signature
     */
    public java.lang.String getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this TransactionSpecIdentifierRequest.
     * 
     * @param signature
     */
    public void setSignature(java.lang.String signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionSpecIdentifierRequest)) return false;
        TransactionSpecIdentifierRequest other = (TransactionSpecIdentifierRequest) obj;
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
            ((this.listOfIdentifiersSearch==null && other.getListOfIdentifiersSearch()==null) || 
             (this.listOfIdentifiersSearch!=null &&
              java.util.Arrays.equals(this.listOfIdentifiersSearch, other.getListOfIdentifiersSearch()))) &&
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
        if (getListOfIdentifiersSearch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfIdentifiersSearch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfIdentifiersSearch(), i);
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
        new org.apache.axis.description.TypeDesc(TransactionSpecIdentifierRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">TransactionSpecIdentifierRequest"));
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
        elemField.setFieldName("listOfIdentifiersSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ListOfIdentifiersSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "IdentifierSearchType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "IdentifierSearch"));
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
