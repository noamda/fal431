package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualCenterUID", propOrder = {"uuid"})
public class VirtualCenterUID {
    @XmlElement(required = true)
    protected String uuid;

    public VirtualCenterUID() {
    }

    public VirtualCenterUID(String uuid) {
        this.uuid = uuid;
    }


    public String getUuid() {
        return this.uuid;
    }


    public void setUuid(String value) {
        this.uuid = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualCenterUID)) {
            return false;
        }
        VirtualCenterUID otherObj = (VirtualCenterUID) obj;

        return this.uuid == otherObj.uuid ? true : this.uuid != null ? this.uuid.equals(otherObj.uuid) : false;
    }


    public int hashCode() {
        return this.uuid != null ? this.uuid.hashCode() : 0;
    }


    public String toString() {
        return "VirtualCenterUID [uuid=" + this.uuid + "]";
    }
}


