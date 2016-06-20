package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticsFilter", propOrder = {"timeFrame", "includeGlobalStatistics", "groups", "rpasNumbers", "clusters", "categories", "granularity"})
public class StatisticsFilter {
    @XmlElement(nillable = true)
    protected TimeFrame timeFrame;
    protected boolean includeGlobalStatistics;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupUID> groups;
    @XmlElement(nillable = true)
    protected List<Integer> rpasNumbers;
    @XmlElement(nillable = true)
    protected List<ClusterUID> clusters;
    @XmlElement(nillable = true)
    protected List<String> categories;
    @XmlElement(required = true)
    protected Quantity granularity;

    public StatisticsFilter() {
    }

    public StatisticsFilter(TimeFrame timeFrame, boolean includeGlobalStatistics, List<ConsistencyGroupUID> groups, List<Integer> rpasNumbers, List<ClusterUID> clusters, List<String> categories, Quantity granularity) {
        this.timeFrame = timeFrame;
        this.includeGlobalStatistics = includeGlobalStatistics;
        this.groups = groups;
        this.rpasNumbers = rpasNumbers;
        this.clusters = clusters;
        this.categories = categories;
        this.granularity = granularity;
    }


    public TimeFrame getTimeFrame() {
        return this.timeFrame;
    }


    public void setTimeFrame(TimeFrame value) {
        this.timeFrame = value;
    }


    public boolean isIncludeGlobalStatistics() {
        return this.includeGlobalStatistics;
    }


    public void setIncludeGlobalStatistics(boolean value) {
        this.includeGlobalStatistics = value;
    }


    public List<ConsistencyGroupUID> getGroups() {
        if (this.groups == null) {
            this.groups = new ArrayList();
        }
        return this.groups;
    }


    public List<Integer> getRpasNumbers() {
        if (this.rpasNumbers == null) {
            this.rpasNumbers = new ArrayList();
        }
        return this.rpasNumbers;
    }


    public List<ClusterUID> getClusters() {
        if (this.clusters == null) {
            this.clusters = new ArrayList();
        }
        return this.clusters;
    }


    public List<String> getCategories() {
        if (this.categories == null) {
            this.categories = new ArrayList();
        }
        return this.categories;
    }


    public Quantity getGranularity() {
        return this.granularity;
    }


    public void setGranularity(Quantity value) {
        this.granularity = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof StatisticsFilter)) {
            return false;
        }
        StatisticsFilter otherObj = (StatisticsFilter) obj;

        return (this.timeFrame != null ? this.timeFrame.equals(otherObj.timeFrame) : this.timeFrame == otherObj.timeFrame) && (this.includeGlobalStatistics == otherObj.includeGlobalStatistics) && (this.groups != null ? this.groups.equals(otherObj.groups) : this.groups == otherObj.groups) && (this.rpasNumbers != null ? this.rpasNumbers.equals(otherObj.rpasNumbers) : this.rpasNumbers == otherObj.rpasNumbers) && (this.clusters != null ? this.clusters.equals(otherObj.clusters) : this.clusters == otherObj.clusters) && (this.categories != null ? this.categories.equals(otherObj.categories) : this.categories == otherObj.categories) && (this.granularity != null ? this.granularity.equals(otherObj.granularity) : this.granularity == otherObj.granularity);
    }


    public int hashCode() {
        return (this.timeFrame != null ? this.timeFrame.hashCode() : 0) ^ (this.includeGlobalStatistics ? 1 : 0) ^ (this.groups != null ? this.groups.hashCode() : 0) ^ (this.rpasNumbers != null ? this.rpasNumbers.hashCode() : 0) ^ (this.clusters != null ? this.clusters.hashCode() : 0) ^ (this.categories != null ? this.categories.hashCode() : 0) ^ (this.granularity != null ? this.granularity.hashCode() : 0);
    }


    public String toString() {
        return "StatisticsFilter [timeFrame=" + this.timeFrame + ", " + "includeGlobalStatistics=" + this.includeGlobalStatistics + ", " + "groups=" + this.groups + ", " + "rpasNumbers=" + this.rpasNumbers + ", " + "clusters=" + this.clusters + ", " + "categories=" + this.categories + ", " + "granularity=" + this.granularity + "]";
    }
}


