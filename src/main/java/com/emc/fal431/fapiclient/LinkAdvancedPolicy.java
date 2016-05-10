
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for linkAdvancedPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="linkAdvancedPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="performLongInitialization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{}snapshotGranularity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkAdvancedPolicy", propOrder = {
    "performLongInitialization",
    "snapshotGranularity"
})
public class LinkAdvancedPolicy {

    protected boolean performLongInitialization;
    protected SnapshotGranularity snapshotGranularity;

    /**
     * Gets the value of the performLongInitialization property.
     * 
     */
    public boolean isPerformLongInitialization() {
        return performLongInitialization;
    }

    /**
     * Sets the value of the performLongInitialization property.
     * 
     */
    public void setPerformLongInitialization(boolean value) {
        this.performLongInitialization = value;
    }

    /**
     * Gets the value of the snapshotGranularity property.
     * 
     * @return
     *     possible object is
     *     {@link SnapshotGranularity }
     *     
     */
    public SnapshotGranularity getSnapshotGranularity() {
        return snapshotGranularity;
    }

    /**
     * Sets the value of the snapshotGranularity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapshotGranularity }
     *     
     */
    public void setSnapshotGranularity(SnapshotGranularity value) {
        this.snapshotGranularity = value;
    }

}
