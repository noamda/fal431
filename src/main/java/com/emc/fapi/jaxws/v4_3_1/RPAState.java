package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RPAState", propOrder = {"rpaUID", "status", "repositoryConnectivityStatus", "remoteRPAsDataLinkStatus", "runningClusterControl", "remoteRPAsConnectivityStatus", "localRPAsFiberConnectivityStatus", "volumesConnectivityStatus", "interfacesStatus", "splittersConnectivityStatus", "globalSystemConfiguation", "version", "hardwareSerialID", "wanIP", "managementIPv4", "managementIPv6", "initiatorsState", "vendor", "hardwarePlatform", "hbaType", "systemMemory", "numberOfCores", "type"})
public class RPAState {
    @XmlElement(nillable = true)
    protected RpaUID rpaUID;
    protected RpaStatus status;
    protected VolumeStatus repositoryConnectivityStatus;
    @XmlElement(nillable = true)
    protected List<RPAConnectivityStatus> remoteRPAsDataLinkStatus;
    protected boolean runningClusterControl;
    @XmlElement(nillable = true)
    protected List<RPAConnectivityStatus> remoteRPAsConnectivityStatus;
    @XmlElement(nillable = true)
    protected List<RPAConnectivityStatus> localRPAsFiberConnectivityStatus;
    @XmlElement(nillable = true)
    protected List<VolumeConnectivityStatus> volumesConnectivityStatus;
    @XmlElement(nillable = true)
    protected List<RPAInterfaceStatus> interfacesStatus;
    @XmlElement(nillable = true)
    protected List<SplitterConnectivityStatus> splittersConnectivityStatus;
    protected GlobalSystemConfiguration globalSystemConfiguation;
    protected RecoverPointVersion version;
    protected String hardwareSerialID;
    protected String wanIP;
    protected String managementIPv4;
    protected String managementIPv6;
    @XmlElement(nillable = true)
    protected List<InitiatorInformation> initiatorsState;
    protected String vendor;
    protected String hardwarePlatform;
    protected long hbaType;
    protected long systemMemory;
    protected long numberOfCores;
    protected RpaType type;

    public RPAState() {
    }

    public RPAState(RpaUID rpaUID, RpaStatus status, VolumeStatus repositoryConnectivityStatus, List<RPAConnectivityStatus> remoteRPAsDataLinkStatus, boolean runningClusterControl, List<RPAConnectivityStatus> remoteRPAsConnectivityStatus, List<RPAConnectivityStatus> localRPAsFiberConnectivityStatus, List<VolumeConnectivityStatus> volumesConnectivityStatus, List<RPAInterfaceStatus> interfacesStatus, List<SplitterConnectivityStatus> splittersConnectivityStatus, GlobalSystemConfiguration globalSystemConfiguation, RecoverPointVersion version, String hardwareSerialID, String wanIP, String managementIPv4, String managementIPv6, List<InitiatorInformation> initiatorsState, String vendor, String hardwarePlatform, long hbaType, long systemMemory, long numberOfCores, RpaType type) {
        this.rpaUID = rpaUID;
        this.status = status;
        this.repositoryConnectivityStatus = repositoryConnectivityStatus;
        this.remoteRPAsDataLinkStatus = remoteRPAsDataLinkStatus;
        this.runningClusterControl = runningClusterControl;
        this.remoteRPAsConnectivityStatus = remoteRPAsConnectivityStatus;
        this.localRPAsFiberConnectivityStatus = localRPAsFiberConnectivityStatus;
        this.volumesConnectivityStatus = volumesConnectivityStatus;
        this.interfacesStatus = interfacesStatus;
        this.splittersConnectivityStatus = splittersConnectivityStatus;
        this.globalSystemConfiguation = globalSystemConfiguation;
        this.version = version;
        this.hardwareSerialID = hardwareSerialID;
        this.wanIP = wanIP;
        this.managementIPv4 = managementIPv4;
        this.managementIPv6 = managementIPv6;
        this.initiatorsState = initiatorsState;
        this.vendor = vendor;
        this.hardwarePlatform = hardwarePlatform;
        this.hbaType = hbaType;
        this.systemMemory = systemMemory;
        this.numberOfCores = numberOfCores;
        this.type = type;
    }


