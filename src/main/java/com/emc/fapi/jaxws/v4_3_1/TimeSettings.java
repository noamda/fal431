package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSettings", propOrder = {"useClustersTimeZones"})
public class TimeSettings {
    protected boolean useClustersTimeZones;

    public TimeSettings() {
    }

    public TimeSettings(boolean useClustersTimeZones) {
        this.useClustersTimeZones = useClustersTimeZones;
    }


    public boolean isUseClustersTimeZones() {
        return this.useClustersTimeZones;
    }


    public void setUseClustersTimeZones(boolean value) {
        this.useClustersTimeZones = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof TimeSettings)) {
            return false;
        }
        TimeSettings otherObj = (TimeSettings) obj;

        return this.useClustersTimeZones == otherObj.useClustersTimeZones;
    }


    public int hashCode() {
        return this.useClustersTimeZones ? 1 : 0;
    }


    public String toString() {
        return "TimeSettings [useClustersTimeZones=" + this.useClustersTimeZones + "]";
    }
}


