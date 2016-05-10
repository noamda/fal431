
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vCenterServer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vCenterServer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="certificateConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vcenterServerUID" type="{}vCenterServerUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vCenterServer", propOrder = {
    "certificateConfigured",
    "port",
    "userName",
    "vcenterServerUID"
})
public class VCenterServer {

    protected boolean certificateConfigured;
    protected int port;
    protected String userName;
    protected VCenterServerUID vcenterServerUID;

    /**
     * Gets the value of the certificateConfigured property.
     * 
     */
    public boolean isCertificateConfigured() {
        return certificateConfigured;
    }

    /**
     * Sets the value of the certificateConfigured property.
     * 
     */
    public void setCertificateConfigured(boolean value) {
        this.certificateConfigured = value;
    }

    /**
     * Gets the value of the port property.
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     */
    public void setPort(int value) {
        this.port = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the vcenterServerUID property.
     * 
     * @return
     *     possible object is
     *     {@link VCenterServerUID }
     *     
     */
    public VCenterServerUID getVcenterServerUID() {
        return vcenterServerUID;
    }

    /**
     * Sets the value of the vcenterServerUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link VCenterServerUID }
     *     
     */
    public void setVcenterServerUID(VCenterServerUID value) {
        this.vcenterServerUID = value;
    }

}
