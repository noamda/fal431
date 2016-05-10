
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for imageAccessInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="imageAccessInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imageAccessEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="imageInformation" type="{}imageAccessParameters" minOccurs="0"/>
 *         &lt;element name="imageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "imageAccessInformation", propOrder = {
    "imageAccessEnabled",
    "imageInformation",
    "imageName",
    "scenario"
})
public class ImageAccessInformation {

    protected boolean imageAccessEnabled;
    protected ImageAccessParameters imageInformation;
    protected String imageName;
    protected ImageAccessScenario scenario;

    /**
     * Gets the value of the imageAccessEnabled property.
     * 
     */
    public boolean isImageAccessEnabled() {
        return imageAccessEnabled;
    }

    /**
     * Sets the value of the imageAccessEnabled property.
     * 
     */
    public void setImageAccessEnabled(boolean value) {
        this.imageAccessEnabled = value;
    }

    /**
     * Gets the value of the imageInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ImageAccessParameters }
     *     
     */
    public ImageAccessParameters getImageInformation() {
        return imageInformation;
    }

    /**
     * Sets the value of the imageInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageAccessParameters }
     *     
     */
    public void setImageInformation(ImageAccessParameters value) {
        this.imageInformation = value;
    }

    /**
     * Gets the value of the imageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * Sets the value of the imageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageName(String value) {
        this.imageName = value;
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
