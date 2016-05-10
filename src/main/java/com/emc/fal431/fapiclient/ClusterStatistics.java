
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clusterStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clusterStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}clusterUID" minOccurs="0"/>
 *         &lt;element name="traffic" type="{}trafficStatistics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clusterStatistics", propOrder = {
    "clusterUID",
    "traffic"
})
public class ClusterStatistics {

    protected ClusterUID clusterUID;
    protected TrafficStatistics traffic;

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
     * Gets the value of the traffic property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficStatistics }
     *     
     */
    public TrafficStatistics getTraffic() {
        return traffic;
    }

    /**
     * Sets the value of the traffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficStatistics }
     *     
     */
    public void setTraffic(TrafficStatistics value) {
        this.traffic = value;
    }

}