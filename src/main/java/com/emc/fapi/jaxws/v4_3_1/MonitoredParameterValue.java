package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoredParameterValue", propOrder = {"parameterWaterMarks", "reverseWaterMarksDirection", "value"})
public class MonitoredParameterValue {
    protected MonitoredParameterWaterMarks parameterWaterMarks;
    protected boolean reverseWaterMarksDirection;
    protected long value;

    public MonitoredParameterValue() {
    }

    public MonitoredParameterValue(MonitoredParameterWaterMarks parameterWaterMarks, boolean reverseWaterMarksDirection, long value) {
        this.parameterWaterMarks = parameterWaterMarks;
        this.reverseWaterMarksDirection = reverseWaterMarksDirection;
        this.value = value;
    }


    public MonitoredParameterWaterMarks getParameterWaterMarks() {
        return this.parameterWaterMarks;
    }


    public void setParameterWaterMarks(MonitoredParameterWaterMarks value) {
        this.parameterWaterMarks = value;
    }


    public boolean isReverseWaterMarksDirection() {
        return this.reverseWaterMarksDirection;
    }


    public void setReverseWaterMarksDirection(boolean value) {
        this.reverseWaterMarksDirection = value;
    }


    public long getValue() {
        return this.value;
    }


    public void setValue(long value) {
        this.value = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof MonitoredParameterValue)) {
            return false;
        }
        MonitoredParameterValue otherObj = (MonitoredParameterValue) obj;

        return (this.parameterWaterMarks != null ? this.parameterWaterMarks.equals(otherObj.parameterWaterMarks) : this.parameterWaterMarks == otherObj.parameterWaterMarks) && (this.reverseWaterMarksDirection == otherObj.reverseWaterMarksDirection) && (this.value == otherObj.value);
    }


    public int hashCode() {
        return (this.parameterWaterMarks != null ? this.parameterWaterMarks.hashCode() : 0) ^ (this.reverseWaterMarksDirection ? 1 : 0) ^ (int) this.value;
    }


    public String toString() {
        return "MonitoredParameterValue [parameterWaterMarks=" + this.parameterWaterMarks + ", " + "reverseWaterMarksDirection=" + this.reverseWaterMarksDirection + ", " + "value=" + this.value + "]";
    }
}