    public RpaUID getRpaUID() {
        return this.rpaUID;
    }


    public void setRpaUID(RpaUID value) {
        this.rpaUID = value;
    }


    public RpaStatus getStatus() {
        return this.status;
    }


    public void setStatus(RpaStatus value) {
        this.status = value;
    }


    public VolumeStatus getRepositoryConnectivityStatus() {
        return this.repositoryConnectivityStatus;
    }


    public void setRepositoryConnectivityStatus(VolumeStatus value) {
        this.repositoryConnectivityStatus = value;
    }


    public List<RPAConnectivityStatus> getRemoteRPAsDataLinkStatus() {
        if (this.remoteRPAsDataLinkStatus == null) {
            this.remoteRPAsDataLinkStatus = new ArrayList();
        }
        return this.remoteRPAsDataLinkStatus;
    }


    public boolean isRunningClusterControl() {
        return this.runningClusterControl;
    }


    public void setRunningClusterControl(boolean value) {
        this.runningClusterControl = value;
    }


    public List<RPAConnectivityStatus> getRemoteRPAsConnectivityStatus() {
        if (this.remoteRPAsConnectivityStatus == null) {
            this.remoteRPAsConnectivityStatus = new ArrayList();
        }
        return this.remoteRPAsConnectivityStatus;
    }


    public List<RPAConnectivityStatus> getLocalRPAsFiberConnectivityStatus() {
        if (this.localRPAsFiberConnectivityStatus == null) {
            this.localRPAsFiberConnectivityStatus = new ArrayList();
        }
        return this.localRPAsFiberConnectivityStatus;
    }


    public List<VolumeConnectivityStatus> getVolumesConnectivityStatus() {
        if (this.volumesConnectivityStatus == null) {
            this.volumesConnectivityStatus = new ArrayList();
        }
        return this.volumesConnectivityStatus;
    }


    public List<RPAInterfaceStatus> getInterfacesStatus() {
        if (this.interfacesStatus == null) {
            this.interfacesStatus = new ArrayList();
        }
        return this.interfacesStatus;
    }


    public List<SplitterConnectivityStatus> getSplittersConnectivityStatus() {
        if (this.splittersConnectivityStatus == null) {
            this.splittersConnectivityStatus = new ArrayList();
        }
        return this.splittersConnectivityStatus;
    }


    public GlobalSystemConfiguration getGlobalSystemConfiguation() {
        return this.globalSystemConfiguation;
    }


    public void setGlobalSystemConfiguation(GlobalSystemConfiguration value) {
        this.globalSystemConfiguation = value;
    }


    public RecoverPointVersion getVersion() {
        return this.version;
    }


    public void setVersion(RecoverPointVersion value) {
        this.version = value;
    }


    public String getHardwareSerialID() {
        return this.hardwareSerialID;
    }


    public void setHardwareSerialID(String value) {
        this.hardwareSerialID = value;
    }


    public String getWanIP() {
        return this.wanIP;
    }


    public void setWanIP(String value) {
        this.wanIP = value;
    }


    public String getManagementIPv4() {
        return this.managementIPv4;
    }


    public void setManagementIPv4(String value) {
        this.managementIPv4 = value;
    }


    public String getManagementIPv6() {
        return this.managementIPv6;
    }


    public void setManagementIPv6(String value) {
        this.managementIPv6 = value;
    }


    public List<InitiatorInformation> getInitiatorsState() {
        if (this.initiatorsState == null) {
            this.initiatorsState = new ArrayList();
        }
        return this.initiatorsState;
    }


