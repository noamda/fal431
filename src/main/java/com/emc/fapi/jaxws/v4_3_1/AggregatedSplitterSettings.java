package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@JsonTypeName("AggregatedSplitterSettings")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = Vnx2ESplitterSettings.class, name = "Vnx2eSplitterSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = VplexSplitterSettings.class, name = "VplexSplitterSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = EsxSplitterSettings.class, name = "EsxSplitterSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = IOFilterSplitterSettings.class, name = "IOFilterSplitterSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = SymmetrixV3SplitterSettings.class, name = "SymmetrixV3SplitterSettings")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregatedSplitterSettings", propOrder = {"singleSplittersInfo", "singleSplitterName"})
@XmlSeeAlso({VplexSplitterSettings.class, Vnx2ESplitterSettings.class, IOFilterSplitterSettings.class, SymmetrixV3SplitterSettings.class, EsxSplitterSettings.class})
public class AggregatedSplitterSettings
        extends SplitterSettings {
    @XmlElement(nillable = true)
    protected List<SplitterInfo> singleSplittersInfo;
    protected SingleSplitterProcessorName singleSplitterName;

    public AggregatedSplitterSettings() {
    }

    public AggregatedSplitterSettings(List<SplitterInfo> singleSplittersInfo, SingleSplitterProcessorName singleSplitterName) {
        this.singleSplittersInfo = singleSplittersInfo;
        this.singleSplitterName = singleSplitterName;
    }


    public List<SplitterInfo> getSingleSplittersInfo() {
        if (this.singleSplittersInfo == null) {
            this.singleSplittersInfo = new ArrayList();
        }
        return this.singleSplittersInfo;
    }


    public SingleSplitterProcessorName getSingleSplitterName() {
        return this.singleSplitterName;
    }


    public void setSingleSplitterName(SingleSplitterProcessorName value) {
        this.singleSplitterName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AggregatedSplitterSettings)) {
            return false;
        }
        AggregatedSplitterSettings otherObj = (AggregatedSplitterSettings) obj;

        return (super.equals(obj)) && (this.singleSplittersInfo != null ? this.singleSplittersInfo.equals(otherObj.singleSplittersInfo) : this.singleSplittersInfo == otherObj.singleSplittersInfo) && (this.singleSplitterName != null ? this.singleSplitterName.equals(otherObj.singleSplitterName) : this.singleSplitterName == otherObj.singleSplitterName);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.singleSplittersInfo != null ? this.singleSplittersInfo.hashCode() : 0) ^ (this.singleSplitterName != null ? this.singleSplitterName.hashCode() : 0);
    }


    public String toString() {
        return "AggregatedSplitterSettings [super=" + super.toString() + ", " + "singleSplittersInfo=" + this.singleSplittersInfo + ", " + "singleSplitterName=" + this.singleSplitterName + "]";
    }
}


