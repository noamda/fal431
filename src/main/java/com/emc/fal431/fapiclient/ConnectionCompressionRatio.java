
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectionCompressionRatio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectionCompressionRatio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cluster" type="{}clusterUID" minOccurs="0"/>
 *         &lt;element name="compressionRatio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectionCompressionRatio", propOrder = {
    "cluster",
    "compressionRatio"
})
public class ConnectionCompressionRatio {

    protected ClusterUID cluster;
    protected double compressionRatio;

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
     * Gets the value of the compressionRatio property.
     * 
     */
    public double getCompressionRatio() {
        return compressionRatio;
    }

    /**
     * Sets the value of the compressionRatio property.
     * 
     */
    public void setCompressionRatio(double value) {
        this.compressionRatio = value;
    }

}
