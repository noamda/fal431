package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerArrayResourcePools", propOrder = {"resourcePools"})
public class RegisterArrayResourcePools {
    protected List<RegisterArrayResourcePoolParams> resourcePools;

    public RegisterArrayResourcePools() {
    }

    public RegisterArrayResourcePools(List<RegisterArrayResourcePoolParams> resourcePools) {
        this.resourcePools = resourcePools;
    }


    public List<RegisterArrayResourcePoolParams> getResourcePools() {
        if (this.resourcePools == null) {
            this.resourcePools = new ArrayList();
        }
        return this.resourcePools;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RegisterArrayResourcePools)) {
            return false;
        }
        RegisterArrayResourcePools otherObj = (RegisterArrayResourcePools) obj;

        return this.resourcePools == otherObj.resourcePools ? true : this.resourcePools != null ? this.resourcePools.equals(otherObj.resourcePools) : false;
    }


    public int hashCode() {
        return this.resourcePools != null ? this.resourcePools.hashCode() : 0;
    }


    public String toString() {
        return "RegisterArrayResourcePools [resourcePools=" + this.resourcePools + "]";
    }
}


