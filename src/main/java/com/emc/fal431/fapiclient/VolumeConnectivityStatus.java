
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for volumeConnectivityStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="volumeConnectivityStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{}clusterEntityConnectivityStatus">
 *       &lt;sequence>
 *         &lt;element name="volumeID" type="{}deviceUID" minOccurs="0"/>
 *         &lt;element ref="{}volumeStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "volumeConnectivityStatus", propOrder = {
    "volumeID",
    "volumeStatus"
})
public class VolumeConnectivityStatus
    extends ClusterEntityConnectivityStatus
{

    protected DeviceUID volumeID;
    protected VolumeStatus volumeStatus;

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
     * Gets the value of the volumeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeStatus }
     *     
     */
    public VolumeStatus getVolumeStatus() {
        return volumeStatus;
    }

    /**
     * Sets the value of the volumeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeStatus }
     *     
     */
    public void setVolumeStatus(VolumeStatus value) {
        this.volumeStatus = value;
    }

}
