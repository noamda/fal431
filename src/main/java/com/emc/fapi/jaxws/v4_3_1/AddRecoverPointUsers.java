package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addRecoverPointUsers", propOrder = {"users"})
public class AddRecoverPointUsers {
    protected List<RecoverPointUser> users;

    public AddRecoverPointUsers() {
    }

    public AddRecoverPointUsers(List<RecoverPointUser> users) {
        this.users = users;
    }


    public List<RecoverPointUser> getUsers() {
        if (this.users == null) {
            this.users = new ArrayList();
        }
        return this.users;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddRecoverPointUsers)) {
            return false;
        }
        AddRecoverPointUsers otherObj = (AddRecoverPointUsers) obj;

        return this.users == otherObj.users ? true : this.users != null ? this.users.equals(otherObj.users) : false;
    }


    public int hashCode() {
        return this.users != null ? this.users.hashCode() : 0;
    }


    public String toString() {
        return "AddRecoverPointUsers [users=" + this.users + "]";
    }
}


