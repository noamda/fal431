package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restSystemSecurityLevel", propOrder = {"restEnum"})
public class RestSystemSecurityLevel {
    protected SystemSecurityLevel restEnum;

    public RestSystemSecurityLevel() {
    }

    public RestSystemSecurityLevel(SystemSecurityLevel restEnum) {
        this.restEnum = restEnum;
    }


    public SystemSecurityLevel getRestEnum() {
        return this.restEnum;
    }


    public void setRestEnum(SystemSecurityLevel value) {
        this.restEnum = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RestSystemSecurityLevel)) {
            return false;
        }
        RestSystemSecurityLevel otherObj = (RestSystemSecurityLevel) obj;

        return this.restEnum == otherObj.restEnum ? true : this.restEnum != null ? this.restEnum.equals(otherObj.restEnum) : false;
    }


    public int hashCode() {
        return this.restEnum != null ? this.restEnum.hashCode() : 0;
    }


    public String toString() {
        return "RestSystemSecurityLevel [restEnum=" + this.restEnum + "]";
    }
}


