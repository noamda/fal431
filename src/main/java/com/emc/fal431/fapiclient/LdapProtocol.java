
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ldapProtocol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ldapProtocol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="certificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protocolType" type="{}ldapProtocolType" minOccurs="0"/>
 *         &lt;element name="useCertificate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ldapProtocol", propOrder = {
    "certificate",
    "protocolType",
    "useCertificate"
})
public class LdapProtocol {

    protected String certificate;
    protected LdapProtocolType protocolType;
    protected boolean useCertificate;

    /**
     * Gets the value of the certificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificate(String value) {
        this.certificate = value;
    }

    /**
     * Gets the value of the protocolType property.
     * 
     * @return
     *     possible object is
     *     {@link LdapProtocolType }
     *     
     */
    public LdapProtocolType getProtocolType() {
        return protocolType;
    }

    /**
     * Sets the value of the protocolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapProtocolType }
     *     
     */
    public void setProtocolType(LdapProtocolType value) {
        this.protocolType = value;
    }

    /**
     * Gets the value of the useCertificate property.
     * 
     */
    public boolean isUseCertificate() {
        return useCertificate;
    }

    /**
     * Sets the value of the useCertificate property.
     * 
     */
    public void setUseCertificate(boolean value) {
        this.useCertificate = value;
    }

}
