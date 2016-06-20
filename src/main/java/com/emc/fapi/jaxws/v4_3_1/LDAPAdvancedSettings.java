package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LDAPAdvancedSettings", propOrder = {"searchTimeLimitInSeconds"})
public class LDAPAdvancedSettings {
    protected long searchTimeLimitInSeconds;

    public LDAPAdvancedSettings() {
    }

    public LDAPAdvancedSettings(long searchTimeLimitInSeconds) {
        this.searchTimeLimitInSeconds = searchTimeLimitInSeconds;
    }


    public long getSearchTimeLimitInSeconds() {
        return this.searchTimeLimitInSeconds;
    }


    public void setSearchTimeLimitInSeconds(long value) {
        this.searchTimeLimitInSeconds = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof LDAPAdvancedSettings)) {
            return false;
        }
        LDAPAdvancedSettings otherObj = (LDAPAdvancedSettings) obj;

        return this.searchTimeLimitInSeconds == otherObj.searchTimeLimitInSeconds;
    }


    public int hashCode() {
        return (int) this.searchTimeLimitInSeconds;
    }


    public String toString() {
        return "LDAPAdvancedSettings [searchTimeLimitInSeconds=" + this.searchTimeLimitInSeconds + "]";
    }
}


