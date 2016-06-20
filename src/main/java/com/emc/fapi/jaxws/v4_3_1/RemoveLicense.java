package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeLicense", propOrder = {"license"})
public class RemoveLicense {
    protected LicenseUID license;

    public RemoveLicense() {
    }

    public RemoveLicense(LicenseUID license) {
        this.license = license;
    }


    public LicenseUID getLicense() {
        return this.license;
    }


    public void setLicense(LicenseUID value) {
        this.license = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RemoveLicense)) {
            return false;
        }
        RemoveLicense otherObj = (RemoveLicense) obj;

        return this.license == otherObj.license ? true : this.license != null ? this.license.equals(otherObj.license) : false;
    }


    public int hashCode() {
        return this.license != null ? this.license.hashCode() : 0;
    }


    public String toString() {
        return "RemoveLicense [license=" + this.license + "]";
    }
}


