package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerContactEmail", propOrder = {"email"})
public class RegisterContactEmail {
    protected String email;

    public RegisterContactEmail() {
    }

    public RegisterContactEmail(String email) {
        this.email = email;
    }


    public String getEmail() {
        return this.email;
    }


    public void setEmail(String value) {
        this.email = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RegisterContactEmail)) {
            return false;
        }
        RegisterContactEmail otherObj = (RegisterContactEmail) obj;

        return this.email == otherObj.email ? true : this.email != null ? this.email.equals(otherObj.email) : false;
    }


    public int hashCode() {
        return this.email != null ? this.email.hashCode() : 0;
    }


    public String toString() {
        return "RegisterContactEmail [email=" + this.email + "]";
    }
}


