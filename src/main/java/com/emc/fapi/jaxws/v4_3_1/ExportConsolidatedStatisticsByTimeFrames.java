package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportConsolidatedStatisticsByTimeFrames", propOrder = {"timeFrames"})
public class ExportConsolidatedStatisticsByTimeFrames {
    protected LongTermStatisticsTimeFrames timeFrames;

    public ExportConsolidatedStatisticsByTimeFrames() {
    }

    public ExportConsolidatedStatisticsByTimeFrames(LongTermStatisticsTimeFrames timeFrames) {
        this.timeFrames = timeFrames;
    }


    public LongTermStatisticsTimeFrames getTimeFrames() {
        return this.timeFrames;
    }


    public void setTimeFrames(LongTermStatisticsTimeFrames value) {
        this.timeFrames = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ExportConsolidatedStatisticsByTimeFrames)) {
            return false;
        }
        ExportConsolidatedStatisticsByTimeFrames otherObj = (ExportConsolidatedStatisticsByTimeFrames) obj;

        return this.timeFrames == otherObj.timeFrames ? true : this.timeFrames != null ? this.timeFrames.equals(otherObj.timeFrames) : false;
    }


    public int hashCode() {
        return this.timeFrames != null ? this.timeFrames.hashCode() : 0;
    }


    public String toString() {
        return "ExportConsolidatedStatisticsByTimeFrames [timeFrames=" + this.timeFrames + "]";
    }
}


