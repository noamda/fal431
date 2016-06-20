package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeAccessState", propOrder = {"attachedToOtherCluster", "busy", "delayed", "inErrorState", "markingDataOnSplitter", "readOnly", "splittingToVolume", "targetRPA", "writable"})
public class VolumeAccessState {
    protected Boolean attachedToOtherCluster;
    protected Boolean busy;
    protected Boolean delayed;
    protected Boolean inErrorState;
    protected Boolean markingDataOnSplitter;
    protected Boolean readOnly;
    protected Boolean splittingToVolume;
    protected RpaUID targetRPA;
    protected Boolean writable;

    public VolumeAccessState() {
    }

    public VolumeAccessState(Boolean attachedToOtherCluster, Boolean busy, Boolean delayed, Boolean inErrorState, Boolean markingDataOnSplitter, Boolean readOnly, Boolean splittingToVolume, RpaUID targetRPA, Boolean writable) {
        this.attachedToOtherCluster = attachedToOtherCluster;
        this.busy = busy;
        this.delayed = delayed;
        this.inErrorState = inErrorState;
        this.markingDataOnSplitter = markingDataOnSplitter;
        this.readOnly = readOnly;
        this.splittingToVolume = splittingToVolume;
        this.targetRPA = targetRPA;
        this.writable = writable;
    }


    public Boolean isAttachedToOtherCluster() {
        return this.attachedToOtherCluster;
    }


    public void setAttachedToOtherCluster(Boolean value) {
        this.attachedToOtherCluster = value;
    }


    public Boolean isBusy() {
        return this.busy;
    }


    public void setBusy(Boolean value) {
        this.busy = value;
    }


    public Boolean isDelayed() {
        return this.delayed;
    }


    public void setDelayed(Boolean value) {
        this.delayed = value;
    }


    public Boolean isInErrorState() {
        return this.inErrorState;
    }


    public void setInErrorState(Boolean value) {
        this.inErrorState = value;
    }


    public Boolean isMarkingDataOnSplitter() {
        return this.markingDataOnSplitter;
    }


    public void setMarkingDataOnSplitter(Boolean value) {
        this.markingDataOnSplitter = value;
    }


    public Boolean isReadOnly() {
        return this.readOnly;
    }


    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }


    public Boolean isSplittingToVolume() {
        return this.splittingToVolume;
    }


    public void setSplittingToVolume(Boolean value) {
        this.splittingToVolume = value;
    }


    public RpaUID getTargetRPA() {
        return this.targetRPA;
    }


    public void setTargetRPA(RpaUID value) {
        this.targetRPA = value;
    }


    public Boolean isWritable() {
        return this.writable;
    }


    public void setWritable(Boolean value) {
        this.writable = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VolumeAccessState)) {
            return false;
        }
        VolumeAccessState otherObj = (VolumeAccessState) obj;

        return (this.attachedToOtherCluster != null ? this.attachedToOtherCluster.equals(otherObj.attachedToOtherCluster) : this.attachedToOtherCluster == otherObj.attachedToOtherCluster) && (this.busy != null ? this.busy.equals(otherObj.busy) : this.busy == otherObj.busy) && (this.delayed != null ? this.delayed.equals(otherObj.delayed) : this.delayed == otherObj.delayed) && (this.inErrorState != null ? this.inErrorState.equals(otherObj.inErrorState) : this.inErrorState == otherObj.inErrorState) && (this.markingDataOnSplitter != null ? this.markingDataOnSplitter.equals(otherObj.markingDataOnSplitter) : this.markingDataOnSplitter == otherObj.markingDataOnSplitter) && (this.readOnly != null ? this.readOnly.equals(otherObj.readOnly) : this.readOnly == otherObj.readOnly) && (this.splittingToVolume != null ? this.splittingToVolume.equals(otherObj.splittingToVolume) : this.splittingToVolume == otherObj.splittingToVolume) && (this.targetRPA != null ? this.targetRPA.equals(otherObj.targetRPA) : this.targetRPA == otherObj.targetRPA) && (this.writable != null ? this.writable.equals(otherObj.writable) : this.writable == otherObj.writable);
    }


    public int hashCode() {
        return (this.attachedToOtherCluster != null ? this.attachedToOtherCluster.hashCode() : 0) ^ (this.busy != null ? this.busy.hashCode() : 0) ^ (this.delayed != null ? this.delayed.hashCode() : 0) ^ (this.inErrorState != null ? this.inErrorState.hashCode() : 0) ^ (this.markingDataOnSplitter != null ? this.markingDataOnSplitter.hashCode() : 0) ^ (this.readOnly != null ? this.readOnly.hashCode() : 0) ^ (this.splittingToVolume != null ? this.splittingToVolume.hashCode() : 0) ^ (this.targetRPA != null ? this.targetRPA.hashCode() : 0) ^ (this.writable != null ? this.writable.hashCode() : 0);
    }


    public String toString() {
        return "VolumeAccessState [attachedToOtherCluster=" + this.attachedToOtherCluster + ", " + "busy=" + this.busy + ", " + "delayed=" + this.delayed + ", " + "inErrorState=" + this.inErrorState + ", " + "markingDataOnSplitter=" + this.markingDataOnSplitter + ", " + "readOnly=" + this.readOnly + ", " + "splittingToVolume=" + this.splittingToVolume + ", " + "targetRPA=" + this.targetRPA + ", " + "writable=" + this.writable + "]";
    }
}


