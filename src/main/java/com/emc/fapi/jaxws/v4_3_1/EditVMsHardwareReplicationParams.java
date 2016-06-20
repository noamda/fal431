package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editVMsHardwareReplicationParams", propOrder = {"params"})
public class EditVMsHardwareReplicationParams {
    protected ConsistencyGroupVMHardwareReplicationParams params;

    public EditVMsHardwareReplicationParams() {
    }

    public EditVMsHardwareReplicationParams(ConsistencyGroupVMHardwareReplicationParams params) {
        this.params = params;
    }


    public ConsistencyGroupVMHardwareReplicationParams getParams() {
        return this.params;
    }


    public void setParams(ConsistencyGroupVMHardwareReplicationParams value) {
        this.params = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EditVMsHardwareReplicationParams)) {
            return false;
        }
        EditVMsHardwareReplicationParams otherObj = (EditVMsHardwareReplicationParams) obj;

        return this.params == otherObj.params ? true : this.params != null ? this.params.equals(otherObj.params) : false;
    }


    public int hashCode() {
        return this.params != null ? this.params.hashCode() : 0;
    }


    public String toString() {
        return "EditVMsHardwareReplicationParams [params=" + this.params + "]";
    }
}


