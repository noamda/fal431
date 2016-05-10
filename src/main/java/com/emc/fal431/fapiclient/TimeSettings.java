
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timeSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timeSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="useClustersTimeZones" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeSettings", propOrder = {
    "useClustersTimeZones"
})
public class TimeSettings {

    protected boolean useClustersTimeZones;

    /**
     * Gets the value of the useClustersTimeZones property.
     * 
     */
    public boolean isUseClustersTimeZones() {
        return useClustersTimeZones;
    }

    /**
     * Sets the value of the useClustersTimeZones property.
     * 
     */
    public void setUseClustersTimeZones(boolean value) {
        this.useClustersTimeZones = value;
    }

}
