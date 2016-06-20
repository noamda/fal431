package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createBookmarkForGroupSetSubSetParams", propOrder = {"bookmarkName", "consistencyType", "consolidationPolicy", "groupSetSubset"})
public class CreateBookmarkForGroupSetSubSetParams {
    protected String bookmarkName;
    protected SnapshotConsistencyType consistencyType;
    protected BookmarkConsolidationPolicy consolidationPolicy;
    protected ConsistencyGroupSetSubset groupSetSubset;

    public CreateBookmarkForGroupSetSubSetParams() {
    }

    public CreateBookmarkForGroupSetSubSetParams(String bookmarkName, SnapshotConsistencyType consistencyType, BookmarkConsolidationPolicy consolidationPolicy, ConsistencyGroupSetSubset groupSetSubset) {
        this.bookmarkName = bookmarkName;
        this.consistencyType = consistencyType;
        this.consolidationPolicy = consolidationPolicy;
        this.groupSetSubset = groupSetSubset;
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


    public ConsistencyGroupSetSubset getGroupSetSubset() {
        return this.groupSetSubset;
    }


    public void setGroupSetSubset(ConsistencyGroupSetSubset value) {
        this.groupSetSubset = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CreateBookmarkForGroupSetSubSetParams)) {
            return false;
        }
        CreateBookmarkForGroupSetSubSetParams otherObj = (CreateBookmarkForGroupSetSubSetParams) obj;

        return (this.bookmarkName != null ? this.bookmarkName.equals(otherObj.bookmarkName) : this.bookmarkName == otherObj.bookmarkName) && (this.consistencyType != null ? this.consistencyType.equals(otherObj.consistencyType) : this.consistencyType == otherObj.consistencyType) && (this.consolidationPolicy != null ? this.consolidationPolicy.equals(otherObj.consolidationPolicy) : this.consolidationPolicy == otherObj.consolidationPolicy) && (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset);
    }


    public int hashCode() {
        return (this.bookmarkName != null ? this.bookmarkName.hashCode() : 0) ^ (this.consistencyType != null ? this.consistencyType.hashCode() : 0) ^ (this.consolidationPolicy != null ? this.consolidationPolicy.hashCode() : 0) ^ (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0);
    }


    public String toString() {
        return "CreateBookmarkForGroupSetSubSetParams [bookmarkName=" + this.bookmarkName + ", " + "consistencyType=" + this.consistencyType + ", " + "consolidationPolicy=" + this.consolidationPolicy + ", " + "groupSetSubset=" + this.groupSetSubset + "]";
    }
}


