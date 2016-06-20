package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSystemReportSettingsParams", propOrder = {"systemReportSettings", "requestedSmtpServerAddress"})
public class SetSystemReportSettingsParams {
    @XmlElement(nillable = true)
    protected SystemReportSettings systemReportSettings;
    protected String requestedSmtpServerAddress;

    public SetSystemReportSettingsParams() {
    }

    public SetSystemReportSettingsParams(SystemReportSettings systemReportSettings, String requestedSmtpServerAddress) {
        this.systemReportSettings = systemReportSettings;
        this.requestedSmtpServerAddress = requestedSmtpServerAddress;
    }


    public SystemReportSettings getSystemReportSettings() {
        return this.systemReportSettings;
    }


    public void setSystemReportSettings(SystemReportSettings value) {
        this.systemReportSettings = value;
    }


    public String getRequestedSmtpServerAddress() {
        return this.requestedSmtpServerAddress;
    }


    public void setRequestedSmtpServerAddress(String value) {
        this.requestedSmtpServerAddress = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetSystemReportSettingsParams)) {
            return false;
        }
        SetSystemReportSettingsParams otherObj = (SetSystemReportSettingsParams) obj;

        return (this.systemReportSettings != null ? this.systemReportSettings.equals(otherObj.systemReportSettings) : this.systemReportSettings == otherObj.systemReportSettings) && (this.requestedSmtpServerAddress != null ? this.requestedSmtpServerAddress.equals(otherObj.requestedSmtpServerAddress) : this.requestedSmtpServerAddress == otherObj.requestedSmtpServerAddress);
    }


    public int hashCode() {
        return (this.systemReportSettings != null ? this.systemReportSettings.hashCode() : 0) ^ (this.requestedSmtpServerAddress != null ? this.requestedSmtpServerAddress.hashCode() : 0);
    }


    public String toString() {
        return "SetSystemReportSettingsParams [systemReportSettings=" + this.systemReportSettings + ", " + "requestedSmtpServerAddress=" + this.requestedSmtpServerAddress + "]";
    }
}


