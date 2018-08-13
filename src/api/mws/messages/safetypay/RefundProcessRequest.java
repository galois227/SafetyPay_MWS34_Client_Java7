/**
 * RefundProcessRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.messages.safetypay;

public class RefundProcessRequest  implements java.io.Serializable {
    private java.lang.String apiKey;

    private java.lang.String requestDateTime;

    private java.lang.String salesOperationID;

    private java.math.BigDecimal amountToRefund;

    private java.math.BigInteger totalPartial;

    private java.math.BigInteger reason;

    private java.lang.String comments;

    private java.lang.String signature;

    private java.lang.String merchantRefundId;

    private api.mws.schema.safetypay.ShopperFieldType[] shopperInformation;

    public RefundProcessRequest() {
    }

    public RefundProcessRequest(
           java.lang.String apiKey,
           java.lang.String requestDateTime,
           java.lang.String salesOperationID,
           java.math.BigDecimal amountToRefund,
           java.math.BigInteger totalPartial,
           java.math.BigInteger reason,
           java.lang.String comments,
           java.lang.String signature,
           java.lang.String merchantRefundId,
           api.mws.schema.safetypay.ShopperFieldType[] shopperInformation) {
           this.apiKey = apiKey;
           this.requestDateTime = requestDateTime;
           this.salesOperationID = salesOperationID;
           this.amountToRefund = amountToRefund;
           this.totalPartial = totalPartial;
           this.reason = reason;
           this.comments = comments;
           this.signature = signature;
           this.merchantRefundId = merchantRefundId;
           this.shopperInformation = shopperInformation;
    }


    /**
     * Gets the apiKey value for this RefundProcessRequest.
     * 
     * @return apiKey
     */
    public java.lang.String getApiKey() {
        return apiKey;
    }


    /**
     * Sets the apiKey value for this RefundProcessRequest.
     * 
     * @param apiKey
     */
    public void setApiKey(java.lang.String apiKey) {
        this.apiKey = apiKey;
    }


    /**
     * Gets the requestDateTime value for this RefundProcessRequest.
     * 
     * @return requestDateTime
     */
    public java.lang.String getRequestDateTime() {
        return requestDateTime;
    }


    /**
     * Sets the requestDateTime value for this RefundProcessRequest.
     * 
     * @param requestDateTime
     */
    public void setRequestDateTime(java.lang.String requestDateTime) {
        this.requestDateTime = requestDateTime;
    }


    /**
     * Gets the salesOperationID value for this RefundProcessRequest.
     * 
     * @return salesOperationID
     */
    public java.lang.String getSalesOperationID() {
        return salesOperationID;
    }


    /**
     * Sets the salesOperationID value for this RefundProcessRequest.
     * 
     * @param salesOperationID
     */
    public void setSalesOperationID(java.lang.String salesOperationID) {
        this.salesOperationID = salesOperationID;
    }


    /**
     * Gets the amountToRefund value for this RefundProcessRequest.
     * 
     * @return amountToRefund
     */
    public java.math.BigDecimal getAmountToRefund() {
        return amountToRefund;
    }


    /**
     * Sets the amountToRefund value for this RefundProcessRequest.
     * 
     * @param amountToRefund
     */
    public void setAmountToRefund(java.math.BigDecimal amountToRefund) {
        this.amountToRefund = amountToRefund;
    }


    /**
     * Gets the totalPartial value for this RefundProcessRequest.
     * 
     * @return totalPartial
     */
    public java.math.BigInteger getTotalPartial() {
        return totalPartial;
    }


    /**
     * Sets the totalPartial value for this RefundProcessRequest.
     * 
     * @param totalPartial
     */
    public void setTotalPartial(java.math.BigInteger totalPartial) {
        this.totalPartial = totalPartial;
    }


    /**
     * Gets the reason value for this RefundProcessRequest.
     * 
     * @return reason
     */
    public java.math.BigInteger getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this RefundProcessRequest.
     * 
     * @param reason
     */
    public void setReason(java.math.BigInteger reason) {
        this.reason = reason;
    }


    /**
     * Gets the comments value for this RefundProcessRequest.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this RefundProcessRequest.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the signature value for this RefundProcessRequest.
     * 
     * @return signature
     */
    public java.lang.String getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this RefundProcessRequest.
     * 
     * @param signature
     */
    public void setSignature(java.lang.String signature) {
        this.signature = signature;
    }


    /**
     * Gets the merchantRefundId value for this RefundProcessRequest.
     * 
     * @return merchantRefundId
     */
    public java.lang.String getMerchantRefundId() {
        return merchantRefundId;
    }


    /**
     * Sets the merchantRefundId value for this RefundProcessRequest.
     * 
     * @param merchantRefundId
     */
    public void setMerchantRefundId(java.lang.String merchantRefundId) {
        this.merchantRefundId = merchantRefundId;
    }


    /**
     * Gets the shopperInformation value for this RefundProcessRequest.
     * 
     * @return shopperInformation
     */
    public api.mws.schema.safetypay.ShopperFieldType[] getShopperInformation() {
        return shopperInformation;
    }


    /**
     * Sets the shopperInformation value for this RefundProcessRequest.
     * 
     * @param shopperInformation
     */
    public void setShopperInformation(api.mws.schema.safetypay.ShopperFieldType[] shopperInformation) {
        this.shopperInformation = shopperInformation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefundProcessRequest)) return false;
        RefundProcessRequest other = (RefundProcessRequest) obj;
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
            ((this.salesOperationID==null && other.getSalesOperationID()==null) || 
             (this.salesOperationID!=null &&
              this.salesOperationID.equals(other.getSalesOperationID()))) &&
            ((this.amountToRefund==null && other.getAmountToRefund()==null) || 
             (this.amountToRefund!=null &&
              this.amountToRefund.equals(other.getAmountToRefund()))) &&
            ((this.totalPartial==null && other.getTotalPartial()==null) || 
             (this.totalPartial!=null &&
              this.totalPartial.equals(other.getTotalPartial()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.merchantRefundId==null && other.getMerchantRefundId()==null) || 
             (this.merchantRefundId!=null &&
              this.merchantRefundId.equals(other.getMerchantRefundId()))) &&
            ((this.shopperInformation==null && other.getShopperInformation()==null) || 
             (this.shopperInformation!=null &&
              java.util.Arrays.equals(this.shopperInformation, other.getShopperInformation())));
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
        if (getSalesOperationID() != null) {
            _hashCode += getSalesOperationID().hashCode();
        }
        if (getAmountToRefund() != null) {
            _hashCode += getAmountToRefund().hashCode();
        }
        if (getTotalPartial() != null) {
            _hashCode += getTotalPartial().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getMerchantRefundId() != null) {
            _hashCode += getMerchantRefundId().hashCode();
        }
        if (getShopperInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShopperInformation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShopperInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RefundProcessRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">RefundProcessRequest"));
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
        elemField.setFieldName("salesOperationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "SalesOperationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountToRefund");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "AmountToRefund"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPartial");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "TotalPartial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "Reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "Signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantRefundId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "MerchantRefundId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ShopperInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShopperFieldType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShopperField"));
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
