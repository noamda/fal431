package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSystemEventLogsFiltersParams", propOrder = {"filters"})
public class SetSystemEventLogsFiltersParams {
    @XmlElement(nillable = true)
    protected List<SystemEventLogsFilter> filters;

    public SetSystemEventLogsFiltersParams() {
    }

    public SetSystemEventLogsFiltersParams(List<SystemEventLogsFilter> filters) {
        this.filters = filters;
    }


    public List<SystemEventLogsFilter> getFilters() {
        if (this.filters == null) {
            this.filters = new ArrayList();
        }
        return this.filters;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetSystemEventLogsFiltersParams)) {
            return false;
        }
        SetSystemEventLogsFiltersParams otherObj = (SetSystemEventLogsFiltersParams) obj;

        return this.filters == otherObj.filters ? true : this.filters != null ? this.filters.equals(otherObj.filters) : false;
    }


    public int hashCode() {
        return this.filters != null ? this.filters.hashCode() : 0;
    }


    public String toString() {
        return "SetSystemEventLogsFiltersParams [filters=" + this.filters + "]";
    }
}


