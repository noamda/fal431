package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionStatus", propOrder = {"completedStage", "eta", "progressPercentage", "stage", "state", "title", "totalStages"})
public class TransactionStatus {
    protected String completedStage;
    protected RecoverPointTimeStamp eta;
    protected Integer progressPercentage;
    protected Integer stage;
    protected ExecutionState state;
    protected String title;
    protected Integer totalStages;

    public TransactionStatus() {
    }

    public TransactionStatus(String completedStage, RecoverPointTimeStamp eta, Integer progressPercentage, Integer stage, ExecutionState state, String title, Integer totalStages) {
        this.completedStage = completedStage;
        this.eta = eta;
        this.progressPercentage = progressPercentage;
        this.stage = stage;
        this.state = state;
        this.title = title;
        this.totalStages = totalStages;
    }


    public String getCompletedStage() {
        return this.completedStage;
    }


    public void setCompletedStage(String value) {
        this.completedStage = value;
    }


    public RecoverPointTimeStamp getEta() {
        return this.eta;
    }


    public void setEta(RecoverPointTimeStamp value) {
        this.eta = value;
    }


    public Integer getProgressPercentage() {
        return this.progressPercentage;
    }


    public void setProgressPercentage(Integer value) {
        this.progressPercentage = value;
    }


    public Integer getStage() {
        return this.stage;
    }


    public void setStage(Integer value) {
        this.stage = value;
    }


    public ExecutionState getState() {
        return this.state;
    }


    public void setState(ExecutionState value) {
        this.state = value;
    }


    public String getTitle() {
        return this.title;
    }


    public void setTitle(String value) {
        this.title = value;
    }


    public Integer getTotalStages() {
        return this.totalStages;
    }


    public void setTotalStages(Integer value) {
        this.totalStages = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof TransactionStatus)) {
            return false;
        }
        TransactionStatus otherObj = (TransactionStatus) obj;

        return (this.completedStage != null ? this.completedStage.equals(otherObj.completedStage) : this.completedStage == otherObj.completedStage) && (this.eta != null ? this.eta.equals(otherObj.eta) : this.eta == otherObj.eta) && (this.progressPercentage != null ? this.progressPercentage.equals(otherObj.progressPercentage) : this.progressPercentage == otherObj.progressPercentage) && (this.stage != null ? this.stage.equals(otherObj.stage) : this.stage == otherObj.stage) && (this.state != null ? this.state.equals(otherObj.state) : this.state == otherObj.state) && (this.title != null ? this.title.equals(otherObj.title) : this.title == otherObj.title) && (this.totalStages != null ? this.totalStages.equals(otherObj.totalStages) : this.totalStages == otherObj.totalStages);
    }


    public int hashCode() {
        return (this.completedStage != null ? this.completedStage.hashCode() : 0) ^ (this.eta != null ? this.eta.hashCode() : 0) ^ (this.progressPercentage != null ? this.progressPercentage.hashCode() : 0) ^ (this.stage != null ? this.stage.hashCode() : 0) ^ (this.state != null ? this.state.hashCode() : 0) ^ (this.title != null ? this.title.hashCode() : 0) ^ (this.totalStages != null ? this.totalStages.hashCode() : 0);
    }


    public String toString() {
        return "TransactionStatus [completedStage=" + this.completedStage + ", " + "eta=" + this.eta + ", " + "progressPercentage=" + this.progressPercentage + ", " + "stage=" + this.stage + ", " + "state=" + this.state + ", " + "title=" + this.title + ", " + "totalStages=" + this.totalStages + "]";
    }
}


