package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Chap", propOrder = {"password", "passwordEncrypted", "username"})
public class Chap {
    protected byte[] password;
    protected boolean passwordEncrypted;
    protected String username;

    public Chap() {
    }

    public Chap(byte[] password, boolean passwordEncrypted, String username) {
        this.password = password;
        this.passwordEncrypted = passwordEncrypted;
        this.username = username;
    }


    public byte[] getPassword() {
        return this.password;
    }


    public void setPassword(byte[] value) {
        this.password = value;
    }


    public boolean isPasswordEncrypted() {
        return this.passwordEncrypted;
    }


    public void setPasswordEncrypted(boolean value) {
        this.passwordEncrypted = value;
    }


    public String getUsername() {
        return this.username;
    }


    public void setUsername(String value) {
        this.username = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof Chap)) {
            return false;
        }
        Chap otherObj = (Chap) obj;

        return (this.password != null ? this.password.equals(otherObj.password) : this.password == otherObj.password) && (this.passwordEncrypted == otherObj.passwordEncrypted) && (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username);
    }


    public int hashCode() {
        return (this.password != null ? this.password.hashCode() : 0) ^ (this.passwordEncrypted ? 1 : 0) ^ (this.username != null ? this.username.hashCode() : 0);
    }


    public String toString() {
        return "Chap [password=" + this.password + ", " + "passwordEncrypted=" + this.passwordEncrypted + ", " + "username=" + this.username + "]";
    }
}


