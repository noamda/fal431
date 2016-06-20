package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagementSettings", propOrder = {"usersSettings", "alertsSettings", "reportSettings", "snmpSettings", "miscSettings", "syslogSettings", "vcenterServersViewSettings", "timeSettings", "showFirstTimeWizard", "callHomeEventsSettings", "systemEventLogsFilters", "userDefinedProperties", "smtpServerAddress", "policyTemplates"})
public class ManagementSettings {
    @XmlElement(nillable = true)
    protected UsersSettings usersSettings;
    protected SystemAlertsSettings alertsSettings;
    protected SystemReportSettings reportSettings;
    @XmlElement(nillable = true)
    protected SNMPSettings snmpSettings;
    protected SystemMiscellaneousSettings miscSettings;
    @XmlElement(nillable = true)
    protected SyslogSettings syslogSettings;
    @XmlElement(nillable = true)
    protected VCenterServersViewSettings vcenterServersViewSettings;
    @XmlElement(nillable = true)
    protected TimeSettings timeSettings;
    protected boolean showFirstTimeWizard;
    protected CallHomeEvents callHomeEventsSettings;
    @XmlElement(nillable = true)
    protected List<SystemEventLogsFilter> systemEventLogsFilters;
    @XmlElement(nillable = true)
    protected UserDefinedProperties userDefinedProperties;
    protected String smtpServerAddress;
    @XmlElement(nillable = true)
    protected PolicyTemplates policyTemplates;

    public ManagementSettings() {
    }

    public ManagementSettings(UsersSettings usersSettings, SystemAlertsSettings alertsSettings, SystemReportSettings reportSettings, SNMPSettings snmpSettings, SystemMiscellaneousSettings miscSettings, SyslogSettings syslogSettings, VCenterServersViewSettings vcenterServersViewSettings, TimeSettings timeSettings, boolean showFirstTimeWizard, CallHomeEvents callHomeEventsSettings, List<SystemEventLogsFilter> systemEventLogsFilters, UserDefinedProperties userDefinedProperties, String smtpServerAddress, PolicyTemplates policyTemplates) {
        this.usersSettings = usersSettings;
        this.alertsSettings = alertsSettings;
        this.reportSettings = reportSettings;
        this.snmpSettings = snmpSettings;
        this.miscSettings = miscSettings;
        this.syslogSettings = syslogSettings;
        this.vcenterServersViewSettings = vcenterServersViewSettings;
        this.timeSettings = timeSettings;
        this.showFirstTimeWizard = showFirstTimeWizard;
        this.callHomeEventsSettings = callHomeEventsSettings;
        this.systemEventLogsFilters = systemEventLogsFilters;
        this.userDefinedProperties = userDefinedProperties;
        this.smtpServerAddress = smtpServerAddress;
        this.policyTemplates = policyTemplates;
    }


    public UsersSettings getUsersSettings() {
        return this.usersSettings;
    }


    public void setUsersSettings(UsersSettings value) {
        this.usersSettings = value;
    }


    public SystemAlertsSettings getAlertsSettings() {
        return this.alertsSettings;
    }


    public void setAlertsSettings(SystemAlertsSettings value) {
        this.alertsSettings = value;
    }


    public SystemReportSettings getReportSettings() {
        return this.reportSettings;
    }


    public void setReportSettings(SystemReportSettings value) {
        this.reportSettings = value;
    }


    public SNMPSettings getSnmpSettings() {
        return this.snmpSettings;
    }


    public void setSnmpSettings(SNMPSettings value) {
        this.snmpSettings = value;
    }


    public SystemMiscellaneousSettings getMiscSettings() {
        return this.miscSettings;
    }


    public void setMiscSettings(SystemMiscellaneousSettings value) {
        this.miscSettings = value;
    }


    public SyslogSettings getSyslogSettings() {
        return this.syslogSettings;
    }


    public void setSyslogSettings(SyslogSettings value) {
        this.syslogSettings = value;
    }


    public VCenterServersViewSettings getVcenterServersViewSettings() {
        return this.vcenterServersViewSettings;
    }


    public void setVcenterServersViewSettings(VCenterServersViewSettings value) {
        this.vcenterServersViewSettings = value;
    }


    public TimeSettings getTimeSettings() {
        return this.timeSettings;
    }


    public void setTimeSettings(TimeSettings value) {
        this.timeSettings = value;
    }


    public boolean isShowFirstTimeWizard() {
        return this.showFirstTimeWizard;
    }


    public void setShowFirstTimeWizard(boolean value) {
        this.showFirstTimeWizard = value;
    }


    public CallHomeEvents getCallHomeEventsSettings() {
        return this.callHomeEventsSettings;
    }


    public void setCallHomeEventsSettings(CallHomeEvents value) {
        this.callHomeEventsSettings = value;
    }


    public List<SystemEventLogsFilter> getSystemEventLogsFilters() {
        if (this.systemEventLogsFilters == null) {
            this.systemEventLogsFilters = new ArrayList();
        }
        return this.systemEventLogsFilters;
    }


