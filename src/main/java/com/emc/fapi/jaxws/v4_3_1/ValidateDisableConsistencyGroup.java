package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateDisableConsistencyGroup", propOrder = {"group"})
public class ValidateDisableConsistencyGroup {
    protected ConsistencyGroupUID group;

    public ValidateDisableConsistencyGroup() {
    }

    public ValidateDisableConsistencyGroup(ConsistencyGroupUID group) {
        this.group = group;
    }


    public ConsistencyGroupUID getGroup() {
        return this.group;
    }


    public void setGroup(ConsistencyGroupUID value) {
        this.group = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateDisableConsistencyGroup)) {
            return false;
        }
        ValidateDisableConsistencyGroup otherObj = (ValidateDisableConsistencyGroup) obj;

        return this.group == otherObj.group ? true : this.group != null ? this.group.equals(otherObj.group) : false;
    }


    public int hashCode() {
        return this.group != null ? this.group.hashCode() : 0;
    }


    public String toString() {
        return "ValidateDisableConsistencyGroup [group=" + this.group + "]";
    }
}


