package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEventLogsWithLargerUID", propOrder = {"eventUID"})
public class GetEventLogsWithLargerUID {
    protected SystemEventUID eventUID;

    public GetEventLogsWithLargerUID() {
    }

    public GetEventLogsWithLargerUID(SystemEventUID eventUID) {
        this.eventUID = eventUID;
    }


    public SystemEventUID getEventUID() {
        return this.eventUID;
    }


    public void setEventUID(SystemEventUID value) {
        this.eventUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetEventLogsWithLargerUID)) {
            return false;
        }
        GetEventLogsWithLargerUID otherObj = (GetEventLogsWithLargerUID) obj;

        return this.eventUID == otherObj.eventUID ? true : this.eventUID != null ? this.eventUID.equals(otherObj.eventUID) : false;
    }


    public int hashCode() {
        return this.eventUID != null ? this.eventUID.hashCode() : 0;
    }


    public String toString() {
        return "GetEventLogsWithLargerUID [eventUID=" + this.eventUID + "]";
    }
}


