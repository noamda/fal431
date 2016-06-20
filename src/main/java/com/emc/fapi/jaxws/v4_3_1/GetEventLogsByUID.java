package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEventLogsByUID", propOrder = {"eventUID", "maxEventsLimit"})
public class GetEventLogsByUID {
    protected SystemEventUID eventUID;
    protected int maxEventsLimit;

    public GetEventLogsByUID() {
    }

    public GetEventLogsByUID(SystemEventUID eventUID, int maxEventsLimit) {
        this.eventUID = eventUID;
        this.maxEventsLimit = maxEventsLimit;
    }


    public SystemEventUID getEventUID() {
        return this.eventUID;
    }


    public void setEventUID(SystemEventUID value) {
        this.eventUID = value;
    }


    public int getMaxEventsLimit() {
        return this.maxEventsLimit;
    }


    public void setMaxEventsLimit(int value) {
        this.maxEventsLimit = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetEventLogsByUID)) {
            return false;
        }
        GetEventLogsByUID otherObj = (GetEventLogsByUID) obj;

        return (this.eventUID != null ? this.eventUID.equals(otherObj.eventUID) : this.eventUID == otherObj.eventUID) && (this.maxEventsLimit == otherObj.maxEventsLimit);
    }


    public int hashCode() {
        return (this.eventUID != null ? this.eventUID.hashCode() : 0) ^ this.maxEventsLimit;
    }


    public String toString() {
        return "GetEventLogsByUID [eventUID=" + this.eventUID + ", " + "maxEventsLimit=" + this.maxEventsLimit + "]";
    }
}


