
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mtuInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mtuInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mtu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{}networkInterface" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mtuInformation", propOrder = {
    "mtu",
    "networkInterface"
})
public class MtuInformation {

    protected int mtu;
    protected NetworkInterface networkInterface;

    /**
     * Gets the value of the mtu property.
     * 
     */
    public int getMtu() {
        return mtu;
    }

    /**
     * Sets the value of the mtu property.
     * 
     */
    public void setMtu(int value) {
        this.mtu = value;
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

}
