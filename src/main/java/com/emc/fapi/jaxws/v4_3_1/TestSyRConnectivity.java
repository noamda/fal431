package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testSyRConnectivity", propOrder = {"contactEmail"})
public class TestSyRConnectivity {
    protected String contactEmail;

    public TestSyRConnectivity() {
    }

    public TestSyRConnectivity(String contactEmail) {
        this.contactEmail = contactEmail;
    }


    public String getContactEmail() {
        return this.contactEmail;
    }


    public void setContactEmail(String value) {
        this.contactEmail = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof TestSyRConnectivity)) {
            return false;
        }
        TestSyRConnectivity otherObj = (TestSyRConnectivity) obj;

        return this.contactEmail == otherObj.contactEmail ? true : this.contactEmail != null ? this.contactEmail.equals(otherObj.contactEmail) : false;
    }


    public int hashCode() {
        return this.contactEmail != null ? this.contactEmail.hashCode() : 0;
    }


    public String toString() {
        return "TestSyRConnectivity [contactEmail=" + this.contactEmail + "]";
    }
}


