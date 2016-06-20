package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detectBottlenecks", propOrder = {"filter"})
public class DetectBottlenecks {
    protected DetectBottlenecksFilter filter;

    public DetectBottlenecks() {
    }

    public DetectBottlenecks(DetectBottlenecksFilter filter) {
        this.filter = filter;
    }


    public DetectBottlenecksFilter getFilter() {
        return this.filter;
    }


    public void setFilter(DetectBottlenecksFilter value) {
        this.filter = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof DetectBottlenecks)) {
            return false;
        }
        DetectBottlenecks otherObj = (DetectBottlenecks) obj;

        return this.filter == otherObj.filter ? true : this.filter != null ? this.filter.equals(otherObj.filter) : false;
    }


    public int hashCode() {
        return this.filter != null ? this.filter.hashCode() : 0;
    }


    public String toString() {
        return "DetectBottlenecks [filter=" + this.filter + "]";
    }
}


