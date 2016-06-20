package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterArrayManagementProviderSettings", propOrder = {"clusterUID", "ampsSettings"})
public class ClusterArrayManagementProviderSettings {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<ArrayManagementProviderSettings> ampsSettings;

    public ClusterArrayManagementProviderSettings() {
    }

    public ClusterArrayManagementProviderSettings(ClusterUID clusterUID, List<ArrayManagementProviderSettings> ampsSettings) {
        this.clusterUID = clusterUID;
        this.ampsSettings = ampsSettings;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public List<ArrayManagementProviderSettings> getAmpsSettings() {
        if (this.ampsSettings == null) {
            this.ampsSettings = new ArrayList();
        }
        return this.ampsSettings;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterArrayManagementProviderSettings)) {
            return false;
        }
        ClusterArrayManagementProviderSettings otherObj = (ClusterArrayManagementProviderSettings) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.ampsSettings != null ? this.ampsSettings.equals(otherObj.ampsSettings) : this.ampsSettings == otherObj.ampsSettings);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.ampsSettings != null ? this.ampsSettings.hashCode() : 0);
    }


    public String toString() {
        return "ClusterArrayManagementProviderSettings [clusterUID=" + this.clusterUID + ", " + "ampsSettings=" + this.ampsSettings + "]";
    }
}


