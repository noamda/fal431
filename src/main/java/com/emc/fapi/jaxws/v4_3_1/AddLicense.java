package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addLicense", propOrder = {"license"})
public class AddLicense {
    protected String license;

    public AddLicense() {
    }

    public AddLicense(String license) {
        this.license = license;
    }


    public String getLicense() {
        return this.license;
    }


    public void setLicense(String value) {
        this.license = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddLicense)) {
            return false;
        }
        AddLicense otherObj = (AddLicense) obj;

        return this.license == otherObj.license ? true : this.license != null ? this.license.equals(otherObj.license) : false;
    }


    public int hashCode() {
        return this.license != null ? this.license.hashCode() : 0;
    }


    public String toString() {
        return "AddLicense [license=" + this.license + "]";
    }
}


