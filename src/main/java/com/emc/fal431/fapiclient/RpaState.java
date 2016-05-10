
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rpaState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rpaState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="globalSystemConfiguation" type="{}globalSystemConfiguration" minOccurs="0"/>
 *         &lt;element name="hardwarePlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hardwareSerialID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hbaType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="initiatorsState" type="{}initiatorInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="interfacesStatus" type="{}rpaInterfaceStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="localRPAsFiberConnectivityStatus" type="{}rpaConnectivityStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="managementIPv4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="managementIPv6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfCores" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="remoteRPAsConnectivityStatus" type="{}rpaConnectivityStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remoteRPAsDataLinkStatus" type="{}rpaConnectivityStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="repositoryConnectivityStatus" type="{}volumeStatus" minOccurs="0"/>
 *         &lt;element ref="{}rpaUID" minOccurs="0"/>
 *         &lt;element name="runningClusterControl" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="splittersConnectivityStatus" type="{}splitterConnectivityStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{}rpaStatus" minOccurs="0"/>
 *         &lt;element name="systemMemory" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="type" type="{}rpaType" minOccurs="0"/>
 *         &lt;element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{}recoverPointVersion" minOccurs="0"/>
 *         &lt;element name="volumesConnectivityStatus" type="{}volumeConnectivityStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wanIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rpaState", propOrder = {
    "globalSystemConfiguation",
    "hardwarePlatform",
    "hardwareSerialID",
    "hbaType",
    "initiatorsState",
    "interfacesStatus",
    "localRPAsFiberConnectivityStatus",
    "managementIPv4",
    "managementIPv6",
    "numberOfCores",
    "remoteRPAsConnectivityStatus",
    "remoteRPAsDataLinkStatus",
    "repositoryConnectivityStatus",
    "rpaUID",
    "runningClusterControl",
    "splittersConnectivityStatus",
    "status",
    "systemMemory",
    "type",
    "vendor",
    "version",
    "volumesConnectivityStatus",
    "wanIP"
})
public class RpaState {

    protected GlobalSystemConfiguration globalSystemConfiguation;
    protected String hardwarePlatform;
    protected String hardwareSerialID;
    protected long hbaType;
    @XmlElement(nillable = true)
    protected List<InitiatorInformation> initiatorsState;
    @XmlElement(nillable = true)
    protected List<RpaInterfaceStatus> interfacesStatus;
    @XmlElement(nillable = true)
    protected List<RpaConnectivityStatus> localRPAsFiberConnectivityStatus;
    protected String managementIPv4;
    protected String managementIPv6;
    protected long numberOfCores;
    @XmlElement(nillable = true)
    protected List<RpaConnectivityStatus> remoteRPAsConnectivityStatus;
    @XmlElement(nillable = true)
    protected List<RpaConnectivityStatus> remoteRPAsDataLinkStatus;
    protected VolumeStatus repositoryConnectivityStatus;
    protected RpaUID rpaUID;
    protected boolean runningClusterControl;
    @XmlElement(nillable = true)
    protected List<SplitterConnectivityStatus> splittersConnectivityStatus;
    protected RpaStatus status;
    protected long systemMemory;
    protected RpaType type;
    protected String vendor;
    protected RecoverPointVersion version;
    @XmlElement(nillable = true)
    protected List<VolumeConnectivityStatus> volumesConnectivityStatus;
    protected String wanIP;

    /**
     * Gets the value of the globalSystemConfiguation property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalSystemConfiguration }
     *     
     */
    public GlobalSystemConfiguration getGlobalSystemConfiguation() {
        return globalSystemConfiguation;
    }

    /**
     * Sets the value of the globalSystemConfiguation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalSystemConfiguration }
     *     
     */
    public void setGlobalSystemConfiguation(GlobalSystemConfiguration value) {
        this.globalSystemConfiguation = value;
    }

    /**
     * Gets the value of the hardwarePlatform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwarePlatform() {
        return hardwarePlatform;
    }

    /**
     * Sets the value of the hardwarePlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwarePlatform(String value) {
        this.hardwarePlatform = value;
    }

    /**
     * Gets the value of the hardwareSerialID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwareSerialID() {
        return hardwareSerialID;
    }

    /**
     * Sets the value of the hardwareSerialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwareSerialID(String value) {
        this.hardwareSerialID = value;
    }

    /**
     * Gets the value of the hbaType property.
     * 
     */
    public long getHbaType() {
        return hbaType;
    }

    /**
     * Sets the value of the hbaType property.
     * 
     */
    public void setHbaType(long value) {
        this.hbaType = value;
    }

    /**
     * Gets the value of the initiatorsState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initiatorsState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitiatorsState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InitiatorInformation }
     * 
     * 
     */
    public List<InitiatorInformation> getInitiatorsState() {
        if (initiatorsState == null) {
            initiatorsState = new ArrayList<InitiatorInformation>();
        }
        return this.initiatorsState;
    }

