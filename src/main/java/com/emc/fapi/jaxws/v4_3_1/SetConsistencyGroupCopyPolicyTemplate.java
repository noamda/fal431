package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setConsistencyGroupCopyPolicyTemplate", propOrder = {"template", "newTemplateName"})
public class SetConsistencyGroupCopyPolicyTemplate {
    protected ConsistencyGroupCopyPolicyTemplate template;
    protected String newTemplateName;

    public SetConsistencyGroupCopyPolicyTemplate() {
    }

    public SetConsistencyGroupCopyPolicyTemplate(ConsistencyGroupCopyPolicyTemplate template, String newTemplateName) {
        this.template = template;
        this.newTemplateName = newTemplateName;
    }


    public ConsistencyGroupCopyPolicyTemplate getTemplate() {
        return this.template;
    }


    public void setTemplate(ConsistencyGroupCopyPolicyTemplate value) {
        this.template = value;
    }


    public String getNewTemplateName() {
        return this.newTemplateName;
    }


    public void setNewTemplateName(String value) {
        this.newTemplateName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetConsistencyGroupCopyPolicyTemplate)) {
            return false;
        }
        SetConsistencyGroupCopyPolicyTemplate otherObj = (SetConsistencyGroupCopyPolicyTemplate) obj;

        return (this.template != null ? this.template.equals(otherObj.template) : this.template == otherObj.template) && (this.newTemplateName != null ? this.newTemplateName.equals(otherObj.newTemplateName) : this.newTemplateName == otherObj.newTemplateName);
    }


    public int hashCode() {
        return (this.template != null ? this.template.hashCode() : 0) ^ (this.newTemplateName != null ? this.newTemplateName.hashCode() : 0);
    }


    public String toString() {
        return "SetConsistencyGroupCopyPolicyTemplate [template=" + this.template + ", " + "newTemplateName=" + this.newTemplateName + "]";
    }
}


