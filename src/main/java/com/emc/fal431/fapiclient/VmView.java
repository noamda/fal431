
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vmView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vmView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataStores" type="{}dataStore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="filtered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectingGroupUID" type="{}consistencyGroupUID" minOccurs="0"/>
 *         &lt;element name="protectionStatus" type="{}vmProtectionStatus" minOccurs="0"/>
 *         &lt;element name="rdmDevices" type="{}vmVolume" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="template" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vmView", propOrder = {
    "dataStores",
    "filtered",
    "ip",
    "name",
    "protectingGroupUID",
    "protectionStatus",
    "rdmDevices",
    "template"
})
public class VmView {

    @XmlElement(nillable = true)
    protected List<DataStore> dataStores;
    protected boolean filtered;
    protected String ip;
    protected String name;
    protected ConsistencyGroupUID protectingGroupUID;
    protected VmProtectionStatus protectionStatus;
    @XmlElement(nillable = true)
    protected List<VmVolume> rdmDevices;
    protected boolean template;

    /**
     * Gets the value of the dataStores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataStores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataStores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataStore }
     * 
     * 
     */
    public List<DataStore> getDataStores() {
        if (dataStores == null) {
            dataStores = new ArrayList<DataStore>();
        }
        return this.dataStores;
    }

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
     * Gets the value of the protectingGroupUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupUID }
     *     
     */
    public ConsistencyGroupUID getProtectingGroupUID() {
        return protectingGroupUID;
    }

    /**
     * Sets the value of the protectingGroupUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupUID }
     *     
     */
    public void setProtectingGroupUID(ConsistencyGroupUID value) {
        this.protectingGroupUID = value;
    }

    /**
     * Gets the value of the protectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VmProtectionStatus }
     *     
     */
    public VmProtectionStatus getProtectionStatus() {
        return protectionStatus;
    }

    /**
     * Sets the value of the protectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmProtectionStatus }
     *     
     */
    public void setProtectionStatus(VmProtectionStatus value) {
        this.protectionStatus = value;
    }

    /**
     * Gets the value of the rdmDevices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rdmDevices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRdmDevices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmVolume }
     * 
     * 
     */
    public List<VmVolume> getRdmDevices() {
        if (rdmDevices == null) {
            rdmDevices = new ArrayList<VmVolume>();
        }
        return this.rdmDevices;
    }

    /**
     * Gets the value of the template property.
     * 
     */
    public boolean isTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     */
    public void setTemplate(boolean value) {
        this.template = value;
    }

}
