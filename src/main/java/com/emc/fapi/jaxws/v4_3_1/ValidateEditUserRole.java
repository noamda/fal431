package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateEditUserRole", propOrder = {"oldRoleName", "newRole"})
public class ValidateEditUserRole {
    protected String oldRoleName;
    protected UserRole newRole;

    public ValidateEditUserRole() {
    }

    public ValidateEditUserRole(String oldRoleName, UserRole newRole) {
        this.oldRoleName = oldRoleName;
        this.newRole = newRole;
    }


    public String getOldRoleName() {
        return this.oldRoleName;
    }


    public void setOldRoleName(String value) {
        this.oldRoleName = value;
    }


    public UserRole getNewRole() {
        return this.newRole;
    }


    public void setNewRole(UserRole value) {
        this.newRole = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateEditUserRole)) {
            return false;
        }
        ValidateEditUserRole otherObj = (ValidateEditUserRole) obj;

        return (this.oldRoleName != null ? this.oldRoleName.equals(otherObj.oldRoleName) : this.oldRoleName == otherObj.oldRoleName) && (this.newRole != null ? this.newRole.equals(otherObj.newRole) : this.newRole == otherObj.newRole);
    }


    public int hashCode() {
        return (this.oldRoleName != null ? this.oldRoleName.hashCode() : 0) ^ (this.newRole != null ? this.newRole.hashCode() : 0);
    }


    public String toString() {
        return "ValidateEditUserRole [oldRoleName=" + this.oldRoleName + ", " + "newRole=" + this.newRole + "]";
    }
}


