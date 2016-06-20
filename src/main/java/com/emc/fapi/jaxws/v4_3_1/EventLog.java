package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventLog", propOrder = {"eventTime", "systemEventUID", "clusterUID", "rpaUID", "eventID", "roles", "groupCopies", "devices", "replicationSets", "splitterVolumes", "grouplinks", "globalLinks", "arrays", "vms", "rpaViews", "splitterViews", "clusterList", "username", "details", "seDetails", "history", "splittersInfo", "groupsInfo", "eventLogInfo", "description"})
public class EventLog {
    protected RecoverPointTimeStamp eventTime;
    @XmlElement(nillable = true)
    protected SystemEventUID systemEventUID;
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected RpaUID rpaUID;
    protected int eventID;
    @XmlElement(nillable = true)
    protected List<RpaUID> roles;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyInfo> groupCopies;
    @XmlElement(nillable = true)
    protected List<DeviceInfo> devices;
    @XmlElement(nillable = true)
    protected List<ReplicationSetInfo> replicationSets;
    @XmlElement(nillable = true)
    protected List<SplitterVolumeInfo> splitterVolumes;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupLinkInfo> grouplinks;
    @XmlElement(nillable = true)
    protected List<GlobalLinkUID> globalLinks;
    @XmlElement(nillable = true)
    protected List<ArrayInfo> arrays;
    @XmlElement(nillable = true)
    protected List<VMEntitiesInformation> vms;
    @XmlElement(nillable = true)
    protected List<RpaView> rpaViews;
    @XmlElement(nillable = true)
    protected List<SplitterView> splitterViews;
    @XmlElement(nillable = true)
    protected List<ClusterUID> clusterList;
    protected String username;
    protected String details;
    protected String seDetails;
    protected boolean history;
    @XmlElement(nillable = true)
    protected List<SplitterInfo> splittersInfo;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupInfo> groupsInfo;
    @XmlElement(nillable = true)
    protected EventLogInfo eventLogInfo;
    protected String description;

    public EventLog() {
    }

    public EventLog(RecoverPointTimeStamp eventTime, SystemEventUID systemEventUID, ClusterUID clusterUID, RpaUID rpaUID, int eventID, List<RpaUID> roles, List<ConsistencyGroupCopyInfo> groupCopies, List<DeviceInfo> devices, List<ReplicationSetInfo> replicationSets, List<SplitterVolumeInfo> splitterVolumes, List<ConsistencyGroupLinkInfo> grouplinks, List<GlobalLinkUID> globalLinks, List<ArrayInfo> arrays, List<VMEntitiesInformation> vms, List<RpaView> rpaViews, List<SplitterView> splitterViews, List<ClusterUID> clusterList, String username, String details, String seDetails, boolean history, List<SplitterInfo> splittersInfo, List<ConsistencyGroupInfo> groupsInfo, EventLogInfo eventLogInfo, String description) {
        this.eventTime = eventTime;
        this.systemEventUID = systemEventUID;
        this.clusterUID = clusterUID;
        this.rpaUID = rpaUID;
        this.eventID = eventID;
        this.roles = roles;
        this.groupCopies = groupCopies;
        this.devices = devices;
        this.replicationSets = replicationSets;
        this.splitterVolumes = splitterVolumes;
        this.grouplinks = grouplinks;
        this.globalLinks = globalLinks;
        this.arrays = arrays;
        this.vms = vms;
        this.rpaViews = rpaViews;
        this.splitterViews = splitterViews;
        this.clusterList = clusterList;
        this.username = username;
        this.details = details;
        this.seDetails = seDetails;
        this.history = history;
        this.splittersInfo = splittersInfo;
        this.groupsInfo = groupsInfo;
        this.eventLogInfo = eventLogInfo;
        this.description = description;
    }


    public RecoverPointTimeStamp getEventTime() {
        return this.eventTime;
    }


    public void setEventTime(RecoverPointTimeStamp value) {
        this.eventTime = value;
    }


    public SystemEventUID getSystemEventUID() {
        return this.systemEventUID;
    }


