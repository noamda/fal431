package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateRemoveUserRole", propOrder = {"role"})
public class ValidateRemoveUserRole {
    protected UserRole role;

    public ValidateRemoveUserRole() {
    }

    public ValidateRemoveUserRole(UserRole role) {
        this.role = role;
    }


    public UserRole getRole() {
        return this.role;
    }


    public void setRole(UserRole value) {
        this.role = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateRemoveUserRole)) {
            return false;
        }
        ValidateRemoveUserRole otherObj = (ValidateRemoveUserRole) obj;

        return this.role == otherObj.role ? true : this.role != null ? this.role.equals(otherObj.role) : false;
    }


    public int hashCode() {
        return this.role != null ? this.role.hashCode() : 0;
    }


    public String toString() {
        return "ValidateRemoveUserRole [role=" + this.role + "]";
    }
}


