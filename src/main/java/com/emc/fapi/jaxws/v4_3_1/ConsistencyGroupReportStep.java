package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ConsistencyGroupReportVMStep.class, name = "ConsistencyGroupReportVMStep")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupReportStep", propOrder = {"endTime", "ownerCopy", "startTime", "stepStatus", "stepType", "stepUID", "subSteps"})
@XmlSeeAlso({ConsistencyGroupReportVMStep.class})
public class ConsistencyGroupReportStep {
    protected Long endTime;
    protected GlobalCopyUID ownerCopy;
    protected Long startTime;
    protected ReportStepStatus stepStatus;
    protected ReportStepType stepType;
    protected ReportStepUID stepUID;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupReportStep> subSteps;

    public ConsistencyGroupReportStep() {
    }

    public ConsistencyGroupReportStep(Long endTime, GlobalCopyUID ownerCopy, Long startTime, ReportStepStatus stepStatus, ReportStepType stepType, ReportStepUID stepUID, List<ConsistencyGroupReportStep> subSteps) {
        this.endTime = endTime;
        this.ownerCopy = ownerCopy;
        this.startTime = startTime;
        this.stepStatus = stepStatus;
        this.stepType = stepType;
        this.stepUID = stepUID;
        this.subSteps = subSteps;
    }


    public Long getEndTime() {
        return this.endTime;
    }


    public void setEndTime(Long value) {
        this.endTime = value;
    }


    public GlobalCopyUID getOwnerCopy() {
        return this.ownerCopy;
    }


    public void setOwnerCopy(GlobalCopyUID value) {
        this.ownerCopy = value;
    }


    public Long getStartTime() {
        return this.startTime;
    }


    public void setStartTime(Long value) {
        this.startTime = value;
    }


    public ReportStepStatus getStepStatus() {
        return this.stepStatus;
    }


    public void setStepStatus(ReportStepStatus value) {
        this.stepStatus = value;
    }


    public ReportStepType getStepType() {
        return this.stepType;
    }


    public void setStepType(ReportStepType value) {
        this.stepType = value;
    }


    public ReportStepUID getStepUID() {
        return this.stepUID;
    }


    public void setStepUID(ReportStepUID value) {
        this.stepUID = value;
    }


    public List<ConsistencyGroupReportStep> getSubSteps() {
        if (this.subSteps == null) {
            this.subSteps = new ArrayList();
        }
        return this.subSteps;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupReportStep)) {
            return false;
        }
        ConsistencyGroupReportStep otherObj = (ConsistencyGroupReportStep) obj;

        return (this.endTime != null ? this.endTime.equals(otherObj.endTime) : this.endTime == otherObj.endTime) && (this.ownerCopy != null ? this.ownerCopy.equals(otherObj.ownerCopy) : this.ownerCopy == otherObj.ownerCopy) && (this.startTime != null ? this.startTime.equals(otherObj.startTime) : this.startTime == otherObj.startTime) && (this.stepStatus != null ? this.stepStatus.equals(otherObj.stepStatus) : this.stepStatus == otherObj.stepStatus) && (this.stepType != null ? this.stepType.equals(otherObj.stepType) : this.stepType == otherObj.stepType) && (this.stepUID != null ? this.stepUID.equals(otherObj.stepUID) : this.stepUID == otherObj.stepUID) && (this.subSteps != null ? this.subSteps.equals(otherObj.subSteps) : this.subSteps == otherObj.subSteps);
    }


    public int hashCode() {
        return (this.endTime != null ? this.endTime.hashCode() : 0) ^ (this.ownerCopy != null ? this.ownerCopy.hashCode() : 0) ^ (this.startTime != null ? this.startTime.hashCode() : 0) ^ (this.stepStatus != null ? this.stepStatus.hashCode() : 0) ^ (this.stepType != null ? this.stepType.hashCode() : 0) ^ (this.stepUID != null ? this.stepUID.hashCode() : 0) ^ (this.subSteps != null ? this.subSteps.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupReportStep [endTime=" + this.endTime + ", " + "ownerCopy=" + this.ownerCopy + ", " + "startTime=" + this.startTime + ", " + "stepStatus=" + this.stepStatus + ", " + "stepType=" + this.stepType + ", " + "stepUID=" + this.stepUID + ", " + "subSteps=" + this.subSteps + "]";
    }
}


