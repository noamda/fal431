package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSystemGlobalPolicy", propOrder = {"policy"})
public class SetSystemGlobalPolicy {
    protected SystemGlobalPolicy policy;

    public SetSystemGlobalPolicy() {
    }

    public SetSystemGlobalPolicy(SystemGlobalPolicy policy) {
        this.policy = policy;
    }


    public SystemGlobalPolicy getPolicy() {
        return this.policy;
    }


    public void setPolicy(SystemGlobalPolicy value) {
        this.policy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetSystemGlobalPolicy)) {
            return false;
        }
        SetSystemGlobalPolicy otherObj = (SetSystemGlobalPolicy) obj;

        return this.policy == otherObj.policy ? true : this.policy != null ? this.policy.equals(otherObj.policy) : false;
    }


    public int hashCode() {
        return this.policy != null ? this.policy.hashCode() : 0;
    }


    public String toString() {
        return "SetSystemGlobalPolicy [policy=" + this.policy + "]";
    }
}


