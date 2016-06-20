package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterVersionState", propOrder = {"features", "version", "clusterUID"})
public class ClusterVersionState {
    @XmlElement(nillable = true)
    protected Features features;
    protected String version;
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;

    public ClusterVersionState() {
    }

    public ClusterVersionState(Features features, String version, ClusterUID clusterUID) {
        this.features = features;
        this.version = version;
        this.clusterUID = clusterUID;
    }


    public Features getFeatures() {
        return this.features;
    }


    public void setFeatures(Features value) {
        this.features = value;
    }


    public String getVersion() {
        return this.version;
    }


    public void setVersion(String value) {
        this.version = value;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterVersionState)) {
            return false;
        }
        ClusterVersionState otherObj = (ClusterVersionState) obj;

        return (this.features != null ? this.features.equals(otherObj.features) : this.features == otherObj.features) && (this.version != null ? this.version.equals(otherObj.version) : this.version == otherObj.version) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID);
    }


    public int hashCode() {
        return (this.features != null ? this.features.hashCode() : 0) ^ (this.version != null ? this.version.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0);
    }


    public String toString() {
        return "ClusterVersionState [features=" + this.features + ", " + "version=" + this.version + ", " + "clusterUID=" + this.clusterUID + "]";
    }
}


