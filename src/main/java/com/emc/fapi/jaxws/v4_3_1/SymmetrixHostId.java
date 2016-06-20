package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymmetrixHostId", propOrder = {"rpaUID", "hostId"})
public class SymmetrixHostId {
    @XmlElement(nillable = true)
    protected RpaUID rpaUID;
    protected String hostId;

    public SymmetrixHostId() {
    }

    public SymmetrixHostId(RpaUID rpaUID, String hostId) {
        this.rpaUID = rpaUID;
        this.hostId = hostId;
    }


    public RpaUID getRpaUID() {
        return this.rpaUID;
    }


    public void setRpaUID(RpaUID value) {
        this.rpaUID = value;
    }


    public String getHostId() {
        return this.hostId;
    }


    public void setHostId(String value) {
        this.hostId = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SymmetrixHostId)) {
            return false;
        }
        SymmetrixHostId otherObj = (SymmetrixHostId) obj;

        return (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.hostId != null ? this.hostId.equals(otherObj.hostId) : this.hostId == otherObj.hostId);
    }


    public int hashCode() {
        return (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ (this.hostId != null ? this.hostId.hashCode() : 0);
    }


    public String toString() {
        return "SymmetrixHostId [rpaUID=" + this.rpaUID + ", " + "hostId=" + this.hostId + "]";
    }
}


