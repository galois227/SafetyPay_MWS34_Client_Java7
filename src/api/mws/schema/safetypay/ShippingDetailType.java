/**
 * ShippingDetailType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.schema.safetypay;

public class ShippingDetailType  implements java.io.Serializable {
    private java.lang.String salesOperationID;

    private java.lang.String invoiceDate;

    private java.lang.String invoiceNo;

    private java.lang.String shipDate;

    private java.lang.String shipMethod;

    private java.lang.String deliveryCompanyName;

    private java.lang.String trackingNumber;

    private java.lang.String recipientName;

    public ShippingDetailType() {
    }

    public ShippingDetailType(
           java.lang.String salesOperationID,
           java.lang.String invoiceDate,
           java.lang.String invoiceNo,
           java.lang.String shipDate,
           java.lang.String shipMethod,
           java.lang.String deliveryCompanyName,
           java.lang.String trackingNumber,
           java.lang.String recipientName) {
           this.salesOperationID = salesOperationID;
           this.invoiceDate = invoiceDate;
           this.invoiceNo = invoiceNo;
           this.shipDate = shipDate;
           this.shipMethod = shipMethod;
           this.deliveryCompanyName = deliveryCompanyName;
           this.trackingNumber = trackingNumber;
           this.recipientName = recipientName;
    }


    /**
     * Gets the salesOperationID value for this ShippingDetailType.
     * 
     * @return salesOperationID
     */
    public java.lang.String getSalesOperationID() {
        return salesOperationID;
    }


    /**
     * Sets the salesOperationID value for this ShippingDetailType.
     * 
     * @param salesOperationID
     */
    public void setSalesOperationID(java.lang.String salesOperationID) {
        this.salesOperationID = salesOperationID;
    }


    /**
     * Gets the invoiceDate value for this ShippingDetailType.
     * 
     * @return invoiceDate
     */
    public java.lang.String getInvoiceDate() {
        return invoiceDate;
    }


    /**
     * Sets the invoiceDate value for this ShippingDetailType.
     * 
     * @param invoiceDate
     */
    public void setInvoiceDate(java.lang.String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }


    /**
     * Gets the invoiceNo value for this ShippingDetailType.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this ShippingDetailType.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the shipDate value for this ShippingDetailType.
     * 
     * @return shipDate
     */
    public java.lang.String getShipDate() {
        return shipDate;
    }


    /**
     * Sets the shipDate value for this ShippingDetailType.
     * 
     * @param shipDate
     */
    public void setShipDate(java.lang.String shipDate) {
        this.shipDate = shipDate;
    }


    /**
     * Gets the shipMethod value for this ShippingDetailType.
     * 
     * @return shipMethod
     */
    public java.lang.String getShipMethod() {
        return shipMethod;
    }


    /**
     * Sets the shipMethod value for this ShippingDetailType.
     * 
     * @param shipMethod
     */
    public void setShipMethod(java.lang.String shipMethod) {
        this.shipMethod = shipMethod;
    }


    /**
     * Gets the deliveryCompanyName value for this ShippingDetailType.
     * 
     * @return deliveryCompanyName
     */
    public java.lang.String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }


    /**
     * Sets the deliveryCompanyName value for this ShippingDetailType.
     * 
     * @param deliveryCompanyName
     */
    public void setDeliveryCompanyName(java.lang.String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }


    /**
     * Gets the trackingNumber value for this ShippingDetailType.
     * 
     * @return trackingNumber
     */
    public java.lang.String getTrackingNumber() {
        return trackingNumber;
    }


    /**
     * Sets the trackingNumber value for this ShippingDetailType.
     * 
     * @param trackingNumber
     */
    public void setTrackingNumber(java.lang.String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }


    /**
     * Gets the recipientName value for this ShippingDetailType.
     * 
     * @return recipientName
     */
    public java.lang.String getRecipientName() {
        return recipientName;
    }


    /**
     * Sets the recipientName value for this ShippingDetailType.
     * 
     * @param recipientName
     */
    public void setRecipientName(java.lang.String recipientName) {
        this.recipientName = recipientName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShippingDetailType)) return false;
        ShippingDetailType other = (ShippingDetailType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.salesOperationID==null && other.getSalesOperationID()==null) || 
             (this.salesOperationID!=null &&
              this.salesOperationID.equals(other.getSalesOperationID()))) &&
            ((this.invoiceDate==null && other.getInvoiceDate()==null) || 
             (this.invoiceDate!=null &&
              this.invoiceDate.equals(other.getInvoiceDate()))) &&
            ((this.invoiceNo==null && other.getInvoiceNo()==null) || 
             (this.invoiceNo!=null &&
              this.invoiceNo.equals(other.getInvoiceNo()))) &&
            ((this.shipDate==null && other.getShipDate()==null) || 
             (this.shipDate!=null &&
              this.shipDate.equals(other.getShipDate()))) &&
            ((this.shipMethod==null && other.getShipMethod()==null) || 
             (this.shipMethod!=null &&
              this.shipMethod.equals(other.getShipMethod()))) &&
            ((this.deliveryCompanyName==null && other.getDeliveryCompanyName()==null) || 
             (this.deliveryCompanyName!=null &&
              this.deliveryCompanyName.equals(other.getDeliveryCompanyName()))) &&
            ((this.trackingNumber==null && other.getTrackingNumber()==null) || 
             (this.trackingNumber!=null &&
              this.trackingNumber.equals(other.getTrackingNumber()))) &&
            ((this.recipientName==null && other.getRecipientName()==null) || 
             (this.recipientName!=null &&
              this.recipientName.equals(other.getRecipientName())));
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
        if (getSalesOperationID() != null) {
            _hashCode += getSalesOperationID().hashCode();
        }
        if (getInvoiceDate() != null) {
            _hashCode += getInvoiceDate().hashCode();
        }
        if (getInvoiceNo() != null) {
            _hashCode += getInvoiceNo().hashCode();
        }
        if (getShipDate() != null) {
            _hashCode += getShipDate().hashCode();
        }
        if (getShipMethod() != null) {
            _hashCode += getShipMethod().hashCode();
        }
        if (getDeliveryCompanyName() != null) {
            _hashCode += getDeliveryCompanyName().hashCode();
        }
        if (getTrackingNumber() != null) {
            _hashCode += getTrackingNumber().hashCode();
        }
        if (getRecipientName() != null) {
            _hashCode += getRecipientName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingDetailType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShippingDetailType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesOperationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "SalesOperationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "InvoiceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "InvoiceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShipMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryCompanyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "DeliveryCompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "TrackingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "RecipientName"));
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
