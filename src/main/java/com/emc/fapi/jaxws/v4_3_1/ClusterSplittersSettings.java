package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterSplittersSettings", propOrder = {"clusterUID", "splittersSettings"})
public class ClusterSplittersSettings {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<SplitterSettings> splittersSettings;

    public ClusterSplittersSettings() {
    }

    public ClusterSplittersSettings(ClusterUID clusterUID, List<SplitterSettings> splittersSettings) {
        this.clusterUID = clusterUID;
        this.splittersSettings = splittersSettings;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public List<SplitterSettings> getSplittersSettings() {
        if (this.splittersSettings == null) {
            this.splittersSettings = new ArrayList();
        }
        return this.splittersSettings;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterSplittersSettings)) {
            return false;
        }
        ClusterSplittersSettings otherObj = (ClusterSplittersSettings) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.splittersSettings != null ? this.splittersSettings.equals(otherObj.splittersSettings) : this.splittersSettings == otherObj.splittersSettings);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.splittersSettings != null ? this.splittersSettings.hashCode() : 0);
    }


    public String toString() {
        return "ClusterSplittersSettings [clusterUID=" + this.clusterUID + ", " + "splittersSettings=" + this.splittersSettings + "]";
    }
}


