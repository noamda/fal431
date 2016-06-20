package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationSetUID", propOrder = {"groupUID", "id"})
public class ReplicationSetUID {
    @XmlElement(required = true)
    protected ConsistencyGroupUID groupUID;
    protected long id;

    public ReplicationSetUID() {
    }

    public ReplicationSetUID(ConsistencyGroupUID groupUID, long id) {
        this.groupUID = groupUID;
        this.id = id;
    }


    public ConsistencyGroupUID getGroupUID() {
        return this.groupUID;
    }


    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }


    public long getId() {
        return this.id;
    }


    public void setId(long value) {
        this.id = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ReplicationSetUID)) {
            return false;
        }
        ReplicationSetUID otherObj = (ReplicationSetUID) obj;

        return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.id == otherObj.id);
    }


    public int hashCode() {
        return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (int) this.id;
    }


    public String toString() {
        return "ReplicationSetUID [groupUID=" + this.groupUID + ", " + "id=" + this.id + "]";
    }
}


