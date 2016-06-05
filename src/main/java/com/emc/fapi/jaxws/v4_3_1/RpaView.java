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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="RpaView", propOrder={"rpaUID", "volumes", "groupCopies", "jvolGroupCopies", "uvolGroupCopies", "splitters", "peerRPAs", "peerClusterList"})
/*     */ public class RpaView
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected RpaUID rpaUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<DeviceInfo> volumes;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyInfo> groupCopies;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyInfo> jvolGroupCopies;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyInfo> uvolGroupCopies;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SplitterInfo> splitters;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RpaUID> peerRPAs;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterUID> peerClusterList;
/*     */   
/*     */   public RpaView() {}
/*     */   
/*     */   public RpaView(RpaUID rpaUID, List<DeviceInfo> volumes, List<ConsistencyGroupCopyInfo> groupCopies, List<ConsistencyGroupCopyInfo> jvolGroupCopies, List<ConsistencyGroupCopyInfo> uvolGroupCopies, List<SplitterInfo> splitters, List<RpaUID> peerRPAs, List<ClusterUID> peerClusterList)
/*     */   {
/*  76 */     this.rpaUID = rpaUID;
/*  77 */     this.volumes = volumes;
/*  78 */     this.groupCopies = groupCopies;
/*  79 */     this.jvolGroupCopies = jvolGroupCopies;
/*  80 */     this.uvolGroupCopies = uvolGroupCopies;
/*  81 */     this.splitters = splitters;
/*  82 */     this.peerRPAs = peerRPAs;
/*  83 */     this.peerClusterList = peerClusterList;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpaUID getRpaUID()
/*     */   {
/*  95 */     return this.rpaUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRpaUID(RpaUID value)
/*     */   {
/* 107 */     this.rpaUID = value;
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
/*     */   public List<DeviceInfo> getVolumes()
/*     */   {
/* 133 */     if (this.volumes == null) {
/* 134 */       this.volumes = new ArrayList();
/*     */     }
/* 136 */     return this.volumes;
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
/*     */   public List<ConsistencyGroupCopyInfo> getGroupCopies()
/*     */   {
/* 162 */     if (this.groupCopies == null) {
/* 163 */       this.groupCopies = new ArrayList();
/*     */     }
/* 165 */     return this.groupCopies;
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
/*     */   public List<ConsistencyGroupCopyInfo> getJvolGroupCopies()
/*     */   {
/* 191 */     if (this.jvolGroupCopies == null) {
/* 192 */       this.jvolGroupCopies = new ArrayList();
/*     */     }
/* 194 */     return this.jvolGroupCopies;
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
/*     */   public List<ConsistencyGroupCopyInfo> getUvolGroupCopies()
/*     */   {
/* 220 */     if (this.uvolGroupCopies == null) {
/* 221 */       this.uvolGroupCopies = new ArrayList();
/*     */     }
/* 223 */     return this.uvolGroupCopies;
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
/*     */   public List<SplitterInfo> getSplitters()
/*     */   {
/* 249 */     if (this.splitters == null) {
/* 250 */       this.splitters = new ArrayList();
/*     */     }
/* 252 */     return this.splitters;
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
/*     */   public List<RpaUID> getPeerRPAs()
/*     */   {
/* 278 */     if (this.peerRPAs == null) {
/* 279 */       this.peerRPAs = new ArrayList();
/*     */     }
/* 281 */     return this.peerRPAs;
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
/*     */   public List<ClusterUID> getPeerClusterList()
/*     */   {
/* 307 */     if (this.peerClusterList == null) {
/* 308 */       this.peerClusterList = new ArrayList();
/*     */     }
/* 310 */     return this.peerClusterList;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 320 */     if (!(obj instanceof RpaView)) {
/* 321 */       return false;
/*     */     }
/* 323 */     RpaView otherObj = (RpaView)obj;
/*     */     
/* 325 */     return (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.volumes != null ? this.volumes.equals(otherObj.volumes) : this.volumes == otherObj.volumes) && (this.groupCopies != null ? this.groupCopies.equals(otherObj.groupCopies) : this.groupCopies == otherObj.groupCopies) && (this.jvolGroupCopies != null ? this.jvolGroupCopies.equals(otherObj.jvolGroupCopies) : this.jvolGroupCopies == otherObj.jvolGroupCopies) && (this.uvolGroupCopies != null ? this.uvolGroupCopies.equals(otherObj.uvolGroupCopies) : this.uvolGroupCopies == otherObj.uvolGroupCopies) && (this.splitters != null ? this.splitters.equals(otherObj.splitters) : this.splitters == otherObj.splitters) && (this.peerRPAs != null ? this.peerRPAs.equals(otherObj.peerRPAs) : this.peerRPAs == otherObj.peerRPAs) && (this.peerClusterList != null ? this.peerClusterList.equals(otherObj.peerClusterList) : this.peerClusterList == otherObj.peerClusterList);
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
/* 341 */     return (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ (this.volumes != null ? this.volumes.hashCode() : 0) ^ (this.groupCopies != null ? this.groupCopies.hashCode() : 0) ^ (this.jvolGroupCopies != null ? this.jvolGroupCopies.hashCode() : 0) ^ (this.uvolGroupCopies != null ? this.uvolGroupCopies.hashCode() : 0) ^ (this.splitters != null ? this.splitters.hashCode() : 0) ^ (this.peerRPAs != null ? this.peerRPAs.hashCode() : 0) ^ (this.peerClusterList != null ? this.peerClusterList.hashCode() : 0);
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
/* 357 */     return "RpaView [rpaUID=" + this.rpaUID + ", " + "volumes=" + this.volumes + ", " + "groupCopies=" + this.groupCopies + ", " + "jvolGroupCopies=" + this.jvolGroupCopies + ", " + "uvolGroupCopies=" + this.uvolGroupCopies + ", " + "splitters=" + this.splitters + ", " + "peerRPAs=" + this.peerRPAs + ", " + "peerClusterList=" + this.peerClusterList + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RpaView.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */