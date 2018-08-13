/**
 * MerchantExpressApiBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.contract.safetypay;

public class MerchantExpressApiBindingStub extends org.apache.axis.client.Stub implements api.mws.contract.safetypay.MerchantExpressApiOperations {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CommunicationTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "TestRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">TestRequest"), api.mws.messages.safetypay.TestRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">TestResponse"));
        oper.setReturnClass(api.mws.messages.safetypay.TestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "TestResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConfirmShippedOrders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ShippedOrderRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">ShippedOrderRequest"), api.mws.messages.safetypay.ShippedOrderRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">ShippedOrderResponse"));
        oper.setReturnClass(api.mws.messages.safetypay.ShippedOrderResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ShippedOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateExpressToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ExpressTokenRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">ExpressTokenRequest"), api.mws.messages.safetypay.ExpressTokenRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">ExpressTokenResponse"));
        oper.setReturnClass(api.mws.messages.safetypay.ExpressTokenResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ExpressTokenResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateExpressTokenReverse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ExpressTokenReverseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">ExpressTokenReverseRequest"), api.mws.messages.safetypay.ExpressTokenReverseRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">ExpressTokenReverseResponse"));
        oper.setReturnClass(api.mws.messages.safetypay.ExpressTokenReverseResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ExpressTokenReverseResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateRefund");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "RefundProcessRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">RefundProcessRequest"), api.mws.messages.safetypay.RefundProcessRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">RefundProcessResponse"));
        oper.setReturnClass(api.mws.messages.safetypay.RefundProcessResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "RefundProcessResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateGenericRefund");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "GenericRefundProcessRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">GenericRefundProcessRequest"), api.mws.messages.safetypay.GenericRefundProcessRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">RefundProcessResponse"));
        oper.setReturnClass(api.mws.messages.safetypay.RefundProcessResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "RefundProcessResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNewOperationActivity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "OperationActivityRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">OperationActivityRequest"), api.mws.messages.safetypay.OperationActivityRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">OperationResponse"));
        oper.setReturnClass(api.mws.messages.safetypay.OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "OperationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConfirmNewOperationActivity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "OperationActivityNotifiedRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">OperationActivityNotifiedRequest"), api.mws.messages.safetypay.OperationActivityNotifiedRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">OperationActivityNotifiedResponse"));
        oper.setReturnClass(api.mws.messages.safetypay.OperationActivityNotifiedResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "OperationActivityNotifiedResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "OperationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">OperationRequest"), api.mws.messages.safetypay.OperationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">OperationResponse"));
        oper.setReturnClass(api.mws.messages.safetypay.OperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "OperationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateCustomTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "CustomTransactionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">CustomTransactionRequest"), api.mws.messages.safetypay.CustomTransactionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">CustomTransactionResponse"));
        oper.setReturnClass(api.mws.messages.safetypay.CustomTransactionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "CustomTransactionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VoidTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "TransactionSpecIdentifierRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">TransactionSpecIdentifierRequest"), api.mws.messages.safetypay.TransactionSpecIdentifierRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">TransactionSpecIdentifierResponse"));
        oper.setReturnClass(api.mws.messages.safetypay.TransactionSpecIdentifierResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "TransactionSpecIdentifierResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

    }

    public MerchantExpressApiBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public MerchantExpressApiBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public MerchantExpressApiBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">CustomTransactionRequest");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.CustomTransactionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">CustomTransactionResponse");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.CustomTransactionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">ExpressTokenRequest");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.ExpressTokenRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">ExpressTokenResponse");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.ExpressTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">ExpressTokenReverseRequest");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.ExpressTokenReverseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">ExpressTokenReverseResponse");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.ExpressTokenReverseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">GenericRefundProcessRequest");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.GenericRefundProcessRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">OperationActivityNotifiedRequest");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.OperationActivityNotifiedRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">OperationActivityNotifiedResponse");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.OperationActivityNotifiedResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">OperationActivityRequest");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.OperationActivityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">OperationRequest");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.OperationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">OperationResponse");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.OperationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">RefundProcessRequest");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.RefundProcessRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">RefundProcessResponse");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.RefundProcessResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">ShippedOrderRequest");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.ShippedOrderRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">ShippedOrderResponse");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.ShippedOrderResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">TestRequest");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.TestRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">TestResponse");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.TestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">TransactionSpecIdentifierRequest");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.TransactionSpecIdentifierRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", ">TransactionSpecIdentifierResponse");
            cachedSerQNames.add(qName);
            cls = api.mws.messages.safetypay.TransactionSpecIdentifierResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ShopperInformationType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.ShopperFieldType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShopperFieldType");
            qName2 = new javax.xml.namespace.QName("urn:safetypay:messages:mws:api", "ShopperFieldType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "CustomerInformationType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.CustomerInformationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ErrorManagerType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.ErrorManagerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "IdentifierNumType");
            cachedSerQNames.add(qName);
            cls = short.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "IdentifierSearchType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.IdentifierSearchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "LanguageCodeType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.LanguageCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ListOfIdentifiersSearchType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.IdentifierSearchType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "IdentifierSearchType");
            qName2 = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "IdentifierSearch");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ListOfOperationActivitiesType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.OperationActivityType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationActivityType");
            qName2 = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationActivity");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ListOfOperationRefundsType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.OperationRefundType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationRefundType");
            qName2 = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "RefundItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ListOfOperationsActivityNotifiedType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.OperationActivityNotifiedType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationActivityNotifiedType");
            qName2 = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ConfirmOperation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ListOfOperationsType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.OperationType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationType");
            qName2 = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "Operation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ListOfPayableAmountsType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.PayableAmountType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "PayableAmountType");
            qName2 = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "PayableAmount");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ListOfShopperCurrenciesType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShopperCurrencyID");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ListOfTransactionsProcessedStatusType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.TransactionProcessedStatusType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "TransactionProcessedStatusType");
            qName2 = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "TransactionProcessedStatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationActivityNotifiedType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.OperationActivityNotifiedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationActivityType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.OperationActivityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationRefundType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.OperationRefundType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "OperationType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.OperationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "PayableAmountType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.PayableAmountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ProcessStatusEnumType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.ProcessStatusEnumType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ProcessStatusType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.ProcessStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "RefundStatusType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.RefundStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "RefundType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.RefundType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShippingDetailType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.ShippingDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShopperFieldType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.ShopperFieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShopperInformationType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.ShopperFieldType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShopperFieldType");
            qName2 = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "ShopperField");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "StatusType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.StatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "TransactionInfoType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.TransactionInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:safetypay:schema:mws:api", "TransactionProcessedStatusType");
            cachedSerQNames.add(qName);
            cls = api.mws.schema.safetypay.TransactionProcessedStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public api.mws.messages.safetypay.TestResponse communicationTest(api.mws.messages.safetypay.TestRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:safetypay:contract:mws:api:CommunicationTest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CommunicationTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (api.mws.messages.safetypay.TestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (api.mws.messages.safetypay.TestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, api.mws.messages.safetypay.TestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public api.mws.messages.safetypay.ShippedOrderResponse confirmShippedOrders(api.mws.messages.safetypay.ShippedOrderRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:safetypay:contract:mws:api:ConfirmShippedOrders");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ConfirmShippedOrders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (api.mws.messages.safetypay.ShippedOrderResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (api.mws.messages.safetypay.ShippedOrderResponse) org.apache.axis.utils.JavaUtils.convert(_resp, api.mws.messages.safetypay.ShippedOrderResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public api.mws.messages.safetypay.ExpressTokenResponse createExpressToken(api.mws.messages.safetypay.ExpressTokenRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:safetypay:contract:mws:api:CreateExpressToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateExpressToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (api.mws.messages.safetypay.ExpressTokenResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (api.mws.messages.safetypay.ExpressTokenResponse) org.apache.axis.utils.JavaUtils.convert(_resp, api.mws.messages.safetypay.ExpressTokenResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public api.mws.messages.safetypay.ExpressTokenReverseResponse createExpressTokenReverse(api.mws.messages.safetypay.ExpressTokenReverseRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:safetypay:contract:mws:api:CreateExpressTokenReverse");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateExpressTokenReverse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (api.mws.messages.safetypay.ExpressTokenReverseResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (api.mws.messages.safetypay.ExpressTokenReverseResponse) org.apache.axis.utils.JavaUtils.convert(_resp, api.mws.messages.safetypay.ExpressTokenReverseResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public api.mws.messages.safetypay.RefundProcessResponse createRefund(api.mws.messages.safetypay.RefundProcessRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:safetypay:contract:mws:api:CreateRefund");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateRefund"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (api.mws.messages.safetypay.RefundProcessResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (api.mws.messages.safetypay.RefundProcessResponse) org.apache.axis.utils.JavaUtils.convert(_resp, api.mws.messages.safetypay.RefundProcessResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public api.mws.messages.safetypay.RefundProcessResponse createGenericRefund(api.mws.messages.safetypay.GenericRefundProcessRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:safetypay:contract:mws:api:CreateGenericRefund");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateGenericRefund"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (api.mws.messages.safetypay.RefundProcessResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (api.mws.messages.safetypay.RefundProcessResponse) org.apache.axis.utils.JavaUtils.convert(_resp, api.mws.messages.safetypay.RefundProcessResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public api.mws.messages.safetypay.OperationResponse getNewOperationActivity(api.mws.messages.safetypay.OperationActivityRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:safetypay:contract:mws:api:GetNewOperationActivity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetNewOperationActivity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (api.mws.messages.safetypay.OperationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (api.mws.messages.safetypay.OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, api.mws.messages.safetypay.OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public api.mws.messages.safetypay.OperationActivityNotifiedResponse confirmNewOperationActivity(api.mws.messages.safetypay.OperationActivityNotifiedRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:safetypay:contract:mws:api:ConfirmNewOperationActivity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ConfirmNewOperationActivity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (api.mws.messages.safetypay.OperationActivityNotifiedResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (api.mws.messages.safetypay.OperationActivityNotifiedResponse) org.apache.axis.utils.JavaUtils.convert(_resp, api.mws.messages.safetypay.OperationActivityNotifiedResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public api.mws.messages.safetypay.OperationResponse getOperation(api.mws.messages.safetypay.OperationRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:safetypay:contract:mws:api:GetOperation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (api.mws.messages.safetypay.OperationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (api.mws.messages.safetypay.OperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, api.mws.messages.safetypay.OperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public api.mws.messages.safetypay.CustomTransactionResponse createCustomTransaction(api.mws.messages.safetypay.CustomTransactionRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:safetypay:contract:mws:api:CreateCustomTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateCustomTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (api.mws.messages.safetypay.CustomTransactionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (api.mws.messages.safetypay.CustomTransactionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, api.mws.messages.safetypay.CustomTransactionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public api.mws.messages.safetypay.TransactionSpecIdentifierResponse voidTransaction(api.mws.messages.safetypay.TransactionSpecIdentifierRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:safetypay:contract:mws:api:VoidTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VoidTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (api.mws.messages.safetypay.TransactionSpecIdentifierResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (api.mws.messages.safetypay.TransactionSpecIdentifierResponse) org.apache.axis.utils.JavaUtils.convert(_resp, api.mws.messages.safetypay.TransactionSpecIdentifierResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
