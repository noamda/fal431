package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateSetSystemSecurityLevel", propOrder = {"securityLevel"})
public class ValidateSetSystemSecurityLevel {
    protected SystemSecurityLevel securityLevel;

    public ValidateSetSystemSecurityLevel() {
    }

    public ValidateSetSystemSecurityLevel(SystemSecurityLevel securityLevel) {
        this.securityLevel = securityLevel;
    }


    public SystemSecurityLevel getSecurityLevel() {
        return this.securityLevel;
    }


    public void setSecurityLevel(SystemSecurityLevel value) {
        this.securityLevel = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateSetSystemSecurityLevel)) {
            return false;
        }
        ValidateSetSystemSecurityLevel otherObj = (ValidateSetSystemSecurityLevel) obj;

        return this.securityLevel == otherObj.securityLevel ? true : this.securityLevel != null ? this.securityLevel.equals(otherObj.securityLevel) : false;
    }


    public int hashCode() {
        return this.securityLevel != null ? this.securityLevel.hashCode() : 0;
    }


    public String toString() {
        return "ValidateSetSystemSecurityLevel [securityLevel=" + this.securityLevel + "]";
    }
}


