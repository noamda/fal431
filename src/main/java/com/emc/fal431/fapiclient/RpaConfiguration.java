
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rpaConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rpaConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}localISCSIPortsConfiguration" minOccurs="0"/>
 *         &lt;element name="nicsInformation" type="{}nicInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ntpServersIPs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}rpaUID" minOccurs="0"/>
 *         &lt;element name="spoofedPorts" type="{}rpaPortInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rpaConfiguration", propOrder = {
    "localISCSIPortsConfiguration",
    "nicsInformation",
    "ntpServersIPs",
    "rpaUID",
    "spoofedPorts"
})
public class RpaConfiguration {

    protected LocalISCSIPortsConfiguration localISCSIPortsConfiguration;
    @XmlElement(nillable = true)
    protected List<NicInformation> nicsInformation;
    @XmlElement(nillable = true)
    protected List<String> ntpServersIPs;
    protected RpaUID rpaUID;
    @XmlElement(nillable = true)
    protected List<RpaPortInformation> spoofedPorts;

    /**
     * Gets the value of the localISCSIPortsConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link LocalISCSIPortsConfiguration }
     *     
     */
    public LocalISCSIPortsConfiguration getLocalISCSIPortsConfiguration() {
        return localISCSIPortsConfiguration;
    }

    /**
     * Sets the value of the localISCSIPortsConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalISCSIPortsConfiguration }
     *     
     */
    public void setLocalISCSIPortsConfiguration(LocalISCSIPortsConfiguration value) {
        this.localISCSIPortsConfiguration = value;
    }

    /**
     * Gets the value of the nicsInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nicsInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNicsInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NicInformation }
     * 
     * 
     */
    public List<NicInformation> getNicsInformation() {
        if (nicsInformation == null) {
            nicsInformation = new ArrayList<NicInformation>();
        }
        return this.nicsInformation;
    }

    /**
     * Gets the value of the ntpServersIPs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ntpServersIPs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtpServersIPs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNtpServersIPs() {
        if (ntpServersIPs == null) {
            ntpServersIPs = new ArrayList<String>();
        }
        return this.ntpServersIPs;
    }

    /**
     * Gets the value of the rpaUID property.
     * 
     * @return
     *     possible object is
     *     {@link RpaUID }
     *     
     */
    public RpaUID getRpaUID() {
        return rpaUID;
    }

    /**
     * Sets the value of the rpaUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RpaUID }
     *     
     */
    public void setRpaUID(RpaUID value) {
        this.rpaUID = value;
    }

    /**
     * Gets the value of the spoofedPorts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spoofedPorts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpoofedPorts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RpaPortInformation }
     * 
     * 
     */
    public List<RpaPortInformation> getSpoofedPorts() {
        if (spoofedPorts == null) {
            spoofedPorts = new ArrayList<RpaPortInformation>();
        }
        return this.spoofedPorts;
    }

}
