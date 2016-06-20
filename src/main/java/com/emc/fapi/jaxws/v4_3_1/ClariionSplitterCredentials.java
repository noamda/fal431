package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ClariionSplitterCredentials")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClariionSplitterCredentials", propOrder = {"credentialsType", "spBip", "authenticationType"})
public class ClariionSplitterCredentials
        extends BaseSplitterCredentials {
    @XmlElement(required = true)
    protected ClariionSplitterCredentialsType credentialsType;
    @XmlElement(name = "SPBip")
    protected String spBip;
    @XmlElement(required = true, nillable = true)
    protected AuthenticationType authenticationType;

    public ClariionSplitterCredentials() {
    }

    public ClariionSplitterCredentials(ClariionSplitterCredentialsType credentialsType, String spBip, AuthenticationType authenticationType) {
        this.credentialsType = credentialsType;
        this.spBip = spBip;
        this.authenticationType = authenticationType;
    }


    public ClariionSplitterCredentialsType getCredentialsType() {
        return this.credentialsType;
    }


    public void setCredentialsType(ClariionSplitterCredentialsType value) {
        this.credentialsType = value;
    }


    public String getSPBip() {
        return this.spBip;
    }


    public void setSPBip(String value) {
        this.spBip = value;
    }


    public AuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }


    public void setAuthenticationType(AuthenticationType value) {
        this.authenticationType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClariionSplitterCredentials)) {
            return false;
        }
        ClariionSplitterCredentials otherObj = (ClariionSplitterCredentials) obj;

        return (super.equals(obj)) && (this.credentialsType != null ? this.credentialsType.equals(otherObj.credentialsType) : this.credentialsType == otherObj.credentialsType) && (this.spBip != null ? this.spBip.equals(otherObj.spBip) : this.spBip == otherObj.spBip) && (this.authenticationType != null ? this.authenticationType.equals(otherObj.authenticationType) : this.authenticationType == otherObj.authenticationType);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.credentialsType != null ? this.credentialsType.hashCode() : 0) ^ (this.spBip != null ? this.spBip.hashCode() : 0) ^ (this.authenticationType != null ? this.authenticationType.hashCode() : 0);
    }


    public String toString() {
        return "ClariionSplitterCredentials [super=" + super.toString() + ", " + "credentialsType=" + this.credentialsType + ", " + "spBip=" + this.spBip + ", " + "authenticationType=" + this.authenticationType + "]";
    }
}


