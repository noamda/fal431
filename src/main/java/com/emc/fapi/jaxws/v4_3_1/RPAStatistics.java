package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RPAStatistics", propOrder = {"rpaUID", "cpuUsage", "traffic"})
public class RPAStatistics {
    @XmlElement(nillable = true)
    protected RpaUID rpaUID;
    protected double cpuUsage;
    protected TrafficStatistics traffic;

    public RPAStatistics() {
    }

    public RPAStatistics(RpaUID rpaUID, double cpuUsage, TrafficStatistics traffic) {
        this.rpaUID = rpaUID;
        this.cpuUsage = cpuUsage;
        this.traffic = traffic;
    }


    public RpaUID getRpaUID() {
        return this.rpaUID;
    }


    public void setRpaUID(RpaUID value) {
        this.rpaUID = value;
    }


    public double getCpuUsage() {
        return this.cpuUsage;
    }


    public void setCpuUsage(double value) {
        this.cpuUsage = value;
    }


    public TrafficStatistics getTraffic() {
        return this.traffic;
    }


    public void setTraffic(TrafficStatistics value) {
        this.traffic = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RPAStatistics)) {
            return false;
        }
        RPAStatistics otherObj = (RPAStatistics) obj;

        return (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.cpuUsage == otherObj.cpuUsage) && (this.traffic != null ? this.traffic.equals(otherObj.traffic) : this.traffic == otherObj.traffic);
    }


    public int hashCode() {
        return (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ (int) this.cpuUsage ^ (this.traffic != null ? this.traffic.hashCode() : 0);
    }


    public String toString() {
        return "RPAStatistics [rpaUID=" + this.rpaUID + ", " + "cpuUsage=" + this.cpuUsage + ", " + "traffic=" + this.traffic + "]";
    }
}


