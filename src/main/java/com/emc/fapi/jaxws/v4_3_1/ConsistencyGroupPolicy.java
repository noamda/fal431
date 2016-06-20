package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupPolicy", propOrder = {"primaryRPANumber", "secondaryRPAsNumbers", "reservationSupported", "canTransferOnNonPreferredRPA", "hostsDelayExpiryTimeoutInSeconds", "distributedGroup", "priority", "managementSettings", "readOnlyInReplicaVolumes", "preferedClusterUID", "powerUp"})
public class ConsistencyGroupPolicy {
    protected int primaryRPANumber;
    @XmlElement(nillable = true)
    protected List<Integer> secondaryRPAsNumbers;
    protected boolean reservationSupported;
    protected boolean canTransferOnNonPreferredRPA;
    protected Integer hostsDelayExpiryTimeoutInSeconds;
    protected boolean distributedGroup;
    @XmlElement(required = true, nillable = true)
    protected Priority priority;
    @XmlElement(required = true)
    protected ConsistencyGroupManagementSettings managementSettings;
    protected boolean readOnlyInReplicaVolumes;
    protected ClusterUID preferedClusterUID;
    protected Integer powerUp;

    public ConsistencyGroupPolicy() {
    }

    public ConsistencyGroupPolicy(int primaryRPANumber, List<Integer> secondaryRPAsNumbers, boolean reservationSupported, boolean canTransferOnNonPreferredRPA, Integer hostsDelayExpiryTimeoutInSeconds, boolean distributedGroup, Priority priority, ConsistencyGroupManagementSettings managementSettings, boolean readOnlyInReplicaVolumes, ClusterUID preferedClusterUID, Integer powerUp) {
        this.primaryRPANumber = primaryRPANumber;
        this.secondaryRPAsNumbers = secondaryRPAsNumbers;
        this.reservationSupported = reservationSupported;
        this.canTransferOnNonPreferredRPA = canTransferOnNonPreferredRPA;
        this.hostsDelayExpiryTimeoutInSeconds = hostsDelayExpiryTimeoutInSeconds;
        this.distributedGroup = distributedGroup;
        this.priority = priority;
        this.managementSettings = managementSettings;
        this.readOnlyInReplicaVolumes = readOnlyInReplicaVolumes;
        this.preferedClusterUID = preferedClusterUID;
        this.powerUp = powerUp;
    }


    public int getPrimaryRPANumber() {
        return this.primaryRPANumber;
    }


    public void setPrimaryRPANumber(int value) {
        this.primaryRPANumber = value;
    }


    public List<Integer> getSecondaryRPAsNumbers() {
        if (this.secondaryRPAsNumbers == null) {
            this.secondaryRPAsNumbers = new ArrayList();
        }
        return this.secondaryRPAsNumbers;
    }


    public boolean isReservationSupported() {
        return this.reservationSupported;
    }


    public void setReservationSupported(boolean value) {
        this.reservationSupported = value;
    }


    public boolean isCanTransferOnNonPreferredRPA() {
        return this.canTransferOnNonPreferredRPA;
    }


    public void setCanTransferOnNonPreferredRPA(boolean value) {
        this.canTransferOnNonPreferredRPA = value;
    }


    public Integer getHostsDelayExpiryTimeoutInSeconds() {
        return this.hostsDelayExpiryTimeoutInSeconds;
    }


    public void setHostsDelayExpiryTimeoutInSeconds(Integer value) {
        this.hostsDelayExpiryTimeoutInSeconds = value;
    }


    public boolean isDistributedGroup() {
        return this.distributedGroup;
    }


    public void setDistributedGroup(boolean value) {
        this.distributedGroup = value;
    }


    public Priority getPriority() {
        return this.priority;
    }


    public void setPriority(Priority value) {
        this.priority = value;
    }


    public ConsistencyGroupManagementSettings getManagementSettings() {
        return this.managementSettings;
    }


    public void setManagementSettings(ConsistencyGroupManagementSettings value) {
        this.managementSettings = value;
    }


