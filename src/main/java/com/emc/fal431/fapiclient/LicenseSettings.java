
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for licenseSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="licenseSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capacityInTerabytes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="expirationDate" type="{}recoverPointTimeStamp" minOccurs="0"/>
 *         &lt;element name="licenseType" type="{}recoverPointLicenseType" minOccurs="0"/>
 *         &lt;element ref="{}licenseUID" minOccurs="0"/>
 *         &lt;element name="localReplicationOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "licenseSettings", propOrder = {
    "capacityInTerabytes",
    "expirationDate",
    "licenseType",
    "licenseUID",
    "localReplicationOnly"
})
@XmlSeeAlso({
    ArrayLicenseSettings.class,
    ClusterLicenseSettings.class
})
public abstract class LicenseSettings {

    protected int capacityInTerabytes;
    protected RecoverPointTimeStamp expirationDate;
    protected RecoverPointLicenseType licenseType;
    protected LicenseUID licenseUID;
    protected boolean localReplicationOnly;

    /**
     * Gets the value of the capacityInTerabytes property.
     * 
     */
    public int getCapacityInTerabytes() {
        return capacityInTerabytes;
    }

    /**
     * Sets the value of the capacityInTerabytes property.
     * 
     */
    public void setCapacityInTerabytes(int value) {
        this.capacityInTerabytes = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public RecoverPointTimeStamp getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public void setExpirationDate(RecoverPointTimeStamp value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the licenseType property.
     * 
     * @return
     *     possible object is
     *     {@link RecoverPointLicenseType }
     *     
     */
    public RecoverPointLicenseType getLicenseType() {
        return licenseType;
    }

    /**
     * Sets the value of the licenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoverPointLicenseType }
     *     
     */
    public void setLicenseType(RecoverPointLicenseType value) {
        this.licenseType = value;
    }

    /**
     * Gets the value of the licenseUID property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseUID }
     *     
     */
    public LicenseUID getLicenseUID() {
        return licenseUID;
    }

    /**
     * Sets the value of the licenseUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseUID }
     *     
     */
    public void setLicenseUID(LicenseUID value) {
        this.licenseUID = value;
    }

    /**
     * Gets the value of the localReplicationOnly property.
     * 
     */
    public boolean isLocalReplicationOnly() {
        return localReplicationOnly;
    }

    /**
     * Sets the value of the localReplicationOnly property.
     * 
     */
    public void setLocalReplicationOnly(boolean value) {
        this.localReplicationOnly = value;
    }

}
