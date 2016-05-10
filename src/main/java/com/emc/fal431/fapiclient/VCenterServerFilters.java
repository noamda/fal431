
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vCenterServerFilters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vCenterServerFilters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filterUnknownLuns" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="filters" type="{}vCenterServerFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vcenterServer" type="{}vCenterServerUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vCenterServerFilters", propOrder = {
    "filterUnknownLuns",
    "filters",
    "vcenterServer"
})
public class VCenterServerFilters {

    protected boolean filterUnknownLuns;
    @XmlElement(nillable = true)
    protected List<VCenterServerFilter> filters;
    protected VCenterServerUID vcenterServer;

    /**
     * Gets the value of the filterUnknownLuns property.
     * 
     */
    public boolean isFilterUnknownLuns() {
        return filterUnknownLuns;
    }

    /**
     * Sets the value of the filterUnknownLuns property.
     * 
     */
    public void setFilterUnknownLuns(boolean value) {
        this.filterUnknownLuns = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VCenterServerFilter }
     * 
     * 
     */
    public List<VCenterServerFilter> getFilters() {
        if (filters == null) {
            filters = new ArrayList<VCenterServerFilter>();
        }
        return this.filters;
    }

    /**
     * Gets the value of the vcenterServer property.
     * 
     * @return
     *     possible object is
     *     {@link VCenterServerUID }
     *     
     */
    public VCenterServerUID getVcenterServer() {
        return vcenterServer;
    }

    /**
     * Sets the value of the vcenterServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link VCenterServerUID }
     *     
     */
    public void setVcenterServer(VCenterServerUID value) {
        this.vcenterServer = value;
    }

}
