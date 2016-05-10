
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for splitterView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="splitterView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupCopies" type="{}consistencyGroupCopyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}splitterInfo" minOccurs="0"/>
 *         &lt;element name="volumes" type="{}deviceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "splitterView", propOrder = {
    "groupCopies",
    "splitterInfo",
    "volumes"
})
public class SplitterView {

    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyInfo> groupCopies;
    protected SplitterInfo splitterInfo;
    @XmlElement(nillable = true)
    protected List<DeviceInfo> volumes;

    /**
     * Gets the value of the groupCopies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupCopies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupCopies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupCopyInfo }
     * 
     * 
     */
    public List<ConsistencyGroupCopyInfo> getGroupCopies() {
        if (groupCopies == null) {
            groupCopies = new ArrayList<ConsistencyGroupCopyInfo>();
        }
        return this.groupCopies;
    }

    /**
     * Gets the value of the splitterInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SplitterInfo }
     *     
     */
    public SplitterInfo getSplitterInfo() {
        return splitterInfo;
    }

    /**
     * Sets the value of the splitterInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitterInfo }
     *     
     */
    public void setSplitterInfo(SplitterInfo value) {
        this.splitterInfo = value;
    }

    /**
     * Gets the value of the volumes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the volumes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVolumes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceInfo }
     * 
     * 
     */
    public List<DeviceInfo> getVolumes() {
        if (volumes == null) {
            volumes = new ArrayList<DeviceInfo>();
        }
        return this.volumes;
    }

}
