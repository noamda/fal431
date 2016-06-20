package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setPassword", propOrder = {"username", "currentPassword", "newPassword"})
public class SetPassword {
    protected String username;
    @XmlElement(nillable = true)
    protected byte[] currentPassword;
    @XmlElement(nillable = true)
    protected byte[] newPassword;

    public SetPassword() {
    }

    public SetPassword(String username, byte[] currentPassword, byte[] newPassword) {
        this.username = username;
        this.currentPassword = currentPassword;
        this.newPassword = newPassword;
    }


    public String getUsername() {
        return this.username;
    }


    public void setUsername(String value) {
        this.username = value;
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


    public boolean equals(Object obj) {
        if (!(obj instanceof SetPassword)) {
            return false;
        }
        SetPassword otherObj = (SetPassword) obj;

        return (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username) && (this.currentPassword != null ? this.currentPassword.equals(otherObj.currentPassword) : this.currentPassword == otherObj.currentPassword) && (this.newPassword != null ? this.newPassword.equals(otherObj.newPassword) : this.newPassword == otherObj.newPassword);
    }


    public int hashCode() {
        return (this.username != null ? this.username.hashCode() : 0) ^ (this.currentPassword != null ? this.currentPassword.hashCode() : 0) ^ (this.newPassword != null ? this.newPassword.hashCode() : 0);
    }


    public String toString() {
        return "SetPassword [username=" + this.username + ", " + "currentPassword=" + this.currentPassword + ", " + "newPassword=" + this.newPassword + "]";
    }
}


