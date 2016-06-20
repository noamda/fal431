package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = UserVolumeSettings.class, name = "UserVolumeSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = RepositoryVolumeSettings.class, name = "RepositoryVolumeSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = JournalVolumeSettings.class, name = "JournalVolumeSettings")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeSettings", propOrder = {"volumeType", "clusterUID", "volumeInfo"})
@XmlSeeAlso({UserVolumeSettings.class, RepositoryVolumeSettings.class, JournalVolumeSettings.class})
public abstract class VolumeSettings {
    @XmlElement(nillable = true)
    protected VolumeType volumeType;
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    protected VolumeInformation volumeInfo;

    public VolumeSettings() {
    }

    public VolumeSettings(VolumeType volumeType, ClusterUID clusterUID, VolumeInformation volumeInfo) {
        this.volumeType = volumeType;
        this.clusterUID = clusterUID;
        this.volumeInfo = volumeInfo;
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


    public VolumeInformation getVolumeInfo() {
        return this.volumeInfo;
    }


    public void setVolumeInfo(VolumeInformation value) {
        this.volumeInfo = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VolumeSettings)) {
            return false;
        }
        VolumeSettings otherObj = (VolumeSettings) obj;

        return (this.volumeType != null ? this.volumeType.equals(otherObj.volumeType) : this.volumeType == otherObj.volumeType) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.volumeInfo != null ? this.volumeInfo.equals(otherObj.volumeInfo) : this.volumeInfo == otherObj.volumeInfo);
    }


    public int hashCode() {
        return (this.volumeType != null ? this.volumeType.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.volumeInfo != null ? this.volumeInfo.hashCode() : 0);
    }


    public String toString() {
        return "VolumeSettings [volumeType=" + this.volumeType + ", " + "clusterUID=" + this.clusterUID + ", " + "volumeInfo=" + this.volumeInfo + "]";
    }
}


