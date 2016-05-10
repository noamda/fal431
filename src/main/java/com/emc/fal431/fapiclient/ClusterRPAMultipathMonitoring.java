
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clusterRPAMultipathMonitoring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clusterRPAMultipathMonitoring">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}clusterUID" minOccurs="0"/>
 *         &lt;element name="monitoringSplitters" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="monitoringStorage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clusterRPAMultipathMonitoring", propOrder = {
    "clusterUID",
    "monitoringSplitters",
    "monitoringStorage"
})
public class ClusterRPAMultipathMonitoring {

    protected ClusterUID clusterUID;
    protected boolean monitoringSplitters;
    protected boolean monitoringStorage;

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
     * Gets the value of the monitoringSplitters property.
     * 
     */
    public boolean isMonitoringSplitters() {
        return monitoringSplitters;
    }

    /**
     * Sets the value of the monitoringSplitters property.
     * 
     */
    public void setMonitoringSplitters(boolean value) {
        this.monitoringSplitters = value;
    }

    /**
     * Gets the value of the monitoringStorage property.
     * 
     */
    public boolean isMonitoringStorage() {
        return monitoringStorage;
    }

    /**
     * Sets the value of the monitoringStorage property.
     * 
     */
    public void setMonitoringStorage(boolean value) {
        this.monitoringStorage = value;
    }

}
