
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupCopySettingsChangesParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupCopySettingsChangesParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="copyUID" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *         &lt;element name="newJournalVolumes" type="{}deviceUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="provisionedJournalInformation" type="{}provisionedJournalChangesParam" minOccurs="0"/>
 *         &lt;element name="removedJournalVolumes" type="{}deviceUID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupCopySettingsChangesParam", propOrder = {
    "copyUID",
    "newJournalVolumes",
    "provisionedJournalInformation",
    "removedJournalVolumes"
})
public class ConsistencyGroupCopySettingsChangesParam {

    protected ConsistencyGroupCopyUID copyUID;
    @XmlElement(nillable = true)
    protected List<DeviceUID> newJournalVolumes;
    protected ProvisionedJournalChangesParam provisionedJournalInformation;
    @XmlElement(nillable = true)
    protected List<DeviceUID> removedJournalVolumes;

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
     * Gets the value of the newJournalVolumes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newJournalVolumes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewJournalVolumes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceUID }
     * 
     * 
     */
    public List<DeviceUID> getNewJournalVolumes() {
        if (newJournalVolumes == null) {
            newJournalVolumes = new ArrayList<DeviceUID>();
        }
        return this.newJournalVolumes;
    }

    /**
     * Gets the value of the provisionedJournalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProvisionedJournalChangesParam }
     *     
     */
    public ProvisionedJournalChangesParam getProvisionedJournalInformation() {
        return provisionedJournalInformation;
    }

    /**
     * Sets the value of the provisionedJournalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvisionedJournalChangesParam }
     *     
     */
    public void setProvisionedJournalInformation(ProvisionedJournalChangesParam value) {
        this.provisionedJournalInformation = value;
    }

    /**
     * Gets the value of the removedJournalVolumes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removedJournalVolumes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemovedJournalVolumes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceUID }
     * 
     * 
     */
    public List<DeviceUID> getRemovedJournalVolumes() {
        if (removedJournalVolumes == null) {
            removedJournalVolumes = new ArrayList<DeviceUID>();
        }
        return this.removedJournalVolumes;
    }

}
