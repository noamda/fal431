package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setConsistencyGroupLinkPolicyTemplateParams", propOrder = {"newName", "template"})
public class SetConsistencyGroupLinkPolicyTemplateParams {
    protected String newName;
    protected ConsistencyGroupLinkPolicyTemplate template;

    public SetConsistencyGroupLinkPolicyTemplateParams() {
    }

    public SetConsistencyGroupLinkPolicyTemplateParams(String newName, ConsistencyGroupLinkPolicyTemplate template) {
        this.newName = newName;
        this.template = template;
    }


    public String getNewName() {
        return this.newName;
    }


    public void setNewName(String value) {
        this.newName = value;
    }


    public ConsistencyGroupLinkPolicyTemplate getTemplate() {
        return this.template;
    }


    public void setTemplate(ConsistencyGroupLinkPolicyTemplate value) {
        this.template = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetConsistencyGroupLinkPolicyTemplateParams)) {
            return false;
        }
        SetConsistencyGroupLinkPolicyTemplateParams otherObj = (SetConsistencyGroupLinkPolicyTemplateParams) obj;

        return (this.newName != null ? this.newName.equals(otherObj.newName) : this.newName == otherObj.newName) && (this.template != null ? this.template.equals(otherObj.template) : this.template == otherObj.template);
    }


    public int hashCode() {
        return (this.newName != null ? this.newName.hashCode() : 0) ^ (this.template != null ? this.template.hashCode() : 0);
    }


    public String toString() {
        return "SetConsistencyGroupLinkPolicyTemplateParams [newName=" + this.newName + ", " + "template=" + this.template + "]";
    }
}


