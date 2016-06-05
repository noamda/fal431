/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ManagementSettings", propOrder={"usersSettings", "alertsSettings", "reportSettings", "snmpSettings", "miscSettings", "syslogSettings", "vcenterServersViewSettings", "timeSettings", "showFirstTimeWizard", "callHomeEventsSettings", "systemEventLogsFilters", "userDefinedProperties", "smtpServerAddress", "policyTemplates"})
/*     */ public class ManagementSettings
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected UsersSettings usersSettings;
/*     */   protected SystemAlertsSettings alertsSettings;
/*     */   protected SystemReportSettings reportSettings;
/*     */   @XmlElement(nillable=true)
/*     */   protected SNMPSettings snmpSettings;
/*     */   protected SystemMiscellaneousSettings miscSettings;
/*     */   @XmlElement(nillable=true)
/*     */   protected SyslogSettings syslogSettings;
/*     */   @XmlElement(nillable=true)
/*     */   protected VCenterServersViewSettings vcenterServersViewSettings;
/*     */   @XmlElement(nillable=true)
/*     */   protected TimeSettings timeSettings;
/*     */   protected boolean showFirstTimeWizard;
/*     */   protected CallHomeEvents callHomeEventsSettings;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SystemEventLogsFilter> systemEventLogsFilters;
/*     */   @XmlElement(nillable=true)
/*     */   protected UserDefinedProperties userDefinedProperties;
/*     */   protected String smtpServerAddress;
/*     */   @XmlElement(nillable=true)
/*     */   protected PolicyTemplates policyTemplates;
/*     */   
/*     */   public ManagementSettings() {}
/*     */   
/*     */   public ManagementSettings(UsersSettings usersSettings, SystemAlertsSettings alertsSettings, SystemReportSettings reportSettings, SNMPSettings snmpSettings, SystemMiscellaneousSettings miscSettings, SyslogSettings syslogSettings, VCenterServersViewSettings vcenterServersViewSettings, TimeSettings timeSettings, boolean showFirstTimeWizard, CallHomeEvents callHomeEventsSettings, List<SystemEventLogsFilter> systemEventLogsFilters, UserDefinedProperties userDefinedProperties, String smtpServerAddress, PolicyTemplates policyTemplates)
/*     */   {
/*  94 */     this.usersSettings = usersSettings;
/*  95 */     this.alertsSettings = alertsSettings;
/*  96 */     this.reportSettings = reportSettings;
/*  97 */     this.snmpSettings = snmpSettings;
/*  98 */     this.miscSettings = miscSettings;
/*  99 */     this.syslogSettings = syslogSettings;
/* 100 */     this.vcenterServersViewSettings = vcenterServersViewSettings;
/* 101 */     this.timeSettings = timeSettings;
/* 102 */     this.showFirstTimeWizard = showFirstTimeWizard;
/* 103 */     this.callHomeEventsSettings = callHomeEventsSettings;
/* 104 */     this.systemEventLogsFilters = systemEventLogsFilters;
/* 105 */     this.userDefinedProperties = userDefinedProperties;
/* 106 */     this.smtpServerAddress = smtpServerAddress;
/* 107 */     this.policyTemplates = policyTemplates;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public UsersSettings getUsersSettings()
/*     */   {
/* 119 */     return this.usersSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUsersSettings(UsersSettings value)
/*     */   {
/* 131 */     this.usersSettings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemAlertsSettings getAlertsSettings()
/*     */   {
/* 143 */     return this.alertsSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAlertsSettings(SystemAlertsSettings value)
/*     */   {
/* 155 */     this.alertsSettings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemReportSettings getReportSettings()
/*     */   {
/* 167 */     return this.reportSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReportSettings(SystemReportSettings value)
/*     */   {
/* 179 */     this.reportSettings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SNMPSettings getSnmpSettings()
/*     */   {
/* 191 */     return this.snmpSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSnmpSettings(SNMPSettings value)
/*     */   {
/* 203 */     this.snmpSettings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemMiscellaneousSettings getMiscSettings()
/*     */   {
/* 215 */     return this.miscSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMiscSettings(SystemMiscellaneousSettings value)
/*     */   {
/* 227 */     this.miscSettings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SyslogSettings getSyslogSettings()
/*     */   {
/* 239 */     return this.syslogSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSyslogSettings(SyslogSettings value)
/*     */   {
/* 251 */     this.syslogSettings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VCenterServersViewSettings getVcenterServersViewSettings()
/*     */   {
/* 263 */     return this.vcenterServersViewSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVcenterServersViewSettings(VCenterServersViewSettings value)
/*     */   {
/* 275 */     this.vcenterServersViewSettings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public TimeSettings getTimeSettings()
/*     */   {
/* 287 */     return this.timeSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTimeSettings(TimeSettings value)
/*     */   {
/* 299 */     this.timeSettings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isShowFirstTimeWizard()
/*     */   {
/* 307 */     return this.showFirstTimeWizard;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setShowFirstTimeWizard(boolean value)
/*     */   {
/* 315 */     this.showFirstTimeWizard = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public CallHomeEvents getCallHomeEventsSettings()
/*     */   {
/* 327 */     return this.callHomeEventsSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCallHomeEventsSettings(CallHomeEvents value)
/*     */   {
/* 339 */     this.callHomeEventsSettings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<SystemEventLogsFilter> getSystemEventLogsFilters()
/*     */   {
/* 365 */     if (this.systemEventLogsFilters == null) {
/* 366 */       this.systemEventLogsFilters = new ArrayList();
/*     */     }
/* 368 */     return this.systemEventLogsFilters;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public UserDefinedProperties getUserDefinedProperties()
/*     */   {
/* 380 */     return this.userDefinedProperties;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUserDefinedProperties(UserDefinedProperties value)
/*     */   {
/* 392 */     this.userDefinedProperties = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSmtpServerAddress()
/*     */   {
/* 404 */     return this.smtpServerAddress;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSmtpServerAddress(String value)
/*     */   {
/* 416 */     this.smtpServerAddress = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public PolicyTemplates getPolicyTemplates()
/*     */   {
/* 428 */     return this.policyTemplates;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPolicyTemplates(PolicyTemplates value)
/*     */   {
/* 440 */     this.policyTemplates = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 450 */     if (!(obj instanceof ManagementSettings)) {
/* 451 */       return false;
/*     */     }
/* 453 */     ManagementSettings otherObj = (ManagementSettings)obj;
/*     */     
/* 455 */     return (this.usersSettings != null ? this.usersSettings.equals(otherObj.usersSettings) : this.usersSettings == otherObj.usersSettings) && (this.alertsSettings != null ? this.alertsSettings.equals(otherObj.alertsSettings) : this.alertsSettings == otherObj.alertsSettings) && (this.reportSettings != null ? this.reportSettings.equals(otherObj.reportSettings) : this.reportSettings == otherObj.reportSettings) && (this.snmpSettings != null ? this.snmpSettings.equals(otherObj.snmpSettings) : this.snmpSettings == otherObj.snmpSettings) && (this.miscSettings != null ? this.miscSettings.equals(otherObj.miscSettings) : this.miscSettings == otherObj.miscSettings) && (this.syslogSettings != null ? this.syslogSettings.equals(otherObj.syslogSettings) : this.syslogSettings == otherObj.syslogSettings) && (this.vcenterServersViewSettings != null ? this.vcenterServersViewSettings.equals(otherObj.vcenterServersViewSettings) : this.vcenterServersViewSettings == otherObj.vcenterServersViewSettings) && (this.timeSettings != null ? this.timeSettings.equals(otherObj.timeSettings) : this.timeSettings == otherObj.timeSettings) && (this.showFirstTimeWizard == otherObj.showFirstTimeWizard) && (this.callHomeEventsSettings != null ? this.callHomeEventsSettings.equals(otherObj.callHomeEventsSettings) : this.callHomeEventsSettings == otherObj.callHomeEventsSettings) && (this.systemEventLogsFilters != null ? this.systemEventLogsFilters.equals(otherObj.systemEventLogsFilters) : this.systemEventLogsFilters == otherObj.systemEventLogsFilters) && (this.userDefinedProperties != null ? this.userDefinedProperties.equals(otherObj.userDefinedProperties) : this.userDefinedProperties == otherObj.userDefinedProperties) && (this.smtpServerAddress != null ? this.smtpServerAddress.equals(otherObj.smtpServerAddress) : this.smtpServerAddress == otherObj.smtpServerAddress) && (this.policyTemplates != null ? this.policyTemplates.equals(otherObj.policyTemplates) : this.policyTemplates == otherObj.policyTemplates);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 477 */     return (this.usersSettings != null ? this.usersSettings.hashCode() : 0) ^ (this.alertsSettings != null ? this.alertsSettings.hashCode() : 0) ^ (this.reportSettings != null ? this.reportSettings.hashCode() : 0) ^ (this.snmpSettings != null ? this.snmpSettings.hashCode() : 0) ^ (this.miscSettings != null ? this.miscSettings.hashCode() : 0) ^ (this.syslogSettings != null ? this.syslogSettings.hashCode() : 0) ^ (this.vcenterServersViewSettings != null ? this.vcenterServersViewSettings.hashCode() : 0) ^ (this.timeSettings != null ? this.timeSettings.hashCode() : 0) ^ (this.showFirstTimeWizard ? 1 : 0) ^ (this.callHomeEventsSettings != null ? this.callHomeEventsSettings.hashCode() : 0) ^ (this.systemEventLogsFilters != null ? this.systemEventLogsFilters.hashCode() : 0) ^ (this.userDefinedProperties != null ? this.userDefinedProperties.hashCode() : 0) ^ (this.smtpServerAddress != null ? this.smtpServerAddress.hashCode() : 0) ^ (this.policyTemplates != null ? this.policyTemplates.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 499 */     return "ManagementSettings [usersSettings=" + this.usersSettings + ", " + "alertsSettings=" + this.alertsSettings + ", " + "reportSettings=" + this.reportSettings + ", " + "snmpSettings=" + this.snmpSettings + ", " + "miscSettings=" + this.miscSettings + ", " + "syslogSettings=" + this.syslogSettings + ", " + "vcenterServersViewSettings=" + this.vcenterServersViewSettings + ", " + "timeSettings=" + this.timeSettings + ", " + "showFirstTimeWizard=" + this.showFirstTimeWizard + ", " + "callHomeEventsSettings=" + this.callHomeEventsSettings + ", " + "systemEventLogsFilters=" + this.systemEventLogsFilters + ", " + "userDefinedProperties=" + this.userDefinedProperties + ", " + "smtpServerAddress=" + this.smtpServerAddress + ", " + "policyTemplates=" + this.policyTemplates + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ManagementSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */