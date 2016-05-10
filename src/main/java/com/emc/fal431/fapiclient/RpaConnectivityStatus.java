
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rpaConnectivityStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rpaConnectivityStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{}clusterEntityConnectivityStatus">
 *       &lt;sequence>
 *         &lt;element ref="{}rpaUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rpaConnectivityStatus", propOrder = {
    "rpaUID"
})
public class RpaConnectivityStatus
    extends ClusterEntityConnectivityStatus
{

    protected RpaUID rpaUID;

    /**
     * Gets the value of the rpaUID property.
     * 
     * @return
     *     possible object is
     *     {@link RpaUID }
     *     
     */
    public RpaUID getRpaUID() {
        return rpaUID;
    }

    /**
     * Sets the value of the rpaUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RpaUID }
     *     
     */
    public void setRpaUID(RpaUID value) {
        this.rpaUID = value;
    }

}
