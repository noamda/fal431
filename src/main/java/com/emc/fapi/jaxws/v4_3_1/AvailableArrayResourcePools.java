package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableArrayResourcePools", propOrder = {"arrayResourcePools"})
public class AvailableArrayResourcePools {
    @XmlElement(nillable = true)
    protected List<ArrayResourcePoolInfo> arrayResourcePools;

    public AvailableArrayResourcePools() {
    }

    public AvailableArrayResourcePools(List<ArrayResourcePoolInfo> arrayResourcePools) {
        this.arrayResourcePools = arrayResourcePools;
    }


    public List<ArrayResourcePoolInfo> getArrayResourcePools() {
        if (this.arrayResourcePools == null) {
            this.arrayResourcePools = new ArrayList();
        }
        return this.arrayResourcePools;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AvailableArrayResourcePools)) {
            return false;
        }
        AvailableArrayResourcePools otherObj = (AvailableArrayResourcePools) obj;

        return this.arrayResourcePools == otherObj.arrayResourcePools ? true : this.arrayResourcePools != null ? this.arrayResourcePools.equals(otherObj.arrayResourcePools) : false;
    }


    public int hashCode() {
        return this.arrayResourcePools != null ? this.arrayResourcePools.hashCode() : 0;
    }


    public String toString() {
        return "AvailableArrayResourcePools [arrayResourcePools=" + this.arrayResourcePools + "]";
    }
}


