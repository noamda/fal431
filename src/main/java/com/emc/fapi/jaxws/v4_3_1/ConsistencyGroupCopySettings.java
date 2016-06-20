package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopySettings", propOrder = {"copyUID", "name", "enabled", "policy", "roleInfo", "imageAccessInformation", "journal", "hasPhoenixDevices", "groupCopySplitters"})
public class ConsistencyGroupCopySettings {
    protected ConsistencyGroupCopyUID copyUID;
    protected String name;
    protected boolean enabled;
    protected ConsistencyGroupCopyPolicy policy;
    protected ConsistencyGroupCopyRoleInfo roleInfo;
    @XmlElement(nillable = true)
    protected ImageAccessInformation imageAccessInformation;
    protected ConsistencyGroupCopyJournal journal;
    protected boolean hasPhoenixDevices;
    @XmlElement(nillable = true)
    protected List<SplitterUID> groupCopySplitters;

    public ConsistencyGroupCopySettings() {
    }

    public ConsistencyGroupCopySettings(ConsistencyGroupCopyUID copyUID, String name, boolean enabled, ConsistencyGroupCopyPolicy policy, ConsistencyGroupCopyRoleInfo roleInfo, ImageAccessInformation imageAccessInformation, ConsistencyGroupCopyJournal journal, boolean hasPhoenixDevices, List<SplitterUID> groupCopySplitters) {
        this.copyUID = copyUID;
        this.name = name;
        this.enabled = enabled;
        this.policy = policy;
        this.roleInfo = roleInfo;
        this.imageAccessInformation = imageAccessInformation;
        this.journal = journal;
        this.hasPhoenixDevices = hasPhoenixDevices;
        this.groupCopySplitters = groupCopySplitters;
    }


    public ConsistencyGroupCopyUID getCopyUID() {
        return this.copyUID;
    }


    public void setCopyUID(ConsistencyGroupCopyUID value) {
        this.copyUID = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public boolean isEnabled() {
        return this.enabled;
    }


    public void setEnabled(boolean value) {
        this.enabled = value;
    }


    public ConsistencyGroupCopyPolicy getPolicy() {
        return this.policy;
    }


    public void setPolicy(ConsistencyGroupCopyPolicy value) {
        this.policy = value;
    }


    public ConsistencyGroupCopyRoleInfo getRoleInfo() {
        return this.roleInfo;
    }


    public void setRoleInfo(ConsistencyGroupCopyRoleInfo value) {
        this.roleInfo = value;
    }


    public ImageAccessInformation getImageAccessInformation() {
        return this.imageAccessInformation;
    }


    public void setImageAccessInformation(ImageAccessInformation value) {
        this.imageAccessInformation = value;
    }


    public ConsistencyGroupCopyJournal getJournal() {
        return this.journal;
    }


    public void setJournal(ConsistencyGroupCopyJournal value) {
        this.journal = value;
    }


    public boolean isHasPhoenixDevices() {
        return this.hasPhoenixDevices;
    }


    public void setHasPhoenixDevices(boolean value) {
        this.hasPhoenixDevices = value;
    }


    public List<SplitterUID> getGroupCopySplitters() {
        if (this.groupCopySplitters == null) {
            this.groupCopySplitters = new ArrayList();
        }
        return this.groupCopySplitters;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopySettings)) {
            return false;
        }
        ConsistencyGroupCopySettings otherObj = (ConsistencyGroupCopySettings) obj;

        return (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.enabled == otherObj.enabled) && (this.policy != null ? this.policy.equals(otherObj.policy) : this.policy == otherObj.policy) && (this.roleInfo != null ? this.roleInfo.equals(otherObj.roleInfo) : this.roleInfo == otherObj.roleInfo) && (this.imageAccessInformation != null ? this.imageAccessInformation.equals(otherObj.imageAccessInformation) : this.imageAccessInformation == otherObj.imageAccessInformation) && (this.journal != null ? this.journal.equals(otherObj.journal) : this.journal == otherObj.journal) && (this.hasPhoenixDevices == otherObj.hasPhoenixDevices) && (this.groupCopySplitters != null ? this.groupCopySplitters.equals(otherObj.groupCopySplitters) : this.groupCopySplitters == otherObj.groupCopySplitters);
    }


    public int hashCode() {
        return (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.enabled ? 1 : 0) ^ (this.policy != null ? this.policy.hashCode() : 0) ^ (this.roleInfo != null ? this.roleInfo.hashCode() : 0) ^ (this.imageAccessInformation != null ? this.imageAccessInformation.hashCode() : 0) ^ (this.journal != null ? this.journal.hashCode() : 0) ^ (this.hasPhoenixDevices ? 1 : 0) ^ (this.groupCopySplitters != null ? this.groupCopySplitters.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupCopySettings [copyUID=" + this.copyUID + ", " + "name=" + this.name + ", " + "enabled=" + this.enabled + ", " + "policy=" + this.policy + ", " + "roleInfo=" + this.roleInfo + ", " + "imageAccessInformation=" + this.imageAccessInformation + ", " + "journal=" + this.journal + ", " + "hasPhoenixDevices=" + this.hasPhoenixDevices + ", " + "groupCopySplitters=" + this.groupCopySplitters + "]";
    }
}


