package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "replicateVms", propOrder = {"params"})
public class ReplicateVms {
    protected ReplicateVmsParam params;

    public ReplicateVms() {
    }

    public ReplicateVms(ReplicateVmsParam params) {
        this.params = params;
    }


    public ReplicateVmsParam getParams() {
        return this.params;
    }


    public void setParams(ReplicateVmsParam value) {
        this.params = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ReplicateVms)) {
            return false;
        }
        ReplicateVms otherObj = (ReplicateVms) obj;

        return this.params == otherObj.params ? true : this.params != null ? this.params.equals(otherObj.params) : false;
    }


    public int hashCode() {
        return this.params != null ? this.params.hashCode() : 0;
    }


    public String toString() {
        return "ReplicateVms [params=" + this.params + "]";
    }
}


