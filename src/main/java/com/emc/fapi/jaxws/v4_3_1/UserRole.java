package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserRole", propOrder = {"roleName", "permissions"})
public class UserRole {
    @XmlElement(required = true)
    protected String roleName;
    @XmlElement(required = true)
    protected List<Permission> permissions;

    public UserRole() {
    }

    public UserRole(String roleName, List<Permission> permissions) {
        this.roleName = roleName;
        this.permissions = permissions;
    }


    public String getRoleName() {
        return this.roleName;
    }


    public void setRoleName(String value) {
        this.roleName = value;
    }


    public List<Permission> getPermissions() {
        if (this.permissions == null) {
            this.permissions = new ArrayList();
        }
        return this.permissions;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof UserRole)) {
            return false;
        }
        UserRole otherObj = (UserRole) obj;

        return (this.roleName != null ? this.roleName.equals(otherObj.roleName) : this.roleName == otherObj.roleName) && (this.permissions != null ? this.permissions.equals(otherObj.permissions) : this.permissions == otherObj.permissions);
    }


    public int hashCode() {
        return (this.roleName != null ? this.roleName.hashCode() : 0) ^ (this.permissions != null ? this.permissions.hashCode() : 0);
    }


    public String toString() {
        return "UserRole [roleName=" + this.roleName + ", " + "permissions=" + this.permissions + "]";
    }
}


