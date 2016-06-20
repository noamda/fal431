package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setVolumeParamSet", propOrder = {"innerSet"})
public class SetVolumeParamSet {
    @XmlElement(nillable = true)
    protected List<SetVolumeParam> innerSet;

    public SetVolumeParamSet() {
    }

    public SetVolumeParamSet(List<SetVolumeParam> innerSet) {
        this.innerSet = innerSet;
    }


    public List<SetVolumeParam> getInnerSet() {
        if (this.innerSet == null) {
            this.innerSet = new ArrayList();
        }
        return this.innerSet;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetVolumeParamSet)) {
            return false;
        }
        SetVolumeParamSet otherObj = (SetVolumeParamSet) obj;

        return this.innerSet == otherObj.innerSet ? true : this.innerSet != null ? this.innerSet.equals(otherObj.innerSet) : false;
    }


    public int hashCode() {
        return this.innerSet != null ? this.innerSet.hashCode() : 0;
    }


    public String toString() {
        return "SetVolumeParamSet [innerSet=" + this.innerSet + "]";
    }
}