    public UserDefinedProperties getUserDefinedProperties() {
        return this.userDefinedProperties;
    }


    public void setUserDefinedProperties(UserDefinedProperties value) {
        this.userDefinedProperties = value;
    }


    public String getSmtpServerAddress() {
        return this.smtpServerAddress;
    }


    public void setSmtpServerAddress(String value) {
        this.smtpServerAddress = value;
    }


    public PolicyTemplates getPolicyTemplates() {
        return this.policyTemplates;
    }


    public void setPolicyTemplates(PolicyTemplates value) {
        this.policyTemplates = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ManagementSettings)) {
            return false;
        }
        ManagementSettings otherObj = (ManagementSettings) obj;

        return (this.usersSettings != null ? this.usersSettings.equals(otherObj.usersSettings) : this.usersSettings == otherObj.usersSettings) && (this.alertsSettings != null ? this.alertsSettings.equals(otherObj.alertsSettings) : this.alertsSettings == otherObj.alertsSettings) && (this.reportSettings != null ? this.reportSettings.equals(otherObj.reportSettings) : this.reportSettings == otherObj.reportSettings) && (this.snmpSettings != null ? this.snmpSettings.equals(otherObj.snmpSettings) : this.snmpSettings == otherObj.snmpSettings) && (this.miscSettings != null ? this.miscSettings.equals(otherObj.miscSettings) : this.miscSettings == otherObj.miscSettings) && (this.syslogSettings != null ? this.syslogSettings.equals(otherObj.syslogSettings) : this.syslogSettings == otherObj.syslogSettings) && (this.vcenterServersViewSettings != null ? this.vcenterServersViewSettings.equals(otherObj.vcenterServersViewSettings) : this.vcenterServersViewSettings == otherObj.vcenterServersViewSettings) && (this.timeSettings != null ? this.timeSettings.equals(otherObj.timeSettings) : this.timeSettings == otherObj.timeSettings) && (this.showFirstTimeWizard == otherObj.showFirstTimeWizard) && (this.callHomeEventsSettings != null ? this.callHomeEventsSettings.equals(otherObj.callHomeEventsSettings) : this.callHomeEventsSettings == otherObj.callHomeEventsSettings) && (this.systemEventLogsFilters != null ? this.systemEventLogsFilters.equals(otherObj.systemEventLogsFilters) : this.systemEventLogsFilters == otherObj.systemEventLogsFilters) && (this.userDefinedProperties != null ? this.userDefinedProperties.equals(otherObj.userDefinedProperties) : this.userDefinedProperties == otherObj.userDefinedProperties) && (this.smtpServerAddress != null ? this.smtpServerAddress.equals(otherObj.smtpServerAddress) : this.smtpServerAddress == otherObj.smtpServerAddress) && (this.policyTemplates != null ? this.policyTemplates.equals(otherObj.policyTemplates) : this.policyTemplates == otherObj.policyTemplates);
    }


    public int hashCode() {
        return (this.usersSettings != null ? this.usersSettings.hashCode() : 0) ^ (this.alertsSettings != null ? this.alertsSettings.hashCode() : 0) ^ (this.reportSettings != null ? this.reportSettings.hashCode() : 0) ^ (this.snmpSettings != null ? this.snmpSettings.hashCode() : 0) ^ (this.miscSettings != null ? this.miscSettings.hashCode() : 0) ^ (this.syslogSettings != null ? this.syslogSettings.hashCode() : 0) ^ (this.vcenterServersViewSettings != null ? this.vcenterServersViewSettings.hashCode() : 0) ^ (this.timeSettings != null ? this.timeSettings.hashCode() : 0) ^ (this.showFirstTimeWizard ? 1 : 0) ^ (this.callHomeEventsSettings != null ? this.callHomeEventsSettings.hashCode() : 0) ^ (this.systemEventLogsFilters != null ? this.systemEventLogsFilters.hashCode() : 0) ^ (this.userDefinedProperties != null ? this.userDefinedProperties.hashCode() : 0) ^ (this.smtpServerAddress != null ? this.smtpServerAddress.hashCode() : 0) ^ (this.policyTemplates != null ? this.policyTemplates.hashCode() : 0);
    }


    public String toString() {
        return "ManagementSettings [usersSettings=" + this.usersSettings + ", " + "alertsSettings=" + this.alertsSettings + ", " + "reportSettings=" + this.reportSettings + ", " + "snmpSettings=" + this.snmpSettings + ", " + "miscSettings=" + this.miscSettings + ", " + "syslogSettings=" + this.syslogSettings + ", " + "vcenterServersViewSettings=" + this.vcenterServersViewSettings + ", " + "timeSettings=" + this.timeSettings + ", " + "showFirstTimeWizard=" + this.showFirstTimeWizard + ", " + "callHomeEventsSettings=" + this.callHomeEventsSettings + ", " + "systemEventLogsFilters=" + this.systemEventLogsFilters + ", " + "userDefinedProperties=" + this.userDefinedProperties + ", " + "smtpServerAddress=" + this.smtpServerAddress + ", " + "policyTemplates=" + this.policyTemplates + "]";
    }
}


