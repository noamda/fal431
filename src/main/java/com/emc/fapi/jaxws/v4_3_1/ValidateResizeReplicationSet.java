package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateResizeReplicationSet", propOrder = {"replicationSet", "resizeReplicationSetParam"})
public class ValidateResizeReplicationSet {
    protected ReplicationSetUID replicationSet;
    @XmlElement(nillable = true)
    protected ResizeReplicationSetParam resizeReplicationSetParam;

    public ValidateResizeReplicationSet() {
    }

    public ValidateResizeReplicationSet(ReplicationSetUID replicationSet, ResizeReplicationSetParam resizeReplicationSetParam) {
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
        if (!(obj instanceof ValidateResizeReplicationSet)) {
            return false;
        }
        ValidateResizeReplicationSet otherObj = (ValidateResizeReplicationSet) obj;

        return (this.replicationSet != null ? this.replicationSet.equals(otherObj.replicationSet) : this.replicationSet == otherObj.replicationSet) && (this.resizeReplicationSetParam != null ? this.resizeReplicationSetParam.equals(otherObj.resizeReplicationSetParam) : this.resizeReplicationSetParam == otherObj.resizeReplicationSetParam);
    }


    public int hashCode() {
        return (this.replicationSet != null ? this.replicationSet.hashCode() : 0) ^ (this.resizeReplicationSetParam != null ? this.resizeReplicationSetParam.hashCode() : 0);
    }


    public String toString() {
        return "ValidateResizeReplicationSet [replicationSet=" + this.replicationSet + ", " + "resizeReplicationSetParam=" + this.resizeReplicationSetParam + "]";
    }
}


