package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateEditVMsHardwareReplicationParams", propOrder = {"params"})
public class ValidateEditVMsHardwareReplicationParams {
    protected ConsistencyGroupVMHardwareReplicationParams params;

    public ValidateEditVMsHardwareReplicationParams() {
    }

    public ValidateEditVMsHardwareReplicationParams(ConsistencyGroupVMHardwareReplicationParams params) {
        this.params = params;
    }


    public ConsistencyGroupVMHardwareReplicationParams getParams() {
        return this.params;
    }


    public void setParams(ConsistencyGroupVMHardwareReplicationParams value) {
        this.params = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateEditVMsHardwareReplicationParams)) {
            return false;
        }
        ValidateEditVMsHardwareReplicationParams otherObj = (ValidateEditVMsHardwareReplicationParams) obj;

        return this.params == otherObj.params ? true : this.params != null ? this.params.equals(otherObj.params) : false;
    }


    public int hashCode() {
        return this.params != null ? this.params.hashCode() : 0;
    }


    public String toString() {
        return "ValidateEditVMsHardwareReplicationParams [params=" + this.params + "]";
    }
}


