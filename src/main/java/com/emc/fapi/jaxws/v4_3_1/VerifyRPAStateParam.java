package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyRPAStateParam", propOrder = {"rpaStatus", "repositoryStatus", "hasClusterControl", "volumesConnectivityStatus", "rpasForConnectivityCheck", "rpasConnectivityStatus"})
public class VerifyRPAStateParam {
    @XmlElement(nillable = true)
    protected RpaStatus rpaStatus;
    protected VolumeStatus repositoryStatus;
    protected Boolean hasClusterControl;
    protected GeneralStatus volumesConnectivityStatus;
    @XmlElement(nillable = true)
    protected List<RpaUID> rpasForConnectivityCheck;
    protected GeneralStatus rpasConnectivityStatus;

    public VerifyRPAStateParam() {
    }

    public VerifyRPAStateParam(RpaStatus rpaStatus, VolumeStatus repositoryStatus, Boolean hasClusterControl, GeneralStatus volumesConnectivityStatus, List<RpaUID> rpasForConnectivityCheck, GeneralStatus rpasConnectivityStatus) {
        this.rpaStatus = rpaStatus;
        this.repositoryStatus = repositoryStatus;
        this.hasClusterControl = hasClusterControl;
        this.volumesConnectivityStatus = volumesConnectivityStatus;
        this.rpasForConnectivityCheck = rpasForConnectivityCheck;
        this.rpasConnectivityStatus = rpasConnectivityStatus;
    }


    public RpaStatus getRpaStatus() {
        return this.rpaStatus;
    }


    public void setRpaStatus(RpaStatus value) {
        this.rpaStatus = value;
    }


    public VolumeStatus getRepositoryStatus() {
        return this.repositoryStatus;
    }


    public void setRepositoryStatus(VolumeStatus value) {
        this.repositoryStatus = value;
    }


    public Boolean isHasClusterControl() {
        return this.hasClusterControl;
    }


    public void setHasClusterControl(Boolean value) {
        this.hasClusterControl = value;
    }


    public GeneralStatus getVolumesConnectivityStatus() {
        return this.volumesConnectivityStatus;
    }


    public void setVolumesConnectivityStatus(GeneralStatus value) {
        this.volumesConnectivityStatus = value;
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


    public boolean equals(Object obj) {
        if (!(obj instanceof VerifyRPAStateParam)) {
            return false;
        }
        VerifyRPAStateParam otherObj = (VerifyRPAStateParam) obj;

        return (this.rpaStatus != null ? this.rpaStatus.equals(otherObj.rpaStatus) : this.rpaStatus == otherObj.rpaStatus) && (this.repositoryStatus != null ? this.repositoryStatus.equals(otherObj.repositoryStatus) : this.repositoryStatus == otherObj.repositoryStatus) && (this.hasClusterControl != null ? this.hasClusterControl.equals(otherObj.hasClusterControl) : this.hasClusterControl == otherObj.hasClusterControl) && (this.volumesConnectivityStatus != null ? this.volumesConnectivityStatus.equals(otherObj.volumesConnectivityStatus) : this.volumesConnectivityStatus == otherObj.volumesConnectivityStatus) && (this.rpasForConnectivityCheck != null ? this.rpasForConnectivityCheck.equals(otherObj.rpasForConnectivityCheck) : this.rpasForConnectivityCheck == otherObj.rpasForConnectivityCheck) && (this.rpasConnectivityStatus != null ? this.rpasConnectivityStatus.equals(otherObj.rpasConnectivityStatus) : this.rpasConnectivityStatus == otherObj.rpasConnectivityStatus);
    }


    public int hashCode() {
        return (this.rpaStatus != null ? this.rpaStatus.hashCode() : 0) ^ (this.repositoryStatus != null ? this.repositoryStatus.hashCode() : 0) ^ (this.hasClusterControl != null ? this.hasClusterControl.hashCode() : 0) ^ (this.volumesConnectivityStatus != null ? this.volumesConnectivityStatus.hashCode() : 0) ^ (this.rpasForConnectivityCheck != null ? this.rpasForConnectivityCheck.hashCode() : 0) ^ (this.rpasConnectivityStatus != null ? this.rpasConnectivityStatus.hashCode() : 0);
    }


    public String toString() {
        return "VerifyRPAStateParam [rpaStatus=" + this.rpaStatus + ", " + "repositoryStatus=" + this.repositoryStatus + ", " + "hasClusterControl=" + this.hasClusterControl + ", " + "volumesConnectivityStatus=" + this.volumesConnectivityStatus + ", " + "rpasForConnectivityCheck=" + this.rpasForConnectivityCheck + ", " + "rpasConnectivityStatus=" + this.rpasConnectivityStatus + "]";
    }
}


