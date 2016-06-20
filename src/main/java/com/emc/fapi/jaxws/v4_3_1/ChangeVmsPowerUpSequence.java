package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeVmsPowerUpSequence", propOrder = {"group", "powerUpSequenceParams"})
public class ChangeVmsPowerUpSequence {
    protected ConsistencyGroupUID group;
    protected List<VmPowerUpSequenceParam> powerUpSequenceParams;

    public ChangeVmsPowerUpSequence() {
    }

    public ChangeVmsPowerUpSequence(ConsistencyGroupUID group, List<VmPowerUpSequenceParam> powerUpSequenceParams) {
        this.group = group;
        this.powerUpSequenceParams = powerUpSequenceParams;
    }


    public ConsistencyGroupUID getGroup() {
        return this.group;
    }


    public void setGroup(ConsistencyGroupUID value) {
        this.group = value;
    }


    public List<VmPowerUpSequenceParam> getPowerUpSequenceParams() {
        if (this.powerUpSequenceParams == null) {
            this.powerUpSequenceParams = new ArrayList();
        }
        return this.powerUpSequenceParams;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ChangeVmsPowerUpSequence)) {
            return false;
        }
        ChangeVmsPowerUpSequence otherObj = (ChangeVmsPowerUpSequence) obj;

        return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.powerUpSequenceParams != null ? this.powerUpSequenceParams.equals(otherObj.powerUpSequenceParams) : this.powerUpSequenceParams == otherObj.powerUpSequenceParams);
    }


    public int hashCode() {
        return (this.group != null ? this.group.hashCode() : 0) ^ (this.powerUpSequenceParams != null ? this.powerUpSequenceParams.hashCode() : 0);
    }


    public String toString() {
        return "ChangeVmsPowerUpSequence [group=" + this.group + ", " + "powerUpSequenceParams=" + this.powerUpSequenceParams + "]";
    }
}


