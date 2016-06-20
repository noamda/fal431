package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopyUID", propOrder = {"groupUID", "globalCopyUID"})
public class ConsistencyGroupCopyUID {
    @XmlElement(required = true)
    protected ConsistencyGroupUID groupUID;
    @XmlElement(required = true, nillable = true)
    protected GlobalCopyUID globalCopyUID;

    public ConsistencyGroupCopyUID() {
    }

    public ConsistencyGroupCopyUID(ConsistencyGroupUID groupUID, GlobalCopyUID globalCopyUID) {
        this.groupUID = groupUID;
        this.globalCopyUID = globalCopyUID;
    }


    public ConsistencyGroupUID getGroupUID() {
        return this.groupUID;
    }


    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }


    public GlobalCopyUID getGlobalCopyUID() {
        return this.globalCopyUID;
    }


    public void setGlobalCopyUID(GlobalCopyUID value) {
        this.globalCopyUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopyUID)) {
            return false;
        }
        ConsistencyGroupCopyUID otherObj = (ConsistencyGroupCopyUID) obj;

        return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.globalCopyUID != null ? this.globalCopyUID.equals(otherObj.globalCopyUID) : this.globalCopyUID == otherObj.globalCopyUID);
    }


    public int hashCode() {
        return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.globalCopyUID != null ? this.globalCopyUID.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupCopyUID [groupUID=" + this.groupUID + ", " + "globalCopyUID=" + this.globalCopyUID + "]";
    }
}


