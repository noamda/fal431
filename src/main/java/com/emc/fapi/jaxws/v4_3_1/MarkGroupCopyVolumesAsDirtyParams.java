package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "markGroupCopyVolumesAsDirtyParams", propOrder = {"replicationSets"})
public class MarkGroupCopyVolumesAsDirtyParams {
    @XmlElement(nillable = true)
    protected List<ReplicationSetUID> replicationSets;

    public MarkGroupCopyVolumesAsDirtyParams() {
    }

    public MarkGroupCopyVolumesAsDirtyParams(List<ReplicationSetUID> replicationSets) {
        this.replicationSets = replicationSets;
    }


    public List<ReplicationSetUID> getReplicationSets() {
        if (this.replicationSets == null) {
            this.replicationSets = new ArrayList();
        }
        return this.replicationSets;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof MarkGroupCopyVolumesAsDirtyParams)) {
            return false;
        }
        MarkGroupCopyVolumesAsDirtyParams otherObj = (MarkGroupCopyVolumesAsDirtyParams) obj;

        return this.replicationSets == otherObj.replicationSets ? true : this.replicationSets != null ? this.replicationSets.equals(otherObj.replicationSets) : false;
    }


    public int hashCode() {
        return this.replicationSets != null ? this.replicationSets.hashCode() : 0;
    }


    public String toString() {
        return "MarkGroupCopyVolumesAsDirtyParams [replicationSets=" + this.replicationSets + "]";
    }
}


