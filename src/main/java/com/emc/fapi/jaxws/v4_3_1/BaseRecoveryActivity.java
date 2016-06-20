package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ConsistencyGroupCopyRecoveryActivity.class, name = "ConsistencyGroupCopyRecoveryActivity"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ConsistencyGroupSetRecoveryActivity.class, name = "ConsistencyGroupSetRecoveryActivity")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseRecoveryActivity", propOrder = {"activity", "clusterName"})
@XmlSeeAlso({ConsistencyGroupSetRecoveryActivity.class, ConsistencyGroupCopyRecoveryActivity.class})
public abstract class BaseRecoveryActivity {
    protected ImageAccessScenario activity;
    protected String clusterName;

    public BaseRecoveryActivity() {
    }

    public BaseRecoveryActivity(ImageAccessScenario activity, String clusterName) {
        this.activity = activity;
        this.clusterName = clusterName;
    }


    public ImageAccessScenario getActivity() {
        return this.activity;
    }


    public void setActivity(ImageAccessScenario value) {
        this.activity = value;
    }


    public String getClusterName() {
        return this.clusterName;
    }


    public void setClusterName(String value) {
        this.clusterName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof BaseRecoveryActivity)) {
            return false;
        }
        BaseRecoveryActivity otherObj = (BaseRecoveryActivity) obj;

        return (this.activity != null ? this.activity.equals(otherObj.activity) : this.activity == otherObj.activity) && (this.clusterName != null ? this.clusterName.equals(otherObj.clusterName) : this.clusterName == otherObj.clusterName);
    }


    public int hashCode() {
        return (this.activity != null ? this.activity.hashCode() : 0) ^ (this.clusterName != null ? this.clusterName.hashCode() : 0);
    }


    public String toString() {
        return "BaseRecoveryActivity [activity=" + this.activity + ", " + "clusterName=" + this.clusterName + "]";
    }
}


