
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupCopySettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupCopySettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="copyUID" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="groupCopySplitters" type="{}splitterUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasPhoenixDevices" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{}imageAccessInformation" minOccurs="0"/>
 *         &lt;element name="journal" type="{}consistencyGroupCopyJournal" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policy" type="{}consistencyGroupCopyPolicy" minOccurs="0"/>
 *         &lt;element name="roleInfo" type="{}consistencyGroupCopyRoleInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupCopySettings", propOrder = {
    "copyUID",
    "enabled",
    "groupCopySplitters",
    "hasPhoenixDevices",
    "imageAccessInformation",
    "journal",
    "name",
    "policy",
    "roleInfo"
})
public class ConsistencyGroupCopySettings {

    protected ConsistencyGroupCopyUID copyUID;
    protected boolean enabled;
    @XmlElement(nillable = true)
    protected List<SplitterUID> groupCopySplitters;
    protected boolean hasPhoenixDevices;
    protected ImageAccessInformation imageAccessInformation;
    protected ConsistencyGroupCopyJournal journal;
    protected String name;
    protected ConsistencyGroupCopyPolicy policy;
    protected ConsistencyGroupCopyRoleInfo roleInfo;

    /**
     * Gets the value of the copyUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public ConsistencyGroupCopyUID getCopyUID() {
        return copyUID;
    }

    /**
     * Sets the value of the copyUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public void setCopyUID(ConsistencyGroupCopyUID value) {
        this.copyUID = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the groupCopySplitters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupCopySplitters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupCopySplitters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitterUID }
     * 
     * 
     */
    public List<SplitterUID> getGroupCopySplitters() {
        if (groupCopySplitters == null) {
            groupCopySplitters = new ArrayList<SplitterUID>();
        }
        return this.groupCopySplitters;
    }

    /**
     * Gets the value of the hasPhoenixDevices property.
     * 
     */
    public boolean isHasPhoenixDevices() {
        return hasPhoenixDevices;
    }

    /**
     * Sets the value of the hasPhoenixDevices property.
     * 
     */
    public void setHasPhoenixDevices(boolean value) {
        this.hasPhoenixDevices = value;
    }

    /**
     * Gets the value of the imageAccessInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ImageAccessInformation }
     *     
     */
    public ImageAccessInformation getImageAccessInformation() {
        return imageAccessInformation;
    }

    /**
     * Sets the value of the imageAccessInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageAccessInformation }
     *     
     */
    public void setImageAccessInformation(ImageAccessInformation value) {
        this.imageAccessInformation = value;
    }

    /**
     * Gets the value of the journal property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyJournal }
     *     
     */
    public ConsistencyGroupCopyJournal getJournal() {
        return journal;
    }

    /**
     * Sets the value of the journal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyJournal }
     *     
     */
    public void setJournal(ConsistencyGroupCopyJournal value) {
        this.journal = value;
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
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyPolicy }
     *     
     */
    public ConsistencyGroupCopyPolicy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyPolicy }
     *     
     */
    public void setPolicy(ConsistencyGroupCopyPolicy value) {
        this.policy = value;
    }

    /**
     * Gets the value of the roleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyRoleInfo }
     *     
     */
    public ConsistencyGroupCopyRoleInfo getRoleInfo() {
        return roleInfo;
    }

    /**
     * Sets the value of the roleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyRoleInfo }
     *     
     */
    public void setRoleInfo(ConsistencyGroupCopyRoleInfo value) {
        this.roleInfo = value;
    }

}
