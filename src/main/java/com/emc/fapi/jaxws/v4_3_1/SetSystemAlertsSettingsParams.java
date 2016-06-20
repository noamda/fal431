package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSystemAlertsSettingsParams", propOrder = {"systemAlertsSettings", "requestedSmtpServerAddress"})
public class SetSystemAlertsSettingsParams {
    @XmlElement(nillable = true)
    protected SystemAlertsSettings systemAlertsSettings;
    protected String requestedSmtpServerAddress;

    public SetSystemAlertsSettingsParams() {
    }

    public SetSystemAlertsSettingsParams(SystemAlertsSettings systemAlertsSettings, String requestedSmtpServerAddress) {
        this.systemAlertsSettings = systemAlertsSettings;
        this.requestedSmtpServerAddress = requestedSmtpServerAddress;
    }


    public SystemAlertsSettings getSystemAlertsSettings() {
        return this.systemAlertsSettings;
    }


    public void setSystemAlertsSettings(SystemAlertsSettings value) {
        this.systemAlertsSettings = value;
    }


    public String getRequestedSmtpServerAddress() {
        return this.requestedSmtpServerAddress;
    }


    public void setRequestedSmtpServerAddress(String value) {
        this.requestedSmtpServerAddress = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetSystemAlertsSettingsParams)) {
            return false;
        }
        SetSystemAlertsSettingsParams otherObj = (SetSystemAlertsSettingsParams) obj;

        return (this.systemAlertsSettings != null ? this.systemAlertsSettings.equals(otherObj.systemAlertsSettings) : this.systemAlertsSettings == otherObj.systemAlertsSettings) && (this.requestedSmtpServerAddress != null ? this.requestedSmtpServerAddress.equals(otherObj.requestedSmtpServerAddress) : this.requestedSmtpServerAddress == otherObj.requestedSmtpServerAddress);
    }


    public int hashCode() {
        return (this.systemAlertsSettings != null ? this.systemAlertsSettings.hashCode() : 0) ^ (this.requestedSmtpServerAddress != null ? this.requestedSmtpServerAddress.hashCode() : 0);
    }


    public String toString() {
        return "SetSystemAlertsSettingsParams [systemAlertsSettings=" + this.systemAlertsSettings + ", " + "requestedSmtpServerAddress=" + this.requestedSmtpServerAddress + "]";
    }
}


