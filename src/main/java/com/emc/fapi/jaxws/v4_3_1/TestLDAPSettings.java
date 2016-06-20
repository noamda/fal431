package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testLDAPSettings", propOrder = {"settings"})
public class TestLDAPSettings {
    protected LDAPSettings settings;

    public TestLDAPSettings() {
    }

    public TestLDAPSettings(LDAPSettings settings) {
        this.settings = settings;
    }


    public LDAPSettings getSettings() {
        return this.settings;
    }


    public void setSettings(LDAPSettings value) {
        this.settings = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof TestLDAPSettings)) {
            return false;
        }
        TestLDAPSettings otherObj = (TestLDAPSettings) obj;

        return this.settings == otherObj.settings ? true : this.settings != null ? this.settings.equals(otherObj.settings) : false;
    }


    public int hashCode() {
        return this.settings != null ? this.settings.hashCode() : 0;
    }


    public String toString() {
        return "TestLDAPSettings [settings=" + this.settings + "]";
    }
}


