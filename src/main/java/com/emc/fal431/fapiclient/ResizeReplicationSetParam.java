
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resizeReplicationSetParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resizeReplicationSetParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalSpaceClean" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newSizeInBytes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resizeReplicationSetParam", propOrder = {
    "additionalSpaceClean",
    "newSizeInBytes"
})
public class ResizeReplicationSetParam {

    protected boolean additionalSpaceClean;
    protected long newSizeInBytes;

    /**
     * Gets the value of the additionalSpaceClean property.
     * 
     */
    public boolean isAdditionalSpaceClean() {
        return additionalSpaceClean;
    }

    /**
     * Sets the value of the additionalSpaceClean property.
     * 
     */
    public void setAdditionalSpaceClean(boolean value) {
        this.additionalSpaceClean = value;
    }

    /**
     * Gets the value of the newSizeInBytes property.
     * 
     */
    public long getNewSizeInBytes() {
        return newSizeInBytes;
    }

    /**
     * Sets the value of the newSizeInBytes property.
     * 
     */
    public void setNewSizeInBytes(long value) {
        this.newSizeInBytes = value;
    }

}
