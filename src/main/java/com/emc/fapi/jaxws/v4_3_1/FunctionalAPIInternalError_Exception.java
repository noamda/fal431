package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.ws.WebFault;


@WebFault(name = "FunctionalAPIInternalError", targetNamespace = "http:
        public class FunctionalAPIInternalError_Exception
        extends Exception
        {
        private FunctionalAPIInternalError faultInfo;

        public FunctionalAPIInternalError_Exception(String message, FunctionalAPIInternalError faultInfo)
{
        super(message);
        this.faultInfo=faultInfo;
        }


public FunctionalAPIInternalError_Exception(String message,FunctionalAPIInternalError faultInfo,Throwable cause)
        {
        super(message,cause);
        this.faultInfo=faultInfo;
        }


public FunctionalAPIInternalError getFaultInfo()
        {
        return this.faultInfo;
        }
        }


