package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = SymmetrixSplitterState.class, name = "SymmetrixSplitterState"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = AggregatedSplitterState.class, name = "AggregatedSplitterState")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitterState", propOrder = {"splitterUID", "splitterStatus", "numberOfAttachedRPAClusters", "rpasConnectivityStatus", "volumesAccessState", "osAndVersionInfo", "rpasPaths", "splitterCapabilities"})
@XmlSeeAlso({SymmetrixSplitterState.class, AggregatedSplitterState.class})
public class SplitterState {
    @XmlElement(nillable = true)
    protected SplitterUID splitterUID;
    @XmlElement(nillable = true)
    protected SplitterStatus splitterStatus;
    protected int numberOfAttachedRPAClusters;
    @XmlElement(nillable = true)
    protected List<RPAConnectivityStatus> rpasConnectivityStatus;
    @XmlElement(nillable = true)
    protected List<AttachedUserVolumeAccessState> volumesAccessState;
    @XmlElement(nillable = true)
    protected List<SplitterOSAndVersionInfo> osAndVersionInfo;
    @XmlElement(nillable = true)
    protected List<Path> rpasPaths;
    @XmlElement(nillable = true)
    protected List<Capability> splitterCapabilities;

    public SplitterState() {
    }

    public SplitterState(SplitterUID splitterUID, SplitterStatus splitterStatus, int numberOfAttachedRPAClusters, List<RPAConnectivityStatus> rpasConnectivityStatus, List<AttachedUserVolumeAccessState> volumesAccessState, List<SplitterOSAndVersionInfo> osAndVersionInfo, List<Path> rpasPaths, List<Capability> splitterCapabilities) {
        this.splitterUID = splitterUID;
        this.splitterStatus = splitterStatus;
        this.numberOfAttachedRPAClusters = numberOfAttachedRPAClusters;
        this.rpasConnectivityStatus = rpasConnectivityStatus;
        this.volumesAccessState = volumesAccessState;
        this.osAndVersionInfo = osAndVersionInfo;
        this.rpasPaths = rpasPaths;
        this.splitterCapabilities = splitterCapabilities;
    }


    public SplitterUID getSplitterUID() {
        return this.splitterUID;
    }


    public void setSplitterUID(SplitterUID value) {
        this.splitterUID = value;
    }


    public SplitterStatus getSplitterStatus() {
        return this.splitterStatus;
    }


    public void setSplitterStatus(SplitterStatus value) {
        this.splitterStatus = value;
    }


    public int getNumberOfAttachedRPAClusters() {
        return this.numberOfAttachedRPAClusters;
    }


    public void setNumberOfAttachedRPAClusters(int value) {
        this.numberOfAttachedRPAClusters = value;
    }


    public List<RPAConnectivityStatus> getRpasConnectivityStatus() {
        if (this.rpasConnectivityStatus == null) {
            this.rpasConnectivityStatus = new ArrayList();
        }
        return this.rpasConnectivityStatus;
    }


    public List<AttachedUserVolumeAccessState> getVolumesAccessState() {
        if (this.volumesAccessState == null) {
            this.volumesAccessState = new ArrayList();
        }
        return this.volumesAccessState;
    }


    public List<SplitterOSAndVersionInfo> getOsAndVersionInfo() {
        if (this.osAndVersionInfo == null) {
            this.osAndVersionInfo = new ArrayList();
        }
        return this.osAndVersionInfo;
    }


    public List<Path> getRpasPaths() {
        if (this.rpasPaths == null) {
            this.rpasPaths = new ArrayList();
        }
        return this.rpasPaths;
    }


    public List<Capability> getSplitterCapabilities() {
        if (this.splitterCapabilities == null) {
            this.splitterCapabilities = new ArrayList();
        }
        return this.splitterCapabilities;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SplitterState)) {
            return false;
        }
        SplitterState otherObj = (SplitterState) obj;

        return (this.splitterUID != null ? this.splitterUID.equals(otherObj.splitterUID) : this.splitterUID == otherObj.splitterUID) && (this.splitterStatus != null ? this.splitterStatus.equals(otherObj.splitterStatus) : this.splitterStatus == otherObj.splitterStatus) && (this.numberOfAttachedRPAClusters == otherObj.numberOfAttachedRPAClusters) && (this.rpasConnectivityStatus != null ? this.rpasConnectivityStatus.equals(otherObj.rpasConnectivityStatus) : this.rpasConnectivityStatus == otherObj.rpasConnectivityStatus) && (this.volumesAccessState != null ? this.volumesAccessState.equals(otherObj.volumesAccessState) : this.volumesAccessState == otherObj.volumesAccessState) && (this.osAndVersionInfo != null ? this.osAndVersionInfo.equals(otherObj.osAndVersionInfo) : this.osAndVersionInfo == otherObj.osAndVersionInfo) && (this.rpasPaths != null ? this.rpasPaths.equals(otherObj.rpasPaths) : this.rpasPaths == otherObj.rpasPaths) && (this.splitterCapabilities != null ? this.splitterCapabilities.equals(otherObj.splitterCapabilities) : this.splitterCapabilities == otherObj.splitterCapabilities);
    }


    public int hashCode() {
        return (this.splitterUID != null ? this.splitterUID.hashCode() : 0) ^ (this.splitterStatus != null ? this.splitterStatus.hashCode() : 0) ^ this.numberOfAttachedRPAClusters ^ (this.rpasConnectivityStatus != null ? this.rpasConnectivityStatus.hashCode() : 0) ^ (this.volumesAccessState != null ? this.volumesAccessState.hashCode() : 0) ^ (this.osAndVersionInfo != null ? this.osAndVersionInfo.hashCode() : 0) ^ (this.rpasPaths != null ? this.rpasPaths.hashCode() : 0) ^ (this.splitterCapabilities != null ? this.splitterCapabilities.hashCode() : 0);
    }


    public String toString() {
        return "SplitterState [splitterUID=" + this.splitterUID + ", " + "splitterStatus=" + this.splitterStatus + ", " + "numberOfAttachedRPAClusters=" + this.numberOfAttachedRPAClusters + ", " + "rpasConnectivityStatus=" + this.rpasConnectivityStatus + ", " + "volumesAccessState=" + this.volumesAccessState + ", " + "osAndVersionInfo=" + this.osAndVersionInfo + ", " + "rpasPaths=" + this.rpasPaths + ", " + "splitterCapabilities=" + this.splitterCapabilities + "]";
    }
}


