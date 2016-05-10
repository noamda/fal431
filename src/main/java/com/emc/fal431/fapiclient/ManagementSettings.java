
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for managementSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="managementSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertsSettings" type="{}systemAlertsSettings" minOccurs="0"/>
 *         &lt;element name="callHomeEventsSettings" type="{}callHomeEvents" minOccurs="0"/>
 *         &lt;element name="miscSettings" type="{}systemMiscellaneousSettings" minOccurs="0"/>
 *         &lt;element name="reportSettings" type="{}systemReportSettings" minOccurs="0"/>
 *         &lt;element name="showFirstTimeWizard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="smtpServerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}snmpSettings" minOccurs="0"/>
 *         &lt;element ref="{}syslogSettings" minOccurs="0"/>
 *         &lt;element name="systemEventLogsFilters" type="{}systemEventLogsFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}timeSettings" minOccurs="0"/>
 *         &lt;element ref="{}userDefinedProperties" minOccurs="0"/>
 *         &lt;element ref="{}usersSettings" minOccurs="0"/>
 *         &lt;element name="vcenterServersViewSettings" type="{}vCenterServersViewSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "managementSettings", propOrder = {
    "alertsSettings",
    "callHomeEventsSettings",
    "miscSettings",
    "reportSettings",
    "showFirstTimeWizard",
    "smtpServerAddress",
    "snmpSettings",
    "syslogSettings",
    "systemEventLogsFilters",
    "timeSettings",
    "userDefinedProperties",
    "usersSettings",
    "vcenterServersViewSettings"
})
public class ManagementSettings {

    protected SystemAlertsSettings alertsSettings;
    protected CallHomeEvents callHomeEventsSettings;
    protected SystemMiscellaneousSettings miscSettings;
    protected SystemReportSettings reportSettings;
    protected boolean showFirstTimeWizard;
    protected String smtpServerAddress;
    protected SnmpSettings snmpSettings;
    protected SyslogSettings syslogSettings;
    @XmlElement(nillable = true)
    protected List<SystemEventLogsFilter> systemEventLogsFilters;
    protected TimeSettings timeSettings;
    protected UserDefinedProperties userDefinedProperties;
    protected UsersSettings usersSettings;
    protected VCenterServersViewSettings vcenterServersViewSettings;

    /**
     * Gets the value of the alertsSettings property.
     * 
     * @return
     *     possible object is
     *     {@link SystemAlertsSettings }
     *     
     */
    public SystemAlertsSettings getAlertsSettings() {
        return alertsSettings;
    }

    /**
     * Sets the value of the alertsSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemAlertsSettings }
     *     
     */
    public void setAlertsSettings(SystemAlertsSettings value) {
        this.alertsSettings = value;
    }

    /**
     * Gets the value of the callHomeEventsSettings property.
     * 
     * @return
     *     possible object is
     *     {@link CallHomeEvents }
     *     
     */
    public CallHomeEvents getCallHomeEventsSettings() {
        return callHomeEventsSettings;
    }

    /**
     * Sets the value of the callHomeEventsSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallHomeEvents }
     *     
     */
    public void setCallHomeEventsSettings(CallHomeEvents value) {
        this.callHomeEventsSettings = value;
    }

    /**
     * Gets the value of the miscSettings property.
     * 
     * @return
     *     possible object is
     *     {@link SystemMiscellaneousSettings }
     *     
     */
    public SystemMiscellaneousSettings getMiscSettings() {
        return miscSettings;
    }

    /**
     * Sets the value of the miscSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemMiscellaneousSettings }
     *     
     */
    public void setMiscSettings(SystemMiscellaneousSettings value) {
        this.miscSettings = value;
    }

    /**
     * Gets the value of the reportSettings property.
     * 
     * @return
     *     possible object is
     *     {@link SystemReportSettings }
     *     
     */
    public SystemReportSettings getReportSettings() {
        return reportSettings;
    }

    /**
     * Sets the value of the reportSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemReportSettings }
     *     
     */
    public void setReportSettings(SystemReportSettings value) {
        this.reportSettings = value;
    }

    /**
     * Gets the value of the showFirstTimeWizard property.
     * 
     */
    public boolean isShowFirstTimeWizard() {
        return showFirstTimeWizard;
    }

    /**
     * Sets the value of the showFirstTimeWizard property.
     * 
     */
    public void setShowFirstTimeWizard(boolean value) {
        this.showFirstTimeWizard = value;
    }

    /**
     * Gets the value of the smtpServerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtpServerAddress() {
        return smtpServerAddress;
    }

    /**
     * Sets the value of the smtpServerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtpServerAddress(String value) {
        this.smtpServerAddress = value;
    }

    /**
     * Gets the value of the snmpSettings property.
     * 
     * @return
     *     possible object is
     *     {@link SnmpSettings }
     *     
     */
    public SnmpSettings getSnmpSettings() {
        return snmpSettings;
    }

    /**
     * Sets the value of the snmpSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnmpSettings }
     *     
     */
    public void setSnmpSettings(SnmpSettings value) {
        this.snmpSettings = value;
    }

    /**
     * Gets the value of the syslogSettings property.
     * 
     * @return
     *     possible object is
     *     {@link SyslogSettings }
     *     
     */
    public SyslogSettings getSyslogSettings() {
        return syslogSettings;
    }

    /**
     * Sets the value of the syslogSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyslogSettings }
     *     
     */
    public void setSyslogSettings(SyslogSettings value) {
        this.syslogSettings = value;
    }

    /**
     * Gets the value of the systemEventLogsFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemEventLogsFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemEventLogsFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemEventLogsFilter }
     * 
     * 
     */
    public List<SystemEventLogsFilter> getSystemEventLogsFilters() {
        if (systemEventLogsFilters == null) {
            systemEventLogsFilters = new ArrayList<SystemEventLogsFilter>();
        }
        return this.systemEventLogsFilters;
    }

    /**
     * Gets the value of the timeSettings property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSettings }
     *     
     */
    public TimeSettings getTimeSettings() {
        return timeSettings;
    }

    /**
     * Sets the value of the timeSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSettings }
     *     
     */
    public void setTimeSettings(TimeSettings value) {
        this.timeSettings = value;
    }

    /**
     * Gets the value of the userDefinedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedProperties }
     *     
     */
    public UserDefinedProperties getUserDefinedProperties() {
        return userDefinedProperties;
    }

    /**
     * Sets the value of the userDefinedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedProperties }
     *     
     */
    public void setUserDefinedProperties(UserDefinedProperties value) {
        this.userDefinedProperties = value;
    }

    /**
     * Gets the value of the usersSettings property.
     * 
     * @return
     *     possible object is
     *     {@link UsersSettings }
     *     
     */
    public UsersSettings getUsersSettings() {
        return usersSettings;
    }

    /**
     * Sets the value of the usersSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsersSettings }
     *     
     */
    public void setUsersSettings(UsersSettings value) {
        this.usersSettings = value;
    }

    /**
     * Gets the value of the vcenterServersViewSettings property.
     * 
     * @return
     *     possible object is
     *     {@link VCenterServersViewSettings }
     *     
     */
    public VCenterServersViewSettings getVcenterServersViewSettings() {
        return vcenterServersViewSettings;
    }

    /**
     * Sets the value of the vcenterServersViewSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link VCenterServersViewSettings }
     *     
     */
    public void setVcenterServersViewSettings(VCenterServersViewSettings value) {
        this.vcenterServersViewSettings = value;
    }

}
