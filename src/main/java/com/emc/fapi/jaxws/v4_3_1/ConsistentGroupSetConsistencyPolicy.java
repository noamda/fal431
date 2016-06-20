package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistentGroupSetConsistencyPolicy", propOrder = {"bookmarkFrequencyInMicroSeconds"})
public class ConsistentGroupSetConsistencyPolicy {
    protected long bookmarkFrequencyInMicroSeconds;

    public ConsistentGroupSetConsistencyPolicy() {
    }

    public ConsistentGroupSetConsistencyPolicy(long bookmarkFrequencyInMicroSeconds) {
        this.bookmarkFrequencyInMicroSeconds = bookmarkFrequencyInMicroSeconds;
    }


    public long getBookmarkFrequencyInMicroSeconds() {
        return this.bookmarkFrequencyInMicroSeconds;
    }


    public void setBookmarkFrequencyInMicroSeconds(long value) {
        this.bookmarkFrequencyInMicroSeconds = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistentGroupSetConsistencyPolicy)) {
            return false;
        }
        ConsistentGroupSetConsistencyPolicy otherObj = (ConsistentGroupSetConsistencyPolicy) obj;

        return this.bookmarkFrequencyInMicroSeconds == otherObj.bookmarkFrequencyInMicroSeconds;
    }


    public int hashCode() {
        return (int) this.bookmarkFrequencyInMicroSeconds;
    }


    public String toString() {
        return "ConsistentGroupSetConsistencyPolicy [bookmarkFrequencyInMicroSeconds=" + this.bookmarkFrequencyInMicroSeconds + "]";
    }
}


