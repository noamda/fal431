package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateRemoveSystemEventLogsFilter", propOrder = {"filter"})
public class ValidateRemoveSystemEventLogsFilter {
    protected SystemEventLogsFilterUID filter;

    public ValidateRemoveSystemEventLogsFilter() {
    }

    public ValidateRemoveSystemEventLogsFilter(SystemEventLogsFilterUID filter) {
        this.filter = filter;
    }


    public SystemEventLogsFilterUID getFilter() {
        return this.filter;
    }


    public void setFilter(SystemEventLogsFilterUID value) {
        this.filter = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateRemoveSystemEventLogsFilter)) {
            return false;
        }
        ValidateRemoveSystemEventLogsFilter otherObj = (ValidateRemoveSystemEventLogsFilter) obj;

        return this.filter == otherObj.filter ? true : this.filter != null ? this.filter.equals(otherObj.filter) : false;
    }


    public int hashCode() {
        return this.filter != null ? this.filter.hashCode() : 0;
    }


    public String toString() {
        return "ValidateRemoveSystemEventLogsFilter [filter=" + this.filter + "]";
    }
}


