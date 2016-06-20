package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ConsistencyGroupCopyPolicyTemplate")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopyPolicyTemplate", propOrder = {"policy"})
public class ConsistencyGroupCopyPolicyTemplate
        extends BasePolicyTemplate {
    @XmlElement(required = true)
    protected ConsistencyGroupCopyPolicy policy;

    public ConsistencyGroupCopyPolicyTemplate() {
    }

    public ConsistencyGroupCopyPolicyTemplate(ConsistencyGroupCopyPolicy policy) {
        this.policy = policy;
    }


    public ConsistencyGroupCopyPolicy getPolicy() {
        return this.policy;
    }


    public void setPolicy(ConsistencyGroupCopyPolicy value) {
        this.policy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopyPolicyTemplate)) {
            return false;
        }
        ConsistencyGroupCopyPolicyTemplate otherObj = (ConsistencyGroupCopyPolicyTemplate) obj;

        return (super.equals(obj)) && (this.policy != null ? this.policy.equals(otherObj.policy) : this.policy == otherObj.policy);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.policy != null ? this.policy.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupCopyPolicyTemplate [super=" + super.toString() + ", " + "policy=" + this.policy + "]";
    }
}


