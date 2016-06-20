package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VCenterServerFilters", propOrder = {"vcenterServer", "filters", "filterUnknownLuns"})
public class VCenterServerFilters {
    @XmlElement(required = true)
    protected VCenterServerUID vcenterServer;
    @XmlElement(required = true)
    protected List<VCenterServerFilter> filters;
    protected boolean filterUnknownLuns;

    public VCenterServerFilters() {
    }

    public VCenterServerFilters(VCenterServerUID vcenterServer, List<VCenterServerFilter> filters, boolean filterUnknownLuns) {
        this.vcenterServer = vcenterServer;
        this.filters = filters;
        this.filterUnknownLuns = filterUnknownLuns;
    }


    public VCenterServerUID getVcenterServer() {
        return this.vcenterServer;
    }


    public void setVcenterServer(VCenterServerUID value) {
        this.vcenterServer = value;
    }


    public List<VCenterServerFilter> getFilters() {
        if (this.filters == null) {
            this.filters = new ArrayList();
        }
        return this.filters;
    }


    public boolean isFilterUnknownLuns() {
        return this.filterUnknownLuns;
    }


    public void setFilterUnknownLuns(boolean value) {
        this.filterUnknownLuns = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VCenterServerFilters)) {
            return false;
        }
        VCenterServerFilters otherObj = (VCenterServerFilters) obj;

        return (this.vcenterServer != null ? this.vcenterServer.equals(otherObj.vcenterServer) : this.vcenterServer == otherObj.vcenterServer) && (this.filters != null ? this.filters.equals(otherObj.filters) : this.filters == otherObj.filters) && (this.filterUnknownLuns == otherObj.filterUnknownLuns);
    }


    public int hashCode() {
        return (this.vcenterServer != null ? this.vcenterServer.hashCode() : 0) ^ (this.filters != null ? this.filters.hashCode() : 0) ^ (this.filterUnknownLuns ? 1 : 0);
    }


    public String toString() {
        return "VCenterServerFilters [vcenterServer=" + this.vcenterServer + ", " + "filters=" + this.filters + ", " + "filterUnknownLuns=" + this.filterUnknownLuns + "]";
    }
}


