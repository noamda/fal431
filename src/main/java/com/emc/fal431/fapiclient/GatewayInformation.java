
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gatewayInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gatewayInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destinationNetworkMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationSubnet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gatewayIP" type="{}ipInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gatewayInformation", propOrder = {
    "destinationNetworkMask",
    "destinationSubnet",
    "gatewayIP"
})
public class GatewayInformation {

    protected String destinationNetworkMask;
    protected String destinationSubnet;
    protected IpInformation gatewayIP;

    /**
     * Gets the value of the destinationNetworkMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationNetworkMask() {
        return destinationNetworkMask;
    }

    /**
     * Sets the value of the destinationNetworkMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationNetworkMask(String value) {
        this.destinationNetworkMask = value;
    }

    /**
     * Gets the value of the destinationSubnet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationSubnet() {
        return destinationSubnet;
    }

    /**
     * Sets the value of the destinationSubnet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationSubnet(String value) {
        this.destinationSubnet = value;
    }

    /**
     * Gets the value of the gatewayIP property.
     * 
     * @return
     *     possible object is
     *     {@link IpInformation }
     *     
     */
    public IpInformation getGatewayIP() {
        return gatewayIP;
    }

    /**
     * Sets the value of the gatewayIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpInformation }
     *     
     */
    public void setGatewayIP(IpInformation value) {
        this.gatewayIP = value;
    }

}
