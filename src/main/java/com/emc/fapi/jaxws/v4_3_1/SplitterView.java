package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitterView", propOrder = {"splitterInfo", "groupCopies", "volumes"})
public class SplitterView {
    @XmlElement(nillable = true)
    protected SplitterInfo splitterInfo;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyInfo> groupCopies;
    @XmlElement(nillable = true)
    protected List<DeviceInfo> volumes;

    public SplitterView() {
    }

    public SplitterView(SplitterInfo splitterInfo, List<ConsistencyGroupCopyInfo> groupCopies, List<DeviceInfo> volumes) {
        this.splitterInfo = splitterInfo;
        this.groupCopies = groupCopies;
        this.volumes = volumes;
    }


    public SplitterInfo getSplitterInfo() {
        return this.splitterInfo;
    }


    public void setSplitterInfo(SplitterInfo value) {
        this.splitterInfo = value;
    }


    public List<ConsistencyGroupCopyInfo> getGroupCopies() {
        if (this.groupCopies == null) {
            this.groupCopies = new ArrayList();
        }
        return this.groupCopies;
    }


    public List<DeviceInfo> getVolumes() {
        if (this.volumes == null) {
            this.volumes = new ArrayList();
        }
        return this.volumes;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SplitterView)) {
            return false;
        }
        SplitterView otherObj = (SplitterView) obj;

        return (this.splitterInfo != null ? this.splitterInfo.equals(otherObj.splitterInfo) : this.splitterInfo == otherObj.splitterInfo) && (this.groupCopies != null ? this.groupCopies.equals(otherObj.groupCopies) : this.groupCopies == otherObj.groupCopies) && (this.volumes != null ? this.volumes.equals(otherObj.volumes) : this.volumes == otherObj.volumes);
    }


    public int hashCode() {
        return (this.splitterInfo != null ? this.splitterInfo.hashCode() : 0) ^ (this.groupCopies != null ? this.groupCopies.hashCode() : 0) ^ (this.volumes != null ? this.volumes.hashCode() : 0);
    }


    public String toString() {
        return "SplitterView [splitterInfo=" + this.splitterInfo + ", " + "groupCopies=" + this.groupCopies + ", " + "volumes=" + this.volumes + "]";
    }
}


