package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateAddRecoverPointUser", propOrder = {"user"})
public class ValidateAddRecoverPointUser {
    protected RecoverPointUser user;

    public ValidateAddRecoverPointUser() {
    }

    public ValidateAddRecoverPointUser(RecoverPointUser user) {
        this.user = user;
    }


    public RecoverPointUser getUser() {
        return this.user;
    }


    public void setUser(RecoverPointUser value) {
        this.user = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateAddRecoverPointUser)) {
            return false;
        }
        ValidateAddRecoverPointUser otherObj = (ValidateAddRecoverPointUser) obj;

        return this.user == otherObj.user ? true : this.user != null ? this.user.equals(otherObj.user) : false;
    }


    public int hashCode() {
        return this.user != null ? this.user.hashCode() : 0;
    }


    public String toString() {
        return "ValidateAddRecoverPointUser [user=" + this.user + "]";
    }
}


