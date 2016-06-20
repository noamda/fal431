package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareInformation", propOrder = {"sharePath", "dataMover", "shareType"})
public class ShareInformation {
    protected String sharePath;
    protected String dataMover;
    @XmlElement(nillable = true)
    protected ShareType shareType;

    public ShareInformation() {
    }

    public ShareInformation(String sharePath, String dataMover, ShareType shareType) {
        this.sharePath = sharePath;
        this.dataMover = dataMover;
        this.shareType = shareType;
    }


    public String getSharePath() {
        return this.sharePath;
    }


    public void setSharePath(String value) {
        this.sharePath = value;
    }


    public String getDataMover() {
        return this.dataMover;
    }


    public void setDataMover(String value) {
        this.dataMover = value;
    }


    public ShareType getShareType() {
        return this.shareType;
    }


    public void setShareType(ShareType value) {
        this.shareType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ShareInformation)) {
            return false;
        }
        ShareInformation otherObj = (ShareInformation) obj;

        return (this.sharePath != null ? this.sharePath.equals(otherObj.sharePath) : this.sharePath == otherObj.sharePath) && (this.dataMover != null ? this.dataMover.equals(otherObj.dataMover) : this.dataMover == otherObj.dataMover) && (this.shareType != null ? this.shareType.equals(otherObj.shareType) : this.shareType == otherObj.shareType);
    }


    public int hashCode() {
        return (this.sharePath != null ? this.sharePath.hashCode() : 0) ^ (this.dataMover != null ? this.dataMover.hashCode() : 0) ^ (this.shareType != null ? this.shareType.hashCode() : 0);
    }


    public String toString() {
        return "ShareInformation [sharePath=" + this.sharePath + ", " + "dataMover=" + this.dataMover + ", " + "shareType=" + this.shareType + "]";
    }
}


