package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportUID", propOrder = {"id", "groupUID"})
public class ReportUID {
    protected long id;
    @XmlElement(required = true)
    protected ConsistencyGroupUID groupUID;

    public ReportUID() {
    }

    public ReportUID(long id, ConsistencyGroupUID groupUID) {
        this.id = id;
        this.groupUID = groupUID;
    }


    public long getId() {
        return this.id;
    }


    public void setId(long value) {
        this.id = value;
    }


    public ConsistencyGroupUID getGroupUID() {
        return this.groupUID;
    }


    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ReportUID)) {
            return false;
        }
        ReportUID otherObj = (ReportUID) obj;

        return (this.id == otherObj.id) && (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID);
    }


    public int hashCode() {
        return (int) this.id ^ (this.groupUID != null ? this.groupUID.hashCode() : 0);
    }


    public String toString() {
        return "ReportUID [id=" + this.id + ", " + "groupUID=" + this.groupUID + "]";
    }
}


