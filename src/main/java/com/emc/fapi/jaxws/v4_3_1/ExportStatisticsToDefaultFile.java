package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportStatisticsToDefaultFile", propOrder = {"filter"})
public class ExportStatisticsToDefaultFile {
    protected StatisticsFilter filter;

    public ExportStatisticsToDefaultFile() {
    }

    public ExportStatisticsToDefaultFile(StatisticsFilter filter) {
        this.filter = filter;
    }


    public StatisticsFilter getFilter() {
        return this.filter;
    }


    public void setFilter(StatisticsFilter value) {
        this.filter = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ExportStatisticsToDefaultFile)) {
            return false;
        }
        ExportStatisticsToDefaultFile otherObj = (ExportStatisticsToDefaultFile) obj;

        return this.filter == otherObj.filter ? true : this.filter != null ? this.filter.equals(otherObj.filter) : false;
    }


    public int hashCode() {
        return this.filter != null ? this.filter.hashCode() : 0;
    }


    public String toString() {
        return "ExportStatisticsToDefaultFile [filter=" + this.filter + "]";
    }
}


