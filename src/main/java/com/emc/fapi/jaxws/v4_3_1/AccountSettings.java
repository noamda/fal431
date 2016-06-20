package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSettings", propOrder = {"contactInfo", "licenses"})
public class AccountSettings {
    protected String contactInfo;
    @XmlElement(nillable = true)
    protected List<LicenseSettings> licenses;

    public AccountSettings() {
    }

    public AccountSettings(String contactInfo, List<LicenseSettings> licenses) {
        this.contactInfo = contactInfo;
        this.licenses = licenses;
    }


    public String getContactInfo() {
        return this.contactInfo;
    }


    public void setContactInfo(String value) {
        this.contactInfo = value;
    }


    public List<LicenseSettings> getLicenses() {
        if (this.licenses == null) {
            this.licenses = new ArrayList();
        }
        return this.licenses;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AccountSettings)) {
            return false;
        }
        AccountSettings otherObj = (AccountSettings) obj;

        return (this.contactInfo != null ? this.contactInfo.equals(otherObj.contactInfo) : this.contactInfo == otherObj.contactInfo) && (this.licenses != null ? this.licenses.equals(otherObj.licenses) : this.licenses == otherObj.licenses);
    }


    public int hashCode() {
        return (this.contactInfo != null ? this.contactInfo.hashCode() : 0) ^ (this.licenses != null ? this.licenses.hashCode() : 0);
    }


    public String toString() {
        return "AccountSettings [contactInfo=" + this.contactInfo + ", " + "licenses=" + this.licenses + "]";
    }
}


