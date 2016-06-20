package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayResourcePoolTieringPolicies", propOrder = {"tieringPolicies"})
public class ArrayResourcePoolTieringPolicies {
    @XmlElement(nillable = true)
    protected List<ArrayResourcePoolTieringPolicy> tieringPolicies;

    public ArrayResourcePoolTieringPolicies() {
    }

    public ArrayResourcePoolTieringPolicies(List<ArrayResourcePoolTieringPolicy> tieringPolicies) {
        this.tieringPolicies = tieringPolicies;
    }


    public List<ArrayResourcePoolTieringPolicy> getTieringPolicies() {
        if (this.tieringPolicies == null) {
            this.tieringPolicies = new ArrayList();
        }
        return this.tieringPolicies;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayResourcePoolTieringPolicies)) {
            return false;
        }
        ArrayResourcePoolTieringPolicies otherObj = (ArrayResourcePoolTieringPolicies) obj;

        return this.tieringPolicies == otherObj.tieringPolicies ? true : this.tieringPolicies != null ? this.tieringPolicies.equals(otherObj.tieringPolicies) : false;
    }


    public int hashCode() {
        return this.tieringPolicies != null ? this.tieringPolicies.hashCode() : 0;
    }


    public String toString() {
        return "ArrayResourcePoolTieringPolicies [tieringPolicies=" + this.tieringPolicies + "]";
    }
}


