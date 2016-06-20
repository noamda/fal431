package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSystemAlertsSettings", propOrder = {"settings", "requestedSmtpServerAddress"})
public class SetSystemAlertsSettings {
    protected SystemAlertsSettings settings;
    protected String requestedSmtpServerAddress;

    public SetSystemAlertsSettings() {
    }

    public SetSystemAlertsSettings(SystemAlertsSettings settings, String requestedSmtpServerAddress) {
        this.settings = settings;
        this.requestedSmtpServerAddress = requestedSmtpServerAddress;
    }


    public SystemAlertsSettings getSettings() {
        return this.settings;
    }


    public void setSettings(SystemAlertsSettings value) {
        this.settings = value;
    }


    public String getRequestedSmtpServerAddress() {
        return this.requestedSmtpServerAddress;
    }


    public void setRequestedSmtpServerAddress(String value) {
        this.requestedSmtpServerAddress = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetSystemAlertsSettings)) {
            return false;
        }
        SetSystemAlertsSettings otherObj = (SetSystemAlertsSettings) obj;

        return (this.settings != null ? this.settings.equals(otherObj.settings) : this.settings == otherObj.settings) && (this.requestedSmtpServerAddress != null ? this.requestedSmtpServerAddress.equals(otherObj.requestedSmtpServerAddress) : this.requestedSmtpServerAddress == otherObj.requestedSmtpServerAddress);
    }


    public int hashCode() {
        return (this.settings != null ? this.settings.hashCode() : 0) ^ (this.requestedSmtpServerAddress != null ? this.requestedSmtpServerAddress.hashCode() : 0);
    }


    public String toString() {
        return "SetSystemAlertsSettings [settings=" + this.settings + ", " + "requestedSmtpServerAddress=" + this.requestedSmtpServerAddress + "]";
    }
}


