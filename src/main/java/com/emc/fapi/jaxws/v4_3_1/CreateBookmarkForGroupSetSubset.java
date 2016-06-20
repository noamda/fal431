package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createBookmarkForGroupSetSubset", propOrder = {"groupSetSubset", "bookmarkName", "consolidationPolicy", "consistencyType"})
public class CreateBookmarkForGroupSetSubset {
    protected ConsistencyGroupSetSubset groupSetSubset;
    protected String bookmarkName;
    protected BookmarkConsolidationPolicy consolidationPolicy;
    protected SnapshotConsistencyType consistencyType;

    public CreateBookmarkForGroupSetSubset() {
    }

    public CreateBookmarkForGroupSetSubset(ConsistencyGroupSetSubset groupSetSubset, String bookmarkName, BookmarkConsolidationPolicy consolidationPolicy, SnapshotConsistencyType consistencyType) {
        this.groupSetSubset = groupSetSubset;
        this.bookmarkName = bookmarkName;
        this.consolidationPolicy = consolidationPolicy;
        this.consistencyType = consistencyType;
    }


    public ConsistencyGroupSetSubset getGroupSetSubset() {
        return this.groupSetSubset;
    }


    public void setGroupSetSubset(ConsistencyGroupSetSubset value) {
        this.groupSetSubset = value;
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
        if (!(obj instanceof CreateBookmarkForGroupSetSubset)) {
            return false;
        }
        CreateBookmarkForGroupSetSubset otherObj = (CreateBookmarkForGroupSetSubset) obj;

        return (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset) && (this.bookmarkName != null ? this.bookmarkName.equals(otherObj.bookmarkName) : this.bookmarkName == otherObj.bookmarkName) && (this.consolidationPolicy != null ? this.consolidationPolicy.equals(otherObj.consolidationPolicy) : this.consolidationPolicy == otherObj.consolidationPolicy) && (this.consistencyType != null ? this.consistencyType.equals(otherObj.consistencyType) : this.consistencyType == otherObj.consistencyType);
    }


    public int hashCode() {
        return (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0) ^ (this.bookmarkName != null ? this.bookmarkName.hashCode() : 0) ^ (this.consolidationPolicy != null ? this.consolidationPolicy.hashCode() : 0) ^ (this.consistencyType != null ? this.consistencyType.hashCode() : 0);
    }


    public String toString() {
        return "CreateBookmarkForGroupSetSubset [groupSetSubset=" + this.groupSetSubset + ", " + "bookmarkName=" + this.bookmarkName + ", " + "consolidationPolicy=" + this.consolidationPolicy + ", " + "consistencyType=" + this.consistencyType + "]";
    }
}


