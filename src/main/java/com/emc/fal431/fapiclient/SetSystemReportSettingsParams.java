
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setSystemReportSettingsParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setSystemReportSettingsParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestedSmtpServerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}systemReportSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSystemReportSettingsParams", propOrder = {
    "requestedSmtpServerAddress",
    "systemReportSettings"
})
public class SetSystemReportSettingsParams {

    protected String requestedSmtpServerAddress;
    protected SystemReportSettings systemReportSettings;

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
     * Gets the value of the systemReportSettings property.
     * 
     * @return
     *     possible object is
     *     {@link SystemReportSettings }
     *     
     */
    public SystemReportSettings getSystemReportSettings() {
        return systemReportSettings;
    }

    /**
     * Sets the value of the systemReportSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemReportSettings }
     *     
     */
    public void setSystemReportSettings(SystemReportSettings value) {
        this.systemReportSettings = value;
    }

}
