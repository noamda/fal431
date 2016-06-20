package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficStatistics", propOrder = {"applicationIncomingWrites", "applicationThroughputStatistics", "connectionsCompressionRatio", "initThroughputStatistics"})
public class TrafficStatistics {
    protected long applicationIncomingWrites;
    protected InOutThroughputStatistics applicationThroughputStatistics;
    @XmlElement(nillable = true)
    protected List<ConnectionCompressionRatio> connectionsCompressionRatio;
    protected InOutThroughputStatistics initThroughputStatistics;

    public TrafficStatistics() {
    }

    public TrafficStatistics(long applicationIncomingWrites, InOutThroughputStatistics applicationThroughputStatistics, List<ConnectionCompressionRatio> connectionsCompressionRatio, InOutThroughputStatistics initThroughputStatistics) {
        this.applicationIncomingWrites = applicationIncomingWrites;
        this.applicationThroughputStatistics = applicationThroughputStatistics;
        this.connectionsCompressionRatio = connectionsCompressionRatio;
        this.initThroughputStatistics = initThroughputStatistics;
    }


    public long getApplicationIncomingWrites() {
        return this.applicationIncomingWrites;
    }


    public void setApplicationIncomingWrites(long value) {
        this.applicationIncomingWrites = value;
    }


    public InOutThroughputStatistics getApplicationThroughputStatistics() {
        return this.applicationThroughputStatistics;
    }


    public void setApplicationThroughputStatistics(InOutThroughputStatistics value) {
        this.applicationThroughputStatistics = value;
    }


    public List<ConnectionCompressionRatio> getConnectionsCompressionRatio() {
        if (this.connectionsCompressionRatio == null) {
            this.connectionsCompressionRatio = new ArrayList();
        }
        return this.connectionsCompressionRatio;
    }


    public InOutThroughputStatistics getInitThroughputStatistics() {
        return this.initThroughputStatistics;
    }


    public void setInitThroughputStatistics(InOutThroughputStatistics value) {
        this.initThroughputStatistics = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof TrafficStatistics)) {
            return false;
        }
        TrafficStatistics otherObj = (TrafficStatistics) obj;

        return (this.applicationIncomingWrites == otherObj.applicationIncomingWrites) && (this.applicationThroughputStatistics != null ? this.applicationThroughputStatistics.equals(otherObj.applicationThroughputStatistics) : this.applicationThroughputStatistics == otherObj.applicationThroughputStatistics) && (this.connectionsCompressionRatio != null ? this.connectionsCompressionRatio.equals(otherObj.connectionsCompressionRatio) : this.connectionsCompressionRatio == otherObj.connectionsCompressionRatio) && (this.initThroughputStatistics != null ? this.initThroughputStatistics.equals(otherObj.initThroughputStatistics) : this.initThroughputStatistics == otherObj.initThroughputStatistics);
    }


    public int hashCode() {
        return (int) this.applicationIncomingWrites ^ (this.applicationThroughputStatistics != null ? this.applicationThroughputStatistics.hashCode() : 0) ^ (this.connectionsCompressionRatio != null ? this.connectionsCompressionRatio.hashCode() : 0) ^ (this.initThroughputStatistics != null ? this.initThroughputStatistics.hashCode() : 0);
    }


    public String toString() {
        return "TrafficStatistics [applicationIncomingWrites=" + this.applicationIncomingWrites + ", " + "applicationThroughputStatistics=" + this.applicationThroughputStatistics + ", " + "connectionsCompressionRatio=" + this.connectionsCompressionRatio + ", " + "initThroughputStatistics=" + this.initThroughputStatistics + "]";
    }
}


