/**
 * SafetypayInterfaceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.contract.safetypay;

public class SafetypayInterfaceServiceLocator extends org.apache.axis.client.Service implements api.mws.contract.safetypay.SafetypayInterfaceService {

    public SafetypayInterfaceServiceLocator() {
    }


    public SafetypayInterfaceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SafetypayInterfaceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MerchantExpressApiPort
    private java.lang.String MerchantExpressApiPort_address = "https://sandbox-mws2.safetypay.com/express/ws/v.3.0/";

    public java.lang.String getMerchantExpressApiPortAddress() {
        return MerchantExpressApiPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MerchantExpressApiPortWSDDServiceName = "MerchantExpressApiPort";

    public java.lang.String getMerchantExpressApiPortWSDDServiceName() {
        return MerchantExpressApiPortWSDDServiceName;
    }

    public void setMerchantExpressApiPortWSDDServiceName(java.lang.String name) {
        MerchantExpressApiPortWSDDServiceName = name;
    }

    public api.mws.contract.safetypay.MerchantExpressApiOperations getMerchantExpressApiPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MerchantExpressApiPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMerchantExpressApiPort(endpoint);
    }

    public api.mws.contract.safetypay.MerchantExpressApiOperations getMerchantExpressApiPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            api.mws.contract.safetypay.MerchantExpressApiBindingStub _stub = new api.mws.contract.safetypay.MerchantExpressApiBindingStub(portAddress, this);
            _stub.setPortName(getMerchantExpressApiPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMerchantExpressApiPortEndpointAddress(java.lang.String address) {
        MerchantExpressApiPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (api.mws.contract.safetypay.MerchantExpressApiOperations.class.isAssignableFrom(serviceEndpointInterface)) {
                api.mws.contract.safetypay.MerchantExpressApiBindingStub _stub = new api.mws.contract.safetypay.MerchantExpressApiBindingStub(new java.net.URL(MerchantExpressApiPort_address), this);
                _stub.setPortName(getMerchantExpressApiPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MerchantExpressApiPort".equals(inputPortName)) {
            return getMerchantExpressApiPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:safetypay:contract:mws:api", "SafetypayInterfaceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:safetypay:contract:mws:api", "MerchantExpressApiPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MerchantExpressApiPort".equals(portName)) {
            setMerchantExpressApiPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
