package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createBookmarkParams", propOrder = {"bookmarkName", "consistencyType", "consolidationPolicy", "groups"})
public class CreateBookmarkParams {
    protected String bookmarkName;
    protected SnapshotConsistencyType consistencyType;
    protected BookmarkConsolidationPolicy consolidationPolicy;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupUID> groups;

    public CreateBookmarkParams() {
    }

    public CreateBookmarkParams(String bookmarkName, SnapshotConsistencyType consistencyType, BookmarkConsolidationPolicy consolidationPolicy, List<ConsistencyGroupUID> groups) {
        this.bookmarkName = bookmarkName;
        this.consistencyType = consistencyType;
        this.consolidationPolicy = consolidationPolicy;
        this.groups = groups;
    }


    public String getBookmarkName() {
        return this.bookmarkName;
    }


    public void setBookmarkName(String value) {
        this.bookmarkName = value;
    }


    public SnapshotConsistencyType getConsistencyType() {
        return this.consistencyType;
    }


    public void setConsistencyType(SnapshotConsistencyType value) {
        this.consistencyType = value;
    }


    public BookmarkConsolidationPolicy getConsolidationPolicy() {
        return this.consolidationPolicy;
    }


    public void setConsolidationPolicy(BookmarkConsolidationPolicy value) {
        this.consolidationPolicy = value;
    }


    public List<ConsistencyGroupUID> getGroups() {
        if (this.groups == null) {
            this.groups = new ArrayList();
        }
        return this.groups;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CreateBookmarkParams)) {
            return false;
        }
        CreateBookmarkParams otherObj = (CreateBookmarkParams) obj;

        return (this.bookmarkName != null ? this.bookmarkName.equals(otherObj.bookmarkName) : this.bookmarkName == otherObj.bookmarkName) && (this.consistencyType != null ? this.consistencyType.equals(otherObj.consistencyType) : this.consistencyType == otherObj.consistencyType) && (this.consolidationPolicy != null ? this.consolidationPolicy.equals(otherObj.consolidationPolicy) : this.consolidationPolicy == otherObj.consolidationPolicy) && (this.groups != null ? this.groups.equals(otherObj.groups) : this.groups == otherObj.groups);
    }


    public int hashCode() {
        return (this.bookmarkName != null ? this.bookmarkName.hashCode() : 0) ^ (this.consistencyType != null ? this.consistencyType.hashCode() : 0) ^ (this.consolidationPolicy != null ? this.consolidationPolicy.hashCode() : 0) ^ (this.groups != null ? this.groups.hashCode() : 0);
    }


    public String toString() {
        return "CreateBookmarkParams [bookmarkName=" + this.bookmarkName + ", " + "consistencyType=" + this.consistencyType + ", " + "consolidationPolicy=" + this.consolidationPolicy + ", " + "groups=" + this.groups + "]";
    }
}


