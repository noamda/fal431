package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = VCenterServerESXFilter.class, name = "VCenterServerESXFilter"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = VCenterServerLunFilter.class, name = "VCenterServerLunFilter"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = VCenterServerVMFilter.class, name = "VCenterServerVMFilter")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VCenterServerFilter", propOrder = {"filterType", "filteredEntityName"})
@XmlSeeAlso({VCenterServerVMFilter.class, VCenterServerESXFilter.class, VCenterServerLunFilter.class})
public abstract class VCenterServerFilter {
    @XmlElement(required = true)
    protected VCenterServerFilterType filterType;
    @XmlElement(required = true)
    protected String filteredEntityName;

    public VCenterServerFilter() {
    }

    public VCenterServerFilter(VCenterServerFilterType filterType, String filteredEntityName) {
        this.filterType = filterType;
        this.filteredEntityName = filteredEntityName;
    }


    public VCenterServerFilterType getFilterType() {
        return this.filterType;
    }


    public void setFilterType(VCenterServerFilterType value) {
        this.filterType = value;
    }


    public String getFilteredEntityName() {
        return this.filteredEntityName;
    }


    public void setFilteredEntityName(String value) {
        this.filteredEntityName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VCenterServerFilter)) {
            return false;
        }
        VCenterServerFilter otherObj = (VCenterServerFilter) obj;

        return (this.filterType != null ? this.filterType.equals(otherObj.filterType) : this.filterType == otherObj.filterType) && (this.filteredEntityName != null ? this.filteredEntityName.equals(otherObj.filteredEntityName) : this.filteredEntityName == otherObj.filteredEntityName);
    }


    public int hashCode() {
        return (this.filterType != null ? this.filterType.hashCode() : 0) ^ (this.filteredEntityName != null ? this.filteredEntityName.hashCode() : 0);
    }


    public String toString() {
        return "VCenterServerFilter [filterType=" + this.filterType + ", " + "filteredEntityName=" + this.filteredEntityName + "]";
    }
}


