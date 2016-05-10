
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nicInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nicInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoNegotiationInformation" type="{}autoNegotiationInformation" minOccurs="0"/>
 *         &lt;element ref="{}ipInformation" minOccurs="0"/>
 *         &lt;element ref="{}networkInterface" minOccurs="0"/>
 *         &lt;element name="networkMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nicInformation", propOrder = {
    "autoNegotiationInformation",
    "ipInformation",
    "networkInterface",
    "networkMask"
})
public class NicInformation {

    protected AutoNegotiationInformation autoNegotiationInformation;
    protected IpInformation ipInformation;
    protected NetworkInterface networkInterface;
    protected String networkMask;

    /**
     * Gets the value of the autoNegotiationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AutoNegotiationInformation }
     *     
     */
    public AutoNegotiationInformation getAutoNegotiationInformation() {
        return autoNegotiationInformation;
    }

    /**
     * Sets the value of the autoNegotiationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoNegotiationInformation }
     *     
     */
    public void setAutoNegotiationInformation(AutoNegotiationInformation value) {
        this.autoNegotiationInformation = value;
    }

    /**
     * Gets the value of the ipInformation property.
     * 
     * @return
     *     possible object is
     *     {@link IpInformation }
     *     
     */
    public IpInformation getIpInformation() {
        return ipInformation;
    }

    /**
     * Sets the value of the ipInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpInformation }
     *     
     */
    public void setIpInformation(IpInformation value) {
        this.ipInformation = value;
    }

    /**
     * Gets the value of the networkInterface property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterface }
     *     
     */
    public NetworkInterface getNetworkInterface() {
        return networkInterface;
    }

    /**
     * Sets the value of the networkInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterface }
     *     
     */
    public void setNetworkInterface(NetworkInterface value) {
        this.networkInterface = value;
    }

    /**
     * Gets the value of the networkMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkMask() {
        return networkMask;
    }

    /**
     * Sets the value of the networkMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkMask(String value) {
        this.networkMask = value;
    }

}
