package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RpaView", propOrder = {"rpaUID", "volumes", "groupCopies", "jvolGroupCopies", "uvolGroupCopies", "splitters", "peerRPAs", "peerClusterList"})
public class RpaView {
    @XmlElement(nillable = true)
    protected RpaUID rpaUID;
    @XmlElement(nillable = true)
    protected List<DeviceInfo> volumes;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyInfo> groupCopies;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyInfo> jvolGroupCopies;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyInfo> uvolGroupCopies;
    @XmlElement(nillable = true)
    protected List<SplitterInfo> splitters;
    @XmlElement(nillable = true)
    protected List<RpaUID> peerRPAs;
    @XmlElement(nillable = true)
    protected List<ClusterUID> peerClusterList;

    public RpaView() {
    }

    public RpaView(RpaUID rpaUID, List<DeviceInfo> volumes, List<ConsistencyGroupCopyInfo> groupCopies, List<ConsistencyGroupCopyInfo> jvolGroupCopies, List<ConsistencyGroupCopyInfo> uvolGroupCopies, List<SplitterInfo> splitters, List<RpaUID> peerRPAs, List<ClusterUID> peerClusterList) {
        this.rpaUID = rpaUID;
        this.volumes = volumes;
        this.groupCopies = groupCopies;
        this.jvolGroupCopies = jvolGroupCopies;
        this.uvolGroupCopies = uvolGroupCopies;
        this.splitters = splitters;
        this.peerRPAs = peerRPAs;
        this.peerClusterList = peerClusterList;
    }


    public RpaUID getRpaUID() {
        return this.rpaUID;
    }


    public void setRpaUID(RpaUID value) {
        this.rpaUID = value;
    }


    public List<DeviceInfo> getVolumes() {
        if (this.volumes == null) {
            this.volumes = new ArrayList();
        }
        return this.volumes;
    }


    public List<ConsistencyGroupCopyInfo> getGroupCopies() {
        if (this.groupCopies == null) {
            this.groupCopies = new ArrayList();
        }
        return this.groupCopies;
    }


    public List<ConsistencyGroupCopyInfo> getJvolGroupCopies() {
        if (this.jvolGroupCopies == null) {
            this.jvolGroupCopies = new ArrayList();
        }
        return this.jvolGroupCopies;
    }


    public List<ConsistencyGroupCopyInfo> getUvolGroupCopies() {
        if (this.uvolGroupCopies == null) {
            this.uvolGroupCopies = new ArrayList();
        }
        return this.uvolGroupCopies;
    }


    public List<SplitterInfo> getSplitters() {
        if (this.splitters == null) {
            this.splitters = new ArrayList();
        }
        return this.splitters;
    }


    public List<RpaUID> getPeerRPAs() {
        if (this.peerRPAs == null) {
            this.peerRPAs = new ArrayList();
        }
        return this.peerRPAs;
    }


    public List<ClusterUID> getPeerClusterList() {
        if (this.peerClusterList == null) {
            this.peerClusterList = new ArrayList();
        }
        return this.peerClusterList;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RpaView)) {
            return false;
        }
        RpaView otherObj = (RpaView) obj;

        return (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.volumes != null ? this.volumes.equals(otherObj.volumes) : this.volumes == otherObj.volumes) && (this.groupCopies != null ? this.groupCopies.equals(otherObj.groupCopies) : this.groupCopies == otherObj.groupCopies) && (this.jvolGroupCopies != null ? this.jvolGroupCopies.equals(otherObj.jvolGroupCopies) : this.jvolGroupCopies == otherObj.jvolGroupCopies) && (this.uvolGroupCopies != null ? this.uvolGroupCopies.equals(otherObj.uvolGroupCopies) : this.uvolGroupCopies == otherObj.uvolGroupCopies) && (this.splitters != null ? this.splitters.equals(otherObj.splitters) : this.splitters == otherObj.splitters) && (this.peerRPAs != null ? this.peerRPAs.equals(otherObj.peerRPAs) : this.peerRPAs == otherObj.peerRPAs) && (this.peerClusterList != null ? this.peerClusterList.equals(otherObj.peerClusterList) : this.peerClusterList == otherObj.peerClusterList);
    }


    public int hashCode() {
        return (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ (this.volumes != null ? this.volumes.hashCode() : 0) ^ (this.groupCopies != null ? this.groupCopies.hashCode() : 0) ^ (this.jvolGroupCopies != null ? this.jvolGroupCopies.hashCode() : 0) ^ (this.uvolGroupCopies != null ? this.uvolGroupCopies.hashCode() : 0) ^ (this.splitters != null ? this.splitters.hashCode() : 0) ^ (this.peerRPAs != null ? this.peerRPAs.hashCode() : 0) ^ (this.peerClusterList != null ? this.peerClusterList.hashCode() : 0);
    }


    public String toString() {
        return "RpaView [rpaUID=" + this.rpaUID + ", " + "volumes=" + this.volumes + ", " + "groupCopies=" + this.groupCopies + ", " + "jvolGroupCopies=" + this.jvolGroupCopies + ", " + "uvolGroupCopies=" + this.uvolGroupCopies + ", " + "splitters=" + this.splitters + ", " + "peerRPAs=" + this.peerRPAs + ", " + "peerClusterList=" + this.peerClusterList + "]";
    }
}


