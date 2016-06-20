package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymmetrixArrayList", propOrder = {"symmetrixIDs"})
public class SymmetrixArrayList {
    @XmlElement(nillable = true)
    protected List<String> symmetrixIDs;

    public SymmetrixArrayList() {
    }

    public SymmetrixArrayList(List<String> symmetrixIDs) {
        this.symmetrixIDs = symmetrixIDs;
    }


    public List<String> getSymmetrixIDs() {
        if (this.symmetrixIDs == null) {
            this.symmetrixIDs = new ArrayList();
        }
        return this.symmetrixIDs;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SymmetrixArrayList)) {
            return false;
        }
        SymmetrixArrayList otherObj = (SymmetrixArrayList) obj;

        return this.symmetrixIDs == otherObj.symmetrixIDs ? true : this.symmetrixIDs != null ? this.symmetrixIDs.equals(otherObj.symmetrixIDs) : false;
    }


    public int hashCode() {
        return this.symmetrixIDs != null ? this.symmetrixIDs.hashCode() : 0;
    }


    public String toString() {
        return "SymmetrixArrayList [symmetrixIDs=" + this.symmetrixIDs + "]";
    }
}


