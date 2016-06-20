package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ImageAccessQueryParameters.class, name = "ImageAccessQueryParameters"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ImageAccessLatestSnapshotParameters.class, name = "ImageAccessLatestSnapshotParameters"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ImageAccessSpecificSnapshotParameters.class, name = "ImageAccessSpecificSnapshotParameters")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageAccessGeneralParameters", propOrder = {"scenario", "targetNetwork"})
@XmlSeeAlso({ImageAccessSpecificSnapshotParameters.class, ImageAccessLatestSnapshotParameters.class, ImageAccessQueryParameters.class})
public abstract class ImageAccessGeneralParameters {
    @XmlElement(required = true)
    protected ImageAccessScenario scenario;
    protected ImageAccessTargetVirtualNetworkParam targetNetwork;

    public ImageAccessGeneralParameters() {
    }

    public ImageAccessGeneralParameters(ImageAccessScenario scenario, ImageAccessTargetVirtualNetworkParam targetNetwork) {
        this.scenario = scenario;
        this.targetNetwork = targetNetwork;
    }


    public ImageAccessScenario getScenario() {
        return this.scenario;
    }


    public void setScenario(ImageAccessScenario value) {
        this.scenario = value;
    }


    public ImageAccessTargetVirtualNetworkParam getTargetNetwork() {
        return this.targetNetwork;
    }


    public void setTargetNetwork(ImageAccessTargetVirtualNetworkParam value) {
        this.targetNetwork = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ImageAccessGeneralParameters)) {
            return false;
        }
        ImageAccessGeneralParameters otherObj = (ImageAccessGeneralParameters) obj;

        return (this.scenario != null ? this.scenario.equals(otherObj.scenario) : this.scenario == otherObj.scenario) && (this.targetNetwork != null ? this.targetNetwork.equals(otherObj.targetNetwork) : this.targetNetwork == otherObj.targetNetwork);
    }


    public int hashCode() {
        return (this.scenario != null ? this.scenario.hashCode() : 0) ^ (this.targetNetwork != null ? this.targetNetwork.hashCode() : 0);
    }


    public String toString() {
        return "ImageAccessGeneralParameters [scenario=" + this.scenario + ", " + "targetNetwork=" + this.targetNetwork + "]";
    }
}


