package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetectBottlenecksFilter", propOrder = {"workingMode", "timeFrame", "peakDuration", "advancedOverview", "detailedOverview", "groups"})
public class DetectBottlenecksFilter {
    @XmlElement(required = true)
    protected BottlenecksDetectionMode workingMode;
    @XmlElement(nillable = true)
    protected TimeFrame timeFrame;
    protected Quantity peakDuration;
    protected Boolean advancedOverview;
    protected Boolean detailedOverview;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupUID> groups;

    public DetectBottlenecksFilter() {
    }

    public DetectBottlenecksFilter(BottlenecksDetectionMode workingMode, TimeFrame timeFrame, Quantity peakDuration, Boolean advancedOverview, Boolean detailedOverview, List<ConsistencyGroupUID> groups) {
        this.workingMode = workingMode;
        this.timeFrame = timeFrame;
        this.peakDuration = peakDuration;
        this.advancedOverview = advancedOverview;
        this.detailedOverview = detailedOverview;
        this.groups = groups;
    }


    public BottlenecksDetectionMode getWorkingMode() {
        return this.workingMode;
    }


    public void setWorkingMode(BottlenecksDetectionMode value) {
        this.workingMode = value;
    }


    public TimeFrame getTimeFrame() {
        return this.timeFrame;
    }


    public void setTimeFrame(TimeFrame value) {
        this.timeFrame = value;
    }


    public Quantity getPeakDuration() {
        return this.peakDuration;
    }


    public void setPeakDuration(Quantity value) {
        this.peakDuration = value;
    }


    public Boolean isAdvancedOverview() {
        return this.advancedOverview;
    }


    public void setAdvancedOverview(Boolean value) {
        this.advancedOverview = value;
    }


    public Boolean isDetailedOverview() {
        return this.detailedOverview;
    }


    public void setDetailedOverview(Boolean value) {
        this.detailedOverview = value;
    }


    public List<ConsistencyGroupUID> getGroups() {
        if (this.groups == null) {
            this.groups = new ArrayList();
        }
        return this.groups;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof DetectBottlenecksFilter)) {
            return false;
        }
        DetectBottlenecksFilter otherObj = (DetectBottlenecksFilter) obj;

        return (this.workingMode != null ? this.workingMode.equals(otherObj.workingMode) : this.workingMode == otherObj.workingMode) && (this.timeFrame != null ? this.timeFrame.equals(otherObj.timeFrame) : this.timeFrame == otherObj.timeFrame) && (this.peakDuration != null ? this.peakDuration.equals(otherObj.peakDuration) : this.peakDuration == otherObj.peakDuration) && (this.advancedOverview != null ? this.advancedOverview.equals(otherObj.advancedOverview) : this.advancedOverview == otherObj.advancedOverview) && (this.detailedOverview != null ? this.detailedOverview.equals(otherObj.detailedOverview) : this.detailedOverview == otherObj.detailedOverview) && (this.groups != null ? this.groups.equals(otherObj.groups) : this.groups == otherObj.groups);
    }


    public int hashCode() {
        return (this.workingMode != null ? this.workingMode.hashCode() : 0) ^ (this.timeFrame != null ? this.timeFrame.hashCode() : 0) ^ (this.peakDuration != null ? this.peakDuration.hashCode() : 0) ^ (this.advancedOverview != null ? this.advancedOverview.hashCode() : 0) ^ (this.detailedOverview != null ? this.detailedOverview.hashCode() : 0) ^ (this.groups != null ? this.groups.hashCode() : 0);
    }


    public String toString() {
        return "DetectBottlenecksFilter [workingMode=" + this.workingMode + ", " + "timeFrame=" + this.timeFrame + ", " + "peakDuration=" + this.peakDuration + ", " + "advancedOverview=" + this.advancedOverview + ", " + "detailedOverview=" + this.detailedOverview + ", " + "groups=" + this.groups + "]";
    }
}