    public void setSystemEventUID(SystemEventUID value) {
        this.systemEventUID = value;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public RpaUID getRpaUID() {
        return this.rpaUID;
    }


    public void setRpaUID(RpaUID value) {
        this.rpaUID = value;
    }


    public int getEventID() {
        return this.eventID;
    }


    public void setEventID(int value) {
        this.eventID = value;
    }


    public List<RpaUID> getRoles() {
        if (this.roles == null) {
            this.roles = new ArrayList();
        }
        return this.roles;
    }


    public List<ConsistencyGroupCopyInfo> getGroupCopies() {
        if (this.groupCopies == null) {
            this.groupCopies = new ArrayList();
        }
        return this.groupCopies;
    }


    public List<DeviceInfo> getDevices() {
        if (this.devices == null) {
            this.devices = new ArrayList();
        }
        return this.devices;
    }


    public List<ReplicationSetInfo> getReplicationSets() {
        if (this.replicationSets == null) {
            this.replicationSets = new ArrayList();
        }
        return this.replicationSets;
    }


    public List<SplitterVolumeInfo> getSplitterVolumes() {
        if (this.splitterVolumes == null) {
            this.splitterVolumes = new ArrayList();
        }
        return this.splitterVolumes;
    }


    public List<ConsistencyGroupLinkInfo> getGrouplinks() {
        if (this.grouplinks == null) {
            this.grouplinks = new ArrayList();
        }
        return this.grouplinks;
    }


    public List<GlobalLinkUID> getGlobalLinks() {
        if (this.globalLinks == null) {
            this.globalLinks = new ArrayList();
        }
        return this.globalLinks;
    }


    public List<ArrayInfo> getArrays() {
        if (this.arrays == null) {
            this.arrays = new ArrayList();
        }
        return this.arrays;
    }


    public List<VMEntitiesInformation> getVms() {
        if (this.vms == null) {
            this.vms = new ArrayList();
        }
        return this.vms;
    }


    public List<RpaView> getRpaViews() {
        if (this.rpaViews == null) {
            this.rpaViews = new ArrayList();
        }
        return this.rpaViews;
    }


    public List<SplitterView> getSplitterViews() {
        if (this.splitterViews == null) {
            this.splitterViews = new ArrayList();
        }
        return this.splitterViews;
    }


    public List<ClusterUID> getClusterList() {
        if (this.clusterList == null) {
            this.clusterList = new ArrayList();
        }
        return this.clusterList;
    }


    public String getUsername() {
        return this.username;
    }


    public void setUsername(String value) {
        this.username = value;
    }


    public String getDetails() {
        return this.details;
    }


    public void setDetails(String value) {
        this.details = value;
    }


    public String getSeDetails() {
        return this.seDetails;
    }


    public void setSeDetails(String value) {
        this.seDetails = value;
    }


    public boolean isHistory() {
        return this.history;
    }


    public void setHistory(boolean value) {
        this.history = value;
    }


    public List<SplitterInfo> getSplittersInfo() {
        if (this.splittersInfo == null) {
            this.splittersInfo = new ArrayList();
        }
        return this.splittersInfo;
    }


    public List<ConsistencyGroupInfo> getGroupsInfo() {
        if (this.groupsInfo == null) {
            this.groupsInfo = new ArrayList();
        }
        return this.groupsInfo;
    }


    public EventLogInfo getEventLogInfo() {
        return this.eventLogInfo;
    }


    public void setEventLogInfo(EventLogInfo value) {
        this.eventLogInfo = value;
    }


    public String getDescription() {
        return this.description;
    }


    public void setDescription(String value) {
        this.description = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EventLog)) {
            return false;
        }
        EventLog otherObj = (EventLog) obj;

