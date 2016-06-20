package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateUnregisterArrayResourcePools", propOrder = {"resourcePools"})
public class ValidateUnregisterArrayResourcePools {
    protected List<ResourcePoolUID> resourcePools;

    public ValidateUnregisterArrayResourcePools() {
    }

    public ValidateUnregisterArrayResourcePools(List<ResourcePoolUID> resourcePools) {
        this.resourcePools = resourcePools;
    }


    public List<ResourcePoolUID> getResourcePools() {
        if (this.resourcePools == null) {
            this.resourcePools = new ArrayList();
        }
        return this.resourcePools;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateUnregisterArrayResourcePools)) {
            return false;
        }
        ValidateUnregisterArrayResourcePools otherObj = (ValidateUnregisterArrayResourcePools) obj;

        return this.resourcePools == otherObj.resourcePools ? true : this.resourcePools != null ? this.resourcePools.equals(otherObj.resourcePools) : false;
    }


    public int hashCode() {
        return this.resourcePools != null ? this.resourcePools.hashCode() : 0;
    }


    public String toString() {
        return "ValidateUnregisterArrayResourcePools [resourcePools=" + this.resourcePools + "]";
    }
}


