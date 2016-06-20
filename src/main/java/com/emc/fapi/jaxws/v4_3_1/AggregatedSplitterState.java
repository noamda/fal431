package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@JsonTypeName("AggregatedSplitterState")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregatedSplitterState", propOrder = {"singleSplittersState"})
public class AggregatedSplitterState
        extends SplitterState {
    @XmlElement(nillable = true)
    protected List<SplitterState> singleSplittersState;

    public AggregatedSplitterState() {
    }

    public AggregatedSplitterState(List<SplitterState> singleSplittersState) {
        this.singleSplittersState = singleSplittersState;
    }


    public List<SplitterState> getSingleSplittersState() {
        if (this.singleSplittersState == null) {
            this.singleSplittersState = new ArrayList();
        }
        return this.singleSplittersState;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AggregatedSplitterState)) {
            return false;
        }
        AggregatedSplitterState otherObj = (AggregatedSplitterState) obj;

        return (super.equals(obj)) && (this.singleSplittersState != null ? this.singleSplittersState.equals(otherObj.singleSplittersState) : this.singleSplittersState == otherObj.singleSplittersState);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.singleSplittersState != null ? this.singleSplittersState.hashCode() : 0);
    }


    public String toString() {
        return "AggregatedSplitterState [super=" + super.toString() + ", " + "singleSplittersState=" + this.singleSplittersState + "]";
    }
}


