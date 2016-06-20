package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getConsistencyGroupReports", propOrder = {"reportsUIDs"})
public class GetConsistencyGroupReports {
    protected List<ReportUID> reportsUIDs;

    public GetConsistencyGroupReports() {
    }

    public GetConsistencyGroupReports(List<ReportUID> reportsUIDs) {
        this.reportsUIDs = reportsUIDs;
    }


    public List<ReportUID> getReportsUIDs() {
        if (this.reportsUIDs == null) {
            this.reportsUIDs = new ArrayList();
        }
        return this.reportsUIDs;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetConsistencyGroupReports)) {
            return false;
        }
        GetConsistencyGroupReports otherObj = (GetConsistencyGroupReports) obj;

        return this.reportsUIDs == otherObj.reportsUIDs ? true : this.reportsUIDs != null ? this.reportsUIDs.equals(otherObj.reportsUIDs) : false;
    }


    public int hashCode() {
        return this.reportsUIDs != null ? this.reportsUIDs.hashCode() : 0;
    }


    public String toString() {
        return "GetConsistencyGroupReports [reportsUIDs=" + this.reportsUIDs + "]";
    }
}


