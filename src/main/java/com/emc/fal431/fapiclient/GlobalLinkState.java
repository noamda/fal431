
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for globalLinkState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="globalLinkState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deduplicationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="globalLink" type="{}globalLinkUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "globalLinkState", propOrder = {
    "deduplicationSupported",
    "globalLink"
})
public class GlobalLinkState {

    protected boolean deduplicationSupported;
    protected GlobalLinkUID globalLink;

    /**
     * Gets the value of the deduplicationSupported property.
     * 
     */
    public boolean isDeduplicationSupported() {
        return deduplicationSupported;
    }

    /**
     * Sets the value of the deduplicationSupported property.
     * 
     */
    public void setDeduplicationSupported(boolean value) {
        this.deduplicationSupported = value;
    }

    /**
     * Gets the value of the globalLink property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalLinkUID }
     *     
     */
    public GlobalLinkUID getGlobalLink() {
        return globalLink;
    }

    /**
     * Sets the value of the globalLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalLinkUID }
     *     
     */
    public void setGlobalLink(GlobalLinkUID value) {
        this.globalLink = value;
    }

}
