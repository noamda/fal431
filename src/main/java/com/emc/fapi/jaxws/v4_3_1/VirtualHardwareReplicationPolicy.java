package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualHardwareReplicationPolicy", propOrder = {"provisionPolicy", "hwChangesPolicy"})
public class VirtualHardwareReplicationPolicy {
    @XmlElement(required = true)
    protected DiskProvisionPolicy provisionPolicy;
    @XmlElement(required = true)
    protected HardwareChangesPolicy hwChangesPolicy;

    public VirtualHardwareReplicationPolicy() {
    }

    public VirtualHardwareReplicationPolicy(DiskProvisionPolicy provisionPolicy, HardwareChangesPolicy hwChangesPolicy) {
        this.provisionPolicy = provisionPolicy;
        this.hwChangesPolicy = hwChangesPolicy;
    }


    public DiskProvisionPolicy getProvisionPolicy() {
        return this.provisionPolicy;
    }


    public void setProvisionPolicy(DiskProvisionPolicy value) {
        this.provisionPolicy = value;
    }


    public HardwareChangesPolicy getHwChangesPolicy() {
        return this.hwChangesPolicy;
    }


    public void setHwChangesPolicy(HardwareChangesPolicy value) {
        this.hwChangesPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualHardwareReplicationPolicy)) {
            return false;
        }
        VirtualHardwareReplicationPolicy otherObj = (VirtualHardwareReplicationPolicy) obj;

        return (this.provisionPolicy != null ? this.provisionPolicy.equals(otherObj.provisionPolicy) : this.provisionPolicy == otherObj.provisionPolicy) && (this.hwChangesPolicy != null ? this.hwChangesPolicy.equals(otherObj.hwChangesPolicy) : this.hwChangesPolicy == otherObj.hwChangesPolicy);
    }


    public int hashCode() {
        return (this.provisionPolicy != null ? this.provisionPolicy.hashCode() : 0) ^ (this.hwChangesPolicy != null ? this.hwChangesPolicy.hashCode() : 0);
    }


    public String toString() {
        return "VirtualHardwareReplicationPolicy [provisionPolicy=" + this.provisionPolicy + ", " + "hwChangesPolicy=" + this.hwChangesPolicy + "]";
    }
}