    /**
     * Gets the value of the interfacesStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interfacesStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterfacesStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RpaInterfaceStatus }
     * 
     * 
     */
    public List<RpaInterfaceStatus> getInterfacesStatus() {
        if (interfacesStatus == null) {
            interfacesStatus = new ArrayList<RpaInterfaceStatus>();
        }
        return this.interfacesStatus;
    }

    /**
     * Gets the value of the localRPAsFiberConnectivityStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localRPAsFiberConnectivityStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalRPAsFiberConnectivityStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RpaConnectivityStatus }
     * 
     * 
     */
    public List<RpaConnectivityStatus> getLocalRPAsFiberConnectivityStatus() {
        if (localRPAsFiberConnectivityStatus == null) {
            localRPAsFiberConnectivityStatus = new ArrayList<RpaConnectivityStatus>();
        }
        return this.localRPAsFiberConnectivityStatus;
    }

    /**
     * Gets the value of the managementIPv4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementIPv4() {
        return managementIPv4;
    }

    /**
     * Sets the value of the managementIPv4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementIPv4(String value) {
        this.managementIPv4 = value;
    }

    /**
     * Gets the value of the managementIPv6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementIPv6() {
        return managementIPv6;
    }

    /**
     * Sets the value of the managementIPv6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementIPv6(String value) {
        this.managementIPv6 = value;
    }

    /**
     * Gets the value of the numberOfCores property.
     * 
     */
    public long getNumberOfCores() {
        return numberOfCores;
    }

    /**
     * Sets the value of the numberOfCores property.
     * 
     */
    public void setNumberOfCores(long value) {
        this.numberOfCores = value;
    }

    /**
     * Gets the value of the remoteRPAsConnectivityStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteRPAsConnectivityStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteRPAsConnectivityStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RpaConnectivityStatus }
     * 
     * 
     */
    public List<RpaConnectivityStatus> getRemoteRPAsConnectivityStatus() {
        if (remoteRPAsConnectivityStatus == null) {
            remoteRPAsConnectivityStatus = new ArrayList<RpaConnectivityStatus>();
        }
        return this.remoteRPAsConnectivityStatus;
    }

    /**
     * Gets the value of the remoteRPAsDataLinkStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteRPAsDataLinkStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteRPAsDataLinkStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RpaConnectivityStatus }
     * 
     * 
     */
    public List<RpaConnectivityStatus> getRemoteRPAsDataLinkStatus() {
        if (remoteRPAsDataLinkStatus == null) {
            remoteRPAsDataLinkStatus = new ArrayList<RpaConnectivityStatus>();
        }
        return this.remoteRPAsDataLinkStatus;
    }

    /**
     * Gets the value of the repositoryConnectivityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeStatus }
     *     
     */
    public VolumeStatus getRepositoryConnectivityStatus() {
        return repositoryConnectivityStatus;
    }

    /**
     * Sets the value of the repositoryConnectivityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeStatus }
     *     
     */
    public void setRepositoryConnectivityStatus(VolumeStatus value) {
        this.repositoryConnectivityStatus = value;
    }

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

    /**
     * Gets the value of the runningClusterControl property.
     * 
     */
    public boolean isRunningClusterControl() {
        return runningClusterControl;
    }

    /**
     * Sets the value of the runningClusterControl property.
     * 
     */
    public void setRunningClusterControl(boolean value) {
        this.runningClusterControl = value;
    }

    /**
     * Gets the value of the splittersConnectivityStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splittersConnectivityStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplittersConnectivityStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitterConnectivityStatus }
     * 
     * 
     */
    public List<SplitterConnectivityStatus> getSplittersConnectivityStatus() {
        if (splittersConnectivityStatus == null) {
            splittersConnectivityStatus = new ArrayList<SplitterConnectivityStatus>();
        }
        return this.splittersConnectivityStatus;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RpaStatus }
     *     
     */
    public RpaStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RpaStatus }
     *     
     */
    public void setStatus(RpaStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the systemMemory property.
     * 
     */
    public long getSystemMemory() {
        return systemMemory;
    }

    /**
     * Sets the value of the systemMemory property.
     * 
     */
    public void setSystemMemory(long value) {
        this.systemMemory = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RpaType }
     *     
     */
    public RpaType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RpaType }
     *     
     */
    public void setType(RpaType value) {
        this.type = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link RecoverPointVersion }
     *     
     */
    public RecoverPointVersion getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoverPointVersion }
     *     
     */
    public void setVersion(RecoverPointVersion value) {
        this.version = value;
    }

    /**
     * Gets the value of the volumesConnectivityStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the volumesConnectivityStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVolumesConnectivityStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VolumeConnectivityStatus }
     * 
     * 
     */
    public List<VolumeConnectivityStatus> getVolumesConnectivityStatus() {
        if (volumesConnectivityStatus == null) {
            volumesConnectivityStatus = new ArrayList<VolumeConnectivityStatus>();
        }
        return this.volumesConnectivityStatus;
    }

    /**
     * Gets the value of the wanIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWanIP() {
        return wanIP;
    }

    /**
     * Sets the value of the wanIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWanIP(String value) {
        this.wanIP = value;
    }

}
