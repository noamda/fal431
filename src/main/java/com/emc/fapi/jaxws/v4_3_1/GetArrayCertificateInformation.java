package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArrayCertificateInformation", propOrder = {"certificateInfoParam"})
public class GetArrayCertificateInformation {
    protected ArrayCertificateInformationParam certificateInfoParam;

    public GetArrayCertificateInformation() {
    }

    public GetArrayCertificateInformation(ArrayCertificateInformationParam certificateInfoParam) {
        this.certificateInfoParam = certificateInfoParam;
    }


    public ArrayCertificateInformationParam getCertificateInfoParam() {
        return this.certificateInfoParam;
    }


    public void setCertificateInfoParam(ArrayCertificateInformationParam value) {
        this.certificateInfoParam = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetArrayCertificateInformation)) {
            return false;
        }
        GetArrayCertificateInformation otherObj = (GetArrayCertificateInformation) obj;

        return this.certificateInfoParam == otherObj.certificateInfoParam ? true : this.certificateInfoParam != null ? this.certificateInfoParam.equals(otherObj.certificateInfoParam) : false;
    }


    public int hashCode() {
        return this.certificateInfoParam != null ? this.certificateInfoParam.hashCode() : 0;
    }


    public String toString() {
        return "GetArrayCertificateInformation [certificateInfoParam=" + this.certificateInfoParam + "]";
    }
}


