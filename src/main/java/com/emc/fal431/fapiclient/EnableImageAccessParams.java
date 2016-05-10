
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enableImageAccessParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enableImageAccessParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mode" type="{}imageAccessMode" minOccurs="0"/>
 *         &lt;element name="scenario" type="{}imageAccessScenario" minOccurs="0"/>
 *         &lt;element ref="{}snapshot" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableImageAccessParams", propOrder = {
    "mode",
    "scenario",
    "snapshot"
})
public class EnableImageAccessParams {

    protected ImageAccessMode mode;
    protected ImageAccessScenario scenario;
    protected Snapshot snapshot;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link ImageAccessMode }
     *     
     */
    public ImageAccessMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageAccessMode }
     *     
     */
    public void setMode(ImageAccessMode value) {
        this.mode = value;
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

    /**
     * Gets the value of the snapshot property.
     * 
     * @return
     *     possible object is
     *     {@link Snapshot }
     *     
     */
    public Snapshot getSnapshot() {
        return snapshot;
    }

    /**
     * Sets the value of the snapshot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Snapshot }
     *     
     */
    public void setSnapshot(Snapshot value) {
        this.snapshot = value;
    }

}
