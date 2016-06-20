package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeSNMPUser", propOrder = {"user"})
public class RemoveSNMPUser {
    protected SNMPUser user;

    public RemoveSNMPUser() {
    }

    public RemoveSNMPUser(SNMPUser user) {
        this.user = user;
    }


    public SNMPUser getUser() {
        return this.user;
    }


    public void setUser(SNMPUser value) {
        this.user = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RemoveSNMPUser)) {
            return false;
        }
        RemoveSNMPUser otherObj = (RemoveSNMPUser) obj;

        return this.user == otherObj.user ? true : this.user != null ? this.user.equals(otherObj.user) : false;
    }


    public int hashCode() {
        return this.user != null ? this.user.hashCode() : 0;
    }


    public String toString() {
        return "RemoveSNMPUser [user=" + this.user + "]";
    }
}


