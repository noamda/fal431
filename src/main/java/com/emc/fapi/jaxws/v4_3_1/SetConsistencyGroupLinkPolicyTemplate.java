package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setConsistencyGroupLinkPolicyTemplate", propOrder = {"template", "newTemplateName"})
public class SetConsistencyGroupLinkPolicyTemplate {
    protected ConsistencyGroupLinkPolicyTemplate template;
    protected String newTemplateName;

    public SetConsistencyGroupLinkPolicyTemplate() {
    }

    public SetConsistencyGroupLinkPolicyTemplate(ConsistencyGroupLinkPolicyTemplate template, String newTemplateName) {
        this.template = template;
        this.newTemplateName = newTemplateName;
    }


    public ConsistencyGroupLinkPolicyTemplate getTemplate() {
        return this.template;
    }


    public void setTemplate(ConsistencyGroupLinkPolicyTemplate value) {
        this.template = value;
    }


    public String getNewTemplateName() {
        return this.newTemplateName;
    }


    public void setNewTemplateName(String value) {
        this.newTemplateName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetConsistencyGroupLinkPolicyTemplate)) {
            return false;
        }
        SetConsistencyGroupLinkPolicyTemplate otherObj = (SetConsistencyGroupLinkPolicyTemplate) obj;

        return (this.template != null ? this.template.equals(otherObj.template) : this.template == otherObj.template) && (this.newTemplateName != null ? this.newTemplateName.equals(otherObj.newTemplateName) : this.newTemplateName == otherObj.newTemplateName);
    }


    public int hashCode() {
        return (this.template != null ? this.template.hashCode() : 0) ^ (this.newTemplateName != null ? this.newTemplateName.hashCode() : 0);
    }


    public String toString() {
        return "SetConsistencyGroupLinkPolicyTemplate [template=" + this.template + ", " + "newTemplateName=" + this.newTemplateName + "]";
    }
}


