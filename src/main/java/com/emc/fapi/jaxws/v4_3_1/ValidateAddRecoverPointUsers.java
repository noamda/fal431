package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateAddRecoverPointUsers", propOrder = {"users"})
public class ValidateAddRecoverPointUsers {
    protected List<RecoverPointUser> users;

    public ValidateAddRecoverPointUsers() {
    }

    public ValidateAddRecoverPointUsers(List<RecoverPointUser> users) {
        this.users = users;
    }


    public List<RecoverPointUser> getUsers() {
        if (this.users == null) {
            this.users = new ArrayList();
        }
        return this.users;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateAddRecoverPointUsers)) {
            return false;
        }
        ValidateAddRecoverPointUsers otherObj = (ValidateAddRecoverPointUsers) obj;

        return this.users == otherObj.users ? true : this.users != null ? this.users.equals(otherObj.users) : false;
    }


    public int hashCode() {
        return this.users != null ? this.users.hashCode() : 0;
    }


    public String toString() {
        return "ValidateAddRecoverPointUsers [users=" + this.users + "]";
    }
}


