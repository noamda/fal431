package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupReport", propOrder = {"reportUID", "type", "status", "mainGlobalCopy", "startTime", "endTime", "username", "reportSteps", "vmPersistentReportInfo", "context", "progressPercentage"})
public class ConsistencyGroupReport {
    @XmlElement(nillable = true)
    protected ReportUID reportUID;
    protected ReportType type;
    protected ReportStatus status;
    protected GlobalCopyUID mainGlobalCopy;
    protected Long startTime;
    protected Long endTime;
    protected String username;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupReportStep> reportSteps;
    @XmlElement(nillable = true)
    protected VMPersistentReportInfo vmPersistentReportInfo;
    protected long context;
    protected Integer progressPercentage;

    public ConsistencyGroupReport() {
    }

    public ConsistencyGroupReport(ReportUID reportUID, ReportType type, ReportStatus status, GlobalCopyUID mainGlobalCopy, Long startTime, Long endTime, String username, List<ConsistencyGroupReportStep> reportSteps, VMPersistentReportInfo vmPersistentReportInfo, long context, Integer progressPercentage) {
        this.reportUID = reportUID;
        this.type = type;
        this.status = status;
        this.mainGlobalCopy = mainGlobalCopy;
        this.startTime = startTime;
        this.endTime = endTime;
        this.username = username;
        this.reportSteps = reportSteps;
        this.vmPersistentReportInfo = vmPersistentReportInfo;
        this.context = context;
        this.progressPercentage = progressPercentage;
    }


    public ReportUID getReportUID() {
        return this.reportUID;
    }


    public void setReportUID(ReportUID value) {
        this.reportUID = value;
    }


    public ReportType getType() {
        return this.type;
    }


    public void setType(ReportType value) {
        this.type = value;
    }


    public ReportStatus getStatus() {
        return this.status;
    }


    public void setStatus(ReportStatus value) {
        this.status = value;
    }


    public GlobalCopyUID getMainGlobalCopy() {
        return this.mainGlobalCopy;
    }


    public void setMainGlobalCopy(GlobalCopyUID value) {
        this.mainGlobalCopy = value;
    }


    public Long getStartTime() {
        return this.startTime;
    }


    public void setStartTime(Long value) {
        this.startTime = value;
    }


    public Long getEndTime() {
        return this.endTime;
    }


    public void setEndTime(Long value) {
        this.endTime = value;
    }


    public String getUsername() {
        return this.username;
    }


    public void setUsername(String value) {
        this.username = value;
    }


    public List<ConsistencyGroupReportStep> getReportSteps() {
        if (this.reportSteps == null) {
            this.reportSteps = new ArrayList();
        }
        return this.reportSteps;
    }


    public VMPersistentReportInfo getVmPersistentReportInfo() {
        return this.vmPersistentReportInfo;
    }


    public void setVmPersistentReportInfo(VMPersistentReportInfo value) {
        this.vmPersistentReportInfo = value;
    }


    public long getContext() {
        return this.context;
    }


    public void setContext(long value) {
        this.context = value;
    }


    public Integer getProgressPercentage() {
        return this.progressPercentage;
    }


    public void setProgressPercentage(Integer value) {
        this.progressPercentage = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupReport)) {
            return false;
        }
        ConsistencyGroupReport otherObj = (ConsistencyGroupReport) obj;

        return (this.reportUID != null ? this.reportUID.equals(otherObj.reportUID) : this.reportUID == otherObj.reportUID) && (this.type != null ? this.type.equals(otherObj.type) : this.type == otherObj.type) && (this.status != null ? this.status.equals(otherObj.status) : this.status == otherObj.status) && (this.mainGlobalCopy != null ? this.mainGlobalCopy.equals(otherObj.mainGlobalCopy) : this.mainGlobalCopy == otherObj.mainGlobalCopy) && (this.startTime != null ? this.startTime.equals(otherObj.startTime) : this.startTime == otherObj.startTime) && (this.endTime != null ? this.endTime.equals(otherObj.endTime) : this.endTime == otherObj.endTime) && (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username) && (this.reportSteps != null ? this.reportSteps.equals(otherObj.reportSteps) : this.reportSteps == otherObj.reportSteps) && (this.vmPersistentReportInfo != null ? this.vmPersistentReportInfo.equals(otherObj.vmPersistentReportInfo) : this.vmPersistentReportInfo == otherObj.vmPersistentReportInfo) && (this.context == otherObj.context) && (this.progressPercentage != null ? this.progressPercentage.equals(otherObj.progressPercentage) : this.progressPercentage == otherObj.progressPercentage);
    }


    public int hashCode() {
        return (this.reportUID != null ? this.reportUID.hashCode() : 0) ^ (this.type != null ? this.type.hashCode() : 0) ^ (this.status != null ? this.status.hashCode() : 0) ^ (this.mainGlobalCopy != null ? this.mainGlobalCopy.hashCode() : 0) ^ (this.startTime != null ? this.startTime.hashCode() : 0) ^ (this.endTime != null ? this.endTime.hashCode() : 0) ^ (this.username != null ? this.username.hashCode() : 0) ^ (this.reportSteps != null ? this.reportSteps.hashCode() : 0) ^ (this.vmPersistentReportInfo != null ? this.vmPersistentReportInfo.hashCode() : 0) ^ (int) this.context ^ (this.progressPercentage != null ? this.progressPercentage.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupReport [reportUID=" + this.reportUID + ", " + "type=" + this.type + ", " + "status=" + this.status + ", " + "mainGlobalCopy=" + this.mainGlobalCopy + ", " + "startTime=" + this.startTime + ", " + "endTime=" + this.endTime + ", " + "username=" + this.username + ", " + "reportSteps=" + this.reportSteps + ", " + "vmPersistentReportInfo=" + this.vmPersistentReportInfo + ", " + "context=" + this.context + ", " + "progressPercentage=" + this.progressPercentage + "]";
    }
}


