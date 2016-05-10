
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setSystemAlertsSettingsParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setSystemAlertsSettingsParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestedSmtpServerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}systemAlertsSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSystemAlertsSettingsParams", propOrder = {
    "requestedSmtpServerAddress",
    "systemAlertsSettings"
})
public class SetSystemAlertsSettingsParams {

    protected String requestedSmtpServerAddress;
    protected SystemAlertsSettings systemAlertsSettings;

    /**
     * Gets the value of the requestedSmtpServerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedSmtpServerAddress() {
        return requestedSmtpServerAddress;
    }

    /**
     * Sets the value of the requestedSmtpServerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedSmtpServerAddress(String value) {
        this.requestedSmtpServerAddress = value;
    }

    /**
     * Gets the value of the systemAlertsSettings property.
     * 
     * @return
     *     possible object is
     *     {@link SystemAlertsSettings }
     *     
     */
    public SystemAlertsSettings getSystemAlertsSettings() {
        return systemAlertsSettings;
    }

    /**
     * Sets the value of the systemAlertsSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemAlertsSettings }
     *     
     */
    public void setSystemAlertsSettings(SystemAlertsSettings value) {
        this.systemAlertsSettings = value;
    }

}
