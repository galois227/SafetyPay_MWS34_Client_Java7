/**
 * ProcessStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.schema.safetypay;

public class ProcessStatusType  implements java.io.Serializable {
    private api.mws.schema.safetypay.ProcessStatusEnumType status;

    private api.mws.schema.safetypay.ErrorManagerType processError;

    public ProcessStatusType() {
    }

    public ProcessStatusType(
           api.mws.schema.safetypay.ProcessStatusEnumType status,
           api.mws.schema.safetypay.ErrorManagerType processError) {
           this.status = status;
           this.processError = processError;
    }


    /**
     * Gets the status value for this ProcessStatusType.
     * 
     * @return status
     */
    public api.mws.schema.safetypay.ProcessStatusEnumType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProcessStatusType.
     * 
     * @param status
     */
    public void setStatus(api.mws.schema.safetypay.ProcessStatusEnumType status) {
        this.status = status;
    }


    /**
     * Gets the processError value for this ProcessStatusType.
     * 
     * @return processError
     */
    public api.mws.schema.safetypay.ErrorManagerType getProcessError() {
        return processError;
    }


    /**
     * Sets the processError value for this ProcessStatusType.
     * 
     * @param processError
     */
    public void setProcessError(api.mws.schema.safetypay.ErrorManagerType processError) {
        this.processError = processError;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessStatusType)) return false;
        ProcessStatusType other = (ProcessStatusType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.processError==null && other.getProcessError()==null) || 
             (this.processError!=null &&
              this.processError.equals(other.getProcessError())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getProcessError() != null) {
            _hashCode += getProcessError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessStatusType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ProcessStatusType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ProcessStatusEnumType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processError");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ProcessError"));
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
