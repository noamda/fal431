
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clariionVolumes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clariionVolumes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}splitterUID" minOccurs="0"/>
 *         &lt;element name="volumesInformation" type="{}clariionVolumeInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clariionVolumes", propOrder = {
    "splitterUID",
    "volumesInformation"
})
public class ClariionVolumes {

    protected SplitterUID splitterUID;
    @XmlElement(nillable = true)
    protected List<ClariionVolumeInformation> volumesInformation;

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

    /**
     * Gets the value of the volumesInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the volumesInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVolumesInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClariionVolumeInformation }
     * 
     * 
     */
    public List<ClariionVolumeInformation> getVolumesInformation() {
        if (volumesInformation == null) {
            volumesInformation = new ArrayList<ClariionVolumeInformation>();
        }
        return this.volumesInformation;
    }

}
