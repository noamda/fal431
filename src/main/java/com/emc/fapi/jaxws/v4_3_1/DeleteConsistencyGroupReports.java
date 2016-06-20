package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteConsistencyGroupReports", propOrder = {"reportUID"})
public class DeleteConsistencyGroupReports {
    @XmlElement(nillable = true)
    protected ReportUID reportUID;

    public DeleteConsistencyGroupReports() {
    }

    public DeleteConsistencyGroupReports(ReportUID reportUID) {
        this.reportUID = reportUID;
    }


    public ReportUID getReportUID() {
        return this.reportUID;
    }


    public void setReportUID(ReportUID value) {
        this.reportUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof DeleteConsistencyGroupReports)) {
            return false;
        }
        DeleteConsistencyGroupReports otherObj = (DeleteConsistencyGroupReports) obj;

        return this.reportUID == otherObj.reportUID ? true : this.reportUID != null ? this.reportUID.equals(otherObj.reportUID) : false;
    }


    public int hashCode() {
        return this.reportUID != null ? this.reportUID.hashCode() : 0;
    }


    public String toString() {
        return "DeleteConsistencyGroupReports [reportUID=" + this.reportUID + "]";
    }
}


