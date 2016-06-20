package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsersSettings", propOrder = {"usersRoles", "users", "ldapSettings"})
public class UsersSettings {
    @XmlElement(required = true)
    protected List<UserRole> usersRoles;
    @XmlElement(required = true)
    protected List<RecoverPointUser> users;
    @XmlElement(required = true, nillable = true)
    protected LDAPSettings ldapSettings;

    public UsersSettings() {
    }

    public UsersSettings(List<UserRole> usersRoles, List<RecoverPointUser> users, LDAPSettings ldapSettings) {
        this.usersRoles = usersRoles;
        this.users = users;
        this.ldapSettings = ldapSettings;
    }


    public List<UserRole> getUsersRoles() {
        if (this.usersRoles == null) {
            this.usersRoles = new ArrayList();
        }
        return this.usersRoles;
    }


    public List<RecoverPointUser> getUsers() {
        if (this.users == null) {
            this.users = new ArrayList();
        }
        return this.users;
    }


    public LDAPSettings getLdapSettings() {
        return this.ldapSettings;
    }


    public void setLdapSettings(LDAPSettings value) {
        this.ldapSettings = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof UsersSettings)) {
            return false;
        }
        UsersSettings otherObj = (UsersSettings) obj;

        return (this.usersRoles != null ? this.usersRoles.equals(otherObj.usersRoles) : this.usersRoles == otherObj.usersRoles) && (this.users != null ? this.users.equals(otherObj.users) : this.users == otherObj.users) && (this.ldapSettings != null ? this.ldapSettings.equals(otherObj.ldapSettings) : this.ldapSettings == otherObj.ldapSettings);
    }


    public int hashCode() {
        return (this.usersRoles != null ? this.usersRoles.hashCode() : 0) ^ (this.users != null ? this.users.hashCode() : 0) ^ (this.ldapSettings != null ? this.ldapSettings.hashCode() : 0);
    }


    public String toString() {
        return "UsersSettings [usersRoles=" + this.usersRoles + ", " + "users=" + this.users + ", " + "ldapSettings=" + this.ldapSettings + "]";
    }
}


