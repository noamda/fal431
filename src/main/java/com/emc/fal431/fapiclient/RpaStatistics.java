
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rpaStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rpaStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpuUsage" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element ref="{}rpaUID" minOccurs="0"/>
 *         &lt;element name="traffic" type="{}trafficStatistics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rpaStatistics", propOrder = {
    "cpuUsage",
    "rpaUID",
    "traffic"
})
public class RpaStatistics {

    protected double cpuUsage;
    protected RpaUID rpaUID;
    protected TrafficStatistics traffic;

    /**
     * Gets the value of the cpuUsage property.
     * 
     */
    public double getCpuUsage() {
        return cpuUsage;
    }

    /**
     * Sets the value of the cpuUsage property.
     * 
     */
    public void setCpuUsage(double value) {
        this.cpuUsage = value;
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
     * Gets the value of the traffic property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficStatistics }
     *     
     */
    public TrafficStatistics getTraffic() {
        return traffic;
    }

    /**
     * Sets the value of the traffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficStatistics }
     *     
     */
    public void setTraffic(TrafficStatistics value) {
        this.traffic = value;
    }

}
