
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for moveToImageParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="moveToImageParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessType" type="{}specificImageAccessType" minOccurs="0"/>
 *         &lt;element name="imageType" type="{}searchImageType" minOccurs="0"/>
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
@XmlType(name = "moveToImageParams", propOrder = {
    "accessType",
    "imageType",
    "scenario"
})
public class MoveToImageParams {

    protected SpecificImageAccessType accessType;
    protected SearchImageType imageType;
    protected ImageAccessScenario scenario;

    /**
     * Gets the value of the accessType property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificImageAccessType }
     *     
     */
    public SpecificImageAccessType getAccessType() {
        return accessType;
    }

    /**
     * Sets the value of the accessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificImageAccessType }
     *     
     */
    public void setAccessType(SpecificImageAccessType value) {
        this.accessType = value;
    }

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchImageType }
     *     
     */
    public SearchImageType getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchImageType }
     *     
     */
    public void setImageType(SearchImageType value) {
        this.imageType = value;
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
