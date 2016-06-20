package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


@WebServiceClient(name = "FunctionalAPIImplService", targetNamespace = "http:
        public class FunctionalAPIImplService
        extends Service
        {
        private static final URL FUNCTIONALAPIIMPLSERVICE_WSDL_LOCATION;
        private static final WebServiceException FUNCTIONALAPIIMPLSERVICE_EXCEPTION;
        private static final QName FUNCTIONALAPIIMPLSERVICE_QNAME=new QName("http:

        static{
        FUNCTIONALAPIIMPLSERVICE_WSDL_LOCATION=FunctionalAPIImplService.class.getResource("/resource/FunctionalAPIImplService.wsdl");
        WebServiceException e=null;
        if(FUNCTIONALAPIIMPLSERVICE_WSDL_LOCATION == null){
        e = new WebServiceException("Cannot find '/resource/FunctionalAPIImplService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        FUNCTIONALAPIIMPLSERVICE_EXCEPTION = e;
        }

        public FunctionalAPIImplService(){
        super(__getWsdlLocation(), FUNCTIONALAPIIMPLSERVICE_QNAME);
        }

        public FunctionalAPIImplService(WebServiceFeature...features){
        super(__getWsdlLocation(),FUNCTIONALAPIIMPLSERVICE_QNAME,features);
        }

public FunctionalAPIImplService(URL wsdlLocation){
        super(wsdlLocation,FUNCTIONALAPIIMPLSERVICE_QNAME);
        }

public FunctionalAPIImplService(URL wsdlLocation,WebServiceFeature...features){
        super(wsdlLocation,FUNCTIONALAPIIMPLSERVICE_QNAME,features);
        }

public FunctionalAPIImplService(URL wsdlLocation,QName serviceName){
        super(wsdlLocation,serviceName);
        }

public FunctionalAPIImplService(URL wsdlLocation,QName serviceName,WebServiceFeature...features){
        super(wsdlLocation,serviceName,features);
        }


@WebEndpoint(name = "FunctionalAPIImplPort")
public FunctionalAPIImpl getFunctionalAPIImplPort()
        {
        return(FunctionalAPIImpl)super.getPort(new QName("http:
        }


@WebEndpoint(name = "FunctionalAPIImplPort")
public FunctionalAPIImpl getFunctionalAPIImplPort(WebServiceFeature...features)
        {
        return(FunctionalAPIImpl)super.getPort(new QName("http:
        }

private static URL __getWsdlLocation(){
        if(FUNCTIONALAPIIMPLSERVICE_EXCEPTION!=null){
        throw FUNCTIONALAPIIMPLSERVICE_EXCEPTION;
        }
        return FUNCTIONALAPIIMPLSERVICE_WSDL_LOCATION;
        }
        }


