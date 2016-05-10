
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for globalLinkUID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="globalLinkUID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstCluster" type="{}clusterUID" minOccurs="0"/>
 *         &lt;element name="secondCluster" type="{}clusterUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "globalLinkUID", propOrder = {
    "firstCluster",
    "secondCluster"
})
public class GlobalLinkUID {

    protected ClusterUID firstCluster;
    protected ClusterUID secondCluster;

    /**
     * Gets the value of the firstCluster property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterUID }
     *     
     */
    public ClusterUID getFirstCluster() {
        return firstCluster;
    }

    /**
     * Sets the value of the firstCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterUID }
     *     
     */
    public void setFirstCluster(ClusterUID value) {
        this.firstCluster = value;
    }

    /**
     * Gets the value of the secondCluster property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterUID }
     *     
     */
    public ClusterUID getSecondCluster() {
        return secondCluster;
    }

    /**
     * Sets the value of the secondCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterUID }
     *     
     */
    public void setSecondCluster(ClusterUID value) {
        this.secondCluster = value;
    }

}
