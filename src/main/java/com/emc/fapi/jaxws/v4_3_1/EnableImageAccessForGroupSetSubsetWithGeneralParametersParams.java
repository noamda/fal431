package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableImageAccessForGroupSetSubsetWithGeneralParametersParams", propOrder = {"generalParams", "groupSetSubset"})
public class EnableImageAccessForGroupSetSubsetWithGeneralParametersParams {
    protected ImageAccessGeneralParameters generalParams;
    protected ConsistencyGroupSetSubset groupSetSubset;

    public EnableImageAccessForGroupSetSubsetWithGeneralParametersParams() {
    }

    public EnableImageAccessForGroupSetSubsetWithGeneralParametersParams(ImageAccessGeneralParameters generalParams, ConsistencyGroupSetSubset groupSetSubset) {
        this.generalParams = generalParams;
        this.groupSetSubset = groupSetSubset;
    }


    public ImageAccessGeneralParameters getGeneralParams() {
        return this.generalParams;
    }


    public void setGeneralParams(ImageAccessGeneralParameters value) {
        this.generalParams = value;
    }


    public ConsistencyGroupSetSubset getGroupSetSubset() {
        return this.groupSetSubset;
    }


    public void setGroupSetSubset(ConsistencyGroupSetSubset value) {
        this.groupSetSubset = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EnableImageAccessForGroupSetSubsetWithGeneralParametersParams)) {
            return false;
        }
        EnableImageAccessForGroupSetSubsetWithGeneralParametersParams otherObj = (EnableImageAccessForGroupSetSubsetWithGeneralParametersParams) obj;

        return (this.generalParams != null ? this.generalParams.equals(otherObj.generalParams) : this.generalParams == otherObj.generalParams) && (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset);
    }


    public int hashCode() {
        return (this.generalParams != null ? this.generalParams.hashCode() : 0) ^ (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0);
    }


    public String toString() {
        return "EnableImageAccessForGroupSetSubsetWithGeneralParametersParams [generalParams=" + this.generalParams + ", " + "groupSetSubset=" + this.groupSetSubset + "]";
    }
}


