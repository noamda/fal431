package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemAlertsSettings", propOrder = {"emailFilters", "enabled", "sendDailyInfoToEMCSupport", "senderEmailAddress"})
public class SystemAlertsSettings {
    @XmlElement(nillable = true)
    protected List<EmailFilterData> emailFilters;
    protected boolean enabled;
    protected boolean sendDailyInfoToEMCSupport;
    protected String senderEmailAddress;

    public SystemAlertsSettings() {
    }

    public SystemAlertsSettings(List<EmailFilterData> emailFilters, boolean enabled, boolean sendDailyInfoToEMCSupport, String senderEmailAddress) {
        this.emailFilters = emailFilters;
        this.enabled = enabled;
        this.sendDailyInfoToEMCSupport = sendDailyInfoToEMCSupport;
        this.senderEmailAddress = senderEmailAddress;
    }


    public List<EmailFilterData> getEmailFilters() {
        if (this.emailFilters == null) {
            this.emailFilters = new ArrayList();
        }
        return this.emailFilters;
    }


    public boolean isEnabled() {
        return this.enabled;
    }


    public void setEnabled(boolean value) {
        this.enabled = value;
    }


    public boolean isSendDailyInfoToEMCSupport() {
        return this.sendDailyInfoToEMCSupport;
    }


    public void setSendDailyInfoToEMCSupport(boolean value) {
        this.sendDailyInfoToEMCSupport = value;
    }


    public String getSenderEmailAddress() {
        return this.senderEmailAddress;
    }


    public void setSenderEmailAddress(String value) {
        this.senderEmailAddress = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SystemAlertsSettings)) {
            return false;
        }
        SystemAlertsSettings otherObj = (SystemAlertsSettings) obj;

        return (this.emailFilters != null ? this.emailFilters.equals(otherObj.emailFilters) : this.emailFilters == otherObj.emailFilters) && (this.enabled == otherObj.enabled) && (this.sendDailyInfoToEMCSupport == otherObj.sendDailyInfoToEMCSupport) && (this.senderEmailAddress != null ? this.senderEmailAddress.equals(otherObj.senderEmailAddress) : this.senderEmailAddress == otherObj.senderEmailAddress);
    }


    public int hashCode() {
        return (this.emailFilters != null ? this.emailFilters.hashCode() : 0) ^ (this.enabled ? 1 : 0) ^ (this.sendDailyInfoToEMCSupport ? 1 : 0) ^ (this.senderEmailAddress != null ? this.senderEmailAddress.hashCode() : 0);
    }


    public String toString() {
        return "SystemAlertsSettings [emailFilters=" + this.emailFilters + ", " + "enabled=" + this.enabled + ", " + "sendDailyInfoToEMCSupport=" + this.sendDailyInfoToEMCSupport + ", " + "senderEmailAddress=" + this.senderEmailAddress + "]";
    }
}


