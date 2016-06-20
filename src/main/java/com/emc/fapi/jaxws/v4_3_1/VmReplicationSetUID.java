package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmReplicationSetUID", propOrder = {"uid"})
public class VmReplicationSetUID {
    protected long uid;

    public VmReplicationSetUID() {
    }

    public VmReplicationSetUID(long uid) {
        this.uid = uid;
    }


    public long getUid() {
        return this.uid;
    }


    public void setUid(long value) {
        this.uid = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmReplicationSetUID)) {
            return false;
        }
        VmReplicationSetUID otherObj = (VmReplicationSetUID) obj;

        return this.uid == otherObj.uid;
    }


    public int hashCode() {
        return (int) this.uid;
    }


    public String toString() {
        return "VmReplicationSetUID [uid=" + this.uid + "]";
    }
}


