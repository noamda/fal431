
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iscsiPortInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iscsiPortInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}chap" minOccurs="0"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iscsiPortInformation", propOrder = {
    "chap",
    "port"
})
@XmlSeeAlso({
    LocalISCSIPortInformation.class,
    RemoteISCSIPortInformation.class
})
public abstract class IscsiPortInformation {

    protected Chap chap;
    protected int port;

    /**
     * Gets the value of the chap property.
     * 
     * @return
     *     possible object is
     *     {@link Chap }
     *     
     */
    public Chap getChap() {
        return chap;
    }

    /**
     * Sets the value of the chap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chap }
     *     
     */
    public void setChap(Chap value) {
        this.chap = value;
    }

    /**
     * Gets the value of the port property.
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     */
    public void setPort(int value) {
        this.port = value;
    }

}
