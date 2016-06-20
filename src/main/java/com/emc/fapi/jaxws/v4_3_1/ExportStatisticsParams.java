package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportStatisticsParams", propOrder = {"fileName", "filter"})
public class ExportStatisticsParams {
    protected String fileName;
    protected StatisticsFilter filter;

    public ExportStatisticsParams() {
    }

    public ExportStatisticsParams(String fileName, StatisticsFilter filter) {
        this.fileName = fileName;
        this.filter = filter;
    }


    public String getFileName() {
        return this.fileName;
    }


    public void setFileName(String value) {
        this.fileName = value;
    }


    public StatisticsFilter getFilter() {
        return this.filter;
    }


    public void setFilter(StatisticsFilter value) {
        this.filter = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ExportStatisticsParams)) {
            return false;
        }
        ExportStatisticsParams otherObj = (ExportStatisticsParams) obj;

        return (this.fileName != null ? this.fileName.equals(otherObj.fileName) : this.fileName == otherObj.fileName) && (this.filter != null ? this.filter.equals(otherObj.filter) : this.filter == otherObj.filter);
    }


    public int hashCode() {
        return (this.fileName != null ? this.fileName.hashCode() : 0) ^ (this.filter != null ? this.filter.hashCode() : 0);
    }


    public String toString() {
        return "ExportStatisticsParams [fileName=" + this.fileName + ", " + "filter=" + this.filter + "]";
    }
}


