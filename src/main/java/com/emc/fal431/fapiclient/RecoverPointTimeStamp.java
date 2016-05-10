
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recoverPointTimeStamp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recoverPointTimeStamp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timeInMicroSeconds" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recoverPointTimeStamp", propOrder = {
    "timeInMicroSeconds"
})
public class RecoverPointTimeStamp {

    protected long timeInMicroSeconds;

    /**
     * Gets the value of the timeInMicroSeconds property.
     * 
     */
    public long getTimeInMicroSeconds() {
        return timeInMicroSeconds;
    }

    /**
     * Sets the value of the timeInMicroSeconds property.
     * 
     */
    public void setTimeInMicroSeconds(long value) {
        this.timeInMicroSeconds = value;
    }

}
