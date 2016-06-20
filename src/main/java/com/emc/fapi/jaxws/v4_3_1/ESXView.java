package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ESXView", propOrder = {"filtered", "ip", "name", "nonVMVolumes", "vmViews"})
public class ESXView {
    protected boolean filtered;
    protected String ip;
    protected String name;
    @XmlElement(nillable = true)
    protected List<VMVolume> nonVMVolumes;
    @XmlElement(nillable = true)
    protected List<VMView> vmViews;

    public ESXView() {
    }

    public ESXView(boolean filtered, String ip, String name, List<VMVolume> nonVMVolumes, List<VMView> vmViews) {
        this.filtered = filtered;
        this.ip = ip;
        this.name = name;
        this.nonVMVolumes = nonVMVolumes;
        this.vmViews = vmViews;
    }


    public boolean isFiltered() {
        return this.filtered;
    }


    public void setFiltered(boolean value) {
        this.filtered = value;
    }


    public String getIp() {
        return this.ip;
    }


    public void setIp(String value) {
        this.ip = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public List<VMVolume> getNonVMVolumes() {
        if (this.nonVMVolumes == null) {
            this.nonVMVolumes = new ArrayList();
        }
        return this.nonVMVolumes;
    }


    public List<VMView> getVmViews() {
        if (this.vmViews == null) {
            this.vmViews = new ArrayList();
        }
        return this.vmViews;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ESXView)) {
            return false;
        }
        ESXView otherObj = (ESXView) obj;

        return (this.filtered == otherObj.filtered) && (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.nonVMVolumes != null ? this.nonVMVolumes.equals(otherObj.nonVMVolumes) : this.nonVMVolumes == otherObj.nonVMVolumes) && (this.vmViews != null ? this.vmViews.equals(otherObj.vmViews) : this.vmViews == otherObj.vmViews);
    }


    public int hashCode() {
        return (this.filtered ? 1 : 0) ^ (this.ip != null ? this.ip.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.nonVMVolumes != null ? this.nonVMVolumes.hashCode() : 0) ^ (this.vmViews != null ? this.vmViews.hashCode() : 0);
    }


    public String toString() {
        return "ESXView [filtered=" + this.filtered + ", " + "ip=" + this.ip + ", " + "name=" + this.name + ", " + "nonVMVolumes=" + this.nonVMVolumes + ", " + "vmViews=" + this.vmViews + "]";
    }
}


