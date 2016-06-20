package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymmetrixHostIDsInfo", propOrder = {"symmetrixHostIDs"})
public class SymmetrixHostIDsInfo {
    @XmlElement(nillable = true)
    protected List<SymmetrixHostId> symmetrixHostIDs;

    public SymmetrixHostIDsInfo() {
    }

    public SymmetrixHostIDsInfo(List<SymmetrixHostId> symmetrixHostIDs) {
        this.symmetrixHostIDs = symmetrixHostIDs;
    }


    public List<SymmetrixHostId> getSymmetrixHostIDs() {
        if (this.symmetrixHostIDs == null) {
            this.symmetrixHostIDs = new ArrayList();
        }
        return this.symmetrixHostIDs;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SymmetrixHostIDsInfo)) {
            return false;
        }
        SymmetrixHostIDsInfo otherObj = (SymmetrixHostIDsInfo) obj;

        return this.symmetrixHostIDs == otherObj.symmetrixHostIDs ? true : this.symmetrixHostIDs != null ? this.symmetrixHostIDs.equals(otherObj.symmetrixHostIDs) : false;
    }


    public int hashCode() {
        return this.symmetrixHostIDs != null ? this.symmetrixHostIDs.hashCode() : 0;
    }


    public String toString() {
        return "SymmetrixHostIDsInfo [symmetrixHostIDs=" + this.symmetrixHostIDs + "]";
    }
}


