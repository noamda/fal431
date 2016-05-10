
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectionOutThroughput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectionOutThroughput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cluster" type="{}clusterUID" minOccurs="0"/>
 *         &lt;element name="outThroughput" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectionOutThroughput", propOrder = {
    "cluster",
    "outThroughput"
})
public class ConnectionOutThroughput {

    protected ClusterUID cluster;
    protected long outThroughput;

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
     * Gets the value of the outThroughput property.
     * 
     */
    public long getOutThroughput() {
        return outThroughput;
    }

    /**
     * Sets the value of the outThroughput property.
     * 
     */
    public void setOutThroughput(long value) {
        this.outThroughput = value;
    }

}
