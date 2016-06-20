package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateRenameConsistencyGroupCopy", propOrder = {"groupCopy", "newName"})
public class ValidateRenameConsistencyGroupCopy {
    protected ConsistencyGroupCopyUID groupCopy;
    protected String newName;

    public ValidateRenameConsistencyGroupCopy() {
    }

    public ValidateRenameConsistencyGroupCopy(ConsistencyGroupCopyUID groupCopy, String newName) {
        this.groupCopy = groupCopy;
        this.newName = newName;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public String getNewName() {
        return this.newName;
    }


    public void setNewName(String value) {
        this.newName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateRenameConsistencyGroupCopy)) {
            return false;
        }
        ValidateRenameConsistencyGroupCopy otherObj = (ValidateRenameConsistencyGroupCopy) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.newName != null ? this.newName.equals(otherObj.newName) : this.newName == otherObj.newName);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.newName != null ? this.newName.hashCode() : 0);
    }


    public String toString() {
        return "ValidateRenameConsistencyGroupCopy [groupCopy=" + this.groupCopy + ", " + "newName=" + this.newName + "]";
    }
}


