package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendLoginEvent", propOrder = {"isLoginSuccessful"})
public class SendLoginEvent {
    protected boolean isLoginSuccessful;

    public SendLoginEvent() {
    }

    public SendLoginEvent(boolean isLoginSuccessful) {
        this.isLoginSuccessful = isLoginSuccessful;
    }


    public boolean isIsLoginSuccessful() {
        return this.isLoginSuccessful;
    }


    public void setIsLoginSuccessful(boolean value) {
        this.isLoginSuccessful = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SendLoginEvent)) {
            return false;
        }
        SendLoginEvent otherObj = (SendLoginEvent) obj;

        return this.isLoginSuccessful == otherObj.isLoginSuccessful;
    }


    public int hashCode() {
        return this.isLoginSuccessful ? 1 : 0;
    }


    public String toString() {
        return "SendLoginEvent [isLoginSuccessful=" + this.isLoginSuccessful + "]";
    }
}


