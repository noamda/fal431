package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setCurrentUserEventLogsFilter", propOrder = {"filter"})
public class SetCurrentUserEventLogsFilter {
    protected UserEventLogsFilter filter;

    public SetCurrentUserEventLogsFilter() {
    }

    public SetCurrentUserEventLogsFilter(UserEventLogsFilter filter) {
        this.filter = filter;
    }


    public UserEventLogsFilter getFilter() {
        return this.filter;
    }


    public void setFilter(UserEventLogsFilter value) {
        this.filter = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetCurrentUserEventLogsFilter)) {
            return false;
        }
        SetCurrentUserEventLogsFilter otherObj = (SetCurrentUserEventLogsFilter) obj;

        return this.filter == otherObj.filter ? true : this.filter != null ? this.filter.equals(otherObj.filter) : false;
    }


    public int hashCode() {
        return this.filter != null ? this.filter.hashCode() : 0;
    }


    public String toString() {
        return "SetCurrentUserEventLogsFilter [filter=" + this.filter + "]";
    }
}


