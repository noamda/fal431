package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setCallHomeEvents", propOrder = {"callHomeEvents"})
public class SetCallHomeEvents {
    @XmlElement(nillable = true)
    protected CallHomeEvents callHomeEvents;

    public SetCallHomeEvents() {
    }

    public SetCallHomeEvents(CallHomeEvents callHomeEvents) {
        this.callHomeEvents = callHomeEvents;
    }


    public CallHomeEvents getCallHomeEvents() {
        return this.callHomeEvents;
    }


    public void setCallHomeEvents(CallHomeEvents value) {
        this.callHomeEvents = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetCallHomeEvents)) {
            return false;
        }
        SetCallHomeEvents otherObj = (SetCallHomeEvents) obj;

        return this.callHomeEvents == otherObj.callHomeEvents ? true : this.callHomeEvents != null ? this.callHomeEvents.equals(otherObj.callHomeEvents) : false;
    }


    public int hashCode() {
        return this.callHomeEvents != null ? this.callHomeEvents.hashCode() : 0;
    }


    public String toString() {
        return "SetCallHomeEvents [callHomeEvents=" + this.callHomeEvents + "]";
    }
}


