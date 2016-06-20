package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "markGroupVolumesAsDirtyParams", propOrder = {"replicationSets"})
public class MarkGroupVolumesAsDirtyParams {
    @XmlElement(nillable = true)
    protected List<ReplicationSetUID> replicationSets;

    public MarkGroupVolumesAsDirtyParams() {
    }

    public MarkGroupVolumesAsDirtyParams(List<ReplicationSetUID> replicationSets) {
        this.replicationSets = replicationSets;
    }


    public List<ReplicationSetUID> getReplicationSets() {
        if (this.replicationSets == null) {
            this.replicationSets = new ArrayList();
        }
        return this.replicationSets;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof MarkGroupVolumesAsDirtyParams)) {
            return false;
        }
        MarkGroupVolumesAsDirtyParams otherObj = (MarkGroupVolumesAsDirtyParams) obj;

        return this.replicationSets == otherObj.replicationSets ? true : this.replicationSets != null ? this.replicationSets.equals(otherObj.replicationSets) : false;
    }


    public int hashCode() {
        return this.replicationSets != null ? this.replicationSets.hashCode() : 0;
    }


    public String toString() {
        return "MarkGroupVolumesAsDirtyParams [replicationSets=" + this.replicationSets + "]";
    }
}


