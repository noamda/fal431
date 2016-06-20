package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("VplexCredentials")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VplexCredentials", propOrder = {"credentialsType", "certificate"})
public class VplexCredentials
        extends BaseCredentials {
    @XmlElement(required = true)
    protected VplexCredentialsType credentialsType;
    @XmlElement(required = true)
    protected String certificate;

    public VplexCredentials() {
    }

    public VplexCredentials(VplexCredentialsType credentialsType, String certificate) {
        this.credentialsType = credentialsType;
        this.certificate = certificate;
    }


    public VplexCredentialsType getCredentialsType() {
        return this.credentialsType;
    }


    public void setCredentialsType(VplexCredentialsType value) {
        this.credentialsType = value;
    }


    public String getCertificate() {
        return this.certificate;
    }


    public void setCertificate(String value) {
        this.certificate = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VplexCredentials)) {
            return false;
        }
        VplexCredentials otherObj = (VplexCredentials) obj;

        return (super.equals(obj)) && (this.credentialsType != null ? this.credentialsType.equals(otherObj.credentialsType) : this.credentialsType == otherObj.credentialsType) && (this.certificate != null ? this.certificate.equals(otherObj.certificate) : this.certificate == otherObj.certificate);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.credentialsType != null ? this.credentialsType.hashCode() : 0) ^ (this.certificate != null ? this.certificate.hashCode() : 0);
    }


    public String toString() {
        return "VplexCredentials [super=" + super.toString() + ", " + "credentialsType=" + this.credentialsType + ", " + "certificate=" + this.certificate + "]";
    }
}


