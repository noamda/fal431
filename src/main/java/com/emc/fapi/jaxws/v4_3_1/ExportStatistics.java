package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportStatistics", propOrder = {"filter", "fileName"})
public class ExportStatistics {
    protected StatisticsFilter filter;
    protected String fileName;

    public ExportStatistics() {
    }

    public ExportStatistics(StatisticsFilter filter, String fileName) {
        this.filter = filter;
        this.fileName = fileName;
    }


    public StatisticsFilter getFilter() {
        return this.filter;
    }


    public void setFilter(StatisticsFilter value) {
        this.filter = value;
    }


    public String getFileName() {
        return this.fileName;
    }


    public void setFileName(String value) {
        this.fileName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ExportStatistics)) {
            return false;
        }
        ExportStatistics otherObj = (ExportStatistics) obj;

        return (this.filter != null ? this.filter.equals(otherObj.filter) : this.filter == otherObj.filter) && (this.fileName != null ? this.fileName.equals(otherObj.fileName) : this.fileName == otherObj.fileName);
    }


    public int hashCode() {
        return (this.filter != null ? this.filter.hashCode() : 0) ^ (this.fileName != null ? this.fileName.hashCode() : 0);
    }


    public String toString() {
        return "ExportStatistics [filter=" + this.filter + ", " + "fileName=" + this.fileName + "]";
    }
}


