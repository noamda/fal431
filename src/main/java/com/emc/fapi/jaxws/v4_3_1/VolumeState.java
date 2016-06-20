package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = RepositoryVolumeState.class, name = "RepositoryVolumeState"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = UserVolumeState.class, name = "UserVolumeState"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = JournalVolumeState.class, name = "JournalVolumeState")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeState", propOrder = {"volumeType", "clusterUID", "volumeID", "rpasAccessStatus"})
@XmlSeeAlso({UserVolumeState.class, JournalVolumeState.class, RepositoryVolumeState.class})
public abstract class VolumeState {
    @XmlElement(nillable = true)
    protected VolumeType volumeType;
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    protected DeviceUID volumeID;
    @XmlElement(nillable = true)
    protected List<VolumeRPAAccessStatus> rpasAccessStatus;

    public VolumeState() {
    }

    public VolumeState(VolumeType volumeType, ClusterUID clusterUID, DeviceUID volumeID, List<VolumeRPAAccessStatus> rpasAccessStatus) {
        this.volumeType = volumeType;
        this.clusterUID = clusterUID;
        this.volumeID = volumeID;
        this.rpasAccessStatus = rpasAccessStatus;
    }


    public VolumeType getVolumeType() {
        return this.volumeType;
    }


    public void setVolumeType(VolumeType value) {
        this.volumeType = value;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public DeviceUID getVolumeID() {
        return this.volumeID;
    }


    public void setVolumeID(DeviceUID value) {
        this.volumeID = value;
    }


    public List<VolumeRPAAccessStatus> getRpasAccessStatus() {
        if (this.rpasAccessStatus == null) {
            this.rpasAccessStatus = new ArrayList();
        }
        return this.rpasAccessStatus;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VolumeState)) {
            return false;
        }
        VolumeState otherObj = (VolumeState) obj;

        return (this.volumeType != null ? this.volumeType.equals(otherObj.volumeType) : this.volumeType == otherObj.volumeType) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID) && (this.rpasAccessStatus != null ? this.rpasAccessStatus.equals(otherObj.rpasAccessStatus) : this.rpasAccessStatus == otherObj.rpasAccessStatus);
    }


    public int hashCode() {
        return (this.volumeType != null ? this.volumeType.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.volumeID != null ? this.volumeID.hashCode() : 0) ^ (this.rpasAccessStatus != null ? this.rpasAccessStatus.hashCode() : 0);
    }


    public String toString() {
        return "VolumeState [volumeType=" + this.volumeType + ", " + "clusterUID=" + this.clusterUID + ", " + "volumeID=" + this.volumeID + ", " + "rpasAccessStatus=" + this.rpasAccessStatus + "]";
    }
}


