package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("CollectLogsSplitterResultValue")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectLogsSplitterResultValue", propOrder = {"splitter"})
public class CollectLogsSplitterResultValue
        extends CollectLogsResultValue {
    protected SplitterUID splitter;

    public CollectLogsSplitterResultValue() {
    }

    public CollectLogsSplitterResultValue(SplitterUID splitter) {
        this.splitter = splitter;
    }


    public SplitterUID getSplitter() {
        return this.splitter;
    }


    public void setSplitter(SplitterUID value) {
        this.splitter = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CollectLogsSplitterResultValue)) {
            return false;
        }
        CollectLogsSplitterResultValue otherObj = (CollectLogsSplitterResultValue) obj;

        return (super.equals(obj)) && (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.splitter != null ? this.splitter.hashCode() : 0);
    }


    public String toString() {
        return "CollectLogsSplitterResultValue [super=" + super.toString() + ", " + "splitter=" + this.splitter + "]";
    }
}


