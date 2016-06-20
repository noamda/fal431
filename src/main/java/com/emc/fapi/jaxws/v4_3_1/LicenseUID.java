package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseUID", propOrder = {"id"})
public class LicenseUID {
    @XmlElement(required = true)
    protected String id;

    public LicenseUID() {
    }

    public LicenseUID(String id) {
        this.id = id;
    }


    public String getId() {
        return this.id;
    }


    public void setId(String value) {
        this.id = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof LicenseUID)) {
            return false;
        }
        LicenseUID otherObj = (LicenseUID) obj;

        return this.id == otherObj.id ? true : this.id != null ? this.id.equals(otherObj.id) : false;
    }


    public int hashCode() {
        return this.id != null ? this.id.hashCode() : 0;
    }


    public String toString() {
        return "LicenseUID [id=" + this.id + "]";
    }
}


