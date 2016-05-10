
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for esxView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="esxView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filtered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nonVMVolumes" type="{}vmVolume" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vmViews" type="{}vmView" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esxView", propOrder = {
    "filtered",
    "ip",
    "name",
    "nonVMVolumes",
    "vmViews"
})
public class EsxView {

    protected boolean filtered;
    protected String ip;
    protected String name;
    @XmlElement(nillable = true)
    protected List<VmVolume> nonVMVolumes;
    @XmlElement(nillable = true)
    protected List<VmView> vmViews;

    /**
     * Gets the value of the filtered property.
     * 
     */
    public boolean isFiltered() {
        return filtered;
    }

    /**
     * Sets the value of the filtered property.
     * 
     */
    public void setFiltered(boolean value) {
        this.filtered = value;
    }

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nonVMVolumes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonVMVolumes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonVMVolumes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmVolume }
     * 
     * 
     */
    public List<VmVolume> getNonVMVolumes() {
        if (nonVMVolumes == null) {
            nonVMVolumes = new ArrayList<VmVolume>();
        }
        return this.nonVMVolumes;
    }

    /**
     * Gets the value of the vmViews property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmViews property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmViews().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmView }
     * 
     * 
     */
    public List<VmView> getVmViews() {
        if (vmViews == null) {
            vmViews = new ArrayList<VmView>();
        }
        return this.vmViews;
    }

}
