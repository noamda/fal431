package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InOutThroughputStatistics", propOrder = {"connectionsOutThroughput", "inThroughput"})
public class InOutThroughputStatistics {
    @XmlElement(nillable = true)
    protected List<ConnectionOutThroughput> connectionsOutThroughput;
    protected long inThroughput;

    public InOutThroughputStatistics() {
    }

    public InOutThroughputStatistics(List<ConnectionOutThroughput> connectionsOutThroughput, long inThroughput) {
        this.connectionsOutThroughput = connectionsOutThroughput;
        this.inThroughput = inThroughput;
    }


    public List<ConnectionOutThroughput> getConnectionsOutThroughput() {
        if (this.connectionsOutThroughput == null) {
            this.connectionsOutThroughput = new ArrayList();
        }
        return this.connectionsOutThroughput;
    }


    public long getInThroughput() {
        return this.inThroughput;
    }


    public void setInThroughput(long value) {
        this.inThroughput = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof InOutThroughputStatistics)) {
            return false;
        }
        InOutThroughputStatistics otherObj = (InOutThroughputStatistics) obj;

        return (this.connectionsOutThroughput != null ? this.connectionsOutThroughput.equals(otherObj.connectionsOutThroughput) : this.connectionsOutThroughput == otherObj.connectionsOutThroughput) && (this.inThroughput == otherObj.inThroughput);
    }


    public int hashCode() {
        return (this.connectionsOutThroughput != null ? this.connectionsOutThroughput.hashCode() : 0) ^ (int) this.inThroughput;
    }


    public String toString() {
        return "InOutThroughputStatistics [connectionsOutThroughput=" + this.connectionsOutThroughput + ", " + "inThroughput=" + this.inThroughput + "]";
    }
}


