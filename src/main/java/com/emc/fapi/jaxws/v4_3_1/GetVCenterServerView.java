package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVCenterServerView", propOrder = {"vCenterServer", "shouldRescan"})
public class GetVCenterServerView {
    protected VCenterServerUID vCenterServer;
    protected boolean shouldRescan;

    public GetVCenterServerView() {
    }

    public GetVCenterServerView(VCenterServerUID vCenterServer, boolean shouldRescan) {
        this.vCenterServer = vCenterServer;
        this.shouldRescan = shouldRescan;
    }


    public VCenterServerUID getVCenterServer() {
        return this.vCenterServer;
    }


    public void setVCenterServer(VCenterServerUID value) {
        this.vCenterServer = value;
    }


    public boolean isShouldRescan() {
        return this.shouldRescan;
    }


    public void setShouldRescan(boolean value) {
        this.shouldRescan = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVCenterServerView)) {
            return false;
        }
        GetVCenterServerView otherObj = (GetVCenterServerView) obj;

        return (this.vCenterServer != null ? this.vCenterServer.equals(otherObj.vCenterServer) : this.vCenterServer == otherObj.vCenterServer) && (this.shouldRescan == otherObj.shouldRescan);
    }


    public int hashCode() {
        return (this.vCenterServer != null ? this.vCenterServer.hashCode() : 0) ^ (this.shouldRescan ? 1 : 0);
    }


    public String toString() {
        return "GetVCenterServerView [vCenterServer=" + this.vCenterServer + ", " + "shouldRescan=" + this.shouldRescan + "]";
    }
}


