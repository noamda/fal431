package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("FiberChannelInitiatorInformation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiberChannelInitiatorInformation", propOrder = {"nodeWWN", "portWWN"})
public class FiberChannelInitiatorInformation
        extends InitiatorInformation {
    protected String nodeWWN;
    protected String portWWN;

    public FiberChannelInitiatorInformation() {
    }

    public FiberChannelInitiatorInformation(String nodeWWN, String portWWN) {
        this.nodeWWN = nodeWWN;
        this.portWWN = portWWN;
    }


    public String getNodeWWN() {
        return this.nodeWWN;
    }


    public void setNodeWWN(String value) {
        this.nodeWWN = value;
    }


    public String getPortWWN() {
        return this.portWWN;
    }


    public void setPortWWN(String value) {
        this.portWWN = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FiberChannelInitiatorInformation)) {
            return false;
        }
        FiberChannelInitiatorInformation otherObj = (FiberChannelInitiatorInformation) obj;

        return (super.equals(obj)) && (this.nodeWWN != null ? this.nodeWWN.equals(otherObj.nodeWWN) : this.nodeWWN == otherObj.nodeWWN) && (this.portWWN != null ? this.portWWN.equals(otherObj.portWWN) : this.portWWN == otherObj.portWWN);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.nodeWWN != null ? this.nodeWWN.hashCode() : 0) ^ (this.portWWN != null ? this.portWWN.hashCode() : 0);
    }


    public String toString() {
        return "FiberChannelInitiatorInformation [super=" + super.toString() + ", " + "nodeWWN=" + this.nodeWWN + ", " + "portWWN=" + this.portWWN + "]";
    }
}


