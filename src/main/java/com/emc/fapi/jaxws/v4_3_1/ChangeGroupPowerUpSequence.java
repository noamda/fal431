package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeGroupPowerUpSequence", propOrder = {"group", "powerUpGroup"})
public class ChangeGroupPowerUpSequence {
    protected ConsistencyGroupUID group;
    protected Long powerUpGroup;

    public ChangeGroupPowerUpSequence() {
    }

    public ChangeGroupPowerUpSequence(ConsistencyGroupUID group, Long powerUpGroup) {
        this.group = group;
        this.powerUpGroup = powerUpGroup;
    }


    public ConsistencyGroupUID getGroup() {
        return this.group;
    }


    public void setGroup(ConsistencyGroupUID value) {
        this.group = value;
    }


    public Long getPowerUpGroup() {
        return this.powerUpGroup;
    }


    public void setPowerUpGroup(Long value) {
        this.powerUpGroup = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ChangeGroupPowerUpSequence)) {
            return false;
        }
        ChangeGroupPowerUpSequence otherObj = (ChangeGroupPowerUpSequence) obj;

        return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.powerUpGroup != null ? this.powerUpGroup.equals(otherObj.powerUpGroup) : this.powerUpGroup == otherObj.powerUpGroup);
    }


    public int hashCode() {
        return (this.group != null ? this.group.hashCode() : 0) ^ (this.powerUpGroup != null ? this.powerUpGroup.hashCode() : 0);
    }


    public String toString() {
        return "ChangeGroupPowerUpSequence [group=" + this.group + ", " + "powerUpGroup=" + this.powerUpGroup + "]";
    }
}


