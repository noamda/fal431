package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupStatistics", propOrder = {"consistencyGroupUID", "consistencyGroupCopyStatistics", "consistencyGroupLinkStatistics"})
public class ConsistencyGroupStatistics {
    @XmlElement(nillable = true)
    protected ConsistencyGroupUID consistencyGroupUID;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyStatistics> consistencyGroupCopyStatistics;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupLinkStatistics> consistencyGroupLinkStatistics;

    public ConsistencyGroupStatistics() {
    }

    public ConsistencyGroupStatistics(ConsistencyGroupUID consistencyGroupUID, List<ConsistencyGroupCopyStatistics> consistencyGroupCopyStatistics, List<ConsistencyGroupLinkStatistics> consistencyGroupLinkStatistics) {
        this.consistencyGroupUID = consistencyGroupUID;
        this.consistencyGroupCopyStatistics = consistencyGroupCopyStatistics;
        this.consistencyGroupLinkStatistics = consistencyGroupLinkStatistics;
    }


    public ConsistencyGroupUID getConsistencyGroupUID() {
        return this.consistencyGroupUID;
    }


    public void setConsistencyGroupUID(ConsistencyGroupUID value) {
        this.consistencyGroupUID = value;
    }


    public List<ConsistencyGroupCopyStatistics> getConsistencyGroupCopyStatistics() {
        if (this.consistencyGroupCopyStatistics == null) {
            this.consistencyGroupCopyStatistics = new ArrayList();
        }
        return this.consistencyGroupCopyStatistics;
    }


    public List<ConsistencyGroupLinkStatistics> getConsistencyGroupLinkStatistics() {
        if (this.consistencyGroupLinkStatistics == null) {
            this.consistencyGroupLinkStatistics = new ArrayList();
        }
        return this.consistencyGroupLinkStatistics;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupStatistics)) {
            return false;
        }
        ConsistencyGroupStatistics otherObj = (ConsistencyGroupStatistics) obj;

        return (this.consistencyGroupUID != null ? this.consistencyGroupUID.equals(otherObj.consistencyGroupUID) : this.consistencyGroupUID == otherObj.consistencyGroupUID) && (this.consistencyGroupCopyStatistics != null ? this.consistencyGroupCopyStatistics.equals(otherObj.consistencyGroupCopyStatistics) : this.consistencyGroupCopyStatistics == otherObj.consistencyGroupCopyStatistics) && (this.consistencyGroupLinkStatistics != null ? this.consistencyGroupLinkStatistics.equals(otherObj.consistencyGroupLinkStatistics) : this.consistencyGroupLinkStatistics == otherObj.consistencyGroupLinkStatistics);
    }


    public int hashCode() {
        return (this.consistencyGroupUID != null ? this.consistencyGroupUID.hashCode() : 0) ^ (this.consistencyGroupCopyStatistics != null ? this.consistencyGroupCopyStatistics.hashCode() : 0) ^ (this.consistencyGroupLinkStatistics != null ? this.consistencyGroupLinkStatistics.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupStatistics [consistencyGroupUID=" + this.consistencyGroupUID + ", " + "consistencyGroupCopyStatistics=" + this.consistencyGroupCopyStatistics + ", " + "consistencyGroupLinkStatistics=" + this.consistencyGroupLinkStatistics + "]";
    }
}


