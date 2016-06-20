package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ConsistencyGroupLinkPolicyTemplate")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupLinkPolicyTemplate", propOrder = {"policy"})
public class ConsistencyGroupLinkPolicyTemplate
        extends BasePolicyTemplate {
    @XmlElement(required = true)
    protected ConsistencyGroupLinkPolicy policy;

    public ConsistencyGroupLinkPolicyTemplate() {
    }

    public ConsistencyGroupLinkPolicyTemplate(ConsistencyGroupLinkPolicy policy) {
        this.policy = policy;
    }


    public ConsistencyGroupLinkPolicy getPolicy() {
        return this.policy;
    }


    public void setPolicy(ConsistencyGroupLinkPolicy value) {
        this.policy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupLinkPolicyTemplate)) {
            return false;
        }
        ConsistencyGroupLinkPolicyTemplate otherObj = (ConsistencyGroupLinkPolicyTemplate) obj;

        return (super.equals(obj)) && (this.policy != null ? this.policy.equals(otherObj.policy) : this.policy == otherObj.policy);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.policy != null ? this.policy.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupLinkPolicyTemplate [super=" + super.toString() + ", " + "policy=" + this.policy + "]";
    }
}


