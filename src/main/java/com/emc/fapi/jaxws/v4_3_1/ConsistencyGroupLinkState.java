package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupLinkState", propOrder = {"groupLinkUID", "pipeState", "transferErrorReason", "inSyncMode", "stateUnknown"})
public class ConsistencyGroupLinkState {
    protected ConsistencyGroupLinkUID groupLinkUID;
    @XmlElement(nillable = true)
    protected PipeState pipeState;
    protected String transferErrorReason;
    protected boolean inSyncMode;
    protected boolean stateUnknown;

    public ConsistencyGroupLinkState() {
    }

    public ConsistencyGroupLinkState(ConsistencyGroupLinkUID groupLinkUID, PipeState pipeState, String transferErrorReason, boolean inSyncMode, boolean stateUnknown) {
        this.groupLinkUID = groupLinkUID;
        this.pipeState = pipeState;
        this.transferErrorReason = transferErrorReason;
        this.inSyncMode = inSyncMode;
        this.stateUnknown = stateUnknown;
    }


    public ConsistencyGroupLinkUID getGroupLinkUID() {
        return this.groupLinkUID;
    }


    public void setGroupLinkUID(ConsistencyGroupLinkUID value) {
        this.groupLinkUID = value;
    }


    public PipeState getPipeState() {
        return this.pipeState;
    }


    public void setPipeState(PipeState value) {
        this.pipeState = value;
    }


    public String getTransferErrorReason() {
        return this.transferErrorReason;
    }


    public void setTransferErrorReason(String value) {
        this.transferErrorReason = value;
    }


    public boolean isInSyncMode() {
        return this.inSyncMode;
    }


    public void setInSyncMode(boolean value) {
        this.inSyncMode = value;
    }


    public boolean isStateUnknown() {
        return this.stateUnknown;
    }


    public void setStateUnknown(boolean value) {
        this.stateUnknown = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupLinkState)) {
            return false;
        }
        ConsistencyGroupLinkState otherObj = (ConsistencyGroupLinkState) obj;

        return (this.groupLinkUID != null ? this.groupLinkUID.equals(otherObj.groupLinkUID) : this.groupLinkUID == otherObj.groupLinkUID) && (this.pipeState != null ? this.pipeState.equals(otherObj.pipeState) : this.pipeState == otherObj.pipeState) && (this.transferErrorReason != null ? this.transferErrorReason.equals(otherObj.transferErrorReason) : this.transferErrorReason == otherObj.transferErrorReason) && (this.inSyncMode == otherObj.inSyncMode) && (this.stateUnknown == otherObj.stateUnknown);
    }


    public int hashCode() {
        return (this.groupLinkUID != null ? this.groupLinkUID.hashCode() : 0) ^ (this.pipeState != null ? this.pipeState.hashCode() : 0) ^ (this.transferErrorReason != null ? this.transferErrorReason.hashCode() : 0) ^ (this.inSyncMode ? 1 : 0) ^ (this.stateUnknown ? 1 : 0);
    }


    public String toString() {
        return "ConsistencyGroupLinkState [groupLinkUID=" + this.groupLinkUID + ", " + "pipeState=" + this.pipeState + ", " + "transferErrorReason=" + this.transferErrorReason + ", " + "inSyncMode=" + this.inSyncMode + ", " + "stateUnknown=" + this.stateUnknown + "]";
    }
}


