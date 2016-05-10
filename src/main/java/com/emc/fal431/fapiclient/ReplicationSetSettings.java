
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for replicationSetSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="replicationSetSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="replicationSetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}replicationSetUID" minOccurs="0"/>
 *         &lt;element name="sizeInBytes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="volumes" type="{}userVolumeSettings" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "replicationSetSettings", propOrder = {
    "replicationSetName",
    "replicationSetUID",
    "sizeInBytes",
    "volumes"
})
public class ReplicationSetSettings {

    protected String replicationSetName;
    protected ReplicationSetUID replicationSetUID;
    protected long sizeInBytes;
    @XmlElement(nillable = true)
    protected List<UserVolumeSettings> volumes;

    /**
     * Gets the value of the replicationSetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplicationSetName() {
        return replicationSetName;
    }

    /**
     * Sets the value of the replicationSetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplicationSetName(String value) {
        this.replicationSetName = value;
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
     * Gets the value of the sizeInBytes property.
     * 
     */
    public long getSizeInBytes() {
        return sizeInBytes;
    }

    /**
     * Sets the value of the sizeInBytes property.
     * 
     */
    public void setSizeInBytes(long value) {
        this.sizeInBytes = value;
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
     * {@link UserVolumeSettings }
     * 
     * 
     */
    public List<UserVolumeSettings> getVolumes() {
        if (volumes == null) {
            volumes = new ArrayList<UserVolumeSettings>();
        }
        return this.volumes;
    }

}
