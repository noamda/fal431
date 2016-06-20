package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createBookmark", propOrder = {"groups", "bookmarkName", "consolidationPolicy", "consistencyType"})
public class CreateBookmark {
    protected List<ConsistencyGroupUID> groups;
    protected String bookmarkName;
    protected BookmarkConsolidationPolicy consolidationPolicy;
    protected SnapshotConsistencyType consistencyType;

    public CreateBookmark() {
    }

    public CreateBookmark(List<ConsistencyGroupUID> groups, String bookmarkName, BookmarkConsolidationPolicy consolidationPolicy, SnapshotConsistencyType consistencyType) {
        this.groups = groups;
        this.bookmarkName = bookmarkName;
        this.consolidationPolicy = consolidationPolicy;
        this.consistencyType = consistencyType;
    }


    public List<ConsistencyGroupUID> getGroups() {
        if (this.groups == null) {
            this.groups = new ArrayList();
        }
        return this.groups;
    }


    public String getBookmarkName() {
        return this.bookmarkName;
    }


    public void setBookmarkName(String value) {
        this.bookmarkName = value;
    }


    public BookmarkConsolidationPolicy getConsolidationPolicy() {
        return this.consolidationPolicy;
    }


    public void setConsolidationPolicy(BookmarkConsolidationPolicy value) {
        this.consolidationPolicy = value;
    }


    public SnapshotConsistencyType getConsistencyType() {
        return this.consistencyType;
    }


    public void setConsistencyType(SnapshotConsistencyType value) {
        this.consistencyType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CreateBookmark)) {
            return false;
        }
        CreateBookmark otherObj = (CreateBookmark) obj;

        return (this.groups != null ? this.groups.equals(otherObj.groups) : this.groups == otherObj.groups) && (this.bookmarkName != null ? this.bookmarkName.equals(otherObj.bookmarkName) : this.bookmarkName == otherObj.bookmarkName) && (this.consolidationPolicy != null ? this.consolidationPolicy.equals(otherObj.consolidationPolicy) : this.consolidationPolicy == otherObj.consolidationPolicy) && (this.consistencyType != null ? this.consistencyType.equals(otherObj.consistencyType) : this.consistencyType == otherObj.consistencyType);
    }


    public int hashCode() {
        return (this.groups != null ? this.groups.hashCode() : 0) ^ (this.bookmarkName != null ? this.bookmarkName.hashCode() : 0) ^ (this.consolidationPolicy != null ? this.consolidationPolicy.hashCode() : 0) ^ (this.consistencyType != null ? this.consistencyType.hashCode() : 0);
    }


    public String toString() {
        return "CreateBookmark [groups=" + this.groups + ", " + "bookmarkName=" + this.bookmarkName + ", " + "consolidationPolicy=" + this.consolidationPolicy + ", " + "consistencyType=" + this.consistencyType + "]";
    }
}


