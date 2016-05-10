
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vplexDirectorInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vplexDirectorInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="directorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directorUID" type="{}splitterUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vplexDirectorInformation", propOrder = {
    "directorName",
    "directorUID"
})
public class VplexDirectorInformation {

    protected String directorName;
    protected SplitterUID directorUID;

    /**
     * Gets the value of the directorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectorName() {
        return directorName;
    }

    /**
     * Sets the value of the directorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectorName(String value) {
        this.directorName = value;
    }

    /**
     * Gets the value of the directorUID property.
     * 
     * @return
     *     possible object is
     *     {@link SplitterUID }
     *     
     */
    public SplitterUID getDirectorUID() {
        return directorUID;
    }

    /**
     * Sets the value of the directorUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitterUID }
     *     
     */
    public void setDirectorUID(SplitterUID value) {
        this.directorUID = value;
    }

}
