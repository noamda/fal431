package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeAllVCenterServerFilters", propOrder = {"vCenterServer"})
public class RemoveAllVCenterServerFilters {
    protected VCenterServerUID vCenterServer;

    public RemoveAllVCenterServerFilters() {
    }

    public RemoveAllVCenterServerFilters(VCenterServerUID vCenterServer) {
        this.vCenterServer = vCenterServer;
    }


    public VCenterServerUID getVCenterServer() {
        return this.vCenterServer;
    }


    public void setVCenterServer(VCenterServerUID value) {
        this.vCenterServer = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RemoveAllVCenterServerFilters)) {
            return false;
        }
        RemoveAllVCenterServerFilters otherObj = (RemoveAllVCenterServerFilters) obj;

        return this.vCenterServer == otherObj.vCenterServer ? true : this.vCenterServer != null ? this.vCenterServer.equals(otherObj.vCenterServer) : false;
    }


    public int hashCode() {
        return this.vCenterServer != null ? this.vCenterServer.hashCode() : 0;
    }


    public String toString() {
        return "RemoveAllVCenterServerFilters [vCenterServer=" + this.vCenterServer + "]";
    }
}


