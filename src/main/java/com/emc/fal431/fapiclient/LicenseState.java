
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for licenseState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="licenseState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clustersUID" type="{}clusterUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="daysUntilExpiration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element ref="{}licenseStatus" minOccurs="0"/>
 *         &lt;element ref="{}licenseUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "licenseState", propOrder = {
    "clustersUID",
    "daysUntilExpiration",
    "licenseStatus",
    "licenseUID"
})
public class LicenseState {

    @XmlElement(nillable = true)
    protected List<ClusterUID> clustersUID;
    protected Integer daysUntilExpiration;
    protected LicenseStatus licenseStatus;
    protected LicenseUID licenseUID;

    /**
     * Gets the value of the clustersUID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clustersUID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClustersUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterUID }
     * 
     * 
     */
    public List<ClusterUID> getClustersUID() {
        if (clustersUID == null) {
            clustersUID = new ArrayList<ClusterUID>();
        }
        return this.clustersUID;
    }

    /**
     * Gets the value of the daysUntilExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysUntilExpiration() {
        return daysUntilExpiration;
    }

    /**
     * Sets the value of the daysUntilExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysUntilExpiration(Integer value) {
        this.daysUntilExpiration = value;
    }

    /**
     * Gets the value of the licenseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseStatus }
     *     
     */
    public LicenseStatus getLicenseStatus() {
        return licenseStatus;
    }

    /**
     * Sets the value of the licenseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseStatus }
     *     
     */
    public void setLicenseStatus(LicenseStatus value) {
        this.licenseStatus = value;
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

}
