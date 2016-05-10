
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for volumeSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="volumeSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}clusterUID" minOccurs="0"/>
 *         &lt;element name="volumeInfo" type="{}volumeInformation" minOccurs="0"/>
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
@XmlType(name = "volumeSettings", propOrder = {
    "clusterUID",
    "volumeInfo",
    "volumeType"
})
@XmlSeeAlso({
    RepositoryVolumeSettings.class,
    UserVolumeSettings.class,
    JournalVolumeSettings.class
})
public abstract class VolumeSettings {

    protected ClusterUID clusterUID;
    protected VolumeInformation volumeInfo;
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
     * Gets the value of the volumeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeInformation }
     *     
     */
    public VolumeInformation getVolumeInfo() {
        return volumeInfo;
    }

    /**
     * Sets the value of the volumeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeInformation }
     *     
     */
    public void setVolumeInfo(VolumeInformation value) {
        this.volumeInfo = value;
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
