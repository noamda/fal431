package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmNetworkCustomizationPolicy", propOrder = {"globalNetworkPolicy", "nicsPolicies"})
public class VmNetworkCustomizationPolicy {
    @XmlElement(nillable = true)
    protected GlobalNetworkPolicy globalNetworkPolicy;
    @XmlElement(nillable = true)
    protected List<NicCustomizationPolicy> nicsPolicies;

    public VmNetworkCustomizationPolicy() {
    }

    public VmNetworkCustomizationPolicy(GlobalNetworkPolicy globalNetworkPolicy, List<NicCustomizationPolicy> nicsPolicies) {
        this.globalNetworkPolicy = globalNetworkPolicy;
        this.nicsPolicies = nicsPolicies;
    }


    public GlobalNetworkPolicy getGlobalNetworkPolicy() {
        return this.globalNetworkPolicy;
    }


    public void setGlobalNetworkPolicy(GlobalNetworkPolicy value) {
        this.globalNetworkPolicy = value;
    }


    public List<NicCustomizationPolicy> getNicsPolicies() {
        if (this.nicsPolicies == null) {
            this.nicsPolicies = new ArrayList();
        }
        return this.nicsPolicies;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmNetworkCustomizationPolicy)) {
            return false;
        }
        VmNetworkCustomizationPolicy otherObj = (VmNetworkCustomizationPolicy) obj;

        return (this.globalNetworkPolicy != null ? this.globalNetworkPolicy.equals(otherObj.globalNetworkPolicy) : this.globalNetworkPolicy == otherObj.globalNetworkPolicy) && (this.nicsPolicies != null ? this.nicsPolicies.equals(otherObj.nicsPolicies) : this.nicsPolicies == otherObj.nicsPolicies);
    }


    public int hashCode() {
        return (this.globalNetworkPolicy != null ? this.globalNetworkPolicy.hashCode() : 0) ^ (this.nicsPolicies != null ? this.nicsPolicies.hashCode() : 0);
    }


    public String toString() {
        return "VmNetworkCustomizationPolicy [globalNetworkPolicy=" + this.globalNetworkPolicy + ", " + "nicsPolicies=" + this.nicsPolicies + "]";
    }
}


