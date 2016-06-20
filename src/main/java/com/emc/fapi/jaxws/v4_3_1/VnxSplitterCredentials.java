package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("VnxSplitterCredentials")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VnxSplitterCredentials", propOrder = {"certificate", "spAport", "spBport"})
public class VnxSplitterCredentials
        extends BaseSplitterCredentials {
    @XmlElement(required = true)
    protected String certificate;
    @XmlElement(name = "SPAport")
    protected int spAport;
    @XmlElement(name = "SPBport")
    protected int spBport;

    public VnxSplitterCredentials() {
    }

    public VnxSplitterCredentials(String certificate, int spAport, int spBport) {
        this.certificate = certificate;
        this.spAport = spAport;
        this.spBport = spBport;
    }


    public String getCertificate() {
        return this.certificate;
    }


    public void setCertificate(String value) {
        this.certificate = value;
    }


    public int getSPAport() {
        return this.spAport;
    }


    public void setSPAport(int value) {
        this.spAport = value;
    }


    public int getSPBport() {
        return this.spBport;
    }


    public void setSPBport(int value) {
        this.spBport = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VnxSplitterCredentials)) {
            return false;
        }
        VnxSplitterCredentials otherObj = (VnxSplitterCredentials) obj;

        return (super.equals(obj)) && (this.certificate != null ? this.certificate.equals(otherObj.certificate) : this.certificate == otherObj.certificate) && (this.spAport == otherObj.spAport) && (this.spBport == otherObj.spBport);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.certificate != null ? this.certificate.hashCode() : 0) ^ this.spAport ^ this.spBport;
    }


    public String toString() {
        return "VnxSplitterCredentials [super=" + super.toString() + ", " + "certificate=" + this.certificate + ", " + "spAport=" + this.spAport + ", " + "spBport=" + this.spBport + "]";
    }
}


