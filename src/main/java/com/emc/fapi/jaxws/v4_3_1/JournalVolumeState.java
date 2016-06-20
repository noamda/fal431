package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("JournalVolumeState")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalVolumeState", propOrder = {"groupCopyUID"})
public class JournalVolumeState
        extends VolumeState {
    protected ConsistencyGroupCopyUID groupCopyUID;

    public JournalVolumeState() {
    }

    public JournalVolumeState(ConsistencyGroupCopyUID groupCopyUID) {
        this.groupCopyUID = groupCopyUID;
    }


    public ConsistencyGroupCopyUID getGroupCopyUID() {
        return this.groupCopyUID;
    }


    public void setGroupCopyUID(ConsistencyGroupCopyUID value) {
        this.groupCopyUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof JournalVolumeState)) {
            return false;
        }
        JournalVolumeState otherObj = (JournalVolumeState) obj;

        return (super.equals(obj)) && (this.groupCopyUID != null ? this.groupCopyUID.equals(otherObj.groupCopyUID) : this.groupCopyUID == otherObj.groupCopyUID);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.groupCopyUID != null ? this.groupCopyUID.hashCode() : 0);
    }


    public String toString() {
        return "JournalVolumeState [super=" + super.toString() + ", " + "groupCopyUID=" + this.groupCopyUID + "]";
    }
}


