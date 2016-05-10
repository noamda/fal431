
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ldapSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ldapSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advancedSettings" type="{}ldapAdvancedSettings" minOccurs="0"/>
 *         &lt;element name="baseDistinguishedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="binding" type="{}ldapBinding" minOccurs="0"/>
 *         &lt;element name="distinguishedNameSearch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="primaryServer" type="{}ldapServer" minOccurs="0"/>
 *         &lt;element name="protocol" type="{}ldapProtocol" minOccurs="0"/>
 *         &lt;element name="secondaryServer" type="{}ldapServer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ldapSettings", propOrder = {
    "advancedSettings",
    "baseDistinguishedName",
    "binding",
    "distinguishedNameSearch",
    "enabled",
    "primaryServer",
    "protocol",
    "secondaryServer"
})
public class LdapSettings {

    protected LdapAdvancedSettings advancedSettings;
    protected String baseDistinguishedName;
    protected LdapBinding binding;
    protected String distinguishedNameSearch;
    protected boolean enabled;
    protected LdapServer primaryServer;
    protected LdapProtocol protocol;
    protected LdapServer secondaryServer;

    /**
     * Gets the value of the advancedSettings property.
     * 
     * @return
     *     possible object is
     *     {@link LdapAdvancedSettings }
     *     
     */
    public LdapAdvancedSettings getAdvancedSettings() {
        return advancedSettings;
    }

    /**
     * Sets the value of the advancedSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapAdvancedSettings }
     *     
     */
    public void setAdvancedSettings(LdapAdvancedSettings value) {
        this.advancedSettings = value;
    }

    /**
     * Gets the value of the baseDistinguishedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDistinguishedName() {
        return baseDistinguishedName;
    }

    /**
     * Sets the value of the baseDistinguishedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDistinguishedName(String value) {
        this.baseDistinguishedName = value;
    }

    /**
     * Gets the value of the binding property.
     * 
     * @return
     *     possible object is
     *     {@link LdapBinding }
     *     
     */
    public LdapBinding getBinding() {
        return binding;
    }

    /**
     * Sets the value of the binding property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapBinding }
     *     
     */
    public void setBinding(LdapBinding value) {
        this.binding = value;
    }

    /**
     * Gets the value of the distinguishedNameSearch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistinguishedNameSearch() {
        return distinguishedNameSearch;
    }

    /**
     * Sets the value of the distinguishedNameSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistinguishedNameSearch(String value) {
        this.distinguishedNameSearch = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the primaryServer property.
     * 
     * @return
     *     possible object is
     *     {@link LdapServer }
     *     
     */
    public LdapServer getPrimaryServer() {
        return primaryServer;
    }

    /**
     * Sets the value of the primaryServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapServer }
     *     
     */
    public void setPrimaryServer(LdapServer value) {
        this.primaryServer = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link LdapProtocol }
     *     
     */
    public LdapProtocol getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapProtocol }
     *     
     */
    public void setProtocol(LdapProtocol value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the secondaryServer property.
     * 
     * @return
     *     possible object is
     *     {@link LdapServer }
     *     
     */
    public LdapServer getSecondaryServer() {
        return secondaryServer;
    }

    /**
     * Sets the value of the secondaryServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapServer }
     *     
     */
    public void setSecondaryServer(LdapServer value) {
        this.secondaryServer = value;
    }

}
