package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmPowerUpSequenceParam", propOrder = {"vmReplicationSetUID", "powerUpSequenceNumber", "isCritical"})
public class VmPowerUpSequenceParam {
    @XmlElement(required = true, nillable = true)
    protected VmReplicationSetUID vmReplicationSetUID;
    protected int powerUpSequenceNumber;
    protected Boolean isCritical;

    public VmPowerUpSequenceParam() {
    }

    public VmPowerUpSequenceParam(VmReplicationSetUID vmReplicationSetUID, int powerUpSequenceNumber, Boolean isCritical) {
        this.vmReplicationSetUID = vmReplicationSetUID;
        this.powerUpSequenceNumber = powerUpSequenceNumber;
        this.isCritical = isCritical;
    }


    public VmReplicationSetUID getVmReplicationSetUID() {
        return this.vmReplicationSetUID;
    }


    public void setVmReplicationSetUID(VmReplicationSetUID value) {
        this.vmReplicationSetUID = value;
    }


    public int getPowerUpSequenceNumber() {
        return this.powerUpSequenceNumber;
    }


    public void setPowerUpSequenceNumber(int value) {
        this.powerUpSequenceNumber = value;
    }


    public Boolean isIsCritical() {
        return this.isCritical;
    }


    public void setIsCritical(Boolean value) {
        this.isCritical = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmPowerUpSequenceParam)) {
            return false;
        }
        VmPowerUpSequenceParam otherObj = (VmPowerUpSequenceParam) obj;

        return (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.equals(otherObj.vmReplicationSetUID) : this.vmReplicationSetUID == otherObj.vmReplicationSetUID) && (this.powerUpSequenceNumber == otherObj.powerUpSequenceNumber) && (this.isCritical != null ? this.isCritical.equals(otherObj.isCritical) : this.isCritical == otherObj.isCritical);
    }


    public int hashCode() {
        return (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.hashCode() : 0) ^ this.powerUpSequenceNumber ^ (this.isCritical != null ? this.isCritical.hashCode() : 0);
    }


    public String toString() {
        return "VmPowerUpSequenceParam [vmReplicationSetUID=" + this.vmReplicationSetUID + ", " + "powerUpSequenceNumber=" + this.powerUpSequenceNumber + ", " + "isCritical=" + this.isCritical + "]";
    }
}


