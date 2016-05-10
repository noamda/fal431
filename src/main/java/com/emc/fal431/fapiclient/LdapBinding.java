
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ldapBinding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ldapBinding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bindDistinguishedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="passwordConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ldapBinding", propOrder = {
    "bindDistinguishedName",
    "password",
    "passwordConfigured"
})
public class LdapBinding {

    protected String bindDistinguishedName;
    protected byte[] password;
    protected boolean passwordConfigured;

    /**
     * Gets the value of the bindDistinguishedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindDistinguishedName() {
        return bindDistinguishedName;
    }

    /**
     * Sets the value of the bindDistinguishedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindDistinguishedName(String value) {
        this.bindDistinguishedName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPassword(byte[] value) {
        this.password = ((byte[]) value);
    }

    /**
     * Gets the value of the passwordConfigured property.
     * 
     */
    public boolean isPasswordConfigured() {
        return passwordConfigured;
    }

    /**
     * Sets the value of the passwordConfigured property.
     * 
     */
    public void setPasswordConfigured(boolean value) {
        this.passwordConfigured = value;
    }

}
