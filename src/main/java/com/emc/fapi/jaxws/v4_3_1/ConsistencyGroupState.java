package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupState", propOrder = {"groupUID", "enabled", "sourceCopiesUIDs", "groupCopiesState", "linksState", "runningAsDistributedGroup", "stateUnknown", "vplexMetroLinkState"})
public class ConsistencyGroupState {
    protected ConsistencyGroupUID groupUID;
    protected boolean enabled;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyUID> sourceCopiesUIDs;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyState> groupCopiesState;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupLinkState> linksState;
    protected boolean runningAsDistributedGroup;
    protected boolean stateUnknown;
    @XmlElement(nillable = true)
    protected VplexMetroLinkState vplexMetroLinkState;

    public ConsistencyGroupState() {
    }

    public ConsistencyGroupState(ConsistencyGroupUID groupUID, boolean enabled, List<ConsistencyGroupCopyUID> sourceCopiesUIDs, List<ConsistencyGroupCopyState> groupCopiesState, List<ConsistencyGroupLinkState> linksState, boolean runningAsDistributedGroup, boolean stateUnknown, VplexMetroLinkState vplexMetroLinkState) {
        this.groupUID = groupUID;
        this.enabled = enabled;
        this.sourceCopiesUIDs = sourceCopiesUIDs;
        this.groupCopiesState = groupCopiesState;
        this.linksState = linksState;
        this.runningAsDistributedGroup = runningAsDistributedGroup;
        this.stateUnknown = stateUnknown;
        this.vplexMetroLinkState = vplexMetroLinkState;
    }


    public ConsistencyGroupUID getGroupUID() {
        return this.groupUID;
    }


    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }


    public boolean isEnabled() {
        return this.enabled;
    }


    public void setEnabled(boolean value) {
        this.enabled = value;
    }


    public List<ConsistencyGroupCopyUID> getSourceCopiesUIDs() {
        if (this.sourceCopiesUIDs == null) {
            this.sourceCopiesUIDs = new ArrayList();
        }
        return this.sourceCopiesUIDs;
    }


    public List<ConsistencyGroupCopyState> getGroupCopiesState() {
        if (this.groupCopiesState == null) {
            this.groupCopiesState = new ArrayList();
        }
        return this.groupCopiesState;
    }


    public List<ConsistencyGroupLinkState> getLinksState() {
        if (this.linksState == null) {
            this.linksState = new ArrayList();
        }
        return this.linksState;
    }


    public boolean isRunningAsDistributedGroup() {
        return this.runningAsDistributedGroup;
    }


    public void setRunningAsDistributedGroup(boolean value) {
        this.runningAsDistributedGroup = value;
    }


    public boolean isStateUnknown() {
        return this.stateUnknown;
    }


    public void setStateUnknown(boolean value) {
        this.stateUnknown = value;
    }


    public VplexMetroLinkState getVplexMetroLinkState() {
        return this.vplexMetroLinkState;
    }


    public void setVplexMetroLinkState(VplexMetroLinkState value) {
        this.vplexMetroLinkState = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupState)) {
            return false;
        }
        ConsistencyGroupState otherObj = (ConsistencyGroupState) obj;

        return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.enabled == otherObj.enabled) && (this.sourceCopiesUIDs != null ? this.sourceCopiesUIDs.equals(otherObj.sourceCopiesUIDs) : this.sourceCopiesUIDs == otherObj.sourceCopiesUIDs) && (this.groupCopiesState != null ? this.groupCopiesState.equals(otherObj.groupCopiesState) : this.groupCopiesState == otherObj.groupCopiesState) && (this.linksState != null ? this.linksState.equals(otherObj.linksState) : this.linksState == otherObj.linksState) && (this.runningAsDistributedGroup == otherObj.runningAsDistributedGroup) && (this.stateUnknown == otherObj.stateUnknown) && (this.vplexMetroLinkState != null ? this.vplexMetroLinkState.equals(otherObj.vplexMetroLinkState) : this.vplexMetroLinkState == otherObj.vplexMetroLinkState);
    }


    public int hashCode() {
        return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.enabled ? 1 : 0) ^ (this.sourceCopiesUIDs != null ? this.sourceCopiesUIDs.hashCode() : 0) ^ (this.groupCopiesState != null ? this.groupCopiesState.hashCode() : 0) ^ (this.linksState != null ? this.linksState.hashCode() : 0) ^ (this.runningAsDistributedGroup ? 1 : 0) ^ (this.stateUnknown ? 1 : 0) ^ (this.vplexMetroLinkState != null ? this.vplexMetroLinkState.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupState [groupUID=" + this.groupUID + ", " + "enabled=" + this.enabled + ", " + "sourceCopiesUIDs=" + this.sourceCopiesUIDs + ", " + "groupCopiesState=" + this.groupCopiesState + ", " + "linksState=" + this.linksState + ", " + "runningAsDistributedGroup=" + this.runningAsDistributedGroup + ", " + "stateUnknown=" + this.stateUnknown + ", " + "vplexMetroLinkState=" + this.vplexMetroLinkState + "]";
    }
}


