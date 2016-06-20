package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeConsistencyGroupLinkPolicyTemplate", propOrder = {"name"})
public class RemoveConsistencyGroupLinkPolicyTemplate {
    protected String name;

    public RemoveConsistencyGroupLinkPolicyTemplate() {
    }

    public RemoveConsistencyGroupLinkPolicyTemplate(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RemoveConsistencyGroupLinkPolicyTemplate)) {
            return false;
        }
        RemoveConsistencyGroupLinkPolicyTemplate otherObj = (RemoveConsistencyGroupLinkPolicyTemplate) obj;

        return this.name == otherObj.name ? true : this.name != null ? this.name.equals(otherObj.name) : false;
    }


    public int hashCode() {
        return this.name != null ? this.name.hashCode() : 0;
    }


    public String toString() {
        return "RemoveConsistencyGroupLinkPolicyTemplate [name=" + this.name + "]";
    }
}


