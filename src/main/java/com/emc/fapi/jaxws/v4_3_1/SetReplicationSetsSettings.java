package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setReplicationSetsSettings", propOrder = {"group", "replicationSetsChanges"})
public class SetReplicationSetsSettings {
    protected ConsistencyGroupUID group;
    protected List<ReplicationSetSettingsChangesParam> replicationSetsChanges;

    public SetReplicationSetsSettings() {
    }

    public SetReplicationSetsSettings(ConsistencyGroupUID group, List<ReplicationSetSettingsChangesParam> replicationSetsChanges) {
        this.group = group;
        this.replicationSetsChanges = replicationSetsChanges;
    }


    public ConsistencyGroupUID getGroup() {
        return this.group;
    }


    public void setGroup(ConsistencyGroupUID value) {
        this.group = value;
    }


    public List<ReplicationSetSettingsChangesParam> getReplicationSetsChanges() {
        if (this.replicationSetsChanges == null) {
            this.replicationSetsChanges = new ArrayList();
        }
        return this.replicationSetsChanges;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetReplicationSetsSettings)) {
            return false;
        }
        SetReplicationSetsSettings otherObj = (SetReplicationSetsSettings) obj;

        return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.replicationSetsChanges != null ? this.replicationSetsChanges.equals(otherObj.replicationSetsChanges) : this.replicationSetsChanges == otherObj.replicationSetsChanges);
    }


    public int hashCode() {
        return (this.group != null ? this.group.hashCode() : 0) ^ (this.replicationSetsChanges != null ? this.replicationSetsChanges.hashCode() : 0);
    }


    public String toString() {
        return "SetReplicationSetsSettings [group=" + this.group + ", " + "replicationSetsChanges=" + this.replicationSetsChanges + "]";
    }
}


