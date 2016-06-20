package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionCompressionRatio", propOrder = {"cluster", "compressionRatio"})
public class ConnectionCompressionRatio {
    protected ClusterUID cluster;
    protected double compressionRatio;

    public ConnectionCompressionRatio() {
    }

    public ConnectionCompressionRatio(ClusterUID cluster, double compressionRatio) {
        this.cluster = cluster;
        this.compressionRatio = compressionRatio;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public double getCompressionRatio() {
        return this.compressionRatio;
    }


    public void setCompressionRatio(double value) {
        this.compressionRatio = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionCompressionRatio)) {
            return false;
        }
        ConnectionCompressionRatio otherObj = (ConnectionCompressionRatio) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.compressionRatio == otherObj.compressionRatio);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (int) this.compressionRatio;
    }


    public String toString() {
        return "ConnectionCompressionRatio [cluster=" + this.cluster + ", " + "compressionRatio=" + this.compressionRatio + "]";
    }
}


