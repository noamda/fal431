/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSeeAlso;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonSubTypes;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.As;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=SymmetrixSplitterState.class, name="SymmetrixSplitterState"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=AggregatedSplitterState.class, name="AggregatedSplitterState")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SplitterState", propOrder={"splitterUID", "splitterStatus", "numberOfAttachedRPAClusters", "rpasConnectivityStatus", "volumesAccessState", "osAndVersionInfo", "rpasPaths", "splitterCapabilities"})
/*     */ @XmlSeeAlso({SymmetrixSplitterState.class, AggregatedSplitterState.class})
/*     */ public class SplitterState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected SplitterUID splitterUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected SplitterStatus splitterStatus;
/*     */   protected int numberOfAttachedRPAClusters;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RPAConnectivityStatus> rpasConnectivityStatus;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<AttachedUserVolumeAccessState> volumesAccessState;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SplitterOSAndVersionInfo> osAndVersionInfo;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<Path> rpasPaths;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<Capability> splitterCapabilities;
/*     */   
/*     */   public SplitterState() {}
/*     */   
/*     */   public SplitterState(SplitterUID splitterUID, SplitterStatus splitterStatus, int numberOfAttachedRPAClusters, List<RPAConnectivityStatus> rpasConnectivityStatus, List<AttachedUserVolumeAccessState> volumesAccessState, List<SplitterOSAndVersionInfo> osAndVersionInfo, List<Path> rpasPaths, List<Capability> splitterCapabilities)
/*     */   {
/*  92 */     this.splitterUID = splitterUID;
/*  93 */     this.splitterStatus = splitterStatus;
/*  94 */     this.numberOfAttachedRPAClusters = numberOfAttachedRPAClusters;
/*  95 */     this.rpasConnectivityStatus = rpasConnectivityStatus;
/*  96 */     this.volumesAccessState = volumesAccessState;
/*  97 */     this.osAndVersionInfo = osAndVersionInfo;
/*  98 */     this.rpasPaths = rpasPaths;
/*  99 */     this.splitterCapabilities = splitterCapabilities;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitterUID getSplitterUID()
/*     */   {
/* 111 */     return this.splitterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitterUID(SplitterUID value)
/*     */   {
/* 123 */     this.splitterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitterStatus getSplitterStatus()
/*     */   {
/* 135 */     return this.splitterStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitterStatus(SplitterStatus value)
/*     */   {
/* 147 */     this.splitterStatus = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getNumberOfAttachedRPAClusters()
/*     */   {
/* 155 */     return this.numberOfAttachedRPAClusters;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNumberOfAttachedRPAClusters(int value)
/*     */   {
/* 163 */     this.numberOfAttachedRPAClusters = value;
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
/*     */   public List<RPAConnectivityStatus> getRpasConnectivityStatus()
/*     */   {
/* 189 */     if (this.rpasConnectivityStatus == null) {
/* 190 */       this.rpasConnectivityStatus = new ArrayList();
/*     */     }
/* 192 */     return this.rpasConnectivityStatus;
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
/*     */   public List<AttachedUserVolumeAccessState> getVolumesAccessState()
/*     */   {
/* 218 */     if (this.volumesAccessState == null) {
/* 219 */       this.volumesAccessState = new ArrayList();
/*     */     }
/* 221 */     return this.volumesAccessState;
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
/*     */   public List<SplitterOSAndVersionInfo> getOsAndVersionInfo()
/*     */   {
/* 247 */     if (this.osAndVersionInfo == null) {
/* 248 */       this.osAndVersionInfo = new ArrayList();
/*     */     }
/* 250 */     return this.osAndVersionInfo;
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
/*     */   public List<Path> getRpasPaths()
/*     */   {
/* 276 */     if (this.rpasPaths == null) {
/* 277 */       this.rpasPaths = new ArrayList();
/*     */     }
/* 279 */     return this.rpasPaths;
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
/*     */   public List<Capability> getSplitterCapabilities()
/*     */   {
/* 305 */     if (this.splitterCapabilities == null) {
/* 306 */       this.splitterCapabilities = new ArrayList();
/*     */     }
/* 308 */     return this.splitterCapabilities;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 318 */     if (!(obj instanceof SplitterState)) {
/* 319 */       return false;
/*     */     }
/* 321 */     SplitterState otherObj = (SplitterState)obj;
/*     */     
/* 323 */     return (this.splitterUID != null ? this.splitterUID.equals(otherObj.splitterUID) : this.splitterUID == otherObj.splitterUID) && (this.splitterStatus != null ? this.splitterStatus.equals(otherObj.splitterStatus) : this.splitterStatus == otherObj.splitterStatus) && (this.numberOfAttachedRPAClusters == otherObj.numberOfAttachedRPAClusters) && (this.rpasConnectivityStatus != null ? this.rpasConnectivityStatus.equals(otherObj.rpasConnectivityStatus) : this.rpasConnectivityStatus == otherObj.rpasConnectivityStatus) && (this.volumesAccessState != null ? this.volumesAccessState.equals(otherObj.volumesAccessState) : this.volumesAccessState == otherObj.volumesAccessState) && (this.osAndVersionInfo != null ? this.osAndVersionInfo.equals(otherObj.osAndVersionInfo) : this.osAndVersionInfo == otherObj.osAndVersionInfo) && (this.rpasPaths != null ? this.rpasPaths.equals(otherObj.rpasPaths) : this.rpasPaths == otherObj.rpasPaths) && (this.splitterCapabilities != null ? this.splitterCapabilities.equals(otherObj.splitterCapabilities) : this.splitterCapabilities == otherObj.splitterCapabilities);
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
/*     */   public int hashCode()
/*     */   {
/* 339 */     return (this.splitterUID != null ? this.splitterUID.hashCode() : 0) ^ (this.splitterStatus != null ? this.splitterStatus.hashCode() : 0) ^ this.numberOfAttachedRPAClusters ^ (this.rpasConnectivityStatus != null ? this.rpasConnectivityStatus.hashCode() : 0) ^ (this.volumesAccessState != null ? this.volumesAccessState.hashCode() : 0) ^ (this.osAndVersionInfo != null ? this.osAndVersionInfo.hashCode() : 0) ^ (this.rpasPaths != null ? this.rpasPaths.hashCode() : 0) ^ (this.splitterCapabilities != null ? this.splitterCapabilities.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 355 */     return "SplitterState [splitterUID=" + this.splitterUID + ", " + "splitterStatus=" + this.splitterStatus + ", " + "numberOfAttachedRPAClusters=" + this.numberOfAttachedRPAClusters + ", " + "rpasConnectivityStatus=" + this.rpasConnectivityStatus + ", " + "volumesAccessState=" + this.volumesAccessState + ", " + "osAndVersionInfo=" + this.osAndVersionInfo + ", " + "rpasPaths=" + this.rpasPaths + ", " + "splitterCapabilities=" + this.splitterCapabilities + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SplitterState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */