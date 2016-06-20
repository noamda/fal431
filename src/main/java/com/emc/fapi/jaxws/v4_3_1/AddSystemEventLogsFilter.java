package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addSystemEventLogsFilter", propOrder = {"filter"})
public class AddSystemEventLogsFilter {
    protected SystemEventLogsFilter filter;

    public AddSystemEventLogsFilter() {
    }

    public AddSystemEventLogsFilter(SystemEventLogsFilter filter) {
        this.filter = filter;
    }


    public SystemEventLogsFilter getFilter() {
        return this.filter;
    }


    public void setFilter(SystemEventLogsFilter value) {
        this.filter = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddSystemEventLogsFilter)) {
            return false;
        }
        AddSystemEventLogsFilter otherObj = (AddSystemEventLogsFilter) obj;

        return this.filter == otherObj.filter ? true : this.filter != null ? this.filter.equals(otherObj.filter) : false;
    }


    public int hashCode() {
        return this.filter != null ? this.filter.hashCode() : 0;
    }


    public String toString() {
        return "AddSystemEventLogsFilter [filter=" + this.filter + "]";
    }
}


