package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateSetSystemEventLogsFilters", propOrder = {"filters"})
public class ValidateSetSystemEventLogsFilters {
    protected List<SystemEventLogsFilter> filters;

    public ValidateSetSystemEventLogsFilters() {
    }

    public ValidateSetSystemEventLogsFilters(List<SystemEventLogsFilter> filters) {
        this.filters = filters;
    }


    public List<SystemEventLogsFilter> getFilters() {
        if (this.filters == null) {
            this.filters = new ArrayList();
        }
        return this.filters;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateSetSystemEventLogsFilters)) {
            return false;
        }
        ValidateSetSystemEventLogsFilters otherObj = (ValidateSetSystemEventLogsFilters) obj;

        return this.filters == otherObj.filters ? true : this.filters != null ? this.filters.equals(otherObj.filters) : false;
    }


    public int hashCode() {
        return this.filters != null ? this.filters.hashCode() : 0;
    }


    public String toString() {
        return "ValidateSetSystemEventLogsFilters [filters=" + this.filters + "]";
    }
}


