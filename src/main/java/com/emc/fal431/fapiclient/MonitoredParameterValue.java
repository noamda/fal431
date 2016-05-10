
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for monitoredParameterValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="monitoredParameterValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameterWaterMarks" type="{}monitoredParameterWaterMarks" minOccurs="0"/>
 *         &lt;element name="reverseWaterMarksDirection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monitoredParameterValue", propOrder = {
    "parameterWaterMarks",
    "reverseWaterMarksDirection",
    "value"
})
public class MonitoredParameterValue {

    protected MonitoredParameterWaterMarks parameterWaterMarks;
    protected boolean reverseWaterMarksDirection;
    protected long value;

    /**
     * Gets the value of the parameterWaterMarks property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoredParameterWaterMarks }
     *     
     */
    public MonitoredParameterWaterMarks getParameterWaterMarks() {
        return parameterWaterMarks;
    }

    /**
     * Sets the value of the parameterWaterMarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoredParameterWaterMarks }
     *     
     */
    public void setParameterWaterMarks(MonitoredParameterWaterMarks value) {
        this.parameterWaterMarks = value;
    }

    /**
     * Gets the value of the reverseWaterMarksDirection property.
     * 
     */
    public boolean isReverseWaterMarksDirection() {
        return reverseWaterMarksDirection;
    }

    /**
     * Sets the value of the reverseWaterMarksDirection property.
     * 
     */
    public void setReverseWaterMarksDirection(boolean value) {
        this.reverseWaterMarksDirection = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public long getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(long value) {
        this.value = value;
    }

}
