package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ConsistencyGroupCopyPolicyTemplate.class, name = "ConsistencyGroupCopyPolicyTemplate"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ConsistencyGroupLinkPolicyTemplate.class, name = "ConsistencyGroupLinkPolicyTemplate")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasePolicyTemplate", propOrder = {"name"})
@XmlSeeAlso({ConsistencyGroupCopyPolicyTemplate.class, ConsistencyGroupLinkPolicyTemplate.class})
public abstract class BasePolicyTemplate {
    @XmlElement(required = true)
    protected String name;

    public BasePolicyTemplate() {
    }

    public BasePolicyTemplate(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof BasePolicyTemplate)) {
            return false;
        }
        BasePolicyTemplate otherObj = (BasePolicyTemplate) obj;

        return this.name == otherObj.name ? true : this.name != null ? this.name.equals(otherObj.name) : false;
    }


    public int hashCode() {
        return this.name != null ? this.name.hashCode() : 0;
    }


    public String toString() {
        return "BasePolicyTemplate [name=" + this.name + "]";
    }
}


