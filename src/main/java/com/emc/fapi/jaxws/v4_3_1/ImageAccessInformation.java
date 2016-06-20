package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageAccessInformation", propOrder = {"imageAccessEnabled", "imageInformation", "imageName", "scenario"})
public class ImageAccessInformation {
    protected boolean imageAccessEnabled;
    protected ImageAccessParameters imageInformation;
    protected String imageName;
    protected ImageAccessScenario scenario;

    public ImageAccessInformation() {
    }

    public ImageAccessInformation(boolean imageAccessEnabled, ImageAccessParameters imageInformation, String imageName, ImageAccessScenario scenario) {
        this.imageAccessEnabled = imageAccessEnabled;
        this.imageInformation = imageInformation;
        this.imageName = imageName;
        this.scenario = scenario;
    }


    public boolean isImageAccessEnabled() {
        return this.imageAccessEnabled;
    }


    public void setImageAccessEnabled(boolean value) {
        this.imageAccessEnabled = value;
    }


    public ImageAccessParameters getImageInformation() {
        return this.imageInformation;
    }


    public void setImageInformation(ImageAccessParameters value) {
        this.imageInformation = value;
    }


    public String getImageName() {
        return this.imageName;
    }


    public void setImageName(String value) {
        this.imageName = value;
    }


    public ImageAccessScenario getScenario() {
        return this.scenario;
    }


    public void setScenario(ImageAccessScenario value) {
        this.scenario = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ImageAccessInformation)) {
            return false;
        }
        ImageAccessInformation otherObj = (ImageAccessInformation) obj;

        return (this.imageAccessEnabled == otherObj.imageAccessEnabled) && (this.imageInformation != null ? this.imageInformation.equals(otherObj.imageInformation) : this.imageInformation == otherObj.imageInformation) && (this.imageName != null ? this.imageName.equals(otherObj.imageName) : this.imageName == otherObj.imageName) && (this.scenario != null ? this.scenario.equals(otherObj.scenario) : this.scenario == otherObj.scenario);
    }


    public int hashCode() {
        return (this.imageAccessEnabled ? 1 : 0) ^ (this.imageInformation != null ? this.imageInformation.hashCode() : 0) ^ (this.imageName != null ? this.imageName.hashCode() : 0) ^ (this.scenario != null ? this.scenario.hashCode() : 0);
    }


    public String toString() {
        return "ImageAccessInformation [imageAccessEnabled=" + this.imageAccessEnabled + ", " + "imageInformation=" + this.imageInformation + ", " + "imageName=" + this.imageName + ", " + "scenario=" + this.scenario + "]";
    }
}


