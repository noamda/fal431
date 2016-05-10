
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consolidationProgress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consolidationProgress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consolidationType" type="{}snapshotConsolidationType" minOccurs="0"/>
 *         &lt;element name="firstSnapshotTime" type="{}recoverPointTimeStamp" minOccurs="0"/>
 *         &lt;element name="lastSnapshotTime" type="{}recoverPointTimeStamp" minOccurs="0"/>
 *         &lt;element name="pending" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="progress" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consolidationProgress", propOrder = {
    "consolidationType",
    "firstSnapshotTime",
    "lastSnapshotTime",
    "pending",
    "progress"
})
public class ConsolidationProgress {

    protected SnapshotConsolidationType consolidationType;
    protected RecoverPointTimeStamp firstSnapshotTime;
    protected RecoverPointTimeStamp lastSnapshotTime;
    protected boolean pending;
    protected double progress;

    /**
     * Gets the value of the consolidationType property.
     * 
     * @return
     *     possible object is
     *     {@link SnapshotConsolidationType }
     *     
     */
    public SnapshotConsolidationType getConsolidationType() {
        return consolidationType;
    }

    /**
     * Sets the value of the consolidationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapshotConsolidationType }
     *     
     */
    public void setConsolidationType(SnapshotConsolidationType value) {
        this.consolidationType = value;
    }

    /**
     * Gets the value of the firstSnapshotTime property.
     * 
     * @return
     *     possible object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public RecoverPointTimeStamp getFirstSnapshotTime() {
        return firstSnapshotTime;
    }

    /**
     * Sets the value of the firstSnapshotTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public void setFirstSnapshotTime(RecoverPointTimeStamp value) {
        this.firstSnapshotTime = value;
    }

    /**
     * Gets the value of the lastSnapshotTime property.
     * 
     * @return
     *     possible object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public RecoverPointTimeStamp getLastSnapshotTime() {
        return lastSnapshotTime;
    }

    /**
     * Sets the value of the lastSnapshotTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public void setLastSnapshotTime(RecoverPointTimeStamp value) {
        this.lastSnapshotTime = value;
    }

    /**
     * Gets the value of the pending property.
     * 
     */
    public boolean isPending() {
        return pending;
    }

    /**
     * Sets the value of the pending property.
     * 
     */
    public void setPending(boolean value) {
        this.pending = value;
    }

    /**
     * Gets the value of the progress property.
     * 
     */
    public double getProgress() {
        return progress;
    }

    /**
     * Sets the value of the progress property.
     * 
     */
    public void setProgress(double value) {
        this.progress = value;
    }

}
