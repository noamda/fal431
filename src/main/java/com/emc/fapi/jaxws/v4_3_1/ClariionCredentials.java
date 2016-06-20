package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ClariionCredentials")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClariionCredentials", propOrder = {"credentialsType", "authenticationType", "certificate"})
public class ClariionCredentials
        extends BaseCredentials {
    @XmlElement(required = true)
    protected ClariionCredentialsType credentialsType;
    @XmlElement(required = true, nillable = true)
    protected AuthenticationType authenticationType;
    protected String certificate;

    public ClariionCredentials() {
    }

    public ClariionCredentials(ClariionCredentialsType credentialsType, AuthenticationType authenticationType, String certificate) {
        this.credentialsType = credentialsType;
        this.authenticationType = authenticationType;
        this.certificate = certificate;
    }


    public ClariionCredentialsType getCredentialsType() {
        return this.credentialsType;
    }


    public void setCredentialsType(ClariionCredentialsType value) {
        this.credentialsType = value;
    }


    public AuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }


    public void setAuthenticationType(AuthenticationType value) {
        this.authenticationType = value;
    }


    public String getCertificate() {
        return this.certificate;
    }


    public void setCertificate(String value) {
        this.certificate = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClariionCredentials)) {
            return false;
        }
        ClariionCredentials otherObj = (ClariionCredentials) obj;

        return (super.equals(obj)) && (this.credentialsType != null ? this.credentialsType.equals(otherObj.credentialsType) : this.credentialsType == otherObj.credentialsType) && (this.authenticationType != null ? this.authenticationType.equals(otherObj.authenticationType) : this.authenticationType == otherObj.authenticationType) && (this.certificate != null ? this.certificate.equals(otherObj.certificate) : this.certificate == otherObj.certificate);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.credentialsType != null ? this.credentialsType.hashCode() : 0) ^ (this.authenticationType != null ? this.authenticationType.hashCode() : 0) ^ (this.certificate != null ? this.certificate.hashCode() : 0);
    }


    public String toString() {
        return "ClariionCredentials [super=" + super.toString() + ", " + "credentialsType=" + this.credentialsType + ", " + "authenticationType=" + this.authenticationType + ", " + "certificate=" + this.certificate + "]";
    }
}


