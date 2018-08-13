/**
 * SafetypayInterfaceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.contract.safetypay;

public interface SafetypayInterfaceService extends javax.xml.rpc.Service {
    public java.lang.String getMerchantExpressApiPortAddress();

    public api.mws.contract.safetypay.MerchantExpressApiOperations getMerchantExpressApiPort() throws javax.xml.rpc.ServiceException;

    public api.mws.contract.safetypay.MerchantExpressApiOperations getMerchantExpressApiPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
