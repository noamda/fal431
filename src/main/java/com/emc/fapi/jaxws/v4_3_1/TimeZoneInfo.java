package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeZoneInfo", propOrder = {"offsetInMilliseconds", "timeZone"})
public class TimeZoneInfo {
    protected int offsetInMilliseconds;
    protected String timeZone;

    public TimeZoneInfo() {
    }

    public TimeZoneInfo(int offsetInMilliseconds, String timeZone) {
        this.offsetInMilliseconds = offsetInMilliseconds;
        this.timeZone = timeZone;
    }


    public int getOffsetInMilliseconds() {
        return this.offsetInMilliseconds;
    }


    public void setOffsetInMilliseconds(int value) {
        this.offsetInMilliseconds = value;
    }


    public String getTimeZone() {
        return this.timeZone;
    }


    public void setTimeZone(String value) {
        this.timeZone = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof TimeZoneInfo)) {
            return false;
        }
        TimeZoneInfo otherObj = (TimeZoneInfo) obj;

        return (this.offsetInMilliseconds == otherObj.offsetInMilliseconds) && (this.timeZone != null ? this.timeZone.equals(otherObj.timeZone) : this.timeZone == otherObj.timeZone);
    }


    public int hashCode() {
        return this.offsetInMilliseconds ^ (this.timeZone != null ? this.timeZone.hashCode() : 0);
    }


    public String toString() {
        return "TimeZoneInfo [offsetInMilliseconds=" + this.offsetInMilliseconds + ", " + "timeZone=" + this.timeZone + "]";
    }
}


