package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateStartGroupTransfer", propOrder = {"group"})
public class ValidateStartGroupTransfer {
    protected ConsistencyGroupUID group;

    public ValidateStartGroupTransfer() {
    }

    public ValidateStartGroupTransfer(ConsistencyGroupUID group) {
        this.group = group;
    }


    public ConsistencyGroupUID getGroup() {
        return this.group;
    }


    public void setGroup(ConsistencyGroupUID value) {
        this.group = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateStartGroupTransfer)) {
            return false;
        }
        ValidateStartGroupTransfer otherObj = (ValidateStartGroupTransfer) obj;

        return this.group == otherObj.group ? true : this.group != null ? this.group.equals(otherObj.group) : false;
    }


    public int hashCode() {
        return this.group != null ? this.group.hashCode() : 0;
    }


    public String toString() {
        return "ValidateStartGroupTransfer [group=" + this.group + "]";
    }
}


