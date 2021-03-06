package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymmetrixGateKeepersInfo", propOrder = {"symmetrixGateKeepersRPAInfo"})
public class SymmetrixGateKeepersInfo {
    @XmlElement(nillable = true)
    protected List<SymmetrixGateKeepersRPAInfo> symmetrixGateKeepersRPAInfo;

    public SymmetrixGateKeepersInfo() {
    }

    public SymmetrixGateKeepersInfo(List<SymmetrixGateKeepersRPAInfo> symmetrixGateKeepersRPAInfo) {
        this.symmetrixGateKeepersRPAInfo = symmetrixGateKeepersRPAInfo;
    }


    public List<SymmetrixGateKeepersRPAInfo> getSymmetrixGateKeepersRPAInfo() {
        if (this.symmetrixGateKeepersRPAInfo == null) {
            this.symmetrixGateKeepersRPAInfo = new ArrayList();
        }
        return this.symmetrixGateKeepersRPAInfo;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SymmetrixGateKeepersInfo)) {
            return false;
        }
        SymmetrixGateKeepersInfo otherObj = (SymmetrixGateKeepersInfo) obj;

        return this.symmetrixGateKeepersRPAInfo == otherObj.symmetrixGateKeepersRPAInfo ? true : this.symmetrixGateKeepersRPAInfo != null ? this.symmetrixGateKeepersRPAInfo.equals(otherObj.symmetrixGateKeepersRPAInfo) : false;
    }


    public int hashCode() {
        return this.symmetrixGateKeepersRPAInfo != null ? this.symmetrixGateKeepersRPAInfo.hashCode() : 0;
    }


    public String toString() {
        return "SymmetrixGateKeepersInfo [symmetrixGateKeepersRPAInfo=" + this.symmetrixGateKeepersRPAInfo + "]";
    }
}


