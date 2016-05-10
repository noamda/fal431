
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phoenixClusterState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phoenixClusterState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availableDisk" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cluster" type="{}clusterUID" minOccurs="0"/>
 *         &lt;element name="clusterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diskCapacity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="status" type="{}phoenixClusterStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phoenixClusterState", propOrder = {
    "availableDisk",
    "cluster",
    "clusterName",
    "diskCapacity",
    "status"
})
public class PhoenixClusterState {

    protected Long availableDisk;
    protected ClusterUID cluster;
    protected String clusterName;
    protected long diskCapacity;
    protected PhoenixClusterStatus status;

    /**
     * Gets the value of the availableDisk property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvailableDisk() {
        return availableDisk;
    }

    /**
     * Sets the value of the availableDisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailableDisk(Long value) {
        this.availableDisk = value;
    }

    /**
     * Gets the value of the cluster property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterUID }
     *     
     */
    public ClusterUID getCluster() {
        return cluster;
    }

    /**
     * Sets the value of the cluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterUID }
     *     
     */
    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }

    /**
     * Gets the value of the clusterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * Sets the value of the clusterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterName(String value) {
        this.clusterName = value;
    }

    /**
     * Gets the value of the diskCapacity property.
     * 
     */
    public long getDiskCapacity() {
        return diskCapacity;
    }

    /**
     * Sets the value of the diskCapacity property.
     * 
     */
    public void setDiskCapacity(long value) {
        this.diskCapacity = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PhoenixClusterStatus }
     *     
     */
    public PhoenixClusterStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoenixClusterStatus }
     *     
     */
    public void setStatus(PhoenixClusterStatus value) {
        this.status = value;
    }

}
