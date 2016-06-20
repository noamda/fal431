package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LongTermStatisticsTimeFrame", propOrder = {"granularity", "timeFrame"})
public class LongTermStatisticsTimeFrame {
    @XmlElement(required = true)
    protected StatisticsGranularity granularity;
    @XmlElement(nillable = true)
    protected TimeFrame timeFrame;

    public LongTermStatisticsTimeFrame() {
    }

    public LongTermStatisticsTimeFrame(StatisticsGranularity granularity, TimeFrame timeFrame) {
        this.granularity = granularity;
        this.timeFrame = timeFrame;
    }


    public StatisticsGranularity getGranularity() {
        return this.granularity;
    }


    public void setGranularity(StatisticsGranularity value) {
        this.granularity = value;
    }


    public TimeFrame getTimeFrame() {
        return this.timeFrame;
    }


    public void setTimeFrame(TimeFrame value) {
        this.timeFrame = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof LongTermStatisticsTimeFrame)) {
            return false;
        }
        LongTermStatisticsTimeFrame otherObj = (LongTermStatisticsTimeFrame) obj;

        return (this.granularity != null ? this.granularity.equals(otherObj.granularity) : this.granularity == otherObj.granularity) && (this.timeFrame != null ? this.timeFrame.equals(otherObj.timeFrame) : this.timeFrame == otherObj.timeFrame);
    }


    public int hashCode() {
        return (this.granularity != null ? this.granularity.hashCode() : 0) ^ (this.timeFrame != null ? this.timeFrame.hashCode() : 0);
    }


    public String toString() {
        return "LongTermStatisticsTimeFrame [granularity=" + this.granularity + ", " + "timeFrame=" + this.timeFrame + "]";
    }
}


