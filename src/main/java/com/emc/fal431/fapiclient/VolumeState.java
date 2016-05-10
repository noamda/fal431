
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for volumeState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="volumeState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}clusterUID" minOccurs="0"/>
 *         &lt;element name="rpasAccessStatus" type="{}volumeRPAAccessStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="volumeID" type="{}deviceUID" minOccurs="0"/>
 *         &lt;element ref="{}volumeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "volumeState", propOrder = {
    "clusterUID",
    "rpasAccessStatus",
    "volumeID",
    "volumeType"
})
@XmlSeeAlso({
    UserVolumeState.class,
    RepositoryVolumeState.class,
    JournalVolumeState.class
})
public abstract class VolumeState {

    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<VolumeRPAAccessStatus> rpasAccessStatus;
    protected DeviceUID volumeID;
    protected VolumeType volumeType;

    /**
     * Gets the value of the clusterUID property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterUID }
     *     
     */
    public ClusterUID getClusterUID() {
        return clusterUID;
    }

    /**
     * Sets the value of the clusterUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterUID }
     *     
     */
    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }

    /**
     * Gets the value of the rpasAccessStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rpasAccessStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRpasAccessStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VolumeRPAAccessStatus }
     * 
     * 
     */
    public List<VolumeRPAAccessStatus> getRpasAccessStatus() {
        if (rpasAccessStatus == null) {
            rpasAccessStatus = new ArrayList<VolumeRPAAccessStatus>();
        }
        return this.rpasAccessStatus;
    }

    /**
     * Gets the value of the volumeID property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceUID }
     *     
     */
    public DeviceUID getVolumeID() {
        return volumeID;
    }

    /**
     * Sets the value of the volumeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceUID }
     *     
     */
    public void setVolumeID(DeviceUID value) {
        this.volumeID = value;
    }

    /**
     * Gets the value of the volumeType property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    public VolumeType getVolumeType() {
        return volumeType;
    }

    /**
     * Sets the value of the volumeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setVolumeType(VolumeType value) {
        this.volumeType = value;
    }

}
