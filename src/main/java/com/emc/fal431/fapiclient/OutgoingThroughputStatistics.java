
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outgoingThroughputStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outgoingThroughputStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfGrids" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="outgoingThroughput" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{}rpaUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outgoingThroughputStatistics", propOrder = {
    "numberOfGrids",
    "outgoingThroughput",
    "rpaUID"
})
public class OutgoingThroughputStatistics {

    protected int numberOfGrids;
    protected long outgoingThroughput;
    protected RpaUID rpaUID;

    /**
     * Gets the value of the numberOfGrids property.
     * 
     */
    public int getNumberOfGrids() {
        return numberOfGrids;
    }

    /**
     * Sets the value of the numberOfGrids property.
     * 
     */
    public void setNumberOfGrids(int value) {
        this.numberOfGrids = value;
    }

    /**
     * Gets the value of the outgoingThroughput property.
     * 
     */
    public long getOutgoingThroughput() {
        return outgoingThroughput;
    }

    /**
     * Sets the value of the outgoingThroughput property.
     * 
     */
    public void setOutgoingThroughput(long value) {
        this.outgoingThroughput = value;
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

}
