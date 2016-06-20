package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "renameSystemEventLogsFilter", propOrder = {"filter", "newName"})
public class RenameSystemEventLogsFilter {
    protected SystemEventLogsFilterUID filter;
    protected String newName;

    public RenameSystemEventLogsFilter() {
    }

    public RenameSystemEventLogsFilter(SystemEventLogsFilterUID filter, String newName) {
        this.filter = filter;
        this.newName = newName;
    }


    public SystemEventLogsFilterUID getFilter() {
        return this.filter;
    }


    public void setFilter(SystemEventLogsFilterUID value) {
        this.filter = value;
    }


    public String getNewName() {
        return this.newName;
    }


    public void setNewName(String value) {
        this.newName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RenameSystemEventLogsFilter)) {
            return false;
        }
        RenameSystemEventLogsFilter otherObj = (RenameSystemEventLogsFilter) obj;

        return (this.filter != null ? this.filter.equals(otherObj.filter) : this.filter == otherObj.filter) && (this.newName != null ? this.newName.equals(otherObj.newName) : this.newName == otherObj.newName);
    }


    public int hashCode() {
        return (this.filter != null ? this.filter.hashCode() : 0) ^ (this.newName != null ? this.newName.hashCode() : 0);
    }


    public String toString() {
        return "RenameSystemEventLogsFilter [filter=" + this.filter + ", " + "newName=" + this.newName + "]";
    }
}


