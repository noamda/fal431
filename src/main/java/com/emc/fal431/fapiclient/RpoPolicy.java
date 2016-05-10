
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rpoPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rpoPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowRegulation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maximumAllowedLag" type="{}quantity" minOccurs="0"/>
 *         &lt;element name="minimizationType" type="{}rpoMinimizationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rpoPolicy", propOrder = {
    "allowRegulation",
    "maximumAllowedLag",
    "minimizationType"
})
public class RpoPolicy {

    protected boolean allowRegulation;
    protected Quantity maximumAllowedLag;
    protected RpoMinimizationType minimizationType;

    /**
     * Gets the value of the allowRegulation property.
     * 
     */
    public boolean isAllowRegulation() {
        return allowRegulation;
    }

    /**
     * Sets the value of the allowRegulation property.
     * 
     */
    public void setAllowRegulation(boolean value) {
        this.allowRegulation = value;
    }

    /**
     * Gets the value of the maximumAllowedLag property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getMaximumAllowedLag() {
        return maximumAllowedLag;
    }

    /**
     * Sets the value of the maximumAllowedLag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setMaximumAllowedLag(Quantity value) {
        this.maximumAllowedLag = value;
    }

    /**
     * Gets the value of the minimizationType property.
     * 
     * @return
     *     possible object is
     *     {@link RpoMinimizationType }
     *     
     */
    public RpoMinimizationType getMinimizationType() {
        return minimizationType;
    }

    /**
     * Sets the value of the minimizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RpoMinimizationType }
     *     
     */
    public void setMinimizationType(RpoMinimizationType value) {
        this.minimizationType = value;
    }

}
