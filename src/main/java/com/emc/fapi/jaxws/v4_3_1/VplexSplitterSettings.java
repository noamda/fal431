package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("VplexSplitterSettings")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VplexSplitterSettings", propOrder = {"credentialsStatus", "credentials", "autoRegisterRPAsInitiators"})
public class VplexSplitterSettings
        extends AggregatedSplitterSettings {
    protected SplitterCredentialsStatus credentialsStatus;
    protected VplexSplitterCredentials credentials;
    protected boolean autoRegisterRPAsInitiators;

    public VplexSplitterSettings() {
    }

    public VplexSplitterSettings(SplitterCredentialsStatus credentialsStatus, VplexSplitterCredentials credentials, boolean autoRegisterRPAsInitiators) {
        this.credentialsStatus = credentialsStatus;
        this.credentials = credentials;
        this.autoRegisterRPAsInitiators = autoRegisterRPAsInitiators;
    }


    public SplitterCredentialsStatus getCredentialsStatus() {
        return this.credentialsStatus;
    }


    public void setCredentialsStatus(SplitterCredentialsStatus value) {
        this.credentialsStatus = value;
    }


    public VplexSplitterCredentials getCredentials() {
        return this.credentials;
    }


    public void setCredentials(VplexSplitterCredentials value) {
        this.credentials = value;
    }


    public boolean isAutoRegisterRPAsInitiators() {
        return this.autoRegisterRPAsInitiators;
    }


    public void setAutoRegisterRPAsInitiators(boolean value) {
        this.autoRegisterRPAsInitiators = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VplexSplitterSettings)) {
            return false;
        }
        VplexSplitterSettings otherObj = (VplexSplitterSettings) obj;

        return (super.equals(obj)) && (this.credentialsStatus != null ? this.credentialsStatus.equals(otherObj.credentialsStatus) : this.credentialsStatus == otherObj.credentialsStatus) && (this.credentials != null ? this.credentials.equals(otherObj.credentials) : this.credentials == otherObj.credentials) && (this.autoRegisterRPAsInitiators == otherObj.autoRegisterRPAsInitiators);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.credentialsStatus != null ? this.credentialsStatus.hashCode() : 0) ^ (this.credentials != null ? this.credentials.hashCode() : 0) ^ (this.autoRegisterRPAsInitiators ? 1 : 0);
    }


    public String toString() {
        return "VplexSplitterSettings [super=" + super.toString() + ", " + "credentialsStatus=" + this.credentialsStatus + ", " + "credentials=" + this.credentials + ", " + "autoRegisterRPAsInitiators=" + this.autoRegisterRPAsInitiators + "]";
    }
}


