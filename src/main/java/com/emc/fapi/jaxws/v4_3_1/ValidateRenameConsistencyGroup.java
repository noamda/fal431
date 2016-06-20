package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateRenameConsistencyGroup", propOrder = {"group", "newName"})
public class ValidateRenameConsistencyGroup {
    protected ConsistencyGroupUID group;
    protected String newName;

    public ValidateRenameConsistencyGroup() {
    }

    public ValidateRenameConsistencyGroup(ConsistencyGroupUID group, String newName) {
        this.group = group;
        this.newName = newName;
    }


    public ConsistencyGroupUID getGroup() {
        return this.group;
    }


    public void setGroup(ConsistencyGroupUID value) {
        this.group = value;
    }


    public String getNewName() {
        return this.newName;
    }


    public void setNewName(String value) {
        this.newName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateRenameConsistencyGroup)) {
            return false;
        }
        ValidateRenameConsistencyGroup otherObj = (ValidateRenameConsistencyGroup) obj;

        return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.newName != null ? this.newName.equals(otherObj.newName) : this.newName == otherObj.newName);
    }


    public int hashCode() {
        return (this.group != null ? this.group.hashCode() : 0) ^ (this.newName != null ? this.newName.hashCode() : 0);
    }


    public String toString() {
        return "ValidateRenameConsistencyGroup [group=" + this.group + ", " + "newName=" + this.newName + "]";
    }
}


