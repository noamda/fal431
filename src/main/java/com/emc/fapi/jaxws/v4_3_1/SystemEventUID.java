package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemEventUID", propOrder = {"uniqueId"})
public class SystemEventUID {
    protected long uniqueId;

    public SystemEventUID() {
    }

    public SystemEventUID(long uniqueId) {
        this.uniqueId = uniqueId;
    }


    public long getUniqueId() {
        return this.uniqueId;
    }


    public void setUniqueId(long value) {
        this.uniqueId = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SystemEventUID)) {
            return false;
        }
        SystemEventUID otherObj = (SystemEventUID) obj;

        return this.uniqueId == otherObj.uniqueId;
    }


    public int hashCode() {
        return (int) this.uniqueId;
    }


    public String toString() {
        return "SystemEventUID [uniqueId=" + this.uniqueId + "]";
    }
}


