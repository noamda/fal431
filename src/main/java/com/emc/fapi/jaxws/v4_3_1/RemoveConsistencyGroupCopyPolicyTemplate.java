package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeConsistencyGroupCopyPolicyTemplate", propOrder = {"name"})
public class RemoveConsistencyGroupCopyPolicyTemplate {
    protected String name;

    public RemoveConsistencyGroupCopyPolicyTemplate() {
    }

    public RemoveConsistencyGroupCopyPolicyTemplate(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RemoveConsistencyGroupCopyPolicyTemplate)) {
            return false;
        }
        RemoveConsistencyGroupCopyPolicyTemplate otherObj = (RemoveConsistencyGroupCopyPolicyTemplate) obj;

        return this.name == otherObj.name ? true : this.name != null ? this.name.equals(otherObj.name) : false;
    }


    public int hashCode() {
        return this.name != null ? this.name.hashCode() : 0;
    }


    public String toString() {
        return "RemoveConsistencyGroupCopyPolicyTemplate [name=" + this.name + "]";
    }
}


