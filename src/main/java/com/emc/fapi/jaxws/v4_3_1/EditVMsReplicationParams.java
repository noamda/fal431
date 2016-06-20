package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editVMsReplicationParams", propOrder = {"params"})
public class EditVMsReplicationParams {
    protected ConsistencyGroupVMReplicationParams params;

    public EditVMsReplicationParams() {
    }

    public EditVMsReplicationParams(ConsistencyGroupVMReplicationParams params) {
        this.params = params;
    }


    public ConsistencyGroupVMReplicationParams getParams() {
        return this.params;
    }


    public void setParams(ConsistencyGroupVMReplicationParams value) {
        this.params = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EditVMsReplicationParams)) {
            return false;
        }
        EditVMsReplicationParams otherObj = (EditVMsReplicationParams) obj;

        return this.params == otherObj.params ? true : this.params != null ? this.params.equals(otherObj.params) : false;
    }


    public int hashCode() {
        return this.params != null ? this.params.hashCode() : 0;
    }


    public String toString() {
        return "EditVMsReplicationParams [params=" + this.params + "]";
    }
}


