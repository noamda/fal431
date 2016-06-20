package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("FiberChannelPath")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiberChannelPath", propOrder = {"remotePortWWN", "localPortWWN", "localNodeWWN"})
public class FiberChannelPath
        extends Path {
    protected String remotePortWWN;
    protected String localPortWWN;
    protected String localNodeWWN;

    public FiberChannelPath() {
    }

    public FiberChannelPath(String remotePortWWN, String localPortWWN, String localNodeWWN) {
        this.remotePortWWN = remotePortWWN;
        this.localPortWWN = localPortWWN;
        this.localNodeWWN = localNodeWWN;
    }


    public String getRemotePortWWN() {
        return this.remotePortWWN;
    }


    public void setRemotePortWWN(String value) {
        this.remotePortWWN = value;
    }


    public String getLocalPortWWN() {
        return this.localPortWWN;
    }


    public void setLocalPortWWN(String value) {
        this.localPortWWN = value;
    }


    public String getLocalNodeWWN() {
        return this.localNodeWWN;
    }


    public void setLocalNodeWWN(String value) {
        this.localNodeWWN = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FiberChannelPath)) {
            return false;
        }
        FiberChannelPath otherObj = (FiberChannelPath) obj;

        return (super.equals(obj)) && (this.remotePortWWN != null ? this.remotePortWWN.equals(otherObj.remotePortWWN) : this.remotePortWWN == otherObj.remotePortWWN) && (this.localPortWWN != null ? this.localPortWWN.equals(otherObj.localPortWWN) : this.localPortWWN == otherObj.localPortWWN) && (this.localNodeWWN != null ? this.localNodeWWN.equals(otherObj.localNodeWWN) : this.localNodeWWN == otherObj.localNodeWWN);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.remotePortWWN != null ? this.remotePortWWN.hashCode() : 0) ^ (this.localPortWWN != null ? this.localPortWWN.hashCode() : 0) ^ (this.localNodeWWN != null ? this.localNodeWWN.hashCode() : 0);
    }


    public String toString() {
        return "FiberChannelPath [super=" + super.toString() + ", " + "remotePortWWN=" + this.remotePortWWN + ", " + "localPortWWN=" + this.localPortWWN + ", " + "localNodeWWN=" + this.localNodeWWN + "]";
    }
}


