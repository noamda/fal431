package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VCenterServersViewSettings", propOrder = {"vcenterServersFiltersEnabled"})
public class VCenterServersViewSettings {
    protected boolean vcenterServersFiltersEnabled;

    public VCenterServersViewSettings() {
    }

    public VCenterServersViewSettings(boolean vcenterServersFiltersEnabled) {
        this.vcenterServersFiltersEnabled = vcenterServersFiltersEnabled;
    }


    public boolean isVcenterServersFiltersEnabled() {
        return this.vcenterServersFiltersEnabled;
    }


    public void setVcenterServersFiltersEnabled(boolean value) {
        this.vcenterServersFiltersEnabled = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VCenterServersViewSettings)) {
            return false;
        }
        VCenterServersViewSettings otherObj = (VCenterServersViewSettings) obj;

        return this.vcenterServersFiltersEnabled == otherObj.vcenterServersFiltersEnabled;
    }


    public int hashCode() {
        return this.vcenterServersFiltersEnabled ? 1 : 0;
    }


    public String toString() {
        return "VCenterServersViewSettings [vcenterServersFiltersEnabled=" + this.vcenterServersFiltersEnabled + "]";
    }
}


