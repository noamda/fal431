
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remoteClusterConnectionInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remoteClusterConnectionInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cluster" type="{}clusterUID" minOccurs="0"/>
 *         &lt;element ref="{}connectionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remoteClusterConnectionInformation", propOrder = {
    "cluster",
    "connectionType"
})
public class RemoteClusterConnectionInformation {

    protected ClusterUID cluster;
    protected ConnectionType connectionType;

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
     * Gets the value of the connectionType property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionType }
     *     
     */
    public ConnectionType getConnectionType() {
        return connectionType;
    }

    /**
     * Sets the value of the connectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionType }
     *     
     */
    public void setConnectionType(ConnectionType value) {
        this.connectionType = value;
    }

}
