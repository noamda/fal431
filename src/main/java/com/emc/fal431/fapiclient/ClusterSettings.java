
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clusterSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clusterSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachedPhoenixClusterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clusterIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="clusterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}clusterUID" minOccurs="0"/>
 *         &lt;element name="maintenanceMode" type="{}clusterMaintenanceMode" minOccurs="0"/>
 *         &lt;element name="raidGroupsNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="repositoryVolume" type="{}repositoryVolumeSettings" minOccurs="0"/>
 *         &lt;element name="rpasUIDs" type="{}rpaUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="softwareSerialId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="throttlePolicy" type="{}irThrottlePolicy" minOccurs="0"/>
 *         &lt;element name="vcenterServers" type="{}vCenterServer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vcenterServersFilters" type="{}vCenterServerFilters" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clusterSettings", propOrder = {
    "attachedPhoenixClusterName",
    "clusterIndex",
    "clusterName",
    "clusterUID",
    "maintenanceMode",
    "raidGroupsNames",
    "repositoryVolume",
    "rpasUIDs",
    "softwareSerialId",
    "throttlePolicy",
    "vcenterServers",
    "vcenterServersFilters"
})
public class ClusterSettings {

    protected String attachedPhoenixClusterName;
    protected int clusterIndex;
    protected String clusterName;
    protected ClusterUID clusterUID;
    protected ClusterMaintenanceMode maintenanceMode;
    @XmlElement(nillable = true)
    protected List<String> raidGroupsNames;
    protected RepositoryVolumeSettings repositoryVolume;
    @XmlElement(nillable = true)
    protected List<RpaUID> rpasUIDs;
    protected String softwareSerialId;
    protected IrThrottlePolicy throttlePolicy;
    @XmlElement(nillable = true)
    protected List<VCenterServer> vcenterServers;
    @XmlElement(nillable = true)
    protected List<VCenterServerFilters> vcenterServersFilters;

    /**
     * Gets the value of the attachedPhoenixClusterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachedPhoenixClusterName() {
        return attachedPhoenixClusterName;
    }

    /**
     * Sets the value of the attachedPhoenixClusterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachedPhoenixClusterName(String value) {
        this.attachedPhoenixClusterName = value;
    }

    /**
     * Gets the value of the clusterIndex property.
     * 
     */
    public int getClusterIndex() {
        return clusterIndex;
    }

    /**
     * Sets the value of the clusterIndex property.
     * 
     */
    public void setClusterIndex(int value) {
        this.clusterIndex = value;
    }

    /**
     * Gets the value of the clusterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * Sets the value of the clusterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterName(String value) {
        this.clusterName = value;
    }

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
     * Gets the value of the maintenanceMode property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterMaintenanceMode }
     *     
     */
    public ClusterMaintenanceMode getMaintenanceMode() {
        return maintenanceMode;
    }

    /**
     * Sets the value of the maintenanceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterMaintenanceMode }
     *     
     */
    public void setMaintenanceMode(ClusterMaintenanceMode value) {
        this.maintenanceMode = value;
    }

    /**
     * Gets the value of the raidGroupsNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the raidGroupsNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRaidGroupsNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRaidGroupsNames() {
        if (raidGroupsNames == null) {
            raidGroupsNames = new ArrayList<String>();
        }
        return this.raidGroupsNames;
    }

    /**
     * Gets the value of the repositoryVolume property.
     * 
     * @return
     *     possible object is
     *     {@link RepositoryVolumeSettings }
     *     
     */
    public RepositoryVolumeSettings getRepositoryVolume() {
        return repositoryVolume;
    }

    /**
     * Sets the value of the repositoryVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepositoryVolumeSettings }
     *     
     */
    public void setRepositoryVolume(RepositoryVolumeSettings value) {
        this.repositoryVolume = value;
    }

    /**
     * Gets the value of the rpasUIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rpasUIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRpasUIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RpaUID }
     * 
     * 
     */
    public List<RpaUID> getRpasUIDs() {
        if (rpasUIDs == null) {
            rpasUIDs = new ArrayList<RpaUID>();
        }
        return this.rpasUIDs;
    }

    /**
     * Gets the value of the softwareSerialId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareSerialId() {
        return softwareSerialId;
    }

    /**
     * Sets the value of the softwareSerialId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareSerialId(String value) {
        this.softwareSerialId = value;
    }

    /**
     * Gets the value of the throttlePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link IrThrottlePolicy }
     *     
     */
    public IrThrottlePolicy getThrottlePolicy() {
        return throttlePolicy;
    }

    /**
     * Sets the value of the throttlePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link IrThrottlePolicy }
     *     
     */
    public void setThrottlePolicy(IrThrottlePolicy value) {
        this.throttlePolicy = value;
    }

    /**
     * Gets the value of the vcenterServers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vcenterServers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVcenterServers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VCenterServer }
     * 
     * 
     */
    public List<VCenterServer> getVcenterServers() {
        if (vcenterServers == null) {
            vcenterServers = new ArrayList<VCenterServer>();
        }
        return this.vcenterServers;
    }

    /**
     * Gets the value of the vcenterServersFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vcenterServersFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVcenterServersFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VCenterServerFilters }
     * 
     * 
     */
    public List<VCenterServerFilters> getVcenterServersFilters() {
        if (vcenterServersFilters == null) {
            vcenterServersFilters = new ArrayList<VCenterServerFilters>();
        }
        return this.vcenterServersFilters;
    }

}
