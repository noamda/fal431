
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setSplitterCredentialsParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setSplitterCredentialsParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="credentials" type="{}baseSplitterCredentials" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSplitterCredentialsParams", propOrder = {
    "credentials",
    "password"
})
public class SetSplitterCredentialsParams {

    protected BaseSplitterCredentials credentials;
    protected byte[] password;

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSplitterCredentials }
     *     
     */
    public BaseSplitterCredentials getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSplitterCredentials }
     *     
     */
    public void setCredentials(BaseSplitterCredentials value) {
        this.credentials = value;
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

}
