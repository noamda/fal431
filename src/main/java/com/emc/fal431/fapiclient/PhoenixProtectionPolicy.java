
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phoenixProtectionPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phoenixProtectionPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}phoenixClusterProtectionPolicy" minOccurs="0"/>
 *         &lt;element name="phoenixProctectedCopyUID" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phoenixProtectionPolicy", propOrder = {
    "phoenixClusterProtectionPolicy",
    "phoenixProctectedCopyUID"
})
public class PhoenixProtectionPolicy {

    protected PhoenixClusterProtectionPolicy phoenixClusterProtectionPolicy;
    protected ConsistencyGroupCopyUID phoenixProctectedCopyUID;

    /**
     * Gets the value of the phoenixClusterProtectionPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link PhoenixClusterProtectionPolicy }
     *     
     */
    public PhoenixClusterProtectionPolicy getPhoenixClusterProtectionPolicy() {
        return phoenixClusterProtectionPolicy;
    }

    /**
     * Sets the value of the phoenixClusterProtectionPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoenixClusterProtectionPolicy }
     *     
     */
    public void setPhoenixClusterProtectionPolicy(PhoenixClusterProtectionPolicy value) {
        this.phoenixClusterProtectionPolicy = value;
    }

    /**
     * Gets the value of the phoenixProctectedCopyUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public ConsistencyGroupCopyUID getPhoenixProctectedCopyUID() {
        return phoenixProctectedCopyUID;
    }

    /**
     * Sets the value of the phoenixProctectedCopyUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public void setPhoenixProctectedCopyUID(ConsistencyGroupCopyUID value) {
        this.phoenixProctectedCopyUID = value;
    }

}
