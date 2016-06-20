package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VCenterServerView", propOrder = {"connectionStatus", "esxsView", "vcServerUID"})
public class VCenterServerView {
    protected VCenterServerConnectionStatus connectionStatus;
    @XmlElement(nillable = true)
    protected List<ESXView> esxsView;
    protected VCenterServerUID vcServerUID;

    public VCenterServerView() {
    }

    public VCenterServerView(VCenterServerConnectionStatus connectionStatus, List<ESXView> esxsView, VCenterServerUID vcServerUID) {
        this.connectionStatus = connectionStatus;
        this.esxsView = esxsView;
        this.vcServerUID = vcServerUID;
    }


    public VCenterServerConnectionStatus getConnectionStatus() {
        return this.connectionStatus;
    }


    public void setConnectionStatus(VCenterServerConnectionStatus value) {
        this.connectionStatus = value;
    }


    public List<ESXView> getEsxsView() {
        if (this.esxsView == null) {
            this.esxsView = new ArrayList();
        }
        return this.esxsView;
    }


    public VCenterServerUID getVcServerUID() {
        return this.vcServerUID;
    }


    public void setVcServerUID(VCenterServerUID value) {
        this.vcServerUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VCenterServerView)) {
            return false;
        }
        VCenterServerView otherObj = (VCenterServerView) obj;

        return (this.connectionStatus != null ? this.connectionStatus.equals(otherObj.connectionStatus) : this.connectionStatus == otherObj.connectionStatus) && (this.esxsView != null ? this.esxsView.equals(otherObj.esxsView) : this.esxsView == otherObj.esxsView) && (this.vcServerUID != null ? this.vcServerUID.equals(otherObj.vcServerUID) : this.vcServerUID == otherObj.vcServerUID);
    }


    public int hashCode() {
        return (this.connectionStatus != null ? this.connectionStatus.hashCode() : 0) ^ (this.esxsView != null ? this.esxsView.hashCode() : 0) ^ (this.vcServerUID != null ? this.vcServerUID.hashCode() : 0);
    }


    public String toString() {
        return "VCenterServerView [connectionStatus=" + this.connectionStatus + ", " + "esxsView=" + this.esxsView + ", " + "vcServerUID=" + this.vcServerUID + "]";
    }
}


