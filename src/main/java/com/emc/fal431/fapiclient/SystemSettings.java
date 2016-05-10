
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clustersSettings" type="{}clusterSettings" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}globalSystemConfiguration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemSettings", propOrder = {
    "clustersSettings",
    "globalSystemConfiguration"
})
public class SystemSettings {

    @XmlElement(nillable = true)
    protected List<ClusterSettings> clustersSettings;
    protected GlobalSystemConfiguration globalSystemConfiguration;

    /**
     * Gets the value of the clustersSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clustersSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClustersSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterSettings }
     * 
     * 
     */
    public List<ClusterSettings> getClustersSettings() {
        if (clustersSettings == null) {
            clustersSettings = new ArrayList<ClusterSettings>();
        }
        return this.clustersSettings;
    }

    /**
     * Gets the value of the globalSystemConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalSystemConfiguration }
     *     
     */
    public GlobalSystemConfiguration getGlobalSystemConfiguration() {
        return globalSystemConfiguration;
    }

    /**
     * Sets the value of the globalSystemConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalSystemConfiguration }
     *     
     */
    public void setGlobalSystemConfiguration(GlobalSystemConfiguration value) {
        this.globalSystemConfiguration = value;
    }

}
