package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualResourcePoolUUID", propOrder = {"uuid"})
public class VirtualResourcePoolUUID {
    @XmlElement(required = true)
    protected String uuid;

    public VirtualResourcePoolUUID() {
    }

    public VirtualResourcePoolUUID(String uuid) {
        this.uuid = uuid;
    }


    public String getUuid() {
        return this.uuid;
    }


    public void setUuid(String value) {
        this.uuid = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualResourcePoolUUID)) {
            return false;
        }
        VirtualResourcePoolUUID otherObj = (VirtualResourcePoolUUID) obj;

        return this.uuid == otherObj.uuid ? true : this.uuid != null ? this.uuid.equals(otherObj.uuid) : false;
    }


    public int hashCode() {
        return this.uuid != null ? this.uuid.hashCode() : 0;
    }


    public String toString() {
        return "VirtualResourcePoolUUID [uuid=" + this.uuid + "]";
    }
}


