package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayResourcePoolSupportedTiers", propOrder = {"resourcePoolTier"})
public class ArrayResourcePoolSupportedTiers {
    @XmlElement(nillable = true)
    protected List<ArrayResourcePoolSupportedTier> resourcePoolTier;

    public ArrayResourcePoolSupportedTiers() {
    }

    public ArrayResourcePoolSupportedTiers(List<ArrayResourcePoolSupportedTier> resourcePoolTier) {
        this.resourcePoolTier = resourcePoolTier;
    }


    public List<ArrayResourcePoolSupportedTier> getResourcePoolTier() {
        if (this.resourcePoolTier == null) {
            this.resourcePoolTier = new ArrayList();
        }
        return this.resourcePoolTier;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayResourcePoolSupportedTiers)) {
            return false;
        }
        ArrayResourcePoolSupportedTiers otherObj = (ArrayResourcePoolSupportedTiers) obj;

        return this.resourcePoolTier == otherObj.resourcePoolTier ? true : this.resourcePoolTier != null ? this.resourcePoolTier.equals(otherObj.resourcePoolTier) : false;
    }


    public int hashCode() {
        return this.resourcePoolTier != null ? this.resourcePoolTier.hashCode() : 0;
    }


    public String toString() {
        return "ArrayResourcePoolSupportedTiers [resourcePoolTier=" + this.resourcePoolTier + "]";
    }
}


