package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGroupSnapshotsForTimeFrameAndName", propOrder = {"group", "timeFrame", "name"})
public class GetGroupSnapshotsForTimeFrameAndName {
    protected ConsistencyGroupUID group;
    @XmlElement(nillable = true)
    protected TimeFrame timeFrame;
    protected String name;

    public GetGroupSnapshotsForTimeFrameAndName() {
    }

    public GetGroupSnapshotsForTimeFrameAndName(ConsistencyGroupUID group, TimeFrame timeFrame, String name) {
        this.group = group;
        this.timeFrame = timeFrame;
        this.name = name;
    }


    public ConsistencyGroupUID getGroup() {
        return this.group;
    }


    public void setGroup(ConsistencyGroupUID value) {
        this.group = value;
    }


    public TimeFrame getTimeFrame() {
        return this.timeFrame;
    }


    public void setTimeFrame(TimeFrame value) {
        this.timeFrame = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetGroupSnapshotsForTimeFrameAndName)) {
            return false;
        }
        GetGroupSnapshotsForTimeFrameAndName otherObj = (GetGroupSnapshotsForTimeFrameAndName) obj;

        return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.timeFrame != null ? this.timeFrame.equals(otherObj.timeFrame) : this.timeFrame == otherObj.timeFrame) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name);
    }


    public int hashCode() {
        return (this.group != null ? this.group.hashCode() : 0) ^ (this.timeFrame != null ? this.timeFrame.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0);
    }


    public String toString() {
        return "GetGroupSnapshotsForTimeFrameAndName [group=" + this.group + ", " + "timeFrame=" + this.timeFrame + ", " + "name=" + this.name + "]";
    }
}


