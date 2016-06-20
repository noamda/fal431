package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LDAPProtocol", propOrder = {"protocolType", "certificate", "useCertificate"})
public class LDAPProtocol {
    @XmlElement(required = true)
    protected LdapProtocolType protocolType;
    @XmlElement(required = true)
    protected String certificate;
    protected boolean useCertificate;

    public LDAPProtocol() {
    }

    public LDAPProtocol(LdapProtocolType protocolType, String certificate, boolean useCertificate) {
        this.protocolType = protocolType;
        this.certificate = certificate;
        this.useCertificate = useCertificate;
    }


    public LdapProtocolType getProtocolType() {
        return this.protocolType;
    }


    public void setProtocolType(LdapProtocolType value) {
        this.protocolType = value;
    }


    public String getCertificate() {
        return this.certificate;
    }


    public void setCertificate(String value) {
        this.certificate = value;
    }


    public boolean isUseCertificate() {
        return this.useCertificate;
    }


    public void setUseCertificate(boolean value) {
        this.useCertificate = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof LDAPProtocol)) {
            return false;
        }
        LDAPProtocol otherObj = (LDAPProtocol) obj;

        return (this.protocolType != null ? this.protocolType.equals(otherObj.protocolType) : this.protocolType == otherObj.protocolType) && (this.certificate != null ? this.certificate.equals(otherObj.certificate) : this.certificate == otherObj.certificate) && (this.useCertificate == otherObj.useCertificate);
    }


    public int hashCode() {
        return (this.protocolType != null ? this.protocolType.hashCode() : 0) ^ (this.certificate != null ? this.certificate.hashCode() : 0) ^ (this.useCertificate ? 1 : 0);
    }


    public String toString() {
        return "LDAPProtocol [protocolType=" + this.protocolType + ", " + "certificate=" + this.certificate + ", " + "useCertificate=" + this.useCertificate + "]";
    }
}


