
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for volumeAccessState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="volumeAccessState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachedToOtherCluster" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="busy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="delayed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="inErrorState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="markingDataOnSplitter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="readOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="splittingToVolume" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="targetRPA" type="{}rpaUID" minOccurs="0"/>
 *         &lt;element name="writable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "volumeAccessState", propOrder = {
    "attachedToOtherCluster",
    "busy",
    "delayed",
    "inErrorState",
    "markingDataOnSplitter",
    "readOnly",
    "splittingToVolume",
    "targetRPA",
    "writable"
})
public class VolumeAccessState {

    protected Boolean attachedToOtherCluster;
    protected Boolean busy;
    protected Boolean delayed;
    protected Boolean inErrorState;
    protected Boolean markingDataOnSplitter;
    protected Boolean readOnly;
    protected Boolean splittingToVolume;
    protected RpaUID targetRPA;
    protected Boolean writable;

    /**
     * Gets the value of the attachedToOtherCluster property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttachedToOtherCluster() {
        return attachedToOtherCluster;
    }

    /**
     * Sets the value of the attachedToOtherCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttachedToOtherCluster(Boolean value) {
        this.attachedToOtherCluster = value;
    }

    /**
     * Gets the value of the busy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusy() {
        return busy;
    }

    /**
     * Sets the value of the busy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusy(Boolean value) {
        this.busy = value;
    }

    /**
     * Gets the value of the delayed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelayed() {
        return delayed;
    }

    /**
     * Sets the value of the delayed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelayed(Boolean value) {
        this.delayed = value;
    }

    /**
     * Gets the value of the inErrorState property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInErrorState() {
        return inErrorState;
    }

    /**
     * Sets the value of the inErrorState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInErrorState(Boolean value) {
        this.inErrorState = value;
    }

    /**
     * Gets the value of the markingDataOnSplitter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarkingDataOnSplitter() {
        return markingDataOnSplitter;
    }

    /**
     * Sets the value of the markingDataOnSplitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkingDataOnSplitter(Boolean value) {
        this.markingDataOnSplitter = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the splittingToVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSplittingToVolume() {
        return splittingToVolume;
    }

    /**
     * Sets the value of the splittingToVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSplittingToVolume(Boolean value) {
        this.splittingToVolume = value;
    }

    /**
     * Gets the value of the targetRPA property.
     * 
     * @return
     *     possible object is
     *     {@link RpaUID }
     *     
     */
    public RpaUID getTargetRPA() {
        return targetRPA;
    }

    /**
     * Sets the value of the targetRPA property.
     * 
     * @param value
     *     allowed object is
     *     {@link RpaUID }
     *     
     */
    public void setTargetRPA(RpaUID value) {
        this.targetRPA = value;
    }

    /**
     * Gets the value of the writable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWritable() {
        return writable;
    }

    /**
     * Sets the value of the writable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWritable(Boolean value) {
        this.writable = value;
    }

}
