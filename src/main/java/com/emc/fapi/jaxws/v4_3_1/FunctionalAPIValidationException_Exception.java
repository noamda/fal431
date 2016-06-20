package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.ws.WebFault;


@WebFault(name = "FunctionalAPIValidationException", targetNamespace = "http:
        public class FunctionalAPIValidationException_Exception
        extends Exception
        {
        private FunctionalAPIValidationException faultInfo;

        public FunctionalAPIValidationException_Exception(String message, FunctionalAPIValidationException faultInfo)
{
        super(message);
        this.faultInfo=faultInfo;
        }


public FunctionalAPIValidationException_Exception(String message,FunctionalAPIValidationException faultInfo,Throwable cause)
        {
        super(message,cause);
        this.faultInfo=faultInfo;
        }


public FunctionalAPIValidationException getFaultInfo()
        {
        return this.faultInfo;
        }
        }


