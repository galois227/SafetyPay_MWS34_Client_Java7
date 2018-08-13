/**
 * ErrorManagerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.schema.safetypay;

public class ErrorManagerType  implements java.io.Serializable {
    private java.math.BigInteger errorNumber;

    private java.lang.String description;

    private java.math.BigInteger severity;

    public ErrorManagerType() {
    }

    public ErrorManagerType(
           java.math.BigInteger errorNumber,
           java.lang.String description,
           java.math.BigInteger severity) {
           this.errorNumber = errorNumber;
           this.description = description;
           this.severity = severity;
    }


    /**
     * Gets the errorNumber value for this ErrorManagerType.
     * 
     * @return errorNumber
     */
    public java.math.BigInteger getErrorNumber() {
        return errorNumber;
    }


    /**
     * Sets the errorNumber value for this ErrorManagerType.
     * 
     * @param errorNumber
     */
    public void setErrorNumber(java.math.BigInteger errorNumber) {
        this.errorNumber = errorNumber;
    }


    /**
     * Gets the description value for this ErrorManagerType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ErrorManagerType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the severity value for this ErrorManagerType.
     * 
     * @return severity
     */
    public java.math.BigInteger getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this ErrorManagerType.
     * 
     * @param severity
     */
    public void setSeverity(java.math.BigInteger severity) {
        this.severity = severity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErrorManagerType)) return false;
        ErrorManagerType other = (ErrorManagerType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorNumber==null && other.getErrorNumber()==null) || 
             (this.errorNumber!=null &&
              this.errorNumber.equals(other.getErrorNumber()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity())));
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
        if (getErrorNumber() != null) {
            _hashCode += getErrorNumber().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErrorManagerType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ErrorManagerType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ErrorNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "Severity"));
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
