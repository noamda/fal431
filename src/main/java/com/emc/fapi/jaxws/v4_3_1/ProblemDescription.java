/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ProblemDescription", propOrder={"category", "cluster", "description", "problemID", "relevantCopies", "relevantDevices", "relevantGlobalLinks", "relevantRPAs", "relevantSplitter", "relevantSplitterVolumesInformation", "severity"})
/*     */ public class ProblemDescription
/*     */ {
/*     */   protected ProblemCategory category;
/*     */   protected ClusterUID cluster;
/*     */   protected String description;
/*     */   protected int problemID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyUID> relevantCopies;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<DeviceUID> relevantDevices;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<GlobalLinkUID> relevantGlobalLinks;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RpaUID> relevantRPAs;
/*     */   protected SplitterUID relevantSplitter;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SplitterVolumeInfo> relevantSplitterVolumesInformation;
/*     */   protected ProblemSeverity severity;
/*     */   
/*     */   public ProblemDescription() {}
/*     */   
/*     */   public ProblemDescription(ProblemCategory category, ClusterUID cluster, String description, int problemID, List<ConsistencyGroupCopyUID> relevantCopies, List<DeviceUID> relevantDevices, List<GlobalLinkUID> relevantGlobalLinks, List<RpaUID> relevantRPAs, SplitterUID relevantSplitter, List<SplitterVolumeInfo> relevantSplitterVolumesInformation, ProblemSeverity severity)
/*     */   {
/*  82 */     this.category = category;
/*  83 */     this.cluster = cluster;
/*  84 */     this.description = description;
/*  85 */     this.problemID = problemID;
/*  86 */     this.relevantCopies = relevantCopies;
/*  87 */     this.relevantDevices = relevantDevices;
/*  88 */     this.relevantGlobalLinks = relevantGlobalLinks;
/*  89 */     this.relevantRPAs = relevantRPAs;
/*  90 */     this.relevantSplitter = relevantSplitter;
/*  91 */     this.relevantSplitterVolumesInformation = relevantSplitterVolumesInformation;
/*  92 */     this.severity = severity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ProblemCategory getCategory()
/*     */   {
/* 104 */     return this.category;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCategory(ProblemCategory value)
/*     */   {
/* 116 */     this.category = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getCluster()
/*     */   {
/* 128 */     return this.cluster;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCluster(ClusterUID value)
/*     */   {
/* 140 */     this.cluster = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDescription()
/*     */   {
/* 152 */     return this.description;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDescription(String value)
/*     */   {
/* 164 */     this.description = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getProblemID()
/*     */   {
/* 172 */     return this.problemID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProblemID(int value)
/*     */   {
/* 180 */     this.problemID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<ConsistencyGroupCopyUID> getRelevantCopies()
/*     */   {
/* 206 */     if (this.relevantCopies == null) {
/* 207 */       this.relevantCopies = new ArrayList();
/*     */     }
/* 209 */     return this.relevantCopies;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<DeviceUID> getRelevantDevices()
/*     */   {
/* 235 */     if (this.relevantDevices == null) {
/* 236 */       this.relevantDevices = new ArrayList();
/*     */     }
/* 238 */     return this.relevantDevices;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<GlobalLinkUID> getRelevantGlobalLinks()
/*     */   {
/* 264 */     if (this.relevantGlobalLinks == null) {
/* 265 */       this.relevantGlobalLinks = new ArrayList();
/*     */     }
/* 267 */     return this.relevantGlobalLinks;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<RpaUID> getRelevantRPAs()
/*     */   {
/* 293 */     if (this.relevantRPAs == null) {
/* 294 */       this.relevantRPAs = new ArrayList();
/*     */     }
/* 296 */     return this.relevantRPAs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitterUID getRelevantSplitter()
/*     */   {
/* 308 */     return this.relevantSplitter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRelevantSplitter(SplitterUID value)
/*     */   {
/* 320 */     this.relevantSplitter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<SplitterVolumeInfo> getRelevantSplitterVolumesInformation()
/*     */   {
/* 346 */     if (this.relevantSplitterVolumesInformation == null) {
/* 347 */       this.relevantSplitterVolumesInformation = new ArrayList();
/*     */     }
/* 349 */     return this.relevantSplitterVolumesInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ProblemSeverity getSeverity()
/*     */   {
/* 361 */     return this.severity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSeverity(ProblemSeverity value)
/*     */   {
/* 373 */     this.severity = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 383 */     if (!(obj instanceof ProblemDescription)) {
/* 384 */       return false;
/*     */     }
/* 386 */     ProblemDescription otherObj = (ProblemDescription)obj;
/*     */     
/* 388 */     return (this.category != null ? this.category.equals(otherObj.category) : this.category == otherObj.category) && (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.description != null ? this.description.equals(otherObj.description) : this.description == otherObj.description) && (this.problemID == otherObj.problemID) && (this.relevantCopies != null ? this.relevantCopies.equals(otherObj.relevantCopies) : this.relevantCopies == otherObj.relevantCopies) && (this.relevantDevices != null ? this.relevantDevices.equals(otherObj.relevantDevices) : this.relevantDevices == otherObj.relevantDevices) && (this.relevantGlobalLinks != null ? this.relevantGlobalLinks.equals(otherObj.relevantGlobalLinks) : this.relevantGlobalLinks == otherObj.relevantGlobalLinks) && (this.relevantRPAs != null ? this.relevantRPAs.equals(otherObj.relevantRPAs) : this.relevantRPAs == otherObj.relevantRPAs) && (this.relevantSplitter != null ? this.relevantSplitter.equals(otherObj.relevantSplitter) : this.relevantSplitter == otherObj.relevantSplitter) && (this.relevantSplitterVolumesInformation != null ? this.relevantSplitterVolumesInformation.equals(otherObj.relevantSplitterVolumesInformation) : this.relevantSplitterVolumesInformation == otherObj.relevantSplitterVolumesInformation) && (this.severity != null ? this.severity.equals(otherObj.severity) : this.severity == otherObj.severity);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 407 */     return (this.category != null ? this.category.hashCode() : 0) ^ (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.description != null ? this.description.hashCode() : 0) ^ this.problemID ^ (this.relevantCopies != null ? this.relevantCopies.hashCode() : 0) ^ (this.relevantDevices != null ? this.relevantDevices.hashCode() : 0) ^ (this.relevantGlobalLinks != null ? this.relevantGlobalLinks.hashCode() : 0) ^ (this.relevantRPAs != null ? this.relevantRPAs.hashCode() : 0) ^ (this.relevantSplitter != null ? this.relevantSplitter.hashCode() : 0) ^ (this.relevantSplitterVolumesInformation != null ? this.relevantSplitterVolumesInformation.hashCode() : 0) ^ (this.severity != null ? this.severity.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 426 */     return "ProblemDescription [category=" + this.category + ", " + "cluster=" + this.cluster + ", " + "description=" + this.description + ", " + "problemID=" + this.problemID + ", " + "relevantCopies=" + this.relevantCopies + ", " + "relevantDevices=" + this.relevantDevices + ", " + "relevantGlobalLinks=" + this.relevantGlobalLinks + ", " + "relevantRPAs=" + this.relevantRPAs + ", " + "relevantSplitter=" + this.relevantSplitter + ", " + "relevantSplitterVolumesInformation=" + this.relevantSplitterVolumesInformation + ", " + "severity=" + this.severity + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ProblemDescription.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */