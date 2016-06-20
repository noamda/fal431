package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupReportContextInfo", propOrder = {"reportUID", "context", "inProgress", "reportStatus"})
public class ConsistencyGroupReportContextInfo {
    @XmlElement(nillable = true)
    protected ReportUID reportUID;
    protected long context;
    protected boolean inProgress;
    @XmlElement(nillable = true)
    protected ReportStatus reportStatus;

    public ConsistencyGroupReportContextInfo() {
    }

    public ConsistencyGroupReportContextInfo(ReportUID reportUID, long context, boolean inProgress, ReportStatus reportStatus) {
        this.reportUID = reportUID;
        this.context = context;
        this.inProgress = inProgress;
        this.reportStatus = reportStatus;
    }


    public ReportUID getReportUID() {
        return this.reportUID;
    }


    public void setReportUID(ReportUID value) {
        this.reportUID = value;
    }


    public long getContext() {
        return this.context;
    }


    public void setContext(long value) {
        this.context = value;
    }


    public boolean isInProgress() {
        return this.inProgress;
    }


    public void setInProgress(boolean value) {
        this.inProgress = value;
    }


    public ReportStatus getReportStatus() {
        return this.reportStatus;
    }


    public void setReportStatus(ReportStatus value) {
        this.reportStatus = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupReportContextInfo)) {
            return false;
        }
        ConsistencyGroupReportContextInfo otherObj = (ConsistencyGroupReportContextInfo) obj;

        return (this.reportUID != null ? this.reportUID.equals(otherObj.reportUID) : this.reportUID == otherObj.reportUID) && (this.context == otherObj.context) && (this.inProgress == otherObj.inProgress) && (this.reportStatus != null ? this.reportStatus.equals(otherObj.reportStatus) : this.reportStatus == otherObj.reportStatus);
    }


    public int hashCode() {
        return (this.reportUID != null ? this.reportUID.hashCode() : 0) ^ (int) this.context ^ (this.inProgress ? 1 : 0) ^ (this.reportStatus != null ? this.reportStatus.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupReportContextInfo [reportUID=" + this.reportUID + ", " + "context=" + this.context + ", " + "inProgress=" + this.inProgress + ", " + "reportStatus=" + this.reportStatus + "]";
    }
}


