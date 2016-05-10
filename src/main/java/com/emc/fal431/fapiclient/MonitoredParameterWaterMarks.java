
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for monitoredParameterWaterMarks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="monitoredParameterWaterMarks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="highWaterMark" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="lowWaterMark" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monitoredParameterWaterMarks", propOrder = {
    "highWaterMark",
    "limit",
    "lowWaterMark"
})
public class MonitoredParameterWaterMarks {

    protected long highWaterMark;
    protected long limit;
    protected long lowWaterMark;

    /**
     * Gets the value of the highWaterMark property.
     * 
     */
    public long getHighWaterMark() {
        return highWaterMark;
    }

    /**
     * Sets the value of the highWaterMark property.
     * 
     */
    public void setHighWaterMark(long value) {
        this.highWaterMark = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     */
    public long getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     */
    public void setLimit(long value) {
        this.limit = value;
    }

    /**
     * Gets the value of the lowWaterMark property.
     * 
     */
    public long getLowWaterMark() {
        return lowWaterMark;
    }

    /**
     * Sets the value of the lowWaterMark property.
     * 
     */
    public void setLowWaterMark(long value) {
        this.lowWaterMark = value;
    }

}
