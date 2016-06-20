package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallHomeEvents", propOrder = {"callHomeEvents"})
public class CallHomeEvents {
    @XmlElement(required = true)
    protected List<CallHomeEvent> callHomeEvents;

    public CallHomeEvents() {
    }

    public CallHomeEvents(List<CallHomeEvent> callHomeEvents) {
        this.callHomeEvents = callHomeEvents;
    }


    public List<CallHomeEvent> getCallHomeEvents() {
        if (this.callHomeEvents == null) {
            this.callHomeEvents = new ArrayList();
        }
        return this.callHomeEvents;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CallHomeEvents)) {
            return false;
        }
        CallHomeEvents otherObj = (CallHomeEvents) obj;

        return this.callHomeEvents == otherObj.callHomeEvents ? true : this.callHomeEvents != null ? this.callHomeEvents.equals(otherObj.callHomeEvents) : false;
    }


    public int hashCode() {
        return this.callHomeEvents != null ? this.callHomeEvents.hashCode() : 0;
    }


    public String toString() {
        return "CallHomeEvents [callHomeEvents=" + this.callHomeEvents + "]";
    }
}


