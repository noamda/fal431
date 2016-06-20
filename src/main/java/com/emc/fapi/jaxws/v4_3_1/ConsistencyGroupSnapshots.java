package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupSnapshots", propOrder = {"copiesSnapshots", "groupUID"})
public class ConsistencyGroupSnapshots {
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopySnapshots> copiesSnapshots;
    protected ConsistencyGroupUID groupUID;

    public ConsistencyGroupSnapshots() {
    }

    public ConsistencyGroupSnapshots(List<ConsistencyGroupCopySnapshots> copiesSnapshots, ConsistencyGroupUID groupUID) {
        this.copiesSnapshots = copiesSnapshots;
        this.groupUID = groupUID;
    }


    public List<ConsistencyGroupCopySnapshots> getCopiesSnapshots() {
        if (this.copiesSnapshots == null) {
            this.copiesSnapshots = new ArrayList();
        }
        return this.copiesSnapshots;
    }


    public ConsistencyGroupUID getGroupUID() {
        return this.groupUID;
    }


    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupSnapshots)) {
            return false;
        }
        ConsistencyGroupSnapshots otherObj = (ConsistencyGroupSnapshots) obj;

        return (this.copiesSnapshots != null ? this.copiesSnapshots.equals(otherObj.copiesSnapshots) : this.copiesSnapshots == otherObj.copiesSnapshots) && (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID);
    }


    public int hashCode() {
        return (this.copiesSnapshots != null ? this.copiesSnapshots.hashCode() : 0) ^ (this.groupUID != null ? this.groupUID.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupSnapshots [copiesSnapshots=" + this.copiesSnapshots + ", " + "groupUID=" + this.groupUID + "]";
    }
}


