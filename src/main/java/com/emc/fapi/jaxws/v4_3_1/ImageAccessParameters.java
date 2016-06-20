package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageAccessParameters", propOrder = {"timeStamp", "mode", "imageType", "searchText", "searchExactText", "maximumSearchRange"})
public class ImageAccessParameters {
    @XmlElement(required = true)
    protected RecoverPointTimeStamp timeStamp;
    @XmlElement(required = true)
    protected ImageAccessMode mode;
    protected SearchImageType imageType;
    protected String searchText;
    protected boolean searchExactText;
    protected Long maximumSearchRange;

    public ImageAccessParameters() {
    }

    public ImageAccessParameters(RecoverPointTimeStamp timeStamp, ImageAccessMode mode, SearchImageType imageType, String searchText, boolean searchExactText, Long maximumSearchRange) {
        this.timeStamp = timeStamp;
        this.mode = mode;
        this.imageType = imageType;
        this.searchText = searchText;
        this.searchExactText = searchExactText;
        this.maximumSearchRange = maximumSearchRange;
    }


    public RecoverPointTimeStamp getTimeStamp() {
        return this.timeStamp;
    }


    public void setTimeStamp(RecoverPointTimeStamp value) {
        this.timeStamp = value;
    }


    public ImageAccessMode getMode() {
        return this.mode;
    }


    public void setMode(ImageAccessMode value) {
        this.mode = value;
    }


    public SearchImageType getImageType() {
        return this.imageType;
    }


    public void setImageType(SearchImageType value) {
        this.imageType = value;
    }


    public String getSearchText() {
        return this.searchText;
    }


    public void setSearchText(String value) {
        this.searchText = value;
    }


    public boolean isSearchExactText() {
        return this.searchExactText;
    }


    public void setSearchExactText(boolean value) {
        this.searchExactText = value;
    }


    public Long getMaximumSearchRange() {
        return this.maximumSearchRange;
    }


    public void setMaximumSearchRange(Long value) {
        this.maximumSearchRange = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ImageAccessParameters)) {
            return false;
        }
        ImageAccessParameters otherObj = (ImageAccessParameters) obj;

        return (this.timeStamp != null ? this.timeStamp.equals(otherObj.timeStamp) : this.timeStamp == otherObj.timeStamp) && (this.mode != null ? this.mode.equals(otherObj.mode) : this.mode == otherObj.mode) && (this.imageType != null ? this.imageType.equals(otherObj.imageType) : this.imageType == otherObj.imageType) && (this.searchText != null ? this.searchText.equals(otherObj.searchText) : this.searchText == otherObj.searchText) && (this.searchExactText == otherObj.searchExactText) && (this.maximumSearchRange != null ? this.maximumSearchRange.equals(otherObj.maximumSearchRange) : this.maximumSearchRange == otherObj.maximumSearchRange);
    }


    public int hashCode() {
        return (this.timeStamp != null ? this.timeStamp.hashCode() : 0) ^ (this.mode != null ? this.mode.hashCode() : 0) ^ (this.imageType != null ? this.imageType.hashCode() : 0) ^ (this.searchText != null ? this.searchText.hashCode() : 0) ^ (this.searchExactText ? 1 : 0) ^ (this.maximumSearchRange != null ? this.maximumSearchRange.hashCode() : 0);
    }


    public String toString() {
        return "ImageAccessParameters [timeStamp=" + this.timeStamp + ", " + "mode=" + this.mode + ", " + "imageType=" + this.imageType + ", " + "searchText=" + this.searchText + ", " + "searchExactText=" + this.searchExactText + ", " + "maximumSearchRange=" + this.maximumSearchRange + "]";
    }
}


