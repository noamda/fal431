package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifySplitterStateParam", propOrder = {"splitterStatus", "rpasForConnectivityCheck", "rpasConnectivityStatus", "volumesAccess", "groupCopiesToCheck"})
public class VerifySplitterStateParam {
    @XmlElement(nillable = true)
    protected SplitterStatus splitterStatus;
    @XmlElement(nillable = true)
    protected List<RpaUID> rpasForConnectivityCheck;
    protected GeneralStatus rpasConnectivityStatus;
    protected VolumeAccessState volumesAccess;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyUID> groupCopiesToCheck;

    public VerifySplitterStateParam() {
    }

    public VerifySplitterStateParam(SplitterStatus splitterStatus, List<RpaUID> rpasForConnectivityCheck, GeneralStatus rpasConnectivityStatus, VolumeAccessState volumesAccess, List<ConsistencyGroupCopyUID> groupCopiesToCheck) {
        this.splitterStatus = splitterStatus;
        this.rpasForConnectivityCheck = rpasForConnectivityCheck;
        this.rpasConnectivityStatus = rpasConnectivityStatus;
        this.volumesAccess = volumesAccess;
        this.groupCopiesToCheck = groupCopiesToCheck;
    }


    public SplitterStatus getSplitterStatus() {
        return this.splitterStatus;
    }


    public void setSplitterStatus(SplitterStatus value) {
        this.splitterStatus = value;
    }


    public List<RpaUID> getRpasForConnectivityCheck() {
        if (this.rpasForConnectivityCheck == null) {
            this.rpasForConnectivityCheck = new ArrayList();
        }
        return this.rpasForConnectivityCheck;
    }


    public GeneralStatus getRpasConnectivityStatus() {
        return this.rpasConnectivityStatus;
    }


    public void setRpasConnectivityStatus(GeneralStatus value) {
        this.rpasConnectivityStatus = value;
    }


    public VolumeAccessState getVolumesAccess() {
        return this.volumesAccess;
    }


    public void setVolumesAccess(VolumeAccessState value) {
        this.volumesAccess = value;
    }


    public List<ConsistencyGroupCopyUID> getGroupCopiesToCheck() {
        if (this.groupCopiesToCheck == null) {
            this.groupCopiesToCheck = new ArrayList();
        }
        return this.groupCopiesToCheck;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VerifySplitterStateParam)) {
            return false;
        }
        VerifySplitterStateParam otherObj = (VerifySplitterStateParam) obj;

        return (this.splitterStatus != null ? this.splitterStatus.equals(otherObj.splitterStatus) : this.splitterStatus == otherObj.splitterStatus) && (this.rpasForConnectivityCheck != null ? this.rpasForConnectivityCheck.equals(otherObj.rpasForConnectivityCheck) : this.rpasForConnectivityCheck == otherObj.rpasForConnectivityCheck) && (this.rpasConnectivityStatus != null ? this.rpasConnectivityStatus.equals(otherObj.rpasConnectivityStatus) : this.rpasConnectivityStatus == otherObj.rpasConnectivityStatus) && (this.volumesAccess != null ? this.volumesAccess.equals(otherObj.volumesAccess) : this.volumesAccess == otherObj.volumesAccess) && (this.groupCopiesToCheck != null ? this.groupCopiesToCheck.equals(otherObj.groupCopiesToCheck) : this.groupCopiesToCheck == otherObj.groupCopiesToCheck);
    }


    public int hashCode() {
        return (this.splitterStatus != null ? this.splitterStatus.hashCode() : 0) ^ (this.rpasForConnectivityCheck != null ? this.rpasForConnectivityCheck.hashCode() : 0) ^ (this.rpasConnectivityStatus != null ? this.rpasConnectivityStatus.hashCode() : 0) ^ (this.volumesAccess != null ? this.volumesAccess.hashCode() : 0) ^ (this.groupCopiesToCheck != null ? this.groupCopiesToCheck.hashCode() : 0);
    }


    public String toString() {
        return "VerifySplitterStateParam [splitterStatus=" + this.splitterStatus + ", " + "rpasForConnectivityCheck=" + this.rpasForConnectivityCheck + ", " + "rpasConnectivityStatus=" + this.rpasConnectivityStatus + ", " + "volumesAccess=" + this.volumesAccess + ", " + "groupCopiesToCheck=" + this.groupCopiesToCheck + "]";
    }
}


