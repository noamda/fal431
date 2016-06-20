package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "markGroupVolumesAsDirty", propOrder = {"group", "replicationSets"})
public class MarkGroupVolumesAsDirty {
    protected ConsistencyGroupUID group;
    protected List<ReplicationSetUID> replicationSets;

    public MarkGroupVolumesAsDirty() {
    }

    public MarkGroupVolumesAsDirty(ConsistencyGroupUID group, List<ReplicationSetUID> replicationSets) {
        this.group = group;
        this.replicationSets = replicationSets;
    }


    public ConsistencyGroupUID getGroup() {
        return this.group;
    }


    public void setGroup(ConsistencyGroupUID value) {
        this.group = value;
    }


    public List<ReplicationSetUID> getReplicationSets() {
        if (this.replicationSets == null) {
            this.replicationSets = new ArrayList();
        }
        return this.replicationSets;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof MarkGroupVolumesAsDirty)) {
            return false;
        }
        MarkGroupVolumesAsDirty otherObj = (MarkGroupVolumesAsDirty) obj;

        return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.replicationSets != null ? this.replicationSets.equals(otherObj.replicationSets) : this.replicationSets == otherObj.replicationSets);
    }


    public int hashCode() {
        return (this.group != null ? this.group.hashCode() : 0) ^ (this.replicationSets != null ? this.replicationSets.hashCode() : 0);
    }


    public String toString() {
        return "MarkGroupVolumesAsDirty [group=" + this.group + ", " + "replicationSets=" + this.replicationSets + "]";
    }
}


