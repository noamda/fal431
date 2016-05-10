
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for managementMode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="managementMode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}externalManagement" minOccurs="0"/>
 *         &lt;element name="managedByRecoverPoint" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "managementMode", propOrder = {
    "externalManagement",
    "managedByRecoverPoint"
})
public class ManagementMode {

    protected ExternalManagement externalManagement;
    protected boolean managedByRecoverPoint;

    /**
     * Gets the value of the externalManagement property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalManagement }
     *     
     */
    public ExternalManagement getExternalManagement() {
        return externalManagement;
    }

    /**
     * Sets the value of the externalManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalManagement }
     *     
     */
    public void setExternalManagement(ExternalManagement value) {
        this.externalManagement = value;
    }

    /**
     * Gets the value of the managedByRecoverPoint property.
     * 
     */
    public boolean isManagedByRecoverPoint() {
        return managedByRecoverPoint;
    }

    /**
     * Sets the value of the managedByRecoverPoint property.
     * 
     */
    public void setManagedByRecoverPoint(boolean value) {
        this.managedByRecoverPoint = value;
    }

}
