
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for snapshotConsolidationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="snapshotConsolidationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consolidationPolicy" type="{}bookmarkConsolidationPolicy" minOccurs="0"/>
 *         &lt;element name="consolidationType" type="{}snapshotConsolidationType" minOccurs="0"/>
 *         &lt;element name="savedSpaceInBytes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "snapshotConsolidationInfo", propOrder = {
    "consolidationPolicy",
    "consolidationType",
    "savedSpaceInBytes"
})
public class SnapshotConsolidationInfo {

    protected BookmarkConsolidationPolicy consolidationPolicy;
    protected SnapshotConsolidationType consolidationType;
    protected long savedSpaceInBytes;

    /**
     * Gets the value of the consolidationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link BookmarkConsolidationPolicy }
     *     
     */
    public BookmarkConsolidationPolicy getConsolidationPolicy() {
        return consolidationPolicy;
    }

    /**
     * Sets the value of the consolidationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookmarkConsolidationPolicy }
     *     
     */
    public void setConsolidationPolicy(BookmarkConsolidationPolicy value) {
        this.consolidationPolicy = value;
    }

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
     * Gets the value of the savedSpaceInBytes property.
     * 
     */
    public long getSavedSpaceInBytes() {
        return savedSpaceInBytes;
    }

    /**
     * Sets the value of the savedSpaceInBytes property.
     * 
     */
    public void setSavedSpaceInBytes(long value) {
        this.savedSpaceInBytes = value;
    }

}
