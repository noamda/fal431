package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterSettings", propOrder = {"clusterName", "clusterUID", "rpasUIDs", "vcenterServers", "vcenterServersFilters", "repositoryVolume", "attachedPhoenixClusterName", "throttlePolicy", "clusterIndex", "maintenanceMode", "locationID", "softwareSerialId", "ampsSettings", "autoRegistrationInfo", "externalHostsSettings"})
public class ClusterSettings {
    protected String clusterName;
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<RpaUID> rpasUIDs;
    @XmlElement(nillable = true)
    protected List<VCenterServer> vcenterServers;
    @XmlElement(nillable = true)
    protected List<VCenterServerFilters> vcenterServersFilters;
    protected RepositoryVolumeSettings repositoryVolume;
    protected String attachedPhoenixClusterName;
    @XmlElement(nillable = true)
    protected List<ArrayIRThrottlingPolicyInfo> throttlePolicy;
    protected int clusterIndex;
    protected ClusterMaintenanceMode maintenanceMode;
    protected String locationID;
    protected String softwareSerialId;
    @XmlElement(nillable = true)
    protected List<ArrayManagementProviderSettings> ampsSettings;
    protected ClusterAutoRegistrationInformation autoRegistrationInfo;
    @XmlElement(nillable = true)
    protected List<ExternalHostSettings> externalHostsSettings;

    public ClusterSettings() {
    }

    public ClusterSettings(String clusterName, ClusterUID clusterUID, List<RpaUID> rpasUIDs, List<VCenterServer> vcenterServers, List<VCenterServerFilters> vcenterServersFilters, RepositoryVolumeSettings repositoryVolume, String attachedPhoenixClusterName, List<ArrayIRThrottlingPolicyInfo> throttlePolicy, int clusterIndex, ClusterMaintenanceMode maintenanceMode, String locationID, String softwareSerialId, List<ArrayManagementProviderSettings> ampsSettings, ClusterAutoRegistrationInformation autoRegistrationInfo, List<ExternalHostSettings> externalHostsSettings) {
        this.clusterName = clusterName;
        this.clusterUID = clusterUID;
        this.rpasUIDs = rpasUIDs;
        this.vcenterServers = vcenterServers;
        this.vcenterServersFilters = vcenterServersFilters;
        this.repositoryVolume = repositoryVolume;
        this.attachedPhoenixClusterName = attachedPhoenixClusterName;
        this.throttlePolicy = throttlePolicy;
        this.clusterIndex = clusterIndex;
        this.maintenanceMode = maintenanceMode;
        this.locationID = locationID;
        this.softwareSerialId = softwareSerialId;
        this.ampsSettings = ampsSettings;
        this.autoRegistrationInfo = autoRegistrationInfo;
        this.externalHostsSettings = externalHostsSettings;
    }


    public String getClusterName() {
        return this.clusterName;
    }


    public void setClusterName(String value) {
        this.clusterName = value;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public List<RpaUID> getRpasUIDs() {
        if (this.rpasUIDs == null) {
            this.rpasUIDs = new ArrayList();
        }
        return this.rpasUIDs;
    }


    public List<VCenterServer> getVcenterServers() {
        if (this.vcenterServers == null) {
            this.vcenterServers = new ArrayList();
        }
        return this.vcenterServers;
    }


    public List<VCenterServerFilters> getVcenterServersFilters() {
        if (this.vcenterServersFilters == null) {
            this.vcenterServersFilters = new ArrayList();
        }
        return this.vcenterServersFilters;
    }


    public RepositoryVolumeSettings getRepositoryVolume() {
        return this.repositoryVolume;
    }


    public void setRepositoryVolume(RepositoryVolumeSettings value) {
        this.repositoryVolume = value;
    }


    public String getAttachedPhoenixClusterName() {
        return this.attachedPhoenixClusterName;
    }


    public void setAttachedPhoenixClusterName(String value) {
        this.attachedPhoenixClusterName = value;
    }


    public List<ArrayIRThrottlingPolicyInfo> getThrottlePolicy() {
        if (this.throttlePolicy == null) {
            this.throttlePolicy = new ArrayList();
        }
        return this.throttlePolicy;
    }


    public int getClusterIndex() {
        return this.clusterIndex;
    }


    public void setClusterIndex(int value) {
        this.clusterIndex = value;
    }


    public ClusterMaintenanceMode getMaintenanceMode() {
        return this.maintenanceMode;
    }


    public void setMaintenanceMode(ClusterMaintenanceMode value) {
        this.maintenanceMode = value;
    }


    public String getLocationID() {
        return this.locationID;
    }


    public void setLocationID(String value) {
        this.locationID = value;
    }


    public String getSoftwareSerialId() {
        return this.softwareSerialId;
    }


    public void setSoftwareSerialId(String value) {
        this.softwareSerialId = value;
    }


    public List<ArrayManagementProviderSettings> getAmpsSettings() {
        if (this.ampsSettings == null) {
            this.ampsSettings = new ArrayList();
        }
        return this.ampsSettings;
    }


    public ClusterAutoRegistrationInformation getAutoRegistrationInfo() {
        return this.autoRegistrationInfo;
    }


    public void setAutoRegistrationInfo(ClusterAutoRegistrationInformation value) {
        this.autoRegistrationInfo = value;
    }


    public List<ExternalHostSettings> getExternalHostsSettings() {
        if (this.externalHostsSettings == null) {
            this.externalHostsSettings = new ArrayList();
        }
        return this.externalHostsSettings;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterSettings)) {
            return false;
        }
        ClusterSettings otherObj = (ClusterSettings) obj;

