
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clariionSplitterCredentials complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clariionSplitterCredentials">
 *   &lt;complexContent>
 *     &lt;extension base="{}baseSplitterCredentials">
 *       &lt;sequence>
 *         &lt;element ref="{}authenticationType" minOccurs="0"/>
 *         &lt;element name="credentialsType" type="{}clariionSplitterCredentialsType" minOccurs="0"/>
 *         &lt;element name="SPBip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clariionSplitterCredentials", propOrder = {
    "authenticationType",
    "credentialsType",
    "spBip"
})
public class ClariionSplitterCredentials
    extends BaseSplitterCredentials
{

    protected AuthenticationType authenticationType;
    protected ClariionSplitterCredentialsType credentialsType;
    @XmlElement(name = "SPBip")
    protected String spBip;

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationType }
     *     
     */
    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationType }
     *     
     */
    public void setAuthenticationType(AuthenticationType value) {
        this.authenticationType = value;
    }

    /**
     * Gets the value of the credentialsType property.
     * 
     * @return
     *     possible object is
     *     {@link ClariionSplitterCredentialsType }
     *     
     */
    public ClariionSplitterCredentialsType getCredentialsType() {
        return credentialsType;
    }

    /**
     * Sets the value of the credentialsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClariionSplitterCredentialsType }
     *     
     */
    public void setCredentialsType(ClariionSplitterCredentialsType value) {
        this.credentialsType = value;
    }

    /**
     * Gets the value of the spBip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPBip() {
        return spBip;
    }

    /**
     * Sets the value of the spBip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPBip(String value) {
        this.spBip = value;
    }

}
