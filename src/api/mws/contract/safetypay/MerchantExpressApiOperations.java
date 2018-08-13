/**
 * MerchantExpressApiOperations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package api.mws.contract.safetypay;

public interface MerchantExpressApiOperations extends java.rmi.Remote {
    public api.mws.messages.safetypay.TestResponse communicationTest(api.mws.messages.safetypay.TestRequest request) throws java.rmi.RemoteException;
    public api.mws.messages.safetypay.ShippedOrderResponse confirmShippedOrders(api.mws.messages.safetypay.ShippedOrderRequest request) throws java.rmi.RemoteException;
    public api.mws.messages.safetypay.ExpressTokenResponse createExpressToken(api.mws.messages.safetypay.ExpressTokenRequest request) throws java.rmi.RemoteException;
    public api.mws.messages.safetypay.ExpressTokenReverseResponse createExpressTokenReverse(api.mws.messages.safetypay.ExpressTokenReverseRequest request) throws java.rmi.RemoteException;
    public api.mws.messages.safetypay.RefundProcessResponse createRefund(api.mws.messages.safetypay.RefundProcessRequest request) throws java.rmi.RemoteException;
    public api.mws.messages.safetypay.RefundProcessResponse createGenericRefund(api.mws.messages.safetypay.GenericRefundProcessRequest request) throws java.rmi.RemoteException;
    public api.mws.messages.safetypay.OperationResponse getNewOperationActivity(api.mws.messages.safetypay.OperationActivityRequest request) throws java.rmi.RemoteException;
    public api.mws.messages.safetypay.OperationActivityNotifiedResponse confirmNewOperationActivity(api.mws.messages.safetypay.OperationActivityNotifiedRequest request) throws java.rmi.RemoteException;
    public api.mws.messages.safetypay.OperationResponse getOperation(api.mws.messages.safetypay.OperationRequest request) throws java.rmi.RemoteException;
    public api.mws.messages.safetypay.CustomTransactionResponse createCustomTransaction(api.mws.messages.safetypay.CustomTransactionRequest request) throws java.rmi.RemoteException;
    public api.mws.messages.safetypay.TransactionSpecIdentifierResponse voidTransaction(api.mws.messages.safetypay.TransactionSpecIdentifierRequest request) throws java.rmi.RemoteException;
}
