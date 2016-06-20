package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupVolumesState", propOrder = {"copiesVolumesState", "groupUID", "replicationSetsVolumesState"})
public class ConsistencyGroupVolumesState {
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyVolumesState> copiesVolumesState;
    protected ConsistencyGroupUID groupUID;
    @XmlElement(nillable = true)
    protected List<ReplicationSetVolumesState> replicationSetsVolumesState;

    public ConsistencyGroupVolumesState() {
    }

    public ConsistencyGroupVolumesState(List<ConsistencyGroupCopyVolumesState> copiesVolumesState, ConsistencyGroupUID groupUID, List<ReplicationSetVolumesState> replicationSetsVolumesState) {
        this.copiesVolumesState = copiesVolumesState;
        this.groupUID = groupUID;
        this.replicationSetsVolumesState = replicationSetsVolumesState;
    }


    public List<ConsistencyGroupCopyVolumesState> getCopiesVolumesState() {
        if (this.copiesVolumesState == null) {
            this.copiesVolumesState = new ArrayList();
        }
        return this.copiesVolumesState;
    }


    public ConsistencyGroupUID getGroupUID() {
        return this.groupUID;
    }


    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }


    public List<ReplicationSetVolumesState> getReplicationSetsVolumesState() {
        if (this.replicationSetsVolumesState == null) {
            this.replicationSetsVolumesState = new ArrayList();
        }
        return this.replicationSetsVolumesState;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupVolumesState)) {
            return false;
        }
        ConsistencyGroupVolumesState otherObj = (ConsistencyGroupVolumesState) obj;

        return (this.copiesVolumesState != null ? this.copiesVolumesState.equals(otherObj.copiesVolumesState) : this.copiesVolumesState == otherObj.copiesVolumesState) && (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.replicationSetsVolumesState != null ? this.replicationSetsVolumesState.equals(otherObj.replicationSetsVolumesState) : this.replicationSetsVolumesState == otherObj.replicationSetsVolumesState);
    }


    public int hashCode() {
        return (this.copiesVolumesState != null ? this.copiesVolumesState.hashCode() : 0) ^ (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.replicationSetsVolumesState != null ? this.replicationSetsVolumesState.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupVolumesState [copiesVolumesState=" + this.copiesVolumesState + ", " + "groupUID=" + this.groupUID + ", " + "replicationSetsVolumesState=" + this.replicationSetsVolumesState + "]";
    }
}


