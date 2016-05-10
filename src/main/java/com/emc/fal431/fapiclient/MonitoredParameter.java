
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for monitoredParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="monitoredParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{}monitoredParameterKey" minOccurs="0"/>
 *         &lt;element name="value" type="{}monitoredParameterValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monitoredParameter", propOrder = {
    "key",
    "value"
})
public class MonitoredParameter {

    protected MonitoredParameterKey key;
    protected MonitoredParameterValue value;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoredParameterKey }
     *     
     */
    public MonitoredParameterKey getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoredParameterKey }
     *     
     */
    public void setKey(MonitoredParameterKey value) {
        this.key = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoredParameterValue }
     *     
     */
    public MonitoredParameterValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoredParameterValue }
     *     
     */
    public void setValue(MonitoredParameterValue value) {
        this.value = value;
    }

}
