
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for automaticSnapshotConsolidationPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="automaticSnapshotConsolidationPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dailyConsolidations" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="unconsolidatedDurationInSeconds" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="weeklyConsolidations" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "automaticSnapshotConsolidationPolicy", propOrder = {
    "dailyConsolidations",
    "enabled",
    "unconsolidatedDurationInSeconds",
    "weeklyConsolidations"
})
public class AutomaticSnapshotConsolidationPolicy {

    protected long dailyConsolidations;
    protected boolean enabled;
    protected long unconsolidatedDurationInSeconds;
    protected long weeklyConsolidations;

    /**
     * Gets the value of the dailyConsolidations property.
     * 
     */
    public long getDailyConsolidations() {
        return dailyConsolidations;
    }

    /**
     * Sets the value of the dailyConsolidations property.
     * 
     */
    public void setDailyConsolidations(long value) {
        this.dailyConsolidations = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the unconsolidatedDurationInSeconds property.
     * 
     */
    public long getUnconsolidatedDurationInSeconds() {
        return unconsolidatedDurationInSeconds;
    }

    /**
     * Sets the value of the unconsolidatedDurationInSeconds property.
     * 
     */
    public void setUnconsolidatedDurationInSeconds(long value) {
        this.unconsolidatedDurationInSeconds = value;
    }

    /**
     * Gets the value of the weeklyConsolidations property.
     * 
     */
    public long getWeeklyConsolidations() {
        return weeklyConsolidations;
    }

    /**
     * Sets the value of the weeklyConsolidations property.
     * 
     */
    public void setWeeklyConsolidations(long value) {
        this.weeklyConsolidations = value;
    }

}
