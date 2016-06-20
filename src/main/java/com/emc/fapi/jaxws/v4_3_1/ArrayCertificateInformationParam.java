package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayCertificateInformationParam", propOrder = {"ip", "clusterUID", "arrayType"})
public class ArrayCertificateInformationParam {
    @XmlElement(required = true)
    protected String ip;
    @XmlElement(required = true, nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected ArrayType arrayType;

    public ArrayCertificateInformationParam() {
    }

    public ArrayCertificateInformationParam(String ip, ClusterUID clusterUID, ArrayType arrayType) {
        this.ip = ip;
        this.clusterUID = clusterUID;
        this.arrayType = arrayType;
    }


    public String getIp() {
        return this.ip;
    }


    public void setIp(String value) {
        this.ip = value;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public ArrayType getArrayType() {
        return this.arrayType;
    }


    public void setArrayType(ArrayType value) {
        this.arrayType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayCertificateInformationParam)) {
            return false;
        }
        ArrayCertificateInformationParam otherObj = (ArrayCertificateInformationParam) obj;

        return (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.arrayType != null ? this.arrayType.equals(otherObj.arrayType) : this.arrayType == otherObj.arrayType);
    }


    public int hashCode() {
        return (this.ip != null ? this.ip.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.arrayType != null ? this.arrayType.hashCode() : 0);
    }


    public String toString() {
        return "ArrayCertificateInformationParam [ip=" + this.ip + ", " + "clusterUID=" + this.clusterUID + ", " + "arrayType=" + this.arrayType + "]";
    }
}


