
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for replicationSetSettingsChangesParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="replicationSetSettingsChangesParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}replicationSetUID" minOccurs="0"/>
 *         &lt;element ref="{}resizeReplicationSetParam" minOccurs="0"/>
 *         &lt;element name="shouldAttachAsClean" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="volumesChanges" type="{}userVolumeSettingsChangesParam" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "replicationSetSettingsChangesParam", propOrder = {
    "name",
    "replicationSetUID",
    "resizeReplicationSetParam",
    "shouldAttachAsClean",
    "volumesChanges"
})
public class ReplicationSetSettingsChangesParam {

    protected String name;
    protected ReplicationSetUID replicationSetUID;
    protected ResizeReplicationSetParam resizeReplicationSetParam;
    protected boolean shouldAttachAsClean;
    @XmlElement(nillable = true)
    protected List<UserVolumeSettingsChangesParam> volumesChanges;

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
     * Gets the value of the replicationSetUID property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationSetUID }
     *     
     */
    public ReplicationSetUID getReplicationSetUID() {
        return replicationSetUID;
    }

    /**
     * Sets the value of the replicationSetUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationSetUID }
     *     
     */
    public void setReplicationSetUID(ReplicationSetUID value) {
        this.replicationSetUID = value;
    }

    /**
     * Gets the value of the resizeReplicationSetParam property.
     * 
     * @return
     *     possible object is
     *     {@link ResizeReplicationSetParam }
     *     
     */
    public ResizeReplicationSetParam getResizeReplicationSetParam() {
        return resizeReplicationSetParam;
    }

    /**
     * Sets the value of the resizeReplicationSetParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResizeReplicationSetParam }
     *     
     */
    public void setResizeReplicationSetParam(ResizeReplicationSetParam value) {
        this.resizeReplicationSetParam = value;
    }

    /**
     * Gets the value of the shouldAttachAsClean property.
     * 
     */
    public boolean isShouldAttachAsClean() {
        return shouldAttachAsClean;
    }

    /**
     * Sets the value of the shouldAttachAsClean property.
     * 
     */
    public void setShouldAttachAsClean(boolean value) {
        this.shouldAttachAsClean = value;
    }

    /**
     * Gets the value of the volumesChanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the volumesChanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVolumesChanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserVolumeSettingsChangesParam }
     * 
     * 
     */
    public List<UserVolumeSettingsChangesParam> getVolumesChanges() {
        if (volumesChanges == null) {
            volumesChanges = new ArrayList<UserVolumeSettingsChangesParam>();
        }
        return this.volumesChanges;
    }

}
