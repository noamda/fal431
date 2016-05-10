
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for syncReplicationThreshold complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="syncReplicationThreshold">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resumeSyncReplicationBelow" type="{}quantity" minOccurs="0"/>
 *         &lt;element name="startAsyncReplicationAbove" type="{}quantity" minOccurs="0"/>
 *         &lt;element name="thresholdEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "syncReplicationThreshold", propOrder = {
    "resumeSyncReplicationBelow",
    "startAsyncReplicationAbove",
    "thresholdEnabled"
})
public class SyncReplicationThreshold {

    protected Quantity resumeSyncReplicationBelow;
    protected Quantity startAsyncReplicationAbove;
    protected boolean thresholdEnabled;

    /**
     * Gets the value of the resumeSyncReplicationBelow property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getResumeSyncReplicationBelow() {
        return resumeSyncReplicationBelow;
    }

    /**
     * Sets the value of the resumeSyncReplicationBelow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setResumeSyncReplicationBelow(Quantity value) {
        this.resumeSyncReplicationBelow = value;
    }

    /**
     * Gets the value of the startAsyncReplicationAbove property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getStartAsyncReplicationAbove() {
        return startAsyncReplicationAbove;
    }

    /**
     * Sets the value of the startAsyncReplicationAbove property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setStartAsyncReplicationAbove(Quantity value) {
        this.startAsyncReplicationAbove = value;
    }

    /**
     * Gets the value of the thresholdEnabled property.
     * 
     */
    public boolean isThresholdEnabled() {
        return thresholdEnabled;
    }

    /**
     * Sets the value of the thresholdEnabled property.
     * 
     */
    public void setThresholdEnabled(boolean value) {
        this.thresholdEnabled = value;
    }

}
