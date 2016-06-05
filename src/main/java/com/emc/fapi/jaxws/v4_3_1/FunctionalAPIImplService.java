/*    */ package com.emc.fapi.jaxws.v4_3_1;
/*    */ 
/*    */ import java.net.URL;
/*    */ import javax.xml.namespace.QName;
/*    */ import javax.xml.ws.Service;
/*    */ import javax.xml.ws.WebEndpoint;
/*    */ import javax.xml.ws.WebServiceClient;
/*    */ import javax.xml.ws.WebServiceException;
/*    */ import javax.xml.ws.WebServiceFeature;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @WebServiceClient(name="FunctionalAPIImplService", targetNamespace="http://impl.version4_3_1.fapi.emc.com/", wsdlLocation="/resource/FunctionalAPIImplService.wsdl")
/*    */ public class FunctionalAPIImplService
/*    */   extends Service
/*    */ {
/*    */   private static final URL FUNCTIONALAPIIMPLSERVICE_WSDL_LOCATION;
/*    */   private static final WebServiceException FUNCTIONALAPIIMPLSERVICE_EXCEPTION;
/* 26 */   private static final QName FUNCTIONALAPIIMPLSERVICE_QNAME = new QName("http://impl.version4_3_1.fapi.emc.com/", "FunctionalAPIImplService");
/*    */   
/*    */   static {
/* 29 */     FUNCTIONALAPIIMPLSERVICE_WSDL_LOCATION = FunctionalAPIImplService.class.getResource("/resource/FunctionalAPIImplService.wsdl");
/* 30 */     WebServiceException e = null;
/* 31 */     if (FUNCTIONALAPIIMPLSERVICE_WSDL_LOCATION == null) {
/* 32 */       e = new WebServiceException("Cannot find '/resource/FunctionalAPIImplService.wsdl' wsdl. Place the resource correctly in the classpath.");
/*    */     }
/* 34 */     FUNCTIONALAPIIMPLSERVICE_EXCEPTION = e;
/*    */   }
/*    */   
/*    */   public FunctionalAPIImplService() {
/* 38 */     super(__getWsdlLocation(), FUNCTIONALAPIIMPLSERVICE_QNAME);
/*    */   }
/*    */   
/*    */   public FunctionalAPIImplService(WebServiceFeature... features) {
/* 42 */     super(__getWsdlLocation(), FUNCTIONALAPIIMPLSERVICE_QNAME, features);
/*    */   }
/*    */   
/*    */   public FunctionalAPIImplService(URL wsdlLocation) {
/* 46 */     super(wsdlLocation, FUNCTIONALAPIIMPLSERVICE_QNAME);
/*    */   }
/*    */   
/*    */   public FunctionalAPIImplService(URL wsdlLocation, WebServiceFeature... features) {
/* 50 */     super(wsdlLocation, FUNCTIONALAPIIMPLSERVICE_QNAME, features);
/*    */   }
/*    */   
/*    */   public FunctionalAPIImplService(URL wsdlLocation, QName serviceName) {
/* 54 */     super(wsdlLocation, serviceName);
/*    */   }
/*    */   
/*    */   public FunctionalAPIImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
/* 58 */     super(wsdlLocation, serviceName, features);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @WebEndpoint(name="FunctionalAPIImplPort")
/*    */   public FunctionalAPIImpl getFunctionalAPIImplPort()
/*    */   {
/* 68 */     return (FunctionalAPIImpl)super.getPort(new QName("http://impl.version4_3_1.fapi.emc.com/", "FunctionalAPIImplPort"), FunctionalAPIImpl.class);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @WebEndpoint(name="FunctionalAPIImplPort")
/*    */   public FunctionalAPIImpl getFunctionalAPIImplPort(WebServiceFeature... features)
/*    */   {
/* 80 */     return (FunctionalAPIImpl)super.getPort(new QName("http://impl.version4_3_1.fapi.emc.com/", "FunctionalAPIImplPort"), FunctionalAPIImpl.class, features);
/*    */   }
/*    */   
/*    */   private static URL __getWsdlLocation() {
/* 84 */     if (FUNCTIONALAPIIMPLSERVICE_EXCEPTION != null) {
/* 85 */       throw FUNCTIONALAPIIMPLSERVICE_EXCEPTION;
/*    */     }
/* 87 */     return FUNCTIONALAPIIMPLSERVICE_WSDL_LOCATION;
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FunctionalAPIImplService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */