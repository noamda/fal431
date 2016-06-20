package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayResourcePoolAllocationParams", propOrder = {"supportedTiers", "tieringPolicies"})
public class ArrayResourcePoolAllocationParams {
    @XmlElement(required = true)
    protected ArrayResourcePoolSupportedTiers supportedTiers;
    @XmlElement(required = true)
    protected ArrayResourcePoolTieringPolicies tieringPolicies;

    public ArrayResourcePoolAllocationParams() {
    }

    public ArrayResourcePoolAllocationParams(ArrayResourcePoolSupportedTiers supportedTiers, ArrayResourcePoolTieringPolicies tieringPolicies) {
        this.supportedTiers = supportedTiers;
        this.tieringPolicies = tieringPolicies;
    }


    public ArrayResourcePoolSupportedTiers getSupportedTiers() {
        return this.supportedTiers;
    }


    public void setSupportedTiers(ArrayResourcePoolSupportedTiers value) {
        this.supportedTiers = value;
    }


    public ArrayResourcePoolTieringPolicies getTieringPolicies() {
        return this.tieringPolicies;
    }


    public void setTieringPolicies(ArrayResourcePoolTieringPolicies value) {
        this.tieringPolicies = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayResourcePoolAllocationParams)) {
            return false;
        }
        ArrayResourcePoolAllocationParams otherObj = (ArrayResourcePoolAllocationParams) obj;

        return (this.supportedTiers != null ? this.supportedTiers.equals(otherObj.supportedTiers) : this.supportedTiers == otherObj.supportedTiers) && (this.tieringPolicies != null ? this.tieringPolicies.equals(otherObj.tieringPolicies) : this.tieringPolicies == otherObj.tieringPolicies);
    }


    public int hashCode() {
        return (this.supportedTiers != null ? this.supportedTiers.hashCode() : 0) ^ (this.tieringPolicies != null ? this.tieringPolicies.hashCode() : 0);
    }


    public String toString() {
        return "ArrayResourcePoolAllocationParams [supportedTiers=" + this.supportedTiers + ", " + "tieringPolicies=" + this.tieringPolicies + "]";
    }
}


