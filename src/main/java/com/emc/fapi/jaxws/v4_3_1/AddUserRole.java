package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addUserRole", propOrder = {"role"})
public class AddUserRole {
    protected UserRole role;

    public AddUserRole() {
    }

    public AddUserRole(UserRole role) {
        this.role = role;
    }


    public UserRole getRole() {
        return this.role;
    }


    public void setRole(UserRole value) {
        this.role = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddUserRole)) {
            return false;
        }
        AddUserRole otherObj = (AddUserRole) obj;

        return this.role == otherObj.role ? true : this.role != null ? this.role.equals(otherObj.role) : false;
    }


    public int hashCode() {
        return this.role != null ? this.role.hashCode() : 0;
    }


    public String toString() {
        return "AddUserRole [role=" + this.role + "]";
    }
}


