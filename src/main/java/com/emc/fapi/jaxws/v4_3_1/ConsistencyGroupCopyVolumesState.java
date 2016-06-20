package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopyVolumesState", propOrder = {"copyUID", "journalsState"})
public class ConsistencyGroupCopyVolumesState {
    protected ConsistencyGroupCopyUID copyUID;
    @XmlElement(nillable = true)
    protected List<JournalVolumeState> journalsState;

    public ConsistencyGroupCopyVolumesState() {
    }

    public ConsistencyGroupCopyVolumesState(ConsistencyGroupCopyUID copyUID, List<JournalVolumeState> journalsState) {
        this.copyUID = copyUID;
        this.journalsState = journalsState;
    }


    public ConsistencyGroupCopyUID getCopyUID() {
        return this.copyUID;
    }


    public void setCopyUID(ConsistencyGroupCopyUID value) {
        this.copyUID = value;
    }


    public List<JournalVolumeState> getJournalsState() {
        if (this.journalsState == null) {
            this.journalsState = new ArrayList();
        }
        return this.journalsState;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopyVolumesState)) {
            return false;
        }
        ConsistencyGroupCopyVolumesState otherObj = (ConsistencyGroupCopyVolumesState) obj;

        return (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.journalsState != null ? this.journalsState.equals(otherObj.journalsState) : this.journalsState == otherObj.journalsState);
    }


    public int hashCode() {
        return (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.journalsState != null ? this.journalsState.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupCopyVolumesState [copyUID=" + this.copyUID + ", " + "journalsState=" + this.journalsState + "]";
    }
}


