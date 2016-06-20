package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportConsolidatedStatisticsByTimeFrame", propOrder = {"timeFrame"})
public class ExportConsolidatedStatisticsByTimeFrame {
    protected LongTermStatisticsTimeFrame timeFrame;

    public ExportConsolidatedStatisticsByTimeFrame() {
    }

    public ExportConsolidatedStatisticsByTimeFrame(LongTermStatisticsTimeFrame timeFrame) {
        this.timeFrame = timeFrame;
    }


    public LongTermStatisticsTimeFrame getTimeFrame() {
        return this.timeFrame;
    }


    public void setTimeFrame(LongTermStatisticsTimeFrame value) {
        this.timeFrame = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ExportConsolidatedStatisticsByTimeFrame)) {
            return false;
        }
        ExportConsolidatedStatisticsByTimeFrame otherObj = (ExportConsolidatedStatisticsByTimeFrame) obj;

        return this.timeFrame == otherObj.timeFrame ? true : this.timeFrame != null ? this.timeFrame.equals(otherObj.timeFrame) : false;
    }


    public int hashCode() {
        return this.timeFrame != null ? this.timeFrame.hashCode() : 0;
    }


    public String toString() {
        return "ExportConsolidatedStatisticsByTimeFrame [timeFrame=" + this.timeFrame + "]";
    }
}


