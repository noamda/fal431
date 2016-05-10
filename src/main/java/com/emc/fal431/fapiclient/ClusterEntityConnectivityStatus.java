
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clusterEntityConnectivityStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clusterEntityConnectivityStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}clusterUID" minOccurs="0"/>
 *         &lt;element name="connectivityStatus" type="{}generalStatus" minOccurs="0"/>
 *         &lt;element name="entityType" type="{}clusterEntityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clusterEntityConnectivityStatus", propOrder = {
    "clusterUID",
    "connectivityStatus",
    "entityType"
})
@XmlSeeAlso({
    VolumeConnectivityStatus.class,
    SplitterConnectivityStatus.class,
    RpaConnectivityStatus.class
})
public abstract class ClusterEntityConnectivityStatus {

    protected ClusterUID clusterUID;
    protected GeneralStatus connectivityStatus;
    protected ClusterEntityType entityType;

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
     * Gets the value of the connectivityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralStatus }
     *     
     */
    public GeneralStatus getConnectivityStatus() {
        return connectivityStatus;
    }

    /**
     * Sets the value of the connectivityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralStatus }
     *     
     */
    public void setConnectivityStatus(GeneralStatus value) {
        this.connectivityStatus = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterEntityType }
     *     
     */
    public ClusterEntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterEntityType }
     *     
     */
    public void setEntityType(ClusterEntityType value) {
        this.entityType = value;
    }

}