        return (this.clusterName != null ? this.clusterName.equals(otherObj.clusterName) : this.clusterName == otherObj.clusterName) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.rpasUIDs != null ? this.rpasUIDs.equals(otherObj.rpasUIDs) : this.rpasUIDs == otherObj.rpasUIDs) && (this.vcenterServers != null ? this.vcenterServers.equals(otherObj.vcenterServers) : this.vcenterServers == otherObj.vcenterServers) && (this.vcenterServersFilters != null ? this.vcenterServersFilters.equals(otherObj.vcenterServersFilters) : this.vcenterServersFilters == otherObj.vcenterServersFilters) && (this.repositoryVolume != null ? this.repositoryVolume.equals(otherObj.repositoryVolume) : this.repositoryVolume == otherObj.repositoryVolume) && (this.attachedPhoenixClusterName != null ? this.attachedPhoenixClusterName.equals(otherObj.attachedPhoenixClusterName) : this.attachedPhoenixClusterName == otherObj.attachedPhoenixClusterName) && (this.throttlePolicy != null ? this.throttlePolicy.equals(otherObj.throttlePolicy) : this.throttlePolicy == otherObj.throttlePolicy) && (this.clusterIndex == otherObj.clusterIndex) && (this.maintenanceMode != null ? this.maintenanceMode.equals(otherObj.maintenanceMode) : this.maintenanceMode == otherObj.maintenanceMode) && (this.locationID != null ? this.locationID.equals(otherObj.locationID) : this.locationID == otherObj.locationID) && (this.softwareSerialId != null ? this.softwareSerialId.equals(otherObj.softwareSerialId) : this.softwareSerialId == otherObj.softwareSerialId) && (this.ampsSettings != null ? this.ampsSettings.equals(otherObj.ampsSettings) : this.ampsSettings == otherObj.ampsSettings) && (this.autoRegistrationInfo != null ? this.autoRegistrationInfo.equals(otherObj.autoRegistrationInfo) : this.autoRegistrationInfo == otherObj.autoRegistrationInfo) && (this.externalHostsSettings != null ? this.externalHostsSettings.equals(otherObj.externalHostsSettings) : this.externalHostsSettings == otherObj.externalHostsSettings);
    }


    public int hashCode() {
        return (this.clusterName != null ? this.clusterName.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.rpasUIDs != null ? this.rpasUIDs.hashCode() : 0) ^ (this.vcenterServers != null ? this.vcenterServers.hashCode() : 0) ^ (this.vcenterServersFilters != null ? this.vcenterServersFilters.hashCode() : 0) ^ (this.repositoryVolume != null ? this.repositoryVolume.hashCode() : 0) ^ (this.attachedPhoenixClusterName != null ? this.attachedPhoenixClusterName.hashCode() : 0) ^ (this.throttlePolicy != null ? this.throttlePolicy.hashCode() : 0) ^ this.clusterIndex ^ (this.maintenanceMode != null ? this.maintenanceMode.hashCode() : 0) ^ (this.locationID != null ? this.locationID.hashCode() : 0) ^ (this.softwareSerialId != null ? this.softwareSerialId.hashCode() : 0) ^ (this.ampsSettings != null ? this.ampsSettings.hashCode() : 0) ^ (this.autoRegistrationInfo != null ? this.autoRegistrationInfo.hashCode() : 0) ^ (this.externalHostsSettings != null ? this.externalHostsSettings.hashCode() : 0);
    }


    public String toString() {
        return "ClusterSettings [clusterName=" + this.clusterName + ", " + "clusterUID=" + this.clusterUID + ", " + "rpasUIDs=" + this.rpasUIDs + ", " + "vcenterServers=" + this.vcenterServers + ", " + "vcenterServersFilters=" + this.vcenterServersFilters + ", " + "repositoryVolume=" + this.repositoryVolume + ", " + "attachedPhoenixClusterName=" + this.attachedPhoenixClusterName + ", " + "throttlePolicy=" + this.throttlePolicy + ", " + "clusterIndex=" + this.clusterIndex + ", " + "maintenanceMode=" + this.maintenanceMode + ", " + "locationID=" + this.locationID + ", " + "softwareSerialId=" + this.softwareSerialId + ", " + "ampsSettings=" + this.ampsSettings + ", " + "autoRegistrationInfo=" + this.autoRegistrationInfo + ", " + "externalHostsSettings=" + this.externalHostsSettings + "]";
    }
}


