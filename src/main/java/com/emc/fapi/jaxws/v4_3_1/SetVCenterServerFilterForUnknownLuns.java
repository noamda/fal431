package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setVCenterServerFilterForUnknownLuns", propOrder = {"vCenterServer", "shouldFilterUnknownLuns"})
public class SetVCenterServerFilterForUnknownLuns {
    protected VCenterServerUID vCenterServer;
    protected boolean shouldFilterUnknownLuns;

    public SetVCenterServerFilterForUnknownLuns() {
    }

    public SetVCenterServerFilterForUnknownLuns(VCenterServerUID vCenterServer, boolean shouldFilterUnknownLuns) {
        this.vCenterServer = vCenterServer;
        this.shouldFilterUnknownLuns = shouldFilterUnknownLuns;
    }


    public VCenterServerUID getVCenterServer() {
        return this.vCenterServer;
    }


    public void setVCenterServer(VCenterServerUID value) {
        this.vCenterServer = value;
    }


    public boolean isShouldFilterUnknownLuns() {
        return this.shouldFilterUnknownLuns;
    }


    public void setShouldFilterUnknownLuns(boolean value) {
        this.shouldFilterUnknownLuns = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetVCenterServerFilterForUnknownLuns)) {
            return false;
        }
        SetVCenterServerFilterForUnknownLuns otherObj = (SetVCenterServerFilterForUnknownLuns) obj;

        return (this.vCenterServer != null ? this.vCenterServer.equals(otherObj.vCenterServer) : this.vCenterServer == otherObj.vCenterServer) && (this.shouldFilterUnknownLuns == otherObj.shouldFilterUnknownLuns);
    }


    public int hashCode() {
        return (this.vCenterServer != null ? this.vCenterServer.hashCode() : 0) ^ (this.shouldFilterUnknownLuns ? 1 : 0);
    }


    public String toString() {
        return "SetVCenterServerFilterForUnknownLuns [vCenterServer=" + this.vCenterServer + ", " + "shouldFilterUnknownLuns=" + this.shouldFilterUnknownLuns + "]";
    }
}


