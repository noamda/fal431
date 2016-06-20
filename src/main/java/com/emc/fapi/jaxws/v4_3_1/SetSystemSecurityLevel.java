package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSystemSecurityLevel", propOrder = {"securityLevel"})
public class SetSystemSecurityLevel {
    protected SystemSecurityLevel securityLevel;

    public SetSystemSecurityLevel() {
    }

    public SetSystemSecurityLevel(SystemSecurityLevel securityLevel) {
        this.securityLevel = securityLevel;
    }


    public SystemSecurityLevel getSecurityLevel() {
        return this.securityLevel;
    }


    public void setSecurityLevel(SystemSecurityLevel value) {
        this.securityLevel = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetSystemSecurityLevel)) {
            return false;
        }
        SetSystemSecurityLevel otherObj = (SetSystemSecurityLevel) obj;

        return this.securityLevel == otherObj.securityLevel ? true : this.securityLevel != null ? this.securityLevel.equals(otherObj.securityLevel) : false;
    }


    public int hashCode() {
        return this.securityLevel != null ? this.securityLevel.hashCode() : 0;
    }


    public String toString() {
        return "SetSystemSecurityLevel [securityLevel=" + this.securityLevel + "]";
    }
}


