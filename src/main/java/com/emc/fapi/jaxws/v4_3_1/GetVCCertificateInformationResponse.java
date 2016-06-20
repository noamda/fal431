package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVCCertificateInformationResponse", propOrder = {"_return"})
public class GetVCCertificateInformationResponse {
    @XmlElement(name = "return")
    protected CertificateInformation _return;

    public GetVCCertificateInformationResponse() {
    }

    public GetVCCertificateInformationResponse(CertificateInformation _return) {
        this._return = _return;
    }


    public CertificateInformation getReturn() {
        return this._return;
    }


    public void setReturn(CertificateInformation value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVCCertificateInformationResponse)) {
            return false;
        }
        GetVCCertificateInformationResponse otherObj = (GetVCCertificateInformationResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetVCCertificateInformationResponse [_return=" + this._return + "]";
    }
}


