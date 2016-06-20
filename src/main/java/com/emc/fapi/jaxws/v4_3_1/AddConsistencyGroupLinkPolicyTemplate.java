package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addConsistencyGroupLinkPolicyTemplate", propOrder = {"template"})
public class AddConsistencyGroupLinkPolicyTemplate {
    protected ConsistencyGroupLinkPolicyTemplate template;

    public AddConsistencyGroupLinkPolicyTemplate() {
    }

    public AddConsistencyGroupLinkPolicyTemplate(ConsistencyGroupLinkPolicyTemplate template) {
        this.template = template;
    }


    public ConsistencyGroupLinkPolicyTemplate getTemplate() {
        return this.template;
    }


    public void setTemplate(ConsistencyGroupLinkPolicyTemplate value) {
        this.template = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddConsistencyGroupLinkPolicyTemplate)) {
            return false;
        }
        AddConsistencyGroupLinkPolicyTemplate otherObj = (AddConsistencyGroupLinkPolicyTemplate) obj;

        return this.template == otherObj.template ? true : this.template != null ? this.template.equals(otherObj.template) : false;
    }


    public int hashCode() {
        return this.template != null ? this.template.hashCode() : 0;
    }


    public String toString() {
        return "AddConsistencyGroupLinkPolicyTemplate [template=" + this.template + "]";
    }
}


