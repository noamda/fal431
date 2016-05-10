
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for splitterVolumeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="splitterVolumeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="splitterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}splitterVolume" minOccurs="0"/>
 *         &lt;element name="volumeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "splitterVolumeInfo", propOrder = {
    "splitterName",
    "splitterVolume",
    "volumeName"
})
public class SplitterVolumeInfo {

    protected String splitterName;
    protected SplitterVolume splitterVolume;
    protected String volumeName;

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
     * Gets the value of the splitterVolume property.
     * 
     * @return
     *     possible object is
     *     {@link SplitterVolume }
     *     
     */
    public SplitterVolume getSplitterVolume() {
        return splitterVolume;
    }

    /**
     * Sets the value of the splitterVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitterVolume }
     *     
     */
    public void setSplitterVolume(SplitterVolume value) {
        this.splitterVolume = value;
    }

    /**
     * Gets the value of the volumeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeName() {
        return volumeName;
    }

    /**
     * Sets the value of the volumeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeName(String value) {
        this.volumeName = value;
    }

}
