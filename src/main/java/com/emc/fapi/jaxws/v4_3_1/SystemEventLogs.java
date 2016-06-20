package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemEventLogs", propOrder = {"eventLogs"})
public class SystemEventLogs {
    @XmlElement(nillable = true)
    protected List<EventLog> eventLogs;

    public SystemEventLogs() {
    }

    public SystemEventLogs(List<EventLog> eventLogs) {
        this.eventLogs = eventLogs;
    }


    public List<EventLog> getEventLogs() {
        if (this.eventLogs == null) {
            this.eventLogs = new ArrayList();
        }
        return this.eventLogs;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SystemEventLogs)) {
            return false;
        }
        SystemEventLogs otherObj = (SystemEventLogs) obj;

        return this.eventLogs == otherObj.eventLogs ? true : this.eventLogs != null ? this.eventLogs.equals(otherObj.eventLogs) : false;
    }


    public int hashCode() {
        return this.eventLogs != null ? this.eventLogs.hashCode() : 0;
    }


    public String toString() {
        return "SystemEventLogs [eventLogs=" + this.eventLogs + "]";
    }
}