    public String getVendor() {
        return this.vendor;
    }


    public void setVendor(String value) {
        this.vendor = value;
    }


    public String getHardwarePlatform() {
        return this.hardwarePlatform;
    }


    public void setHardwarePlatform(String value) {
        this.hardwarePlatform = value;
    }


    public long getHbaType() {
        return this.hbaType;
    }


    public void setHbaType(long value) {
        this.hbaType = value;
    }


    public long getSystemMemory() {
        return this.systemMemory;
    }


    public void setSystemMemory(long value) {
        this.systemMemory = value;
    }


    public long getNumberOfCores() {
        return this.numberOfCores;
    }


    public void setNumberOfCores(long value) {
        this.numberOfCores = value;
    }


    public RpaType getType() {
        return this.type;
    }


    public void setType(RpaType value) {
        this.type = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RPAState)) {
            return false;
        }
        RPAState otherObj = (RPAState) obj;

        return (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.status != null ? this.status.equals(otherObj.status) : this.status == otherObj.status) && (this.repositoryConnectivityStatus != null ? this.repositoryConnectivityStatus.equals(otherObj.repositoryConnectivityStatus) : this.repositoryConnectivityStatus == otherObj.repositoryConnectivityStatus) && (this.remoteRPAsDataLinkStatus != null ? this.remoteRPAsDataLinkStatus.equals(otherObj.remoteRPAsDataLinkStatus) : this.remoteRPAsDataLinkStatus == otherObj.remoteRPAsDataLinkStatus) && (this.runningClusterControl == otherObj.runningClusterControl) && (this.remoteRPAsConnectivityStatus != null ? this.remoteRPAsConnectivityStatus.equals(otherObj.remoteRPAsConnectivityStatus) : this.remoteRPAsConnectivityStatus == otherObj.remoteRPAsConnectivityStatus) && (this.localRPAsFiberConnectivityStatus != null ? this.localRPAsFiberConnectivityStatus.equals(otherObj.localRPAsFiberConnectivityStatus) : this.localRPAsFiberConnectivityStatus == otherObj.localRPAsFiberConnectivityStatus) && (this.volumesConnectivityStatus != null ? this.volumesConnectivityStatus.equals(otherObj.volumesConnectivityStatus) : this.volumesConnectivityStatus == otherObj.volumesConnectivityStatus) && (this.interfacesStatus != null ? this.interfacesStatus.equals(otherObj.interfacesStatus) : this.interfacesStatus == otherObj.interfacesStatus) && (this.splittersConnectivityStatus != null ? this.splittersConnectivityStatus.equals(otherObj.splittersConnectivityStatus) : this.splittersConnectivityStatus == otherObj.splittersConnectivityStatus) && (this.globalSystemConfiguation != null ? this.globalSystemConfiguation.equals(otherObj.globalSystemConfiguation) : this.globalSystemConfiguation == otherObj.globalSystemConfiguation) && (this.version != null ? this.version.equals(otherObj.version) : this.version == otherObj.version) && (this.hardwareSerialID != null ? this.hardwareSerialID.equals(otherObj.hardwareSerialID) : this.hardwareSerialID == otherObj.hardwareSerialID) && (this.wanIP != null ? this.wanIP.equals(otherObj.wanIP) : this.wanIP == otherObj.wanIP) && (this.managementIPv4 != null ? this.managementIPv4.equals(otherObj.managementIPv4) : this.managementIPv4 == otherObj.managementIPv4) && (this.managementIPv6 != null ? this.managementIPv6.equals(otherObj.managementIPv6) : this.managementIPv6 == otherObj.managementIPv6) && (this.initiatorsState != null ? this.initiatorsState.equals(otherObj.initiatorsState) : this.initiatorsState == otherObj.initiatorsState) && (this.vendor != null ? this.vendor.equals(otherObj.vendor) : this.vendor == otherObj.vendor) && (this.hardwarePlatform != null ? this.hardwarePlatform.equals(otherObj.hardwarePlatform) : this.hardwarePlatform == otherObj.hardwarePlatform) && (this.hbaType == otherObj.hbaType) && (this.systemMemory == otherObj.systemMemory) && (this.numberOfCores == otherObj.numberOfCores) && (this.type != null ? this.type.equals(otherObj.type) : this.type == otherObj.type);
    }


    public int hashCode() {
        return (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ (this.status != null ? this.status.hashCode() : 0) ^ (this.repositoryConnectivityStatus != null ? this.repositoryConnectivityStatus.hashCode() : 0) ^ (this.remoteRPAsDataLinkStatus != null ? this.remoteRPAsDataLinkStatus.hashCode() : 0) ^ (this.runningClusterControl ? 1 : 0) ^ (this.remoteRPAsConnectivityStatus != null ? this.remoteRPAsConnectivityStatus.hashCode() : 0) ^ (this.localRPAsFiberConnectivityStatus != null ? this.localRPAsFiberConnectivityStatus.hashCode() : 0) ^ (this.volumesConnectivityStatus != null ? this.volumesConnectivityStatus.hashCode() : 0) ^ (this.interfacesStatus != null ? this.interfacesStatus.hashCode() : 0) ^ (this.splittersConnectivityStatus != null ? this.splittersConnectivityStatus.hashCode() : 0) ^ (this.globalSystemConfiguation != null ? this.globalSystemConfiguation.hashCode() : 0) ^ (this.version != null ? this.version.hashCode() : 0) ^ (this.hardwareSerialID != null ? this.hardwareSerialID.hashCode() : 0) ^ (this.wanIP != null ? this.wanIP.hashCode() : 0) ^ (this.managementIPv4 != null ? this.managementIPv4.hashCode() : 0) ^ (this.managementIPv6 != null ? this.managementIPv6.hashCode() : 0) ^ (this.initiatorsState != null ? this.initiatorsState.hashCode() : 0) ^ (this.vendor != null ? this.vendor.hashCode() : 0) ^ (this.hardwarePlatform != null ? this.hardwarePlatform.hashCode() : 0) ^ (int) this.hbaType ^ (int) this.systemMemory ^ (int) this.numberOfCores ^ (this.type != null ? this.type.hashCode() : 0);
    }


    public String toString() {
        return "RPAState [rpaUID=" + this.rpaUID + ", " + "status=" + this.status + ", " + "repositoryConnectivityStatus=" + this.repositoryConnectivityStatus + ", " + "remoteRPAsDataLinkStatus=" + this.remoteRPAsDataLinkStatus + ", " + "runningClusterControl=" + this.runningClusterControl + ", " + "remoteRPAsConnectivityStatus=" + this.remoteRPAsConnectivityStatus + ", " + "localRPAsFiberConnectivityStatus=" + this.localRPAsFiberConnectivityStatus + ", " + "volumesConnectivityStatus=" + this.volumesConnectivityStatus + ", " + "interfacesStatus=" + this.interfacesStatus + ", " + "splittersConnectivityStatus=" + this.splittersConnectivityStatus + ", " + "globalSystemConfiguation=" + this.globalSystemConfiguation + ", " + "version=" + this.version + ", " + "hardwareSerialID=" + this.hardwareSerialID + ", " + "wanIP=" + this.wanIP + ", " + "managementIPv4=" + this.managementIPv4 + ", " + "managementIPv6=" + this.managementIPv6 + ", " + "initiatorsState=" + this.initiatorsState + ", " + "vendor=" + this.vendor + ", " + "hardwarePlatform=" + this.hardwarePlatform + ", " + "hbaType=" + this.hbaType + ", " + "systemMemory=" + this.systemMemory + ", " + "numberOfCores=" + this.numberOfCores + ", " + "type=" + this.type + "]";
    }
}


