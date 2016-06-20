package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupLinkStatistics", propOrder = {"initStatistics", "linkUID", "pipeStatistics"})
public class ConsistencyGroupLinkStatistics {
    protected ConsistencyGroupLinkInitStatistics initStatistics;
    protected ConsistencyGroupLinkUID linkUID;
    protected ConsistencyGroupLinkPipeStatistics pipeStatistics;

    public ConsistencyGroupLinkStatistics() {
    }

    public ConsistencyGroupLinkStatistics(ConsistencyGroupLinkInitStatistics initStatistics, ConsistencyGroupLinkUID linkUID, ConsistencyGroupLinkPipeStatistics pipeStatistics) {
        this.initStatistics = initStatistics;
        this.linkUID = linkUID;
        this.pipeStatistics = pipeStatistics;
    }


    public ConsistencyGroupLinkInitStatistics getInitStatistics() {
        return this.initStatistics;
    }


    public void setInitStatistics(ConsistencyGroupLinkInitStatistics value) {
        this.initStatistics = value;
    }


    public ConsistencyGroupLinkUID getLinkUID() {
        return this.linkUID;
    }


    public void setLinkUID(ConsistencyGroupLinkUID value) {
        this.linkUID = value;
    }


    public ConsistencyGroupLinkPipeStatistics getPipeStatistics() {
        return this.pipeStatistics;
    }


    public void setPipeStatistics(ConsistencyGroupLinkPipeStatistics value) {
        this.pipeStatistics = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupLinkStatistics)) {
            return false;
        }
        ConsistencyGroupLinkStatistics otherObj = (ConsistencyGroupLinkStatistics) obj;

        return (this.initStatistics != null ? this.initStatistics.equals(otherObj.initStatistics) : this.initStatistics == otherObj.initStatistics) && (this.linkUID != null ? this.linkUID.equals(otherObj.linkUID) : this.linkUID == otherObj.linkUID) && (this.pipeStatistics != null ? this.pipeStatistics.equals(otherObj.pipeStatistics) : this.pipeStatistics == otherObj.pipeStatistics);
    }


    public int hashCode() {
        return (this.initStatistics != null ? this.initStatistics.hashCode() : 0) ^ (this.linkUID != null ? this.linkUID.hashCode() : 0) ^ (this.pipeStatistics != null ? this.pipeStatistics.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupLinkStatistics [initStatistics=" + this.initStatistics + ", " + "linkUID=" + this.linkUID + ", " + "pipeStatistics=" + this.pipeStatistics + "]";
    }
}


