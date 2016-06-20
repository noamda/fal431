package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addVCenterServerFilter", propOrder = {"vCenterServer", "filter"})
public class AddVCenterServerFilter {
    protected VCenterServerUID vCenterServer;
    protected VCenterServerFilter filter;

    public AddVCenterServerFilter() {
    }

    public AddVCenterServerFilter(VCenterServerUID vCenterServer, VCenterServerFilter filter) {
        this.vCenterServer = vCenterServer;
        this.filter = filter;
    }


    public VCenterServerUID getVCenterServer() {
        return this.vCenterServer;
    }


    public void setVCenterServer(VCenterServerUID value) {
        this.vCenterServer = value;
    }


    public VCenterServerFilter getFilter() {
        return this.filter;
    }


    public void setFilter(VCenterServerFilter value) {
        this.filter = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddVCenterServerFilter)) {
            return false;
        }
        AddVCenterServerFilter otherObj = (AddVCenterServerFilter) obj;

        return (this.vCenterServer != null ? this.vCenterServer.equals(otherObj.vCenterServer) : this.vCenterServer == otherObj.vCenterServer) && (this.filter != null ? this.filter.equals(otherObj.filter) : this.filter == otherObj.filter);
    }


    public int hashCode() {
        return (this.vCenterServer != null ? this.vCenterServer.hashCode() : 0) ^ (this.filter != null ? this.filter.hashCode() : 0);
    }


    public String toString() {
        return "AddVCenterServerFilter [vCenterServer=" + this.vCenterServer + ", " + "filter=" + this.filter + "]";
    }
}


