package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullRecoverPointSettings", propOrder = {"systemSettings", "splittersSettings", "groupsSettings", "groupsSetsSettings", "accountSettings", "managementSettings", "globalPolicy", "settingsConflict"})
public class FullRecoverPointSettings {
    @XmlElement(nillable = true)
    protected SystemSettings systemSettings;
    @XmlElement(nillable = true)
    protected List<ClusterSplittersSettings> splittersSettings;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupSettings> groupsSettings;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupSetSettings> groupsSetsSettings;
    @XmlElement(nillable = true)
    protected AccountSettings accountSettings;
    @XmlElement(nillable = true)
    protected ManagementSettings managementSettings;
    protected SystemGlobalPolicy globalPolicy;
    protected boolean settingsConflict;

    public FullRecoverPointSettings() {
    }

    public FullRecoverPointSettings(SystemSettings systemSettings, List<ClusterSplittersSettings> splittersSettings, List<ConsistencyGroupSettings> groupsSettings, List<ConsistencyGroupSetSettings> groupsSetsSettings, AccountSettings accountSettings, ManagementSettings managementSettings, SystemGlobalPolicy globalPolicy, boolean settingsConflict) {
        this.systemSettings = systemSettings;
        this.splittersSettings = splittersSettings;
        this.groupsSettings = groupsSettings;
        this.groupsSetsSettings = groupsSetsSettings;
        this.accountSettings = accountSettings;
        this.managementSettings = managementSettings;
        this.globalPolicy = globalPolicy;
        this.settingsConflict = settingsConflict;
    }


    public SystemSettings getSystemSettings() {
        return this.systemSettings;
    }


    public void setSystemSettings(SystemSettings value) {
        this.systemSettings = value;
    }


    public List<ClusterSplittersSettings> getSplittersSettings() {
        if (this.splittersSettings == null) {
            this.splittersSettings = new ArrayList();
        }
        return this.splittersSettings;
    }


    public List<ConsistencyGroupSettings> getGroupsSettings() {
        if (this.groupsSettings == null) {
            this.groupsSettings = new ArrayList();
        }
        return this.groupsSettings;
    }


    public List<ConsistencyGroupSetSettings> getGroupsSetsSettings() {
        if (this.groupsSetsSettings == null) {
            this.groupsSetsSettings = new ArrayList();
        }
        return this.groupsSetsSettings;
    }


    public AccountSettings getAccountSettings() {
        return this.accountSettings;
    }


    public void setAccountSettings(AccountSettings value) {
        this.accountSettings = value;
    }


    public ManagementSettings getManagementSettings() {
        return this.managementSettings;
    }


    public void setManagementSettings(ManagementSettings value) {
        this.managementSettings = value;
    }


    public SystemGlobalPolicy getGlobalPolicy() {
        return this.globalPolicy;
    }


    public void setGlobalPolicy(SystemGlobalPolicy value) {
        this.globalPolicy = value;
    }


    public boolean isSettingsConflict() {
        return this.settingsConflict;
    }


    public void setSettingsConflict(boolean value) {
        this.settingsConflict = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FullRecoverPointSettings)) {
            return false;
        }
        FullRecoverPointSettings otherObj = (FullRecoverPointSettings) obj;

        return (this.systemSettings != null ? this.systemSettings.equals(otherObj.systemSettings) : this.systemSettings == otherObj.systemSettings) && (this.splittersSettings != null ? this.splittersSettings.equals(otherObj.splittersSettings) : this.splittersSettings == otherObj.splittersSettings) && (this.groupsSettings != null ? this.groupsSettings.equals(otherObj.groupsSettings) : this.groupsSettings == otherObj.groupsSettings) && (this.groupsSetsSettings != null ? this.groupsSetsSettings.equals(otherObj.groupsSetsSettings) : this.groupsSetsSettings == otherObj.groupsSetsSettings) && (this.accountSettings != null ? this.accountSettings.equals(otherObj.accountSettings) : this.accountSettings == otherObj.accountSettings) && (this.managementSettings != null ? this.managementSettings.equals(otherObj.managementSettings) : this.managementSettings == otherObj.managementSettings) && (this.globalPolicy != null ? this.globalPolicy.equals(otherObj.globalPolicy) : this.globalPolicy == otherObj.globalPolicy) && (this.settingsConflict == otherObj.settingsConflict);
    }


    public int hashCode() {
        return (this.systemSettings != null ? this.systemSettings.hashCode() : 0) ^ (this.splittersSettings != null ? this.splittersSettings.hashCode() : 0) ^ (this.groupsSettings != null ? this.groupsSettings.hashCode() : 0) ^ (this.groupsSetsSettings != null ? this.groupsSetsSettings.hashCode() : 0) ^ (this.accountSettings != null ? this.accountSettings.hashCode() : 0) ^ (this.managementSettings != null ? this.managementSettings.hashCode() : 0) ^ (this.globalPolicy != null ? this.globalPolicy.hashCode() : 0) ^ (this.settingsConflict ? 1 : 0);
    }


    public String toString() {
        return "FullRecoverPointSettings [systemSettings=" + this.systemSettings + ", " + "splittersSettings=" + this.splittersSettings + ", " + "groupsSettings=" + this.groupsSettings + ", " + "groupsSetsSettings=" + this.groupsSetsSettings + ", " + "accountSettings=" + this.accountSettings + ", " + "managementSettings=" + this.managementSettings + ", " + "globalPolicy=" + this.globalPolicy + ", " + "settingsConflict=" + this.settingsConflict + "]";
    }
}


