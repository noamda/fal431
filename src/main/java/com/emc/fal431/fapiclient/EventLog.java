
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clusterList" type="{}clusterUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}clusterUID" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devices" type="{}deviceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eventID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{}eventLogInfo" minOccurs="0"/>
 *         &lt;element name="eventTime" type="{}recoverPointTimeStamp" minOccurs="0"/>
 *         &lt;element name="globalLinks" type="{}globalLinkUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groupCopies" type="{}consistencyGroupCopyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="grouplinks" type="{}consistencyGroupLinkInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groupsInfo" type="{}consistencyGroupInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="history" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="replicationSets" type="{}replicationSetInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="roles" type="{}rpaUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}rpaUID" minOccurs="0"/>
 *         &lt;element name="rpaViews" type="{}rpaView" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="seDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="splitterViews" type="{}splitterView" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="splitterVolumes" type="{}splitterVolumeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="splittersInfo" type="{}splitterInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}systemEventUID" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventLog", propOrder = {
    "clusterList",
    "clusterUID",
    "description",
    "details",
    "devices",
    "eventID",
    "eventLogInfo",
    "eventTime",
    "globalLinks",
    "groupCopies",
    "grouplinks",
    "groupsInfo",
    "history",
    "replicationSets",
    "roles",
    "rpaUID",
    "rpaViews",
    "seDetails",
    "splitterViews",
    "splitterVolumes",
    "splittersInfo",
    "systemEventUID",
    "username"
})
public class EventLog {

    @XmlElement(nillable = true)
    protected List<ClusterUID> clusterList;
    protected ClusterUID clusterUID;
    protected String description;
    protected String details;
    @XmlElement(nillable = true)
    protected List<DeviceInfo> devices;
    protected int eventID;
    protected EventLogInfo eventLogInfo;
    protected RecoverPointTimeStamp eventTime;
    @XmlElement(nillable = true)
    protected List<GlobalLinkUID> globalLinks;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyInfo> groupCopies;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupLinkInfo> grouplinks;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupInfo> groupsInfo;
    protected boolean history;
    @XmlElement(nillable = true)
    protected List<ReplicationSetInfo> replicationSets;
    @XmlElement(nillable = true)
    protected List<RpaUID> roles;
    protected RpaUID rpaUID;
    @XmlElement(nillable = true)
    protected List<RpaView> rpaViews;
    protected String seDetails;
    @XmlElement(nillable = true)
    protected List<SplitterView> splitterViews;
    @XmlElement(nillable = true)
    protected List<SplitterVolumeInfo> splitterVolumes;
    @XmlElement(nillable = true)
    protected List<SplitterInfo> splittersInfo;
    protected SystemEventUID systemEventUID;
    protected String username;

    /**
     * Gets the value of the clusterList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusterList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClusterList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterUID }
     * 
     * 
     */
    public List<ClusterUID> getClusterList() {
        if (clusterList == null) {
            clusterList = new ArrayList<ClusterUID>();
        }
        return this.clusterList;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetails(String value) {
        this.details = value;
    }

    /**
     * Gets the value of the devices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceInfo }
     * 
     * 
     */
    public List<DeviceInfo> getDevices() {
        if (devices == null) {
            devices = new ArrayList<DeviceInfo>();
        }
        return this.devices;
    }

    /**
     * Gets the value of the eventID property.
     * 
     */
    public int getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     */
    public void setEventID(int value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the eventLogInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EventLogInfo }
     *     
     */
    public EventLogInfo getEventLogInfo() {
        return eventLogInfo;
    }

    /**
     * Sets the value of the eventLogInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventLogInfo }
     *     
     */
    public void setEventLogInfo(EventLogInfo value) {
        this.eventLogInfo = value;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public RecoverPointTimeStamp getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public void setEventTime(RecoverPointTimeStamp value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the globalLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalLinkUID }
     * 
     * 
     */
    public List<GlobalLinkUID> getGlobalLinks() {
        if (globalLinks == null) {
            globalLinks = new ArrayList<GlobalLinkUID>();
        }
        return this.globalLinks;
    }

    /**
     * Gets the value of the groupCopies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupCopies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupCopies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupCopyInfo }
     * 
     * 
     */
    public List<ConsistencyGroupCopyInfo> getGroupCopies() {
        if (groupCopies == null) {
            groupCopies = new ArrayList<ConsistencyGroupCopyInfo>();
        }
        return this.groupCopies;
    }

    /**
     * Gets the value of the grouplinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grouplinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrouplinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupLinkInfo }
     * 
     * 
     */
    public List<ConsistencyGroupLinkInfo> getGrouplinks() {
        if (grouplinks == null) {
            grouplinks = new ArrayList<ConsistencyGroupLinkInfo>();
        }
        return this.grouplinks;
    }

    /**
     * Gets the value of the groupsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupInfo }
     * 
     * 
     */
    public List<ConsistencyGroupInfo> getGroupsInfo() {
        if (groupsInfo == null) {
            groupsInfo = new ArrayList<ConsistencyGroupInfo>();
        }
        return this.groupsInfo;
    }

    /**
     * Gets the value of the history property.
     * 
     */
    public boolean isHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     */
    public void setHistory(boolean value) {
        this.history = value;
    }

    /**
     * Gets the value of the replicationSets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replicationSets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplicationSets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReplicationSetInfo }
     * 
     * 
     */
    public List<ReplicationSetInfo> getReplicationSets() {
        if (replicationSets == null) {
            replicationSets = new ArrayList<ReplicationSetInfo>();
        }
        return this.replicationSets;
    }

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RpaUID }
     * 
     * 
     */
    public List<RpaUID> getRoles() {
        if (roles == null) {
            roles = new ArrayList<RpaUID>();
        }
        return this.roles;
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
     * Gets the value of the rpaViews property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rpaViews property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRpaViews().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RpaView }
     * 
     * 
     */
    public List<RpaView> getRpaViews() {
        if (rpaViews == null) {
            rpaViews = new ArrayList<RpaView>();
        }
        return this.rpaViews;
    }

    /**
     * Gets the value of the seDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeDetails() {
        return seDetails;
    }

    /**
     * Sets the value of the seDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeDetails(String value) {
        this.seDetails = value;
    }

    /**
     * Gets the value of the splitterViews property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitterViews property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitterViews().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitterView }
     * 
     * 
     */
    public List<SplitterView> getSplitterViews() {
        if (splitterViews == null) {
            splitterViews = new ArrayList<SplitterView>();
        }
        return this.splitterViews;
    }

    /**
     * Gets the value of the splitterVolumes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitterVolumes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitterVolumes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitterVolumeInfo }
     * 
     * 
     */
    public List<SplitterVolumeInfo> getSplitterVolumes() {
        if (splitterVolumes == null) {
            splitterVolumes = new ArrayList<SplitterVolumeInfo>();
        }
        return this.splitterVolumes;
    }

    /**
     * Gets the value of the splittersInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splittersInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplittersInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitterInfo }
     * 
     * 
     */
    public List<SplitterInfo> getSplittersInfo() {
        if (splittersInfo == null) {
            splittersInfo = new ArrayList<SplitterInfo>();
        }
        return this.splittersInfo;
    }

    /**
     * Gets the value of the systemEventUID property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventUID }
     *     
     */
    public SystemEventUID getSystemEventUID() {
        return systemEventUID;
    }

    /**
     * Sets the value of the systemEventUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventUID }
     *     
     */
    public void setSystemEventUID(SystemEventUID value) {
        this.systemEventUID = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
