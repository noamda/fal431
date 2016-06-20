package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@JsonTypeName("ConsistencyGroupSetRecoveryActivity")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupSetRecoveryActivity", propOrder = {"consistencyGroupSetUID", "groupSetName", "clusterUID", "numOfGroupsInImageAccess", "numOfGroups", "consistencyGroupSetTransferState", "copiesRecoveryActivities", "copyToResumeProduction"})
public class ConsistencyGroupSetRecoveryActivity
        extends BaseRecoveryActivity {
    @XmlElement(nillable = true)
    protected ConsistencyGroupSetUID consistencyGroupSetUID;
    protected String groupSetName;
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    protected int numOfGroupsInImageAccess;
    protected int numOfGroups;
    protected GroupSetTransferState consistencyGroupSetTransferState;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyRecoveryActivity> copiesRecoveryActivities;
    protected ConsistencyGroupCopyUID copyToResumeProduction;

    public ConsistencyGroupSetRecoveryActivity() {
    }

    public ConsistencyGroupSetRecoveryActivity(ConsistencyGroupSetUID consistencyGroupSetUID, String groupSetName, ClusterUID clusterUID, int numOfGroupsInImageAccess, int numOfGroups, GroupSetTransferState consistencyGroupSetTransferState, List<ConsistencyGroupCopyRecoveryActivity> copiesRecoveryActivities, ConsistencyGroupCopyUID copyToResumeProduction) {
        this.consistencyGroupSetUID = consistencyGroupSetUID;
        this.groupSetName = groupSetName;
        this.clusterUID = clusterUID;
        this.numOfGroupsInImageAccess = numOfGroupsInImageAccess;
        this.numOfGroups = numOfGroups;
        this.consistencyGroupSetTransferState = consistencyGroupSetTransferState;
        this.copiesRecoveryActivities = copiesRecoveryActivities;
        this.copyToResumeProduction = copyToResumeProduction;
    }


    public ConsistencyGroupSetUID getConsistencyGroupSetUID() {
        return this.consistencyGroupSetUID;
    }


    public void setConsistencyGroupSetUID(ConsistencyGroupSetUID value) {
        this.consistencyGroupSetUID = value;
    }


    public String getGroupSetName() {
        return this.groupSetName;
    }


    public void setGroupSetName(String value) {
        this.groupSetName = value;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public int getNumOfGroupsInImageAccess() {
        return this.numOfGroupsInImageAccess;
    }


    public void setNumOfGroupsInImageAccess(int value) {
        this.numOfGroupsInImageAccess = value;
    }


    public int getNumOfGroups() {
        return this.numOfGroups;
    }


    public void setNumOfGroups(int value) {
        this.numOfGroups = value;
    }


    public GroupSetTransferState getConsistencyGroupSetTransferState() {
        return this.consistencyGroupSetTransferState;
    }


    public void setConsistencyGroupSetTransferState(GroupSetTransferState value) {
        this.consistencyGroupSetTransferState = value;
    }


    public List<ConsistencyGroupCopyRecoveryActivity> getCopiesRecoveryActivities() {
        if (this.copiesRecoveryActivities == null) {
            this.copiesRecoveryActivities = new ArrayList();
        }
        return this.copiesRecoveryActivities;
    }


    public ConsistencyGroupCopyUID getCopyToResumeProduction() {
        return this.copyToResumeProduction;
    }


    public void setCopyToResumeProduction(ConsistencyGroupCopyUID value) {
        this.copyToResumeProduction = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupSetRecoveryActivity)) {
            return false;
        }
        ConsistencyGroupSetRecoveryActivity otherObj = (ConsistencyGroupSetRecoveryActivity) obj;

        return (super.equals(obj)) && (this.consistencyGroupSetUID != null ? this.consistencyGroupSetUID.equals(otherObj.consistencyGroupSetUID) : this.consistencyGroupSetUID == otherObj.consistencyGroupSetUID) && (this.groupSetName != null ? this.groupSetName.equals(otherObj.groupSetName) : this.groupSetName == otherObj.groupSetName) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.numOfGroupsInImageAccess == otherObj.numOfGroupsInImageAccess) && (this.numOfGroups == otherObj.numOfGroups) && (this.consistencyGroupSetTransferState != null ? this.consistencyGroupSetTransferState.equals(otherObj.consistencyGroupSetTransferState) : this.consistencyGroupSetTransferState == otherObj.consistencyGroupSetTransferState) && (this.copiesRecoveryActivities != null ? this.copiesRecoveryActivities.equals(otherObj.copiesRecoveryActivities) : this.copiesRecoveryActivities == otherObj.copiesRecoveryActivities) && (this.copyToResumeProduction != null ? this.copyToResumeProduction.equals(otherObj.copyToResumeProduction) : this.copyToResumeProduction == otherObj.copyToResumeProduction);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.consistencyGroupSetUID != null ? this.consistencyGroupSetUID.hashCode() : 0) ^ (this.groupSetName != null ? this.groupSetName.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ this.numOfGroupsInImageAccess ^ this.numOfGroups ^ (this.consistencyGroupSetTransferState != null ? this.consistencyGroupSetTransferState.hashCode() : 0) ^ (this.copiesRecoveryActivities != null ? this.copiesRecoveryActivities.hashCode() : 0) ^ (this.copyToResumeProduction != null ? this.copyToResumeProduction.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupSetRecoveryActivity [super=" + super.toString() + ", " + "consistencyGroupSetUID=" + this.consistencyGroupSetUID + ", " + "groupSetName=" + this.groupSetName + ", " + "clusterUID=" + this.clusterUID + ", " + "numOfGroupsInImageAccess=" + this.numOfGroupsInImageAccess + ", " + "numOfGroups=" + this.numOfGroups + ", " + "consistencyGroupSetTransferState=" + this.consistencyGroupSetTransferState + ", " + "copiesRecoveryActivities=" + this.copiesRecoveryActivities + ", " + "copyToResumeProduction=" + this.copyToResumeProduction + "]";
    }
}


