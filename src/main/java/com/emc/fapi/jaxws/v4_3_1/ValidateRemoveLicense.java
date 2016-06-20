package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateRemoveLicense", propOrder = {"license"})
public class ValidateRemoveLicense {
    protected LicenseUID license;

    public ValidateRemoveLicense() {
    }

    public ValidateRemoveLicense(LicenseUID license) {
        this.license = license;
    }


    public LicenseUID getLicense() {
        return this.license;
    }


    public void setLicense(LicenseUID value) {
        this.license = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateRemoveLicense)) {
            return false;
        }
        ValidateRemoveLicense otherObj = (ValidateRemoveLicense) obj;

        return this.license == otherObj.license ? true : this.license != null ? this.license.equals(otherObj.license) : false;
    }


    public int hashCode() {
        return this.license != null ? this.license.hashCode() : 0;
    }


    public String toString() {
        return "ValidateRemoveLicense [license=" + this.license + "]";
    }
}


