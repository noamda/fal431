
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enableImageAccessWithParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enableImageAccessWithParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="params" type="{}imageAccessParameters" minOccurs="0"/>
 *         &lt;element name="scenario" type="{}imageAccessScenario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableImageAccessWithParams", propOrder = {
    "params",
    "scenario"
})
public class EnableImageAccessWithParams {

    protected ImageAccessParameters params;
    protected ImageAccessScenario scenario;

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link ImageAccessParameters }
     *     
     */
    public ImageAccessParameters getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageAccessParameters }
     *     
     */
    public void setParams(ImageAccessParameters value) {
        this.params = value;
    }

    /**
     * Gets the value of the scenario property.
     * 
     * @return
     *     possible object is
     *     {@link ImageAccessScenario }
     *     
     */
    public ImageAccessScenario getScenario() {
        return scenario;
    }

    /**
     * Sets the value of the scenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageAccessScenario }
     *     
     */
    public void setScenario(ImageAccessScenario value) {
        this.scenario = value;
    }

}
