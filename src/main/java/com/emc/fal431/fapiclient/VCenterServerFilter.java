
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vCenterServerFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vCenterServerFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filterType" type="{}vCenterServerFilterType" minOccurs="0"/>
 *         &lt;element name="filteredEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vCenterServerFilter", propOrder = {
    "filterType",
    "filteredEntityName"
})
@XmlSeeAlso({
    VCenterServerVMFilter.class,
    VCenterServerESXFilter.class,
    VCenterServerLunFilter.class
})
public abstract class VCenterServerFilter {

    protected VCenterServerFilterType filterType;
    protected String filteredEntityName;

    /**
     * Gets the value of the filterType property.
     * 
     * @return
     *     possible object is
     *     {@link VCenterServerFilterType }
     *     
     */
    public VCenterServerFilterType getFilterType() {
        return filterType;
    }

    /**
     * Sets the value of the filterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VCenterServerFilterType }
     *     
     */
    public void setFilterType(VCenterServerFilterType value) {
        this.filterType = value;
    }

    /**
     * Gets the value of the filteredEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilteredEntityName() {
        return filteredEntityName;
    }

    /**
     * Sets the value of the filteredEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilteredEntityName(String value) {
        this.filteredEntityName = value;
    }

}
