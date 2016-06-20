package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LongTermStatisticsTimeFrames", propOrder = {"timeFrames"})
public class LongTermStatisticsTimeFrames {
    @XmlElement(required = true)
    protected List<LongTermStatisticsTimeFrame> timeFrames;

    public LongTermStatisticsTimeFrames() {
    }

    public LongTermStatisticsTimeFrames(List<LongTermStatisticsTimeFrame> timeFrames) {
        this.timeFrames = timeFrames;
    }


    public List<LongTermStatisticsTimeFrame> getTimeFrames() {
        if (this.timeFrames == null) {
            this.timeFrames = new ArrayList();
        }
        return this.timeFrames;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof LongTermStatisticsTimeFrames)) {
            return false;
        }
        LongTermStatisticsTimeFrames otherObj = (LongTermStatisticsTimeFrames) obj;

        return this.timeFrames == otherObj.timeFrames ? true : this.timeFrames != null ? this.timeFrames.equals(otherObj.timeFrames) : false;
    }


    public int hashCode() {
        return this.timeFrames != null ? this.timeFrames.hashCode() : 0;
    }


    public String toString() {
        return "LongTermStatisticsTimeFrames [timeFrames=" + this.timeFrames + "]";
    }
}


