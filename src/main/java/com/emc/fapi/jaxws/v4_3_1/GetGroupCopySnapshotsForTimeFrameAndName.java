package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGroupCopySnapshotsForTimeFrameAndName", propOrder = {"groupCopy", "timeFrame", "name"})
public class GetGroupCopySnapshotsForTimeFrameAndName {
    protected ConsistencyGroupCopyUID groupCopy;
    @XmlElement(nillable = true)
    protected TimeFrame timeFrame;
    protected String name;

    public GetGroupCopySnapshotsForTimeFrameAndName() {
    }

    public GetGroupCopySnapshotsForTimeFrameAndName(ConsistencyGroupCopyUID groupCopy, TimeFrame timeFrame, String name) {
        this.groupCopy = groupCopy;
        this.timeFrame = timeFrame;
        this.name = name;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
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
        if (!(obj instanceof GetGroupCopySnapshotsForTimeFrameAndName)) {
            return false;
        }
        GetGroupCopySnapshotsForTimeFrameAndName otherObj = (GetGroupCopySnapshotsForTimeFrameAndName) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.timeFrame != null ? this.timeFrame.equals(otherObj.timeFrame) : this.timeFrame == otherObj.timeFrame) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.timeFrame != null ? this.timeFrame.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0);
    }


    public String toString() {
        return "GetGroupCopySnapshotsForTimeFrameAndName [groupCopy=" + this.groupCopy + ", " + "timeFrame=" + this.timeFrame + ", " + "name=" + this.name + "]";
    }
}


