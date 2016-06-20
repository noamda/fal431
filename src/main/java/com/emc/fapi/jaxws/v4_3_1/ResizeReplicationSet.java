package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resizeReplicationSet", propOrder = {"replicationSet", "resizeReplicationSetParam"})
public class ResizeReplicationSet {
    protected ReplicationSetUID replicationSet;
    @XmlElement(nillable = true)
    protected ResizeReplicationSetParam resizeReplicationSetParam;

    public ResizeReplicationSet() {
    }

    public ResizeReplicationSet(ReplicationSetUID replicationSet, ResizeReplicationSetParam resizeReplicationSetParam) {
        this.replicationSet = replicationSet;
        this.resizeReplicationSetParam = resizeReplicationSetParam;
    }


    public ReplicationSetUID getReplicationSet() {
        return this.replicationSet;
    }


    public void setReplicationSet(ReplicationSetUID value) {
        this.replicationSet = value;
    }


    public ResizeReplicationSetParam getResizeReplicationSetParam() {
        return this.resizeReplicationSetParam;
    }


    public void setResizeReplicationSetParam(ResizeReplicationSetParam value) {
        this.resizeReplicationSetParam = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ResizeReplicationSet)) {
            return false;
        }
        ResizeReplicationSet otherObj = (ResizeReplicationSet) obj;

        return (this.replicationSet != null ? this.replicationSet.equals(otherObj.replicationSet) : this.replicationSet == otherObj.replicationSet) && (this.resizeReplicationSetParam != null ? this.resizeReplicationSetParam.equals(otherObj.resizeReplicationSetParam) : this.resizeReplicationSetParam == otherObj.resizeReplicationSetParam);
    }


    public int hashCode() {
        return (this.replicationSet != null ? this.replicationSet.hashCode() : 0) ^ (this.resizeReplicationSetParam != null ? this.resizeReplicationSetParam.hashCode() : 0);
    }


    public String toString() {
        return "ResizeReplicationSet [replicationSet=" + this.replicationSet + ", " + "resizeReplicationSetParam=" + this.resizeReplicationSetParam + "]";
    }
}


