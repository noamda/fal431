package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemSettingsConflicts", propOrder = {"clustersInfo", "conflictsDescription"})
public class SystemSettingsConflicts {
    @XmlElement(nillable = true)
    protected List<ClusterInfo> clustersInfo;
    protected String conflictsDescription;

    public SystemSettingsConflicts() {
    }

    public SystemSettingsConflicts(List<ClusterInfo> clustersInfo, String conflictsDescription) {
        this.clustersInfo = clustersInfo;
        this.conflictsDescription = conflictsDescription;
    }


    public List<ClusterInfo> getClustersInfo() {
        if (this.clustersInfo == null) {
            this.clustersInfo = new ArrayList();
        }
        return this.clustersInfo;
    }


    public String getConflictsDescription() {
        return this.conflictsDescription;
    }


    public void setConflictsDescription(String value) {
        this.conflictsDescription = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SystemSettingsConflicts)) {
            return false;
        }
        SystemSettingsConflicts otherObj = (SystemSettingsConflicts) obj;

        return (this.clustersInfo != null ? this.clustersInfo.equals(otherObj.clustersInfo) : this.clustersInfo == otherObj.clustersInfo) && (this.conflictsDescription != null ? this.conflictsDescription.equals(otherObj.conflictsDescription) : this.conflictsDescription == otherObj.conflictsDescription);
    }


    public int hashCode() {
        return (this.clustersInfo != null ? this.clustersInfo.hashCode() : 0) ^ (this.conflictsDescription != null ? this.conflictsDescription.hashCode() : 0);
    }


    public String toString() {
        return "SystemSettingsConflicts [clustersInfo=" + this.clustersInfo + ", " + "conflictsDescription=" + this.conflictsDescription + "]";
    }
}


