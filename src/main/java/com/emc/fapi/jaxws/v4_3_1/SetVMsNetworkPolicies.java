package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setVMsNetworkPolicies", propOrder = {"networkSettingsForVMs"})
public class SetVMsNetworkPolicies {
    protected List<VmNetworkPolicy> networkSettingsForVMs;

    public SetVMsNetworkPolicies() {
    }

    public SetVMsNetworkPolicies(List<VmNetworkPolicy> networkSettingsForVMs) {
        this.networkSettingsForVMs = networkSettingsForVMs;
    }


    public List<VmNetworkPolicy> getNetworkSettingsForVMs() {
        if (this.networkSettingsForVMs == null) {
            this.networkSettingsForVMs = new ArrayList();
        }
        return this.networkSettingsForVMs;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetVMsNetworkPolicies)) {
            return false;
        }
        SetVMsNetworkPolicies otherObj = (SetVMsNetworkPolicies) obj;

        return this.networkSettingsForVMs == otherObj.networkSettingsForVMs ? true : this.networkSettingsForVMs != null ? this.networkSettingsForVMs.equals(otherObj.networkSettingsForVMs) : false;
    }


    public int hashCode() {
        return this.networkSettingsForVMs != null ? this.networkSettingsForVMs.hashCode() : 0;
    }


    public String toString() {
        return "SetVMsNetworkPolicies [networkSettingsForVMs=" + this.networkSettingsForVMs + "]";
    }
}


