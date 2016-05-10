
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemReportSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemReportSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esrsGatewayAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeSystemAlerts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeSystemReports" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="senderEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transferMethod" type="{}systemReportTransferMethod" minOccurs="0"/>
 *         &lt;element name="usingCompression" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="usingEncryption" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemReportSettings", propOrder = {
    "esrsGatewayAddress",
    "includeSystemAlerts",
    "includeSystemReports",
    "senderEmail",
    "transferMethod",
    "usingCompression",
    "usingEncryption"
})
public class SystemReportSettings {

    protected String esrsGatewayAddress;
    protected boolean includeSystemAlerts;
    protected boolean includeSystemReports;
    protected String senderEmail;
    protected SystemReportTransferMethod transferMethod;
    protected boolean usingCompression;
    protected boolean usingEncryption;

    /**
     * Gets the value of the esrsGatewayAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsrsGatewayAddress() {
        return esrsGatewayAddress;
    }

    /**
     * Sets the value of the esrsGatewayAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsrsGatewayAddress(String value) {
        this.esrsGatewayAddress = value;
    }

    /**
     * Gets the value of the includeSystemAlerts property.
     * 
     */
    public boolean isIncludeSystemAlerts() {
        return includeSystemAlerts;
    }

    /**
     * Sets the value of the includeSystemAlerts property.
     * 
     */
    public void setIncludeSystemAlerts(boolean value) {
        this.includeSystemAlerts = value;
    }

    /**
     * Gets the value of the includeSystemReports property.
     * 
     */
    public boolean isIncludeSystemReports() {
        return includeSystemReports;
    }

    /**
     * Sets the value of the includeSystemReports property.
     * 
     */
    public void setIncludeSystemReports(boolean value) {
        this.includeSystemReports = value;
    }

    /**
     * Gets the value of the senderEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderEmail() {
        return senderEmail;
    }

    /**
     * Sets the value of the senderEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderEmail(String value) {
        this.senderEmail = value;
    }

    /**
     * Gets the value of the transferMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SystemReportTransferMethod }
     *     
     */
    public SystemReportTransferMethod getTransferMethod() {
        return transferMethod;
    }

    /**
     * Sets the value of the transferMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemReportTransferMethod }
     *     
     */
    public void setTransferMethod(SystemReportTransferMethod value) {
        this.transferMethod = value;
    }

    /**
     * Gets the value of the usingCompression property.
     * 
     */
    public boolean isUsingCompression() {
        return usingCompression;
    }

    /**
     * Sets the value of the usingCompression property.
     * 
     */
    public void setUsingCompression(boolean value) {
        this.usingCompression = value;
    }

    /**
     * Gets the value of the usingEncryption property.
     * 
     */
    public boolean isUsingEncryption() {
        return usingEncryption;
    }

    /**
     * Sets the value of the usingEncryption property.
     * 
     */
    public void setUsingEncryption(boolean value) {
        this.usingEncryption = value;
    }

}
