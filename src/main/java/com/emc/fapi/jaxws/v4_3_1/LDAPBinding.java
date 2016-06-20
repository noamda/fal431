package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LDAPBinding", propOrder = {"bindDistinguishedName", "password", "passwordConfigured"})
public class LDAPBinding {
    @XmlElement(required = true)
    protected String bindDistinguishedName;
    protected byte[] password;
    protected boolean passwordConfigured;

    public LDAPBinding() {
    }

    public LDAPBinding(String bindDistinguishedName, byte[] password, boolean passwordConfigured) {
        this.bindDistinguishedName = bindDistinguishedName;
        this.password = password;
        this.passwordConfigured = passwordConfigured;
    }


    public String getBindDistinguishedName() {
        return this.bindDistinguishedName;
    }


    public void setBindDistinguishedName(String value) {
        this.bindDistinguishedName = value;
    }


    public byte[] getPassword() {
        return this.password;
    }


    public void setPassword(byte[] value) {
        this.password = value;
    }


    public boolean isPasswordConfigured() {
        return this.passwordConfigured;
    }


    public void setPasswordConfigured(boolean value) {
        this.passwordConfigured = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof LDAPBinding)) {
            return false;
        }
        LDAPBinding otherObj = (LDAPBinding) obj;

        return (this.bindDistinguishedName != null ? this.bindDistinguishedName.equals(otherObj.bindDistinguishedName) : this.bindDistinguishedName == otherObj.bindDistinguishedName) && (this.password != null ? this.password.equals(otherObj.password) : this.password == otherObj.password) && (this.passwordConfigured == otherObj.passwordConfigured);
    }


    public int hashCode() {
        return (this.bindDistinguishedName != null ? this.bindDistinguishedName.hashCode() : 0) ^ (this.password != null ? this.password.hashCode() : 0) ^ (this.passwordConfigured ? 1 : 0);
    }


    public String toString() {
        return "LDAPBinding [bindDistinguishedName=" + this.bindDistinguishedName + ", " + "password=" + this.password + ", " + "passwordConfigured=" + this.passwordConfigured + "]";
    }
}


