/**
 * ProcessStatusEnumType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.schema.safetypay;

public class ProcessStatusEnumType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProcessStatusEnumType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _PENDING = new org.apache.axis.types.Token("PENDING");
    public static final org.apache.axis.types.Token _SUCCESS = new org.apache.axis.types.Token("SUCCESS");
    public static final org.apache.axis.types.Token _FAILURE = new org.apache.axis.types.Token("FAILURE");
    public static final ProcessStatusEnumType PENDING = new ProcessStatusEnumType(_PENDING);
    public static final ProcessStatusEnumType SUCCESS = new ProcessStatusEnumType(_SUCCESS);
    public static final ProcessStatusEnumType FAILURE = new ProcessStatusEnumType(_FAILURE);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static ProcessStatusEnumType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        ProcessStatusEnumType enumeration = (ProcessStatusEnumType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProcessStatusEnumType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.Token(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessStatusEnumType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ProcessStatusEnumType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
