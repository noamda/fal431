package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupReportStats", propOrder = {"reportUID", "type", "status", "startTime", "endTime", "mainGlobalCopy", "username"})
public class ConsistencyGroupReportStats {
    @XmlElement(nillable = true)
    protected ReportUID reportUID;
    protected ReportType type;
    protected ReportStatus status;
    protected Long startTime;
    protected Long endTime;
    protected GlobalCopyUID mainGlobalCopy;
    protected String username;

    public ConsistencyGroupReportStats() {
    }

    public ConsistencyGroupReportStats(ReportUID reportUID, ReportType type, ReportStatus status, Long startTime, Long endTime, GlobalCopyUID mainGlobalCopy, String username) {
        this.reportUID = reportUID;
        this.type = type;
        this.status = status;
        this.startTime = startTime;
        this.endTime = endTime;
        this.mainGlobalCopy = mainGlobalCopy;
        this.username = username;
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


    public GlobalCopyUID getMainGlobalCopy() {
        return this.mainGlobalCopy;
    }


    public void setMainGlobalCopy(GlobalCopyUID value) {
        this.mainGlobalCopy = value;
    }


    public String getUsername() {
        return this.username;
    }


    public void setUsername(String value) {
        this.username = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupReportStats)) {
            return false;
        }
        ConsistencyGroupReportStats otherObj = (ConsistencyGroupReportStats) obj;

        return (this.reportUID != null ? this.reportUID.equals(otherObj.reportUID) : this.reportUID == otherObj.reportUID) && (this.type != null ? this.type.equals(otherObj.type) : this.type == otherObj.type) && (this.status != null ? this.status.equals(otherObj.status) : this.status == otherObj.status) && (this.startTime != null ? this.startTime.equals(otherObj.startTime) : this.startTime == otherObj.startTime) && (this.endTime != null ? this.endTime.equals(otherObj.endTime) : this.endTime == otherObj.endTime) && (this.mainGlobalCopy != null ? this.mainGlobalCopy.equals(otherObj.mainGlobalCopy) : this.mainGlobalCopy == otherObj.mainGlobalCopy) && (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username);
    }


    public int hashCode() {
        return (this.reportUID != null ? this.reportUID.hashCode() : 0) ^ (this.type != null ? this.type.hashCode() : 0) ^ (this.status != null ? this.status.hashCode() : 0) ^ (this.startTime != null ? this.startTime.hashCode() : 0) ^ (this.endTime != null ? this.endTime.hashCode() : 0) ^ (this.mainGlobalCopy != null ? this.mainGlobalCopy.hashCode() : 0) ^ (this.username != null ? this.username.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupReportStats [reportUID=" + this.reportUID + ", " + "type=" + this.type + ", " + "status=" + this.status + ", " + "startTime=" + this.startTime + ", " + "endTime=" + this.endTime + ", " + "mainGlobalCopy=" + this.mainGlobalCopy + ", " + "username=" + this.username + "]";
    }
}


