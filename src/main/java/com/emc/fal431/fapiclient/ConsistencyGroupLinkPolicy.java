
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupLinkPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupLinkPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advancedPolicy" type="{}linkAdvancedPolicy" minOccurs="0"/>
 *         &lt;element name="protectionPolicy" type="{}linkProtectionPolicy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupLinkPolicy", propOrder = {
    "advancedPolicy",
    "protectionPolicy"
})
public class ConsistencyGroupLinkPolicy {

    protected LinkAdvancedPolicy advancedPolicy;
    protected LinkProtectionPolicy protectionPolicy;

    /**
     * Gets the value of the advancedPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link LinkAdvancedPolicy }
     *     
     */
    public LinkAdvancedPolicy getAdvancedPolicy() {
        return advancedPolicy;
    }

    /**
     * Sets the value of the advancedPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkAdvancedPolicy }
     *     
     */
    public void setAdvancedPolicy(LinkAdvancedPolicy value) {
        this.advancedPolicy = value;
    }

    /**
     * Gets the value of the protectionPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link LinkProtectionPolicy }
     *     
     */
    public LinkProtectionPolicy getProtectionPolicy() {
        return protectionPolicy;
    }

    /**
     * Sets the value of the protectionPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkProtectionPolicy }
     *     
     */
    public void setProtectionPolicy(LinkProtectionPolicy value) {
        this.protectionPolicy = value;
    }

}
