package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "volumeInformationSet", propOrder = {"innerSet"})
public class VolumeInformationSet {
    @XmlElement(nillable = true)
    protected List<VolumeInformation> innerSet;

    public VolumeInformationSet() {
    }

    public VolumeInformationSet(List<VolumeInformation> innerSet) {
        this.innerSet = innerSet;
    }


    public List<VolumeInformation> getInnerSet() {
        if (this.innerSet == null) {
            this.innerSet = new ArrayList();
        }
        return this.innerSet;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VolumeInformationSet)) {
            return false;
        }
        VolumeInformationSet otherObj = (VolumeInformationSet) obj;

        return this.innerSet == otherObj.innerSet ? true : this.innerSet != null ? this.innerSet.equals(otherObj.innerSet) : false;
    }


    public int hashCode() {
        return this.innerSet != null ? this.innerSet.hashCode() : 0;
    }


    public String toString() {
        return "VolumeInformationSet [innerSet=" + this.innerSet + "]";
    }
}


