package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProblemDescription", propOrder = {"category", "cluster", "description", "problemID", "relevantCopies", "relevantDevices", "relevantGlobalLinks", "relevantRPAs", "relevantSplitter", "relevantSplitterVolumesInformation", "severity"})
public class ProblemDescription {
    protected ProblemCategory category;
    protected ClusterUID cluster;
    protected String description;
    protected int problemID;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyUID> relevantCopies;
    @XmlElement(nillable = true)
    protected List<DeviceUID> relevantDevices;
    @XmlElement(nillable = true)
    protected List<GlobalLinkUID> relevantGlobalLinks;
    @XmlElement(nillable = true)
    protected List<RpaUID> relevantRPAs;
    protected SplitterUID relevantSplitter;
    @XmlElement(nillable = true)
    protected List<SplitterVolumeInfo> relevantSplitterVolumesInformation;
    protected ProblemSeverity severity;

    public ProblemDescription() {
    }

    public ProblemDescription(ProblemCategory category, ClusterUID cluster, String description, int problemID, List<ConsistencyGroupCopyUID> relevantCopies, List<DeviceUID> relevantDevices, List<GlobalLinkUID> relevantGlobalLinks, List<RpaUID> relevantRPAs, SplitterUID relevantSplitter, List<SplitterVolumeInfo> relevantSplitterVolumesInformation, ProblemSeverity severity) {
        this.category = category;
        this.cluster = cluster;
        this.description = description;
        this.problemID = problemID;
        this.relevantCopies = relevantCopies;
        this.relevantDevices = relevantDevices;
        this.relevantGlobalLinks = relevantGlobalLinks;
        this.relevantRPAs = relevantRPAs;
        this.relevantSplitter = relevantSplitter;
        this.relevantSplitterVolumesInformation = relevantSplitterVolumesInformation;
        this.severity = severity;
    }


    public ProblemCategory getCategory() {
        return this.category;
    }


    public void setCategory(ProblemCategory value) {
        this.category = value;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public String getDescription() {
        return this.description;
    }


    public void setDescription(String value) {
        this.description = value;
    }


    public int getProblemID() {
        return this.problemID;
    }


    public void setProblemID(int value) {
        this.problemID = value;
    }


    public List<ConsistencyGroupCopyUID> getRelevantCopies() {
        if (this.relevantCopies == null) {
            this.relevantCopies = new ArrayList();
        }
        return this.relevantCopies;
    }


    public List<DeviceUID> getRelevantDevices() {
        if (this.relevantDevices == null) {
            this.relevantDevices = new ArrayList();
        }
        return this.relevantDevices;
    }


    public List<GlobalLinkUID> getRelevantGlobalLinks() {
        if (this.relevantGlobalLinks == null) {
            this.relevantGlobalLinks = new ArrayList();
        }
        return this.relevantGlobalLinks;
    }


    public List<RpaUID> getRelevantRPAs() {
        if (this.relevantRPAs == null) {
            this.relevantRPAs = new ArrayList();
        }
        return this.relevantRPAs;
    }


    public SplitterUID getRelevantSplitter() {
        return this.relevantSplitter;
    }


    public void setRelevantSplitter(SplitterUID value) {
        this.relevantSplitter = value;
    }


    public List<SplitterVolumeInfo> getRelevantSplitterVolumesInformation() {
        if (this.relevantSplitterVolumesInformation == null) {
            this.relevantSplitterVolumesInformation = new ArrayList();
        }
        return this.relevantSplitterVolumesInformation;
    }


    public ProblemSeverity getSeverity() {
        return this.severity;
    }


    public void setSeverity(ProblemSeverity value) {
        this.severity = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ProblemDescription)) {
            return false;
        }
        ProblemDescription otherObj = (ProblemDescription) obj;

        return (this.category != null ? this.category.equals(otherObj.category) : this.category == otherObj.category) && (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.description != null ? this.description.equals(otherObj.description) : this.description == otherObj.description) && (this.problemID == otherObj.problemID) && (this.relevantCopies != null ? this.relevantCopies.equals(otherObj.relevantCopies) : this.relevantCopies == otherObj.relevantCopies) && (this.relevantDevices != null ? this.relevantDevices.equals(otherObj.relevantDevices) : this.relevantDevices == otherObj.relevantDevices) && (this.relevantGlobalLinks != null ? this.relevantGlobalLinks.equals(otherObj.relevantGlobalLinks) : this.relevantGlobalLinks == otherObj.relevantGlobalLinks) && (this.relevantRPAs != null ? this.relevantRPAs.equals(otherObj.relevantRPAs) : this.relevantRPAs == otherObj.relevantRPAs) && (this.relevantSplitter != null ? this.relevantSplitter.equals(otherObj.relevantSplitter) : this.relevantSplitter == otherObj.relevantSplitter) && (this.relevantSplitterVolumesInformation != null ? this.relevantSplitterVolumesInformation.equals(otherObj.relevantSplitterVolumesInformation) : this.relevantSplitterVolumesInformation == otherObj.relevantSplitterVolumesInformation) && (this.severity != null ? this.severity.equals(otherObj.severity) : this.severity == otherObj.severity);
    }


    public int hashCode() {
        return (this.category != null ? this.category.hashCode() : 0) ^ (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.description != null ? this.description.hashCode() : 0) ^ this.problemID ^ (this.relevantCopies != null ? this.relevantCopies.hashCode() : 0) ^ (this.relevantDevices != null ? this.relevantDevices.hashCode() : 0) ^ (this.relevantGlobalLinks != null ? this.relevantGlobalLinks.hashCode() : 0) ^ (this.relevantRPAs != null ? this.relevantRPAs.hashCode() : 0) ^ (this.relevantSplitter != null ? this.relevantSplitter.hashCode() : 0) ^ (this.relevantSplitterVolumesInformation != null ? this.relevantSplitterVolumesInformation.hashCode() : 0) ^ (this.severity != null ? this.severity.hashCode() : 0);
    }


    public String toString() {
        return "ProblemDescription [category=" + this.category + ", " + "cluster=" + this.cluster + ", " + "description=" + this.description + ", " + "problemID=" + this.problemID + ", " + "relevantCopies=" + this.relevantCopies + ", " + "relevantDevices=" + this.relevantDevices + ", " + "relevantGlobalLinks=" + this.relevantGlobalLinks + ", " + "relevantRPAs=" + this.relevantRPAs + ", " + "relevantSplitter=" + this.relevantSplitter + ", " + "relevantSplitterVolumesInformation=" + this.relevantSplitterVolumesInformation + ", " + "severity=" + this.severity + "]";
    }
}


