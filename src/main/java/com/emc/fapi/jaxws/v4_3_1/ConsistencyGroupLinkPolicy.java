package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ConsistencyGroupLinkPolicy")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupLinkPolicy", propOrder = {"protectionPolicy", "advancedPolicy", "snapshotShippingPolicy"})
public class ConsistencyGroupLinkPolicy
        extends BaseValidatablePolicyTemplateType {
    @XmlElement(required = true)
    protected LinkProtectionPolicy protectionPolicy;
    @XmlElement(required = true)
    protected LinkAdvancedPolicy advancedPolicy;
    @XmlElement(nillable = true)
    protected SnapshotShippingPolicy snapshotShippingPolicy;

    public ConsistencyGroupLinkPolicy() {
    }

    public ConsistencyGroupLinkPolicy(LinkProtectionPolicy protectionPolicy, LinkAdvancedPolicy advancedPolicy, SnapshotShippingPolicy snapshotShippingPolicy) {
        this.protectionPolicy = protectionPolicy;
        this.advancedPolicy = advancedPolicy;
        this.snapshotShippingPolicy = snapshotShippingPolicy;
    }


    public LinkProtectionPolicy getProtectionPolicy() {
        return this.protectionPolicy;
    }


    public void setProtectionPolicy(LinkProtectionPolicy value) {
        this.protectionPolicy = value;
    }


    public LinkAdvancedPolicy getAdvancedPolicy() {
        return this.advancedPolicy;
    }


    public void setAdvancedPolicy(LinkAdvancedPolicy value) {
        this.advancedPolicy = value;
    }


    public SnapshotShippingPolicy getSnapshotShippingPolicy() {
        return this.snapshotShippingPolicy;
    }


    public void setSnapshotShippingPolicy(SnapshotShippingPolicy value) {
        this.snapshotShippingPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupLinkPolicy)) {
            return false;
        }
        ConsistencyGroupLinkPolicy otherObj = (ConsistencyGroupLinkPolicy) obj;

        return (super.equals(obj)) && (this.protectionPolicy != null ? this.protectionPolicy.equals(otherObj.protectionPolicy) : this.protectionPolicy == otherObj.protectionPolicy) && (this.advancedPolicy != null ? this.advancedPolicy.equals(otherObj.advancedPolicy) : this.advancedPolicy == otherObj.advancedPolicy) && (this.snapshotShippingPolicy != null ? this.snapshotShippingPolicy.equals(otherObj.snapshotShippingPolicy) : this.snapshotShippingPolicy == otherObj.snapshotShippingPolicy);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.protectionPolicy != null ? this.protectionPolicy.hashCode() : 0) ^ (this.advancedPolicy != null ? this.advancedPolicy.hashCode() : 0) ^ (this.snapshotShippingPolicy != null ? this.snapshotShippingPolicy.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupLinkPolicy [super=" + super.toString() + ", " + "protectionPolicy=" + this.protectionPolicy + ", " + "advancedPolicy=" + this.advancedPolicy + ", " + "snapshotShippingPolicy=" + this.snapshotShippingPolicy + "]";
    }
}


