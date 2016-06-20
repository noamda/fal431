package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addConsistencyGroupCopyPolicyTemplate", propOrder = {"template"})
public class AddConsistencyGroupCopyPolicyTemplate {
    protected ConsistencyGroupCopyPolicyTemplate template;

    public AddConsistencyGroupCopyPolicyTemplate() {
    }

    public AddConsistencyGroupCopyPolicyTemplate(ConsistencyGroupCopyPolicyTemplate template) {
        this.template = template;
    }


    public ConsistencyGroupCopyPolicyTemplate getTemplate() {
        return this.template;
    }


    public void setTemplate(ConsistencyGroupCopyPolicyTemplate value) {
        this.template = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddConsistencyGroupCopyPolicyTemplate)) {
            return false;
        }
        AddConsistencyGroupCopyPolicyTemplate otherObj = (AddConsistencyGroupCopyPolicyTemplate) obj;

        return this.template == otherObj.template ? true : this.template != null ? this.template.equals(otherObj.template) : false;
    }


    public int hashCode() {
        return this.template != null ? this.template.hashCode() : 0;
    }


    public String toString() {
        return "AddConsistencyGroupCopyPolicyTemplate [template=" + this.template + "]";
    }
}