        return (this.eventTime != null ? this.eventTime.equals(otherObj.eventTime) : this.eventTime == otherObj.eventTime) && (this.systemEventUID != null ? this.systemEventUID.equals(otherObj.systemEventUID) : this.systemEventUID == otherObj.systemEventUID) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.eventID == otherObj.eventID) && (this.roles != null ? this.roles.equals(otherObj.roles) : this.roles == otherObj.roles) && (this.groupCopies != null ? this.groupCopies.equals(otherObj.groupCopies) : this.groupCopies == otherObj.groupCopies) && (this.devices != null ? this.devices.equals(otherObj.devices) : this.devices == otherObj.devices) && (this.replicationSets != null ? this.replicationSets.equals(otherObj.replicationSets) : this.replicationSets == otherObj.replicationSets) && (this.splitterVolumes != null ? this.splitterVolumes.equals(otherObj.splitterVolumes) : this.splitterVolumes == otherObj.splitterVolumes) && (this.grouplinks != null ? this.grouplinks.equals(otherObj.grouplinks) : this.grouplinks == otherObj.grouplinks) && (this.globalLinks != null ? this.globalLinks.equals(otherObj.globalLinks) : this.globalLinks == otherObj.globalLinks) && (this.arrays != null ? this.arrays.equals(otherObj.arrays) : this.arrays == otherObj.arrays) && (this.vms != null ? this.vms.equals(otherObj.vms) : this.vms == otherObj.vms) && (this.rpaViews != null ? this.rpaViews.equals(otherObj.rpaViews) : this.rpaViews == otherObj.rpaViews) && (this.splitterViews != null ? this.splitterViews.equals(otherObj.splitterViews) : this.splitterViews == otherObj.splitterViews) && (this.clusterList != null ? this.clusterList.equals(otherObj.clusterList) : this.clusterList == otherObj.clusterList) && (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username) && (this.details != null ? this.details.equals(otherObj.details) : this.details == otherObj.details) && (this.seDetails != null ? this.seDetails.equals(otherObj.seDetails) : this.seDetails == otherObj.seDetails) && (this.history == otherObj.history) && (this.splittersInfo != null ? this.splittersInfo.equals(otherObj.splittersInfo) : this.splittersInfo == otherObj.splittersInfo) && (this.groupsInfo != null ? this.groupsInfo.equals(otherObj.groupsInfo) : this.groupsInfo == otherObj.groupsInfo) && (this.eventLogInfo != null ? this.eventLogInfo.equals(otherObj.eventLogInfo) : this.eventLogInfo == otherObj.eventLogInfo) && (this.description != null ? this.description.equals(otherObj.description) : this.description == otherObj.description);
    }


    public int hashCode() {
        return (this.eventTime != null ? this.eventTime.hashCode() : 0) ^ (this.systemEventUID != null ? this.systemEventUID.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ this.eventID ^ (this.roles != null ? this.roles.hashCode() : 0) ^ (this.groupCopies != null ? this.groupCopies.hashCode() : 0) ^ (this.devices != null ? this.devices.hashCode() : 0) ^ (this.replicationSets != null ? this.replicationSets.hashCode() : 0) ^ (this.splitterVolumes != null ? this.splitterVolumes.hashCode() : 0) ^ (this.grouplinks != null ? this.grouplinks.hashCode() : 0) ^ (this.globalLinks != null ? this.globalLinks.hashCode() : 0) ^ (this.arrays != null ? this.arrays.hashCode() : 0) ^ (this.vms != null ? this.vms.hashCode() : 0) ^ (this.rpaViews != null ? this.rpaViews.hashCode() : 0) ^ (this.splitterViews != null ? this.splitterViews.hashCode() : 0) ^ (this.clusterList != null ? this.clusterList.hashCode() : 0) ^ (this.username != null ? this.username.hashCode() : 0) ^ (this.details != null ? this.details.hashCode() : 0) ^ (this.seDetails != null ? this.seDetails.hashCode() : 0) ^ (this.history ? 1 : 0) ^ (this.splittersInfo != null ? this.splittersInfo.hashCode() : 0) ^ (this.groupsInfo != null ? this.groupsInfo.hashCode() : 0) ^ (this.eventLogInfo != null ? this.eventLogInfo.hashCode() : 0) ^ (this.description != null ? this.description.hashCode() : 0);
    }


    public String toString() {
        return "EventLog [eventTime=" + this.eventTime + ", " + "systemEventUID=" + this.systemEventUID + ", " + "clusterUID=" + this.clusterUID + ", " + "rpaUID=" + this.rpaUID + ", " + "eventID=" + this.eventID + ", " + "roles=" + this.roles + ", " + "groupCopies=" + this.groupCopies + ", " + "devices=" + this.devices + ", " + "replicationSets=" + this.replicationSets + ", " + "splitterVolumes=" + this.splitterVolumes + ", " + "grouplinks=" + this.grouplinks + ", " + "globalLinks=" + this.globalLinks + ", " + "arrays=" + this.arrays + ", " + "vms=" + this.vms + ", " + "rpaViews=" + this.rpaViews + ", " + "splitterViews=" + this.splitterViews + ", " + "clusterList=" + this.clusterList + ", " + "username=" + this.username + ", " + "details=" + this.details + ", " + "seDetails=" + this.seDetails + ", " + "history=" + this.history + ", " + "splittersInfo=" + this.splittersInfo + ", " + "groupsInfo=" + this.groupsInfo + ", " + "eventLogInfo=" + this.eventLogInfo + ", " + "description=" + this.description + "]";
    }
}


