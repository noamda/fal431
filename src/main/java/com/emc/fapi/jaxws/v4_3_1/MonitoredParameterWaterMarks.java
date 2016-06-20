package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoredParameterWaterMarks", propOrder = {"highWaterMark", "limit", "lowWaterMark"})
public class MonitoredParameterWaterMarks {
    protected long highWaterMark;
    protected long limit;
    protected long lowWaterMark;

    public MonitoredParameterWaterMarks() {
    }

    public MonitoredParameterWaterMarks(long highWaterMark, long limit, long lowWaterMark) {
        this.highWaterMark = highWaterMark;
        this.limit = limit;
        this.lowWaterMark = lowWaterMark;
    }


    public long getHighWaterMark() {
        return this.highWaterMark;
    }


    public void setHighWaterMark(long value) {
        this.highWaterMark = value;
    }


    public long getLimit() {
        return this.limit;
    }


    public void setLimit(long value) {
        this.limit = value;
    }


    public long getLowWaterMark() {
        return this.lowWaterMark;
    }


    public void setLowWaterMark(long value) {
        this.lowWaterMark = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof MonitoredParameterWaterMarks)) {
            return false;
        }
        MonitoredParameterWaterMarks otherObj = (MonitoredParameterWaterMarks) obj;

        return (this.highWaterMark == otherObj.highWaterMark) && (this.limit == otherObj.limit) && (this.lowWaterMark == otherObj.lowWaterMark);
    }


    public int hashCode() {
        return (int) this.highWaterMark ^ (int) this.limit ^ (int) this.lowWaterMark;
    }


    public String toString() {
        return "MonitoredParameterWaterMarks [highWaterMark=" + this.highWaterMark + ", " + "limit=" + this.limit + ", " + "lowWaterMark=" + this.lowWaterMark + "]";
    }
}


