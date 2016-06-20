package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.ws.WebFault;


@WebFault(name = "FunctionalAPIActionFailedException", targetNamespace = "http:
        public class FunctionalAPIActionFailedException_Exception
        extends Exception
        {
        private FunctionalAPIActionFailedException faultInfo;

        public FunctionalAPIActionFailedException_Exception(String message, FunctionalAPIActionFailedException faultInfo)
{
        super(message);
        this.faultInfo=faultInfo;
        }


public FunctionalAPIActionFailedException_Exception(String message,FunctionalAPIActionFailedException faultInfo,Throwable cause)
        {
        super(message,cause);
        this.faultInfo=faultInfo;
        }


public FunctionalAPIActionFailedException getFaultInfo()
        {
        return this.faultInfo;
        }
        }


