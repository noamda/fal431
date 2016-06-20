package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ClariionSplitterSettings")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClariionSplitterSettings", propOrder = {"credentialsStatus", "credentials"})
public class ClariionSplitterSettings
        extends ArrayBasedSplitterSettings {
    protected SplitterCredentialsStatus credentialsStatus;
    protected ClariionSplitterCredentials credentials;

    public ClariionSplitterSettings() {
    }

    public ClariionSplitterSettings(SplitterCredentialsStatus credentialsStatus, ClariionSplitterCredentials credentials) {
        this.credentialsStatus = credentialsStatus;
        this.credentials = credentials;
    }


    public SplitterCredentialsStatus getCredentialsStatus() {
        return this.credentialsStatus;
    }


    public void setCredentialsStatus(SplitterCredentialsStatus value) {
        this.credentialsStatus = value;
    }


    public ClariionSplitterCredentials getCredentials() {
        return this.credentials;
    }


    public void setCredentials(ClariionSplitterCredentials value) {
        this.credentials = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClariionSplitterSettings)) {
            return false;
        }
        ClariionSplitterSettings otherObj = (ClariionSplitterSettings) obj;

        return (super.equals(obj)) && (this.credentialsStatus != null ? this.credentialsStatus.equals(otherObj.credentialsStatus) : this.credentialsStatus == otherObj.credentialsStatus) && (this.credentials != null ? this.credentials.equals(otherObj.credentials) : this.credentials == otherObj.credentials);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.credentialsStatus != null ? this.credentialsStatus.hashCode() : 0) ^ (this.credentials != null ? this.credentials.hashCode() : 0);
    }


    public String toString() {
        return "ClariionSplitterSettings [super=" + super.toString() + ", " + "credentialsStatus=" + this.credentialsStatus + ", " + "credentials=" + this.credentials + "]";
    }
}


