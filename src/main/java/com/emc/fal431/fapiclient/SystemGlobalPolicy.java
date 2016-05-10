
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemGlobalPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemGlobalPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advancedActionRegulationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="numberOfCommunicationStreams" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shouldCollectLongTermStatistics" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemGlobalPolicy", propOrder = {
    "advancedActionRegulationEnabled",
    "numberOfCommunicationStreams",
    "shouldCollectLongTermStatistics"
})
public class SystemGlobalPolicy {

    protected boolean advancedActionRegulationEnabled;
    protected int numberOfCommunicationStreams;
    protected boolean shouldCollectLongTermStatistics;

    /**
     * Gets the value of the advancedActionRegulationEnabled property.
     * 
     */
    public boolean isAdvancedActionRegulationEnabled() {
        return advancedActionRegulationEnabled;
    }

    /**
     * Sets the value of the advancedActionRegulationEnabled property.
     * 
     */
    public void setAdvancedActionRegulationEnabled(boolean value) {
        this.advancedActionRegulationEnabled = value;
    }

    /**
     * Gets the value of the numberOfCommunicationStreams property.
     * 
     */
    public int getNumberOfCommunicationStreams() {
        return numberOfCommunicationStreams;
    }

    /**
     * Sets the value of the numberOfCommunicationStreams property.
     * 
     */
    public void setNumberOfCommunicationStreams(int value) {
        this.numberOfCommunicationStreams = value;
    }

    /**
     * Gets the value of the shouldCollectLongTermStatistics property.
     * 
     */
    public boolean isShouldCollectLongTermStatistics() {
        return shouldCollectLongTermStatistics;
    }

    /**
     * Sets the value of the shouldCollectLongTermStatistics property.
     * 
     */
    public void setShouldCollectLongTermStatistics(boolean value) {
        this.shouldCollectLongTermStatistics = value;
    }

}
