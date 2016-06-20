package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setPasswordParams", propOrder = {"currentPassword", "newPassword", "username"})
public class SetPasswordParams {
    protected byte[] currentPassword;
    protected byte[] newPassword;
    protected String username;

    public SetPasswordParams() {
    }

    public SetPasswordParams(byte[] currentPassword, byte[] newPassword, String username) {
        this.currentPassword = currentPassword;
        this.newPassword = newPassword;
        this.username = username;
    }


    public byte[] getCurrentPassword() {
        return this.currentPassword;
    }


    public void setCurrentPassword(byte[] value) {
        this.currentPassword = value;
    }


    public byte[] getNewPassword() {
        return this.newPassword;
    }


    public void setNewPassword(byte[] value) {
        this.newPassword = value;
    }


    public String getUsername() {
        return this.username;
    }


    public void setUsername(String value) {
        this.username = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetPasswordParams)) {
            return false;
        }
        SetPasswordParams otherObj = (SetPasswordParams) obj;

        return (this.currentPassword != null ? this.currentPassword.equals(otherObj.currentPassword) : this.currentPassword == otherObj.currentPassword) && (this.newPassword != null ? this.newPassword.equals(otherObj.newPassword) : this.newPassword == otherObj.newPassword) && (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username);
    }


    public int hashCode() {
        return (this.currentPassword != null ? this.currentPassword.hashCode() : 0) ^ (this.newPassword != null ? this.newPassword.hashCode() : 0) ^ (this.username != null ? this.username.hashCode() : 0);
    }


    public String toString() {
        return "SetPasswordParams [currentPassword=" + this.currentPassword + ", " + "newPassword=" + this.newPassword + ", " + "username=" + this.username + "]";
    }
}


