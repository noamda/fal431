package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ConsistencyGroupCopyRecoveryActivity")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopyRecoveryActivity", propOrder = {"activeProductionCopy", "activityState", "canBeSetAsProduction", "canGroupResumeProduction", "copyName", "copyUID", "groupName", "imageAccessSizeLeftInBytes", "imageAccessTotalSizeInBytes", "inImageAccess", "numOfVmStartUpActionState", "transferEnabled", "transferState", "tspUsagePercentage"})
public class ConsistencyGroupCopyRecoveryActivity
        extends BaseRecoveryActivity {
    protected ConsistencyGroupCopyUID activeProductionCopy;
    protected RecoveryActivityState activityState;
    protected boolean canBeSetAsProduction;
    protected boolean canGroupResumeProduction;
    protected String copyName;
    protected ConsistencyGroupCopyUID copyUID;
    protected String groupName;
    protected Long imageAccessSizeLeftInBytes;
    protected Long imageAccessTotalSizeInBytes;
    protected boolean inImageAccess;
    protected int numOfVmStartUpActionState;
    protected boolean transferEnabled;
    protected PipeState transferState;
    protected Double tspUsagePercentage;

    public ConsistencyGroupCopyRecoveryActivity() {
    }

    public ConsistencyGroupCopyRecoveryActivity(ConsistencyGroupCopyUID activeProductionCopy, RecoveryActivityState activityState, boolean canBeSetAsProduction, boolean canGroupResumeProduction, String copyName, ConsistencyGroupCopyUID copyUID, String groupName, Long imageAccessSizeLeftInBytes, Long imageAccessTotalSizeInBytes, boolean inImageAccess, int numOfVmStartUpActionState, boolean transferEnabled, PipeState transferState, Double tspUsagePercentage) {
        this.activeProductionCopy = activeProductionCopy;
        this.activityState = activityState;
        this.canBeSetAsProduction = canBeSetAsProduction;
        this.canGroupResumeProduction = canGroupResumeProduction;
        this.copyName = copyName;
        this.copyUID = copyUID;
        this.groupName = groupName;
        this.imageAccessSizeLeftInBytes = imageAccessSizeLeftInBytes;
        this.imageAccessTotalSizeInBytes = imageAccessTotalSizeInBytes;
        this.inImageAccess = inImageAccess;
        this.numOfVmStartUpActionState = numOfVmStartUpActionState;
        this.transferEnabled = transferEnabled;
        this.transferState = transferState;
        this.tspUsagePercentage = tspUsagePercentage;
    }


    public ConsistencyGroupCopyUID getActiveProductionCopy() {
        return this.activeProductionCopy;
    }


    public void setActiveProductionCopy(ConsistencyGroupCopyUID value) {
        this.activeProductionCopy = value;
    }


    public RecoveryActivityState getActivityState() {
        return this.activityState;
    }


    public void setActivityState(RecoveryActivityState value) {
        this.activityState = value;
    }


    public boolean isCanBeSetAsProduction() {
        return this.canBeSetAsProduction;
    }


    public void setCanBeSetAsProduction(boolean value) {
        this.canBeSetAsProduction = value;
    }


    public boolean isCanGroupResumeProduction() {
        return this.canGroupResumeProduction;
    }


    public void setCanGroupResumeProduction(boolean value) {
        this.canGroupResumeProduction = value;
    }


    public String getCopyName() {
        return this.copyName;
    }


    public void setCopyName(String value) {
        this.copyName = value;
    }


    public ConsistencyGroupCopyUID getCopyUID() {
        return this.copyUID;
    }


    public void setCopyUID(ConsistencyGroupCopyUID value) {
        this.copyUID = value;
    }


    public String getGroupName() {
        return this.groupName;
    }


    public void setGroupName(String value) {
        this.groupName = value;
    }


    public Long getImageAccessSizeLeftInBytes() {
        return this.imageAccessSizeLeftInBytes;
    }


    public void setImageAccessSizeLeftInBytes(Long value) {
        this.imageAccessSizeLeftInBytes = value;
    }


    public Long getImageAccessTotalSizeInBytes() {
        return this.imageAccessTotalSizeInBytes;
    }


    public void setImageAccessTotalSizeInBytes(Long value) {
        this.imageAccessTotalSizeInBytes = value;
    }


    public boolean isInImageAccess() {
        return this.inImageAccess;
    }


    public void setInImageAccess(boolean value) {
        this.inImageAccess = value;
    }


    public int getNumOfVmStartUpActionState() {
        return this.numOfVmStartUpActionState;
    }


    public void setNumOfVmStartUpActionState(int value) {
        this.numOfVmStartUpActionState = value;
    }


    public boolean isTransferEnabled() {
        return this.transferEnabled;
    }


    public void setTransferEnabled(boolean value) {
        this.transferEnabled = value;
    }


    public PipeState getTransferState() {
        return this.transferState;
    }


    public void setTransferState(PipeState value) {
        this.transferState = value;
    }


    public Double getTspUsagePercentage() {
        return this.tspUsagePercentage;
    }


    public void setTspUsagePercentage(Double value) {
        this.tspUsagePercentage = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopyRecoveryActivity)) {
            return false;
        }
        ConsistencyGroupCopyRecoveryActivity otherObj = (ConsistencyGroupCopyRecoveryActivity) obj;

        return (super.equals(obj)) && (this.activeProductionCopy != null ? this.activeProductionCopy.equals(otherObj.activeProductionCopy) : this.activeProductionCopy == otherObj.activeProductionCopy) && (this.activityState != null ? this.activityState.equals(otherObj.activityState) : this.activityState == otherObj.activityState) && (this.canBeSetAsProduction == otherObj.canBeSetAsProduction) && (this.canGroupResumeProduction == otherObj.canGroupResumeProduction) && (this.copyName != null ? this.copyName.equals(otherObj.copyName) : this.copyName == otherObj.copyName) && (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.groupName != null ? this.groupName.equals(otherObj.groupName) : this.groupName == otherObj.groupName) && (this.imageAccessSizeLeftInBytes != null ? this.imageAccessSizeLeftInBytes.equals(otherObj.imageAccessSizeLeftInBytes) : this.imageAccessSizeLeftInBytes == otherObj.imageAccessSizeLeftInBytes) && (this.imageAccessTotalSizeInBytes != null ? this.imageAccessTotalSizeInBytes.equals(otherObj.imageAccessTotalSizeInBytes) : this.imageAccessTotalSizeInBytes == otherObj.imageAccessTotalSizeInBytes) && (this.inImageAccess == otherObj.inImageAccess) && (this.numOfVmStartUpActionState == otherObj.numOfVmStartUpActionState) && (this.transferEnabled == otherObj.transferEnabled) && (this.transferState != null ? this.transferState.equals(otherObj.transferState) : this.transferState == otherObj.transferState) && (this.tspUsagePercentage != null ? this.tspUsagePercentage.equals(otherObj.tspUsagePercentage) : this.tspUsagePercentage == otherObj.tspUsagePercentage);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.activeProductionCopy != null ? this.activeProductionCopy.hashCode() : 0) ^ (this.activityState != null ? this.activityState.hashCode() : 0) ^ (this.canBeSetAsProduction ? 1 : 0) ^ (this.canGroupResumeProduction ? 1 : 0) ^ (this.copyName != null ? this.copyName.hashCode() : 0) ^ (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.groupName != null ? this.groupName.hashCode() : 0) ^ (this.imageAccessSizeLeftInBytes != null ? this.imageAccessSizeLeftInBytes.hashCode() : 0) ^ (this.imageAccessTotalSizeInBytes != null ? this.imageAccessTotalSizeInBytes.hashCode() : 0) ^ (this.inImageAccess ? 1 : 0) ^ this.numOfVmStartUpActionState ^ (this.transferEnabled ? 1 : 0) ^ (this.transferState != null ? this.transferState.hashCode() : 0) ^ (this.tspUsagePercentage != null ? this.tspUsagePercentage.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupCopyRecoveryActivity [super=" + super.toString() + ", " + "activeProductionCopy=" + this.activeProductionCopy + ", " + "activityState=" + this.activityState + ", " + "canBeSetAsProduction=" + this.canBeSetAsProduction + ", " + "canGroupResumeProduction=" + this.canGroupResumeProduction + ", " + "copyName=" + this.copyName + ", " + "copyUID=" + this.copyUID + ", " + "groupName=" + this.groupName + ", " + "imageAccessSizeLeftInBytes=" + this.imageAccessSizeLeftInBytes + ", " + "imageAccessTotalSizeInBytes=" + this.imageAccessTotalSizeInBytes + ", " + "inImageAccess=" + this.inImageAccess + ", " + "numOfVmStartUpActionState=" + this.numOfVmStartUpActionState + ", " + "transferEnabled=" + this.transferEnabled + ", " + "transferState=" + this.transferState + ", " + "tspUsagePercentage=" + this.tspUsagePercentage + "]";
    }
}


