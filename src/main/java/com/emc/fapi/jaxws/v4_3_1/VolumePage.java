package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "volumePage", propOrder = {"content", "context", "pageNumber", "pageSize"})
public class VolumePage {
    @XmlElement(nillable = true)
    protected List<VolumeInformation> content;
    protected ClusterSANVolumesContext context;
    protected int pageNumber;
    protected int pageSize;

    public VolumePage() {
    }

    public VolumePage(List<VolumeInformation> content, ClusterSANVolumesContext context, int pageNumber, int pageSize) {
        this.content = content;
        this.context = context;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }


    public List<VolumeInformation> getContent() {
        if (this.content == null) {
            this.content = new ArrayList();
        }
        return this.content;
    }


    public ClusterSANVolumesContext getContext() {
        return this.context;
    }


    public void setContext(ClusterSANVolumesContext value) {
        this.context = value;
    }


    public int getPageNumber() {
        return this.pageNumber;
    }


    public void setPageNumber(int value) {
        this.pageNumber = value;
    }


    public int getPageSize() {
        return this.pageSize;
    }


    public void setPageSize(int value) {
        this.pageSize = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VolumePage)) {
            return false;
        }
        VolumePage otherObj = (VolumePage) obj;

        return (this.content != null ? this.content.equals(otherObj.content) : this.content == otherObj.content) && (this.context != null ? this.context.equals(otherObj.context) : this.context == otherObj.context) && (this.pageNumber == otherObj.pageNumber) && (this.pageSize == otherObj.pageSize);
    }


    public int hashCode() {
        return (this.content != null ? this.content.hashCode() : 0) ^ (this.context != null ? this.context.hashCode() : 0) ^ this.pageNumber ^ this.pageSize;
    }


    public String toString() {
        return "VolumePage [content=" + this.content + ", " + "context=" + this.context + ", " + "pageNumber=" + this.pageNumber + ", " + "pageSize=" + this.pageSize + "]";
    }
}


