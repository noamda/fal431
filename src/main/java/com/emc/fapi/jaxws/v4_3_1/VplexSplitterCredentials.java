package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("VplexSplitterCredentials")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VplexSplitterCredentials", propOrder = {"certificate"})
public class VplexSplitterCredentials
        extends BaseSplitterCredentials {
    protected String certificate;

    public VplexSplitterCredentials() {
    }

    public VplexSplitterCredentials(String certificate) {
        this.certificate = certificate;
    }


    public String getCertificate() {
        return this.certificate;
    }


    public void setCertificate(String value) {
        this.certificate = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VplexSplitterCredentials)) {
            return false;
        }
        VplexSplitterCredentials otherObj = (VplexSplitterCredentials) obj;

        return (super.equals(obj)) && (this.certificate != null ? this.certificate.equals(otherObj.certificate) : this.certificate == otherObj.certificate);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.certificate != null ? this.certificate.hashCode() : 0);
    }


    public String toString() {
        return "VplexSplitterCredentials [super=" + super.toString() + ", " + "certificate=" + this.certificate + "]";
    }
}


