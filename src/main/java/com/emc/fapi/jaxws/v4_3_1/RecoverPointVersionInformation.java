package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecoverPointVersionInformation", propOrder = {"buildDescription", "hotFix", "major", "minor", "patch", "servicePack"})
public class RecoverPointVersionInformation {
    protected String buildDescription;
    protected String hotFix;
    protected int major;
    protected int minor;
    protected Integer patch;
    protected Integer servicePack;

    public RecoverPointVersionInformation() {
    }

    public RecoverPointVersionInformation(String buildDescription, String hotFix, int major, int minor, Integer patch, Integer servicePack) {
        this.buildDescription = buildDescription;
        this.hotFix = hotFix;
        this.major = major;
        this.minor = minor;
        this.patch = patch;
        this.servicePack = servicePack;
    }


    public String getBuildDescription() {
        return this.buildDescription;
    }


    public void setBuildDescription(String value) {
        this.buildDescription = value;
    }


    public String getHotFix() {
        return this.hotFix;
    }


    public void setHotFix(String value) {
        this.hotFix = value;
    }


    public int getMajor() {
        return this.major;
    }


    public void setMajor(int value) {
        this.major = value;
    }


    public int getMinor() {
        return this.minor;
    }


    public void setMinor(int value) {
        this.minor = value;
    }


    public Integer getPatch() {
        return this.patch;
    }


    public void setPatch(Integer value) {
        this.patch = value;
    }


    public Integer getServicePack() {
        return this.servicePack;
    }


    public void setServicePack(Integer value) {
        this.servicePack = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RecoverPointVersionInformation)) {
            return false;
        }
        RecoverPointVersionInformation otherObj = (RecoverPointVersionInformation) obj;

        return (this.buildDescription != null ? this.buildDescription.equals(otherObj.buildDescription) : this.buildDescription == otherObj.buildDescription) && (this.hotFix != null ? this.hotFix.equals(otherObj.hotFix) : this.hotFix == otherObj.hotFix) && (this.major == otherObj.major) && (this.minor == otherObj.minor) && (this.patch != null ? this.patch.equals(otherObj.patch) : this.patch == otherObj.patch) && (this.servicePack != null ? this.servicePack.equals(otherObj.servicePack) : this.servicePack == otherObj.servicePack);
    }


    public int hashCode() {
        return (this.buildDescription != null ? this.buildDescription.hashCode() : 0) ^ (this.hotFix != null ? this.hotFix.hashCode() : 0) ^ this.major ^ this.minor ^ (this.patch != null ? this.patch.hashCode() : 0) ^ (this.servicePack != null ? this.servicePack.hashCode() : 0);
    }


    public String toString() {
        return "RecoverPointVersionInformation [buildDescription=" + this.buildDescription + ", " + "hotFix=" + this.hotFix + ", " + "major=" + this.major + ", " + "minor=" + this.minor + ", " + "patch=" + this.patch + ", " + "servicePack=" + this.servicePack + "]";
    }
}


