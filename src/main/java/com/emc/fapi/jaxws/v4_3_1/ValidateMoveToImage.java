package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateMoveToImage", propOrder = {"groupCopy", "accessType", "imageType", "scenario"})
public class ValidateMoveToImage {
    protected ConsistencyGroupCopyUID groupCopy;
    protected SpecificImageAccessType accessType;
    protected SearchImageType imageType;
    protected ImageAccessScenario scenario;

    public ValidateMoveToImage() {
    }

    public ValidateMoveToImage(ConsistencyGroupCopyUID groupCopy, SpecificImageAccessType accessType, SearchImageType imageType, ImageAccessScenario scenario) {
        this.groupCopy = groupCopy;
        this.accessType = accessType;
        this.imageType = imageType;
        this.scenario = scenario;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public SpecificImageAccessType getAccessType() {
        return this.accessType;
    }


    public void setAccessType(SpecificImageAccessType value) {
        this.accessType = value;
    }


    public SearchImageType getImageType() {
        return this.imageType;
    }


    public void setImageType(SearchImageType value) {
        this.imageType = value;
    }


    public ImageAccessScenario getScenario() {
        return this.scenario;
    }


    public void setScenario(ImageAccessScenario value) {
        this.scenario = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateMoveToImage)) {
            return false;
        }
        ValidateMoveToImage otherObj = (ValidateMoveToImage) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.accessType != null ? this.accessType.equals(otherObj.accessType) : this.accessType == otherObj.accessType) && (this.imageType != null ? this.imageType.equals(otherObj.imageType) : this.imageType == otherObj.imageType) && (this.scenario != null ? this.scenario.equals(otherObj.scenario) : this.scenario == otherObj.scenario);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.accessType != null ? this.accessType.hashCode() : 0) ^ (this.imageType != null ? this.imageType.hashCode() : 0) ^ (this.scenario != null ? this.scenario.hashCode() : 0);
    }


    public String toString() {
        return "ValidateMoveToImage [groupCopy=" + this.groupCopy + ", " + "accessType=" + this.accessType + ", " + "imageType=" + this.imageType + ", " + "scenario=" + this.scenario + "]";
    }
}


