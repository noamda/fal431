package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVPLEXCertificateInformationResponse", propOrder = {"_return"})
public class GetVPLEXCertificateInformationResponse {
    @XmlElement(name = "return")
    protected CertificateInformation _return;

    public GetVPLEXCertificateInformationResponse() {
    }

    public GetVPLEXCertificateInformationResponse(CertificateInformation _return) {
        this._return = _return;
    }


    public CertificateInformation getReturn() {
        return this._return;
    }


    public void setReturn(CertificateInformation value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVPLEXCertificateInformationResponse)) {
            return false;
        }
        GetVPLEXCertificateInformationResponse otherObj = (GetVPLEXCertificateInformationResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetVPLEXCertificateInformationResponse [_return=" + this._return + "]";
    }
}


