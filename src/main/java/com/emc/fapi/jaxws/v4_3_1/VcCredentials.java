package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("VcCredentials")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VcCredentials", propOrder = {"certificate"})
public class VcCredentials
        extends BaseCredentials {
    @XmlElement(required = true)
    protected String certificate;

    public VcCredentials() {
    }

    public VcCredentials(String certificate) {
        this.certificate = certificate;
    }


    public String getCertificate() {
        return this.certificate;
    }


    public void setCertificate(String value) {
        this.certificate = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VcCredentials)) {
            return false;
        }
        VcCredentials otherObj = (VcCredentials) obj;

        return (super.equals(obj)) && (this.certificate != null ? this.certificate.equals(otherObj.certificate) : this.certificate == otherObj.certificate);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.certificate != null ? this.certificate.hashCode() : 0);
    }


    public String toString() {
        return "VcCredentials [super=" + super.toString() + ", " + "certificate=" + this.certificate + "]";
    }
}


