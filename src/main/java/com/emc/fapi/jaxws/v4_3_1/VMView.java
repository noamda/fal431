package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMView", propOrder = {"dataStores", "filtered", "ip", "name", "protectingGroupUID", "protectionStatus", "rdmDevices", "template"})
public class VMView {
    @XmlElement(nillable = true)
    protected List<DataStore> dataStores;
    protected boolean filtered;
    protected String ip;
    protected String name;
    protected ConsistencyGroupUID protectingGroupUID;
    protected VmProtectionStatus protectionStatus;
    @XmlElement(nillable = true)
    protected List<VMVolume> rdmDevices;
    protected boolean template;

    public VMView() {
    }

    public VMView(List<DataStore> dataStores, boolean filtered, String ip, String name, ConsistencyGroupUID protectingGroupUID, VmProtectionStatus protectionStatus, List<VMVolume> rdmDevices, boolean template) {
        this.dataStores = dataStores;
        this.filtered = filtered;
        this.ip = ip;
        this.name = name;
        this.protectingGroupUID = protectingGroupUID;
        this.protectionStatus = protectionStatus;
        this.rdmDevices = rdmDevices;
        this.template = template;
    }


    public List<DataStore> getDataStores() {
        if (this.dataStores == null) {
            this.dataStores = new ArrayList();
        }
        return this.dataStores;
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


    public ConsistencyGroupUID getProtectingGroupUID() {
        return this.protectingGroupUID;
    }


    public void setProtectingGroupUID(ConsistencyGroupUID value) {
        this.protectingGroupUID = value;
    }


    public VmProtectionStatus getProtectionStatus() {
        return this.protectionStatus;
    }


    public void setProtectionStatus(VmProtectionStatus value) {
        this.protectionStatus = value;
    }


    public List<VMVolume> getRdmDevices() {
        if (this.rdmDevices == null) {
            this.rdmDevices = new ArrayList();
        }
        return this.rdmDevices;
    }


    public boolean isTemplate() {
        return this.template;
    }


    public void setTemplate(boolean value) {
        this.template = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VMView)) {
            return false;
        }
        VMView otherObj = (VMView) obj;

        return (this.dataStores != null ? this.dataStores.equals(otherObj.dataStores) : this.dataStores == otherObj.dataStores) && (this.filtered == otherObj.filtered) && (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.protectingGroupUID != null ? this.protectingGroupUID.equals(otherObj.protectingGroupUID) : this.protectingGroupUID == otherObj.protectingGroupUID) && (this.protectionStatus != null ? this.protectionStatus.equals(otherObj.protectionStatus) : this.protectionStatus == otherObj.protectionStatus) && (this.rdmDevices != null ? this.rdmDevices.equals(otherObj.rdmDevices) : this.rdmDevices == otherObj.rdmDevices) && (this.template == otherObj.template);
    }


    public int hashCode() {
        return (this.dataStores != null ? this.dataStores.hashCode() : 0) ^ (this.filtered ? 1 : 0) ^ (this.ip != null ? this.ip.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.protectingGroupUID != null ? this.protectingGroupUID.hashCode() : 0) ^ (this.protectionStatus != null ? this.protectionStatus.hashCode() : 0) ^ (this.rdmDevices != null ? this.rdmDevices.hashCode() : 0) ^ (this.template ? 1 : 0);
    }


    public String toString() {
        return "VMView [dataStores=" + this.dataStores + ", " + "filtered=" + this.filtered + ", " + "ip=" + this.ip + ", " + "name=" + this.name + ", " + "protectingGroupUID=" + this.protectingGroupUID + ", " + "protectionStatus=" + this.protectionStatus + ", " + "rdmDevices=" + this.rdmDevices + ", " + "template=" + this.template + "]";
    }
}


