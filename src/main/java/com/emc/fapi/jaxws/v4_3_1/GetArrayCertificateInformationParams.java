package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArrayCertificateInformationParams", propOrder = {"arrayType", "ip"})
public class GetArrayCertificateInformationParams {
    @XmlElement(nillable = true)
    protected ArrayType arrayType;
    protected String ip;

    public GetArrayCertificateInformationParams() {
    }

    public GetArrayCertificateInformationParams(ArrayType arrayType, String ip) {
        this.arrayType = arrayType;
        this.ip = ip;
    }


    public ArrayType getArrayType() {
        return this.arrayType;
    }


    public void setArrayType(ArrayType value) {
        this.arrayType = value;
    }


    public String getIp() {
        return this.ip;
    }


    public void setIp(String value) {
        this.ip = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetArrayCertificateInformationParams)) {
            return false;
        }
        GetArrayCertificateInformationParams otherObj = (GetArrayCertificateInformationParams) obj;

        return (this.arrayType != null ? this.arrayType.equals(otherObj.arrayType) : this.arrayType == otherObj.arrayType) && (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip);
    }


    public int hashCode() {
        return (this.arrayType != null ? this.arrayType.hashCode() : 0) ^ (this.ip != null ? this.ip.hashCode() : 0);
    }


    public String toString() {
        return "GetArrayCertificateInformationParams [arrayType=" + this.arrayType + ", " + "ip=" + this.ip + "]";
    }
}


