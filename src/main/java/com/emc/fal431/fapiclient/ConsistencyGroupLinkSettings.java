
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupLinkSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupLinkSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupLinkUID" type="{}consistencyGroupLinkUID" minOccurs="0"/>
 *         &lt;element name="linkPolicy" type="{}consistencyGroupLinkPolicy" minOccurs="0"/>
 *         &lt;element name="localLink" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="transferEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupLinkSettings", propOrder = {
    "groupLinkUID",
    "linkPolicy",
    "localLink",
    "transferEnabled"
})
public class ConsistencyGroupLinkSettings {

    protected ConsistencyGroupLinkUID groupLinkUID;
    protected ConsistencyGroupLinkPolicy linkPolicy;
    protected boolean localLink;
    protected boolean transferEnabled;

    /**
     * Gets the value of the groupLinkUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupLinkUID }
     *     
     */
    public ConsistencyGroupLinkUID getGroupLinkUID() {
        return groupLinkUID;
    }

    /**
     * Sets the value of the groupLinkUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupLinkUID }
     *     
     */
    public void setGroupLinkUID(ConsistencyGroupLinkUID value) {
        this.groupLinkUID = value;
    }

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
     * Gets the value of the localLink property.
     * 
     */
    public boolean isLocalLink() {
        return localLink;
    }

    /**
     * Sets the value of the localLink property.
     * 
     */
    public void setLocalLink(boolean value) {
        this.localLink = value;
    }

    /**
     * Gets the value of the transferEnabled property.
     * 
     */
    public boolean isTransferEnabled() {
        return transferEnabled;
    }

    /**
     * Sets the value of the transferEnabled property.
     * 
     */
    public void setTransferEnabled(boolean value) {
        this.transferEnabled = value;
    }

}
