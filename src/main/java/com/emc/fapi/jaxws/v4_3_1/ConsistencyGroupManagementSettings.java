package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupManagementSettings", propOrder = {"managementMode", "recoveryCopy", "expectedActiveCopy", "allowTestingWhileClustersDisconnected", "recoveryImage", "recoveryImageExpiryDate"})
public class ConsistencyGroupManagementSettings {
    @XmlElement(required = true, nillable = true)
    protected ManagementMode managementMode;
    @XmlElement(required = true)
    protected ConsistencyGroupCopyUID recoveryCopy;
    protected ConsistencyGroupCopyUID expectedActiveCopy;
    protected boolean allowTestingWhileClustersDisconnected;
    protected Snapshot recoveryImage;
    protected RecoverPointTimeStamp recoveryImageExpiryDate;

    public ConsistencyGroupManagementSettings() {
    }

    public ConsistencyGroupManagementSettings(ManagementMode managementMode, ConsistencyGroupCopyUID recoveryCopy, ConsistencyGroupCopyUID expectedActiveCopy, boolean allowTestingWhileClustersDisconnected, Snapshot recoveryImage, RecoverPointTimeStamp recoveryImageExpiryDate) {
        this.managementMode = managementMode;
        this.recoveryCopy = recoveryCopy;
        this.expectedActiveCopy = expectedActiveCopy;
        this.allowTestingWhileClustersDisconnected = allowTestingWhileClustersDisconnected;
        this.recoveryImage = recoveryImage;
        this.recoveryImageExpiryDate = recoveryImageExpiryDate;
    }


    public ManagementMode getManagementMode() {
        return this.managementMode;
    }


    public void setManagementMode(ManagementMode value) {
        this.managementMode = value;
    }


    public ConsistencyGroupCopyUID getRecoveryCopy() {
        return this.recoveryCopy;
    }


    public void setRecoveryCopy(ConsistencyGroupCopyUID value) {
        this.recoveryCopy = value;
    }


    public ConsistencyGroupCopyUID getExpectedActiveCopy() {
        return this.expectedActiveCopy;
    }


    public void setExpectedActiveCopy(ConsistencyGroupCopyUID value) {
        this.expectedActiveCopy = value;
    }


    public boolean isAllowTestingWhileClustersDisconnected() {
        return this.allowTestingWhileClustersDisconnected;
    }


    public void setAllowTestingWhileClustersDisconnected(boolean value) {
        this.allowTestingWhileClustersDisconnected = value;
    }


    public Snapshot getRecoveryImage() {
        return this.recoveryImage;
    }


    public void setRecoveryImage(Snapshot value) {
        this.recoveryImage = value;
    }


    public RecoverPointTimeStamp getRecoveryImageExpiryDate() {
        return this.recoveryImageExpiryDate;
    }


    public void setRecoveryImageExpiryDate(RecoverPointTimeStamp value) {
        this.recoveryImageExpiryDate = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupManagementSettings)) {
            return false;
        }
        ConsistencyGroupManagementSettings otherObj = (ConsistencyGroupManagementSettings) obj;

        return (this.managementMode != null ? this.managementMode.equals(otherObj.managementMode) : this.managementMode == otherObj.managementMode) && (this.recoveryCopy != null ? this.recoveryCopy.equals(otherObj.recoveryCopy) : this.recoveryCopy == otherObj.recoveryCopy) && (this.expectedActiveCopy != null ? this.expectedActiveCopy.equals(otherObj.expectedActiveCopy) : this.expectedActiveCopy == otherObj.expectedActiveCopy) && (this.allowTestingWhileClustersDisconnected == otherObj.allowTestingWhileClustersDisconnected) && (this.recoveryImage != null ? this.recoveryImage.equals(otherObj.recoveryImage) : this.recoveryImage == otherObj.recoveryImage) && (this.recoveryImageExpiryDate != null ? this.recoveryImageExpiryDate.equals(otherObj.recoveryImageExpiryDate) : this.recoveryImageExpiryDate == otherObj.recoveryImageExpiryDate);
    }


    public int hashCode() {
        return (this.managementMode != null ? this.managementMode.hashCode() : 0) ^ (this.recoveryCopy != null ? this.recoveryCopy.hashCode() : 0) ^ (this.expectedActiveCopy != null ? this.expectedActiveCopy.hashCode() : 0) ^ (this.allowTestingWhileClustersDisconnected ? 1 : 0) ^ (this.recoveryImage != null ? this.recoveryImage.hashCode() : 0) ^ (this.recoveryImageExpiryDate != null ? this.recoveryImageExpiryDate.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupManagementSettings [managementMode=" + this.managementMode + ", " + "recoveryCopy=" + this.recoveryCopy + ", " + "expectedActiveCopy=" + this.expectedActiveCopy + ", " + "allowTestingWhileClustersDisconnected=" + this.allowTestingWhileClustersDisconnected + ", " + "recoveryImage=" + this.recoveryImage + ", " + "recoveryImageExpiryDate=" + this.recoveryImageExpiryDate + "]";
    }
}


