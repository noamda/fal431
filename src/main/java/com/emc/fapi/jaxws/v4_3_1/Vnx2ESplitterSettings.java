package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("Vnx2eSplitterSettings")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vnx2eSplitterSettings", propOrder = {"autoRegisterRPAsInitiators", "credentials", "credentialsStatus"})
public class Vnx2ESplitterSettings
        extends AggregatedSplitterSettings {
    protected boolean autoRegisterRPAsInitiators;
    protected ClariionSplitterCredentials credentials;
    protected SplitterCredentialsStatus credentialsStatus;

    public Vnx2ESplitterSettings() {
    }

    public Vnx2ESplitterSettings(boolean autoRegisterRPAsInitiators, ClariionSplitterCredentials credentials, SplitterCredentialsStatus credentialsStatus) {
        this.autoRegisterRPAsInitiators = autoRegisterRPAsInitiators;
        this.credentials = credentials;
        this.credentialsStatus = credentialsStatus;
    }


    public boolean isAutoRegisterRPAsInitiators() {
        return this.autoRegisterRPAsInitiators;
    }


    public void setAutoRegisterRPAsInitiators(boolean value) {
        this.autoRegisterRPAsInitiators = value;
    }


    public ClariionSplitterCredentials getCredentials() {
        return this.credentials;
    }


    public void setCredentials(ClariionSplitterCredentials value) {
        this.credentials = value;
    }


    public SplitterCredentialsStatus getCredentialsStatus() {
        return this.credentialsStatus;
    }


    public void setCredentialsStatus(SplitterCredentialsStatus value) {
        this.credentialsStatus = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof Vnx2ESplitterSettings)) {
            return false;
        }
        Vnx2ESplitterSettings otherObj = (Vnx2ESplitterSettings) obj;

        return (super.equals(obj)) && (this.autoRegisterRPAsInitiators == otherObj.autoRegisterRPAsInitiators) && (this.credentials != null ? this.credentials.equals(otherObj.credentials) : this.credentials == otherObj.credentials) && (this.credentialsStatus != null ? this.credentialsStatus.equals(otherObj.credentialsStatus) : this.credentialsStatus == otherObj.credentialsStatus);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.autoRegisterRPAsInitiators ? 1 : 0) ^ (this.credentials != null ? this.credentials.hashCode() : 0) ^ (this.credentialsStatus != null ? this.credentialsStatus.hashCode() : 0);
    }


    public String toString() {
        return "Vnx2ESplitterSettings [super=" + super.toString() + ", " + "autoRegisterRPAsInitiators=" + this.autoRegisterRPAsInitiators + ", " + "credentials=" + this.credentials + ", " + "credentialsStatus=" + this.credentialsStatus + "]";
    }
}


