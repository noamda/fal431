package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setConsistencyGroupCopyPolicyTemplateParams", propOrder = {"newName", "template"})
public class SetConsistencyGroupCopyPolicyTemplateParams {
    protected String newName;
    protected ConsistencyGroupCopyPolicyTemplate template;

    public SetConsistencyGroupCopyPolicyTemplateParams() {
    }

    public SetConsistencyGroupCopyPolicyTemplateParams(String newName, ConsistencyGroupCopyPolicyTemplate template) {
        this.newName = newName;
        this.template = template;
    }


    public String getNewName() {
        return this.newName;
    }


    public void setNewName(String value) {
        this.newName = value;
    }


    public ConsistencyGroupCopyPolicyTemplate getTemplate() {
        return this.template;
    }


    public void setTemplate(ConsistencyGroupCopyPolicyTemplate value) {
        this.template = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetConsistencyGroupCopyPolicyTemplateParams)) {
            return false;
        }
        SetConsistencyGroupCopyPolicyTemplateParams otherObj = (SetConsistencyGroupCopyPolicyTemplateParams) obj;

        return (this.newName != null ? this.newName.equals(otherObj.newName) : this.newName == otherObj.newName) && (this.template != null ? this.template.equals(otherObj.template) : this.template == otherObj.template);
    }


    public int hashCode() {
        return (this.newName != null ? this.newName.hashCode() : 0) ^ (this.template != null ? this.template.hashCode() : 0);
    }


    public String toString() {
        return "SetConsistencyGroupCopyPolicyTemplateParams [newName=" + this.newName + ", " + "template=" + this.template + "]";
    }
}


