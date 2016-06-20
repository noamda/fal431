package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("XioCredentials")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XioCredentials", propOrder = {"certificate"})
public class XioCredentials
        extends BaseCredentials {
    @XmlElement(required = true)
    protected String certificate;

    public XioCredentials() {
    }

    public XioCredentials(String certificate) {
        this.certificate = certificate;
    }


    public String getCertificate() {
        return this.certificate;
    }


    public void setCertificate(String value) {
        this.certificate = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof XioCredentials)) {
            return false;
        }
        XioCredentials otherObj = (XioCredentials) obj;

        return (super.equals(obj)) && (this.certificate != null ? this.certificate.equals(otherObj.certificate) : this.certificate == otherObj.certificate);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.certificate != null ? this.certificate.hashCode() : 0);
    }


    public String toString() {
        return "XioCredentials [super=" + super.toString() + ", " + "certificate=" + this.certificate + "]";
    }
}


