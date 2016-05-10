
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for splitterSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="splitterSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachedUserVolumes" type="{}attachedUserVolumeInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "splitterSettings", propOrder = {
    "attachedUserVolumes",
    "splitterName",
    "splitterUID"
})
@XmlSeeAlso({
    AggregatedSplitterSettings.class,
    ArrayBasedSplitterSettings.class
})
public class SplitterSettings {

    @XmlElement(nillable = true)
    protected List<AttachedUserVolumeInfo> attachedUserVolumes;
    protected String splitterName;
    protected SplitterUID splitterUID;

    /**
     * Gets the value of the attachedUserVolumes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachedUserVolumes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachedUserVolumes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachedUserVolumeInfo }
     * 
     * 
     */
    public List<AttachedUserVolumeInfo> getAttachedUserVolumes() {
        if (attachedUserVolumes == null) {
            attachedUserVolumes = new ArrayList<AttachedUserVolumeInfo>();
        }
        return this.attachedUserVolumes;
    }

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