    public boolean isReadOnlyInReplicaVolumes() {
        return this.readOnlyInReplicaVolumes;
    }


    public void setReadOnlyInReplicaVolumes(boolean value) {
        this.readOnlyInReplicaVolumes = value;
    }


    public ClusterUID getPreferedClusterUID() {
        return this.preferedClusterUID;
    }


    public void setPreferedClusterUID(ClusterUID value) {
        this.preferedClusterUID = value;
    }


    public Integer getPowerUp() {
        return this.powerUp;
    }


    public void setPowerUp(Integer value) {
        this.powerUp = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupPolicy)) {
            return false;
        }
        ConsistencyGroupPolicy otherObj = (ConsistencyGroupPolicy) obj;

        return (this.primaryRPANumber == otherObj.primaryRPANumber) && (this.secondaryRPAsNumbers != null ? this.secondaryRPAsNumbers.equals(otherObj.secondaryRPAsNumbers) : this.secondaryRPAsNumbers == otherObj.secondaryRPAsNumbers) && (this.reservationSupported == otherObj.reservationSupported) && (this.canTransferOnNonPreferredRPA == otherObj.canTransferOnNonPreferredRPA) && (this.hostsDelayExpiryTimeoutInSeconds != null ? this.hostsDelayExpiryTimeoutInSeconds.equals(otherObj.hostsDelayExpiryTimeoutInSeconds) : this.hostsDelayExpiryTimeoutInSeconds == otherObj.hostsDelayExpiryTimeoutInSeconds) && (this.distributedGroup == otherObj.distributedGroup) && (this.priority != null ? this.priority.equals(otherObj.priority) : this.priority == otherObj.priority) && (this.managementSettings != null ? this.managementSettings.equals(otherObj.managementSettings) : this.managementSettings == otherObj.managementSettings) && (this.readOnlyInReplicaVolumes == otherObj.readOnlyInReplicaVolumes) && (this.preferedClusterUID != null ? this.preferedClusterUID.equals(otherObj.preferedClusterUID) : this.preferedClusterUID == otherObj.preferedClusterUID) && (this.powerUp != null ? this.powerUp.equals(otherObj.powerUp) : this.powerUp == otherObj.powerUp);
    }


    public int hashCode() {
        return this.primaryRPANumber ^ (this.secondaryRPAsNumbers != null ? this.secondaryRPAsNumbers.hashCode() : 0) ^ (this.reservationSupported ? 1 : 0) ^ (this.canTransferOnNonPreferredRPA ? 1 : 0) ^ (this.hostsDelayExpiryTimeoutInSeconds != null ? this.hostsDelayExpiryTimeoutInSeconds.hashCode() : 0) ^ (this.distributedGroup ? 1 : 0) ^ (this.priority != null ? this.priority.hashCode() : 0) ^ (this.managementSettings != null ? this.managementSettings.hashCode() : 0) ^ (this.readOnlyInReplicaVolumes ? 1 : 0) ^ (this.preferedClusterUID != null ? this.preferedClusterUID.hashCode() : 0) ^ (this.powerUp != null ? this.powerUp.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupPolicy [primaryRPANumber=" + this.primaryRPANumber + ", " + "secondaryRPAsNumbers=" + this.secondaryRPAsNumbers + ", " + "reservationSupported=" + this.reservationSupported + ", " + "canTransferOnNonPreferredRPA=" + this.canTransferOnNonPreferredRPA + ", " + "hostsDelayExpiryTimeoutInSeconds=" + this.hostsDelayExpiryTimeoutInSeconds + ", " + "distributedGroup=" + this.distributedGroup + ", " + "priority=" + this.priority + ", " + "managementSettings=" + this.managementSettings + ", " + "readOnlyInReplicaVolumes=" + this.readOnlyInReplicaVolumes + ", " + "preferedClusterUID=" + this.preferedClusterUID + ", " + "powerUp=" + this.powerUp + "]";
    }
}


