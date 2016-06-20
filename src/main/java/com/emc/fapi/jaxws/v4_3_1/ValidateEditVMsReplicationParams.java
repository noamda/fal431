package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateEditVMsReplicationParams", propOrder = {"params"})
public class ValidateEditVMsReplicationParams {
    protected ConsistencyGroupVMReplicationParams params;

    public ValidateEditVMsReplicationParams() {
    }

    public ValidateEditVMsReplicationParams(ConsistencyGroupVMReplicationParams params) {
        this.params = params;
    }


    public ConsistencyGroupVMReplicationParams getParams() {
        return this.params;
    }


    public void setParams(ConsistencyGroupVMReplicationParams value) {
        this.params = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateEditVMsReplicationParams)) {
            return false;
        }
        ValidateEditVMsReplicationParams otherObj = (ValidateEditVMsReplicationParams) obj;

        return this.params == otherObj.params ? true : this.params != null ? this.params.equals(otherObj.params) : false;
    }


    public int hashCode() {
        return this.params != null ? this.params.hashCode() : 0;
    }


    public String toString() {
        return "ValidateEditVMsReplicationParams [params=" + this.params + "]";
    }
}


