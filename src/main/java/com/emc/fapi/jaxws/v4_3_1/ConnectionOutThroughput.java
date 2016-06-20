package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionOutThroughput", propOrder = {"cluster", "outThroughput"})
public class ConnectionOutThroughput {
    protected ClusterUID cluster;
    protected long outThroughput;

    public ConnectionOutThroughput() {
    }

    public ConnectionOutThroughput(ClusterUID cluster, long outThroughput) {
        this.cluster = cluster;
        this.outThroughput = outThroughput;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public long getOutThroughput() {
        return this.outThroughput;
    }


    public void setOutThroughput(long value) {
        this.outThroughput = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionOutThroughput)) {
            return false;
        }
        ConnectionOutThroughput otherObj = (ConnectionOutThroughput) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.outThroughput == otherObj.outThroughput);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (int) this.outThroughput;
    }


    public String toString() {
        return "ConnectionOutThroughput [cluster=" + this.cluster + ", " + "outThroughput=" + this.outThroughput + "]";
    }
}


