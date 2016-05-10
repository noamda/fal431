
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fullConsistencyGroupLinkPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fullConsistencyGroupLinkPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="linkPolicy" type="{}consistencyGroupLinkPolicy" minOccurs="0"/>
 *         &lt;element name="linkUID" type="{}consistencyGroupLinkUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fullConsistencyGroupLinkPolicy", propOrder = {
    "linkPolicy",
    "linkUID"
})
public class FullConsistencyGroupLinkPolicy {

    protected ConsistencyGroupLinkPolicy linkPolicy;
    protected ConsistencyGroupLinkUID linkUID;

    /**
     * Gets the value of the linkPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupLinkPolicy }
     *     
     */
    public ConsistencyGroupLinkPolicy getLinkPolicy() {
        return linkPolicy;
    }

    /**
     * Sets the value of the linkPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupLinkPolicy }
     *     
     */
    public void setLinkPolicy(ConsistencyGroupLinkPolicy value) {
        this.linkPolicy = value;
    }

    /**
     * Gets the value of the linkUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupLinkUID }
     *     
     */
    public ConsistencyGroupLinkUID getLinkUID() {
        return linkUID;
    }

    /**
     * Sets the value of the linkUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupLinkUID }
     *     
     */
    public void setLinkUID(ConsistencyGroupLinkUID value) {
        this.linkUID = value;
    }

}
