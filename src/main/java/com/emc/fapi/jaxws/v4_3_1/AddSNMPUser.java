package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addSNMPUser", propOrder = {"user"})
public class AddSNMPUser {
    protected SNMPUser user;

    public AddSNMPUser() {
    }

    public AddSNMPUser(SNMPUser user) {
        this.user = user;
    }


    public SNMPUser getUser() {
        return this.user;
    }


    public void setUser(SNMPUser value) {
        this.user = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddSNMPUser)) {
            return false;
        }
        AddSNMPUser otherObj = (AddSNMPUser) obj;

        return this.user == otherObj.user ? true : this.user != null ? this.user.equals(otherObj.user) : false;
    }


    public int hashCode() {
        return this.user != null ? this.user.hashCode() : 0;
    }


    public String toString() {
        return "AddSNMPUser [user=" + this.user + "]";
    }
}


