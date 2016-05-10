
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for splitterInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="splitterInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="splitterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}splitterUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "splitterInfo", propOrder = {
    "splitterName",
    "splitterUID"
})
public class SplitterInfo {

    protected String splitterName;
    protected SplitterUID splitterUID;

    /**
     * Gets the value of the splitterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitterName() {
        return splitterName;
    }

    /**
     * Sets the value of the splitterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitterName(String value) {
        this.splitterName = value;
    }

    /**
     * Gets the value of the splitterUID property.
     * 
     * @return
     *     possible object is
     *     {@link SplitterUID }
     *     
     */
    public SplitterUID getSplitterUID() {
        return splitterUID;
    }

    /**
     * Sets the value of the splitterUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitterUID }
     *     
     */
    public void setSplitterUID(SplitterUID value) {
        this.splitterUID = value;
    }

}
