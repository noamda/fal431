package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "markGroupCopyVolumesAsDirty", propOrder = {"groupCopy", "replicationSets"})
public class MarkGroupCopyVolumesAsDirty {
    protected ConsistencyGroupCopyUID groupCopy;
    protected List<ReplicationSetUID> replicationSets;

    public MarkGroupCopyVolumesAsDirty() {
    }

    public MarkGroupCopyVolumesAsDirty(ConsistencyGroupCopyUID groupCopy, List<ReplicationSetUID> replicationSets) {
        this.groupCopy = groupCopy;
        this.replicationSets = replicationSets;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public List<ReplicationSetUID> getReplicationSets() {
        if (this.replicationSets == null) {
            this.replicationSets = new ArrayList();
        }
        return this.replicationSets;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof MarkGroupCopyVolumesAsDirty)) {
            return false;
        }
        MarkGroupCopyVolumesAsDirty otherObj = (MarkGroupCopyVolumesAsDirty) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.replicationSets != null ? this.replicationSets.equals(otherObj.replicationSets) : this.replicationSets == otherObj.replicationSets);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.replicationSets != null ? this.replicationSets.hashCode() : 0);
    }


    public String toString() {
        return "MarkGroupCopyVolumesAsDirty [groupCopy=" + this.groupCopy + ", " + "replicationSets=" + this.replicationSets + "]";
    }
}


