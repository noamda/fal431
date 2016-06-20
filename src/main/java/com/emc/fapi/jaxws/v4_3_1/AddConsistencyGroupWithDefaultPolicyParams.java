package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addConsistencyGroupWithDefaultPolicyParams", propOrder = {"groupName", "primaryRPA"})
public class AddConsistencyGroupWithDefaultPolicyParams {
    protected String groupName;
    protected RpaUID primaryRPA;

    public AddConsistencyGroupWithDefaultPolicyParams() {
    }

    public AddConsistencyGroupWithDefaultPolicyParams(String groupName, RpaUID primaryRPA) {
        this.groupName = groupName;
        this.primaryRPA = primaryRPA;
    }


    public String getGroupName() {
        return this.groupName;
    }


    public void setGroupName(String value) {
        this.groupName = value;
    }


    public RpaUID getPrimaryRPA() {
        return this.primaryRPA;
    }


    public void setPrimaryRPA(RpaUID value) {
        this.primaryRPA = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddConsistencyGroupWithDefaultPolicyParams)) {
            return false;
        }
        AddConsistencyGroupWithDefaultPolicyParams otherObj = (AddConsistencyGroupWithDefaultPolicyParams) obj;

        return (this.groupName != null ? this.groupName.equals(otherObj.groupName) : this.groupName == otherObj.groupName) && (this.primaryRPA != null ? this.primaryRPA.equals(otherObj.primaryRPA) : this.primaryRPA == otherObj.primaryRPA);
    }


    public int hashCode() {
        return (this.groupName != null ? this.groupName.hashCode() : 0) ^ (this.primaryRPA != null ? this.primaryRPA.hashCode() : 0);
    }


    public String toString() {
        return "AddConsistencyGroupWithDefaultPolicyParams [groupName=" + this.groupName + ", " + "primaryRPA=" + this.primaryRPA + "]";
    }
}


