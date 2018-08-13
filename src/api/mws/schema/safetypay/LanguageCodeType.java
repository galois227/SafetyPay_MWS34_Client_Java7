/**
 * LanguageCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.schema.safetypay;

public class LanguageCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LanguageCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _EN = new org.apache.axis.types.Token("EN");
    public static final org.apache.axis.types.Token _ES = new org.apache.axis.types.Token("ES");
    public static final org.apache.axis.types.Token _DE = new org.apache.axis.types.Token("DE");
    public static final org.apache.axis.types.Token _PT = new org.apache.axis.types.Token("PT");
    public static final org.apache.axis.types.Token _FR = new org.apache.axis.types.Token("FR");
    public static final org.apache.axis.types.Token _ZH = new org.apache.axis.types.Token("ZH");
    public static final org.apache.axis.types.Token _JA = new org.apache.axis.types.Token("JA");
    public static final org.apache.axis.types.Token _IT = new org.apache.axis.types.Token("IT");
    public static final org.apache.axis.types.Token _NL = new org.apache.axis.types.Token("NL");
    public static final LanguageCodeType EN = new LanguageCodeType(_EN);
    public static final LanguageCodeType ES = new LanguageCodeType(_ES);
    public static final LanguageCodeType DE = new LanguageCodeType(_DE);
    public static final LanguageCodeType PT = new LanguageCodeType(_PT);
    public static final LanguageCodeType FR = new LanguageCodeType(_FR);
    public static final LanguageCodeType ZH = new LanguageCodeType(_ZH);
    public static final LanguageCodeType JA = new LanguageCodeType(_JA);
    public static final LanguageCodeType IT = new LanguageCodeType(_IT);
    public static final LanguageCodeType NL = new LanguageCodeType(_NL);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static LanguageCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        LanguageCodeType enumeration = (LanguageCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LanguageCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LanguageCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "LanguageCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
