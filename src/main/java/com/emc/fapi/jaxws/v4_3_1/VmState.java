package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmState", propOrder = {"vmUID", "name", "vmToolsInstalled", "virtualDisksState"})
public class VmState {
    @XmlElement(nillable = true)
    protected VmUID vmUID;
    protected String name;
    protected boolean vmToolsInstalled;
    @XmlElement(nillable = true)
    protected List<VirtualDiskState> virtualDisksState;

    public VmState() {
    }

    public VmState(VmUID vmUID, String name, boolean vmToolsInstalled, List<VirtualDiskState> virtualDisksState) {
        this.vmUID = vmUID;
        this.name = name;
        this.vmToolsInstalled = vmToolsInstalled;
        this.virtualDisksState = virtualDisksState;
    }


    public VmUID getVmUID() {
        return this.vmUID;
    }


    public void setVmUID(VmUID value) {
        this.vmUID = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public boolean isVmToolsInstalled() {
        return this.vmToolsInstalled;
    }


    public void setVmToolsInstalled(boolean value) {
        this.vmToolsInstalled = value;
    }


    public List<VirtualDiskState> getVirtualDisksState() {
        if (this.virtualDisksState == null) {
            this.virtualDisksState = new ArrayList();
        }
        return this.virtualDisksState;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmState)) {
            return false;
        }
        VmState otherObj = (VmState) obj;

        return (this.vmUID != null ? this.vmUID.equals(otherObj.vmUID) : this.vmUID == otherObj.vmUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.vmToolsInstalled == otherObj.vmToolsInstalled) && (this.virtualDisksState != null ? this.virtualDisksState.equals(otherObj.virtualDisksState) : this.virtualDisksState == otherObj.virtualDisksState);
    }


    public int hashCode() {
        return (this.vmUID != null ? this.vmUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.vmToolsInstalled ? 1 : 0) ^ (this.virtualDisksState != null ? this.virtualDisksState.hashCode() : 0);
    }


    public String toString() {
        return "VmState [vmUID=" + this.vmUID + ", " + "name=" + this.name + ", " + "vmToolsInstalled=" + this.vmToolsInstalled + ", " + "virtualDisksState=" + this.virtualDisksState + "]";
    }
}


