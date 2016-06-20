package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupSetSettings", propOrder = {"setUID", "name", "groupsUIDs", "recoverySettings", "consistencyPolicy"})
public class ConsistencyGroupSetSettings {
    @XmlElement(required = true)
    protected ConsistencyGroupSetUID setUID;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupUID> groupsUIDs;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupSetRecoverySettings> recoverySettings;
    protected ConsistentGroupSetConsistencyPolicy consistencyPolicy;

    public ConsistencyGroupSetSettings() {
    }

    public ConsistencyGroupSetSettings(ConsistencyGroupSetUID setUID, String name, List<ConsistencyGroupUID> groupsUIDs, List<ConsistencyGroupSetRecoverySettings> recoverySettings, ConsistentGroupSetConsistencyPolicy consistencyPolicy) {
        this.setUID = setUID;
        this.name = name;
        this.groupsUIDs = groupsUIDs;
        this.recoverySettings = recoverySettings;
        this.consistencyPolicy = consistencyPolicy;
    }


    public ConsistencyGroupSetUID getSetUID() {
        return this.setUID;
    }


    public void setSetUID(ConsistencyGroupSetUID value) {
        this.setUID = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public List<ConsistencyGroupUID> getGroupsUIDs() {
        if (this.groupsUIDs == null) {
            this.groupsUIDs = new ArrayList();
        }
        return this.groupsUIDs;
    }


    public List<ConsistencyGroupSetRecoverySettings> getRecoverySettings() {
        if (this.recoverySettings == null) {
            this.recoverySettings = new ArrayList();
        }
        return this.recoverySettings;
    }


    public ConsistentGroupSetConsistencyPolicy getConsistencyPolicy() {
        return this.consistencyPolicy;
    }


    public void setConsistencyPolicy(ConsistentGroupSetConsistencyPolicy value) {
        this.consistencyPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupSetSettings)) {
            return false;
        }
        ConsistencyGroupSetSettings otherObj = (ConsistencyGroupSetSettings) obj;

        return (this.setUID != null ? this.setUID.equals(otherObj.setUID) : this.setUID == otherObj.setUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.groupsUIDs != null ? this.groupsUIDs.equals(otherObj.groupsUIDs) : this.groupsUIDs == otherObj.groupsUIDs) && (this.recoverySettings != null ? this.recoverySettings.equals(otherObj.recoverySettings) : this.recoverySettings == otherObj.recoverySettings) && (this.consistencyPolicy != null ? this.consistencyPolicy.equals(otherObj.consistencyPolicy) : this.consistencyPolicy == otherObj.consistencyPolicy);
    }


    public int hashCode() {
        return (this.setUID != null ? this.setUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.groupsUIDs != null ? this.groupsUIDs.hashCode() : 0) ^ (this.recoverySettings != null ? this.recoverySettings.hashCode() : 0) ^ (this.consistencyPolicy != null ? this.consistencyPolicy.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupSetSettings [setUID=" + this.setUID + ", " + "name=" + this.name + ", " + "groupsUIDs=" + this.groupsUIDs + ", " + "recoverySettings=" + this.recoverySettings + ", " + "consistencyPolicy=" + this.consistencyPolicy + "]";
    }
}


