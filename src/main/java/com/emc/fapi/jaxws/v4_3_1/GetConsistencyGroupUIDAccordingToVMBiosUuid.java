package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getConsistencyGroupUIDAccordingToVMBiosUuid", propOrder = {"vmBiosUuid"})
public class GetConsistencyGroupUIDAccordingToVMBiosUuid {
    protected String vmBiosUuid;

    public GetConsistencyGroupUIDAccordingToVMBiosUuid() {
    }

    public GetConsistencyGroupUIDAccordingToVMBiosUuid(String vmBiosUuid) {
        this.vmBiosUuid = vmBiosUuid;
    }


    public String getVmBiosUuid() {
        return this.vmBiosUuid;
    }


    public void setVmBiosUuid(String value) {
        this.vmBiosUuid = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetConsistencyGroupUIDAccordingToVMBiosUuid)) {
            return false;
        }
        GetConsistencyGroupUIDAccordingToVMBiosUuid otherObj = (GetConsistencyGroupUIDAccordingToVMBiosUuid) obj;

        return this.vmBiosUuid == otherObj.vmBiosUuid ? true : this.vmBiosUuid != null ? this.vmBiosUuid.equals(otherObj.vmBiosUuid) : false;
    }


    public int hashCode() {
        return this.vmBiosUuid != null ? this.vmBiosUuid.hashCode() : 0;
    }


    public String toString() {
        return "GetConsistencyGroupUIDAccordingToVMBiosUuid [vmBiosUuid=" + this.vmBiosUuid + "]";
    }
}


