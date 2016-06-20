package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymmetrixGateKeepersRPAInfo", propOrder = {"rpaUID", "gateKeeperPaths"})
public class SymmetrixGateKeepersRPAInfo {
    @XmlElement(nillable = true)
    protected RpaUID rpaUID;
    @XmlElement(nillable = true)
    protected List<SymmetrixDevicePath> gateKeeperPaths;

    public SymmetrixGateKeepersRPAInfo() {
    }

    public SymmetrixGateKeepersRPAInfo(RpaUID rpaUID, List<SymmetrixDevicePath> gateKeeperPaths) {
        this.rpaUID = rpaUID;
        this.gateKeeperPaths = gateKeeperPaths;
    }


    public RpaUID getRpaUID() {
        return this.rpaUID;
    }


    public void setRpaUID(RpaUID value) {
        this.rpaUID = value;
    }


    public List<SymmetrixDevicePath> getGateKeeperPaths() {
        if (this.gateKeeperPaths == null) {
            this.gateKeeperPaths = new ArrayList();
        }
        return this.gateKeeperPaths;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SymmetrixGateKeepersRPAInfo)) {
            return false;
        }
        SymmetrixGateKeepersRPAInfo otherObj = (SymmetrixGateKeepersRPAInfo) obj;

        return (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.gateKeeperPaths != null ? this.gateKeeperPaths.equals(otherObj.gateKeeperPaths) : this.gateKeeperPaths == otherObj.gateKeeperPaths);
    }


    public int hashCode() {
        return (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ (this.gateKeeperPaths != null ? this.gateKeeperPaths.hashCode() : 0);
    }


    public String toString() {
        return "SymmetrixGateKeepersRPAInfo [rpaUID=" + this.rpaUID + ", " + "gateKeeperPaths=" + this.gateKeeperPaths + "]";
    }
}


