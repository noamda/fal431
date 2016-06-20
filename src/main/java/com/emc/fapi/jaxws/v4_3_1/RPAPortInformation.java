package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RPAPortInformation", propOrder = {"nodeWWN", "portIndex", "portWWN"})
public class RPAPortInformation {
    protected String nodeWWN;
    protected long portIndex;
    protected String portWWN;

    public RPAPortInformation() {
    }

    public RPAPortInformation(String nodeWWN, long portIndex, String portWWN) {
        this.nodeWWN = nodeWWN;
        this.portIndex = portIndex;
        this.portWWN = portWWN;
    }


    public String getNodeWWN() {
        return this.nodeWWN;
    }


    public void setNodeWWN(String value) {
        this.nodeWWN = value;
    }


    public long getPortIndex() {
        return this.portIndex;
    }


    public void setPortIndex(long value) {
        this.portIndex = value;
    }


    public String getPortWWN() {
        return this.portWWN;
    }


    public void setPortWWN(String value) {
        this.portWWN = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RPAPortInformation)) {
            return false;
        }
        RPAPortInformation otherObj = (RPAPortInformation) obj;

        return (this.nodeWWN != null ? this.nodeWWN.equals(otherObj.nodeWWN) : this.nodeWWN == otherObj.nodeWWN) && (this.portIndex == otherObj.portIndex) && (this.portWWN != null ? this.portWWN.equals(otherObj.portWWN) : this.portWWN == otherObj.portWWN);
    }


    public int hashCode() {
        return (this.nodeWWN != null ? this.nodeWWN.hashCode() : 0) ^ (int) this.portIndex ^ (this.portWWN != null ? this.portWWN.hashCode() : 0);
    }


    public String toString() {
        return "RPAPortInformation [nodeWWN=" + this.nodeWWN + ", " + "portIndex=" + this.portIndex + ", " + "portWWN=" + this.portWWN + "]";
    }
}


