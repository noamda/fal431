package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoredParameterKey", propOrder = {"rpaUID", "context", "consistencyGroupCopyUID", "arrayUID", "splitterUID", "clusterUID", "parameterType", "globalLink", "vcUID", "groupUID"})
public class MonitoredParameterKey {
    @XmlElement(nillable = true)
    protected RpaUID rpaUID;
    protected String context;
    @XmlElement(nillable = true)
    protected ConsistencyGroupCopyUID consistencyGroupCopyUID;
    @XmlElement(nillable = true)
    protected ArrayUID arrayUID;
    @XmlElement(nillable = true)
    protected SplitterUID splitterUID;
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    protected MonitoredParameterType parameterType;
    protected GlobalLinkUID globalLink;
    protected VirtualCenterUID vcUID;
    protected ConsistencyGroupUID groupUID;

    public MonitoredParameterKey() {
    }

    public MonitoredParameterKey(RpaUID rpaUID, String context, ConsistencyGroupCopyUID consistencyGroupCopyUID, ArrayUID arrayUID, SplitterUID splitterUID, ClusterUID clusterUID, MonitoredParameterType parameterType, GlobalLinkUID globalLink, VirtualCenterUID vcUID, ConsistencyGroupUID groupUID) {
        this.rpaUID = rpaUID;
        this.context = context;
        this.consistencyGroupCopyUID = consistencyGroupCopyUID;
        this.arrayUID = arrayUID;
        this.splitterUID = splitterUID;
        this.clusterUID = clusterUID;
        this.parameterType = parameterType;
        this.globalLink = globalLink;
        this.vcUID = vcUID;
        this.groupUID = groupUID;
    }


    public RpaUID getRpaUID() {
        return this.rpaUID;
    }


    public void setRpaUID(RpaUID value) {
        this.rpaUID = value;
    }


    public String getContext() {
        return this.context;
    }


    public void setContext(String value) {
        this.context = value;
    }


    public ConsistencyGroupCopyUID getConsistencyGroupCopyUID() {
        return this.consistencyGroupCopyUID;
    }


    public void setConsistencyGroupCopyUID(ConsistencyGroupCopyUID value) {
        this.consistencyGroupCopyUID = value;
    }


    public ArrayUID getArrayUID() {
        return this.arrayUID;
    }


    public void setArrayUID(ArrayUID value) {
        this.arrayUID = value;
    }


    public SplitterUID getSplitterUID() {
        return this.splitterUID;
    }


    public void setSplitterUID(SplitterUID value) {
        this.splitterUID = value;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public MonitoredParameterType getParameterType() {
        return this.parameterType;
    }


    public void setParameterType(MonitoredParameterType value) {
        this.parameterType = value;
    }


    public GlobalLinkUID getGlobalLink() {
        return this.globalLink;
    }


    public void setGlobalLink(GlobalLinkUID value) {
        this.globalLink = value;
    }


    public VirtualCenterUID getVcUID() {
        return this.vcUID;
    }


    public void setVcUID(VirtualCenterUID value) {
        this.vcUID = value;
    }


    public ConsistencyGroupUID getGroupUID() {
        return this.groupUID;
    }


    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof MonitoredParameterKey)) {
            return false;
        }
        MonitoredParameterKey otherObj = (MonitoredParameterKey) obj;

        return (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.context != null ? this.context.equals(otherObj.context) : this.context == otherObj.context) && (this.consistencyGroupCopyUID != null ? this.consistencyGroupCopyUID.equals(otherObj.consistencyGroupCopyUID) : this.consistencyGroupCopyUID == otherObj.consistencyGroupCopyUID) && (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.splitterUID != null ? this.splitterUID.equals(otherObj.splitterUID) : this.splitterUID == otherObj.splitterUID) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.parameterType != null ? this.parameterType.equals(otherObj.parameterType) : this.parameterType == otherObj.parameterType) && (this.globalLink != null ? this.globalLink.equals(otherObj.globalLink) : this.globalLink == otherObj.globalLink) && (this.vcUID != null ? this.vcUID.equals(otherObj.vcUID) : this.vcUID == otherObj.vcUID) && (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID);
    }


    public int hashCode() {
        return (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ (this.context != null ? this.context.hashCode() : 0) ^ (this.consistencyGroupCopyUID != null ? this.consistencyGroupCopyUID.hashCode() : 0) ^ (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.splitterUID != null ? this.splitterUID.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.parameterType != null ? this.parameterType.hashCode() : 0) ^ (this.globalLink != null ? this.globalLink.hashCode() : 0) ^ (this.vcUID != null ? this.vcUID.hashCode() : 0) ^ (this.groupUID != null ? this.groupUID.hashCode() : 0);
    }


    public String toString() {
        return "MonitoredParameterKey [rpaUID=" + this.rpaUID + ", " + "context=" + this.context + ", " + "consistencyGroupCopyUID=" + this.consistencyGroupCopyUID + ", " + "arrayUID=" + this.arrayUID + ", " + "splitterUID=" + this.splitterUID + ", " + "clusterUID=" + this.clusterUID + ", " + "parameterType=" + this.parameterType + ", " + "globalLink=" + this.globalLink + ", " + "vcUID=" + this.vcUID + ", " + "groupUID=" + this.groupUID + "]";
    }
}


