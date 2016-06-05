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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SplitterView", propOrder={"splitterInfo", "groupCopies", "volumes"})
/*     */ public class SplitterView
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected SplitterInfo splitterInfo;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyInfo> groupCopies;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<DeviceInfo> volumes;
/*     */   
/*     */   public SplitterView() {}
/*     */   
/*     */   public SplitterView(SplitterInfo splitterInfo, List<ConsistencyGroupCopyInfo> groupCopies, List<DeviceInfo> volumes)
/*     */   {
/*  56 */     this.splitterInfo = splitterInfo;
/*  57 */     this.groupCopies = groupCopies;
/*  58 */     this.volumes = volumes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitterInfo getSplitterInfo()
/*     */   {
/*  70 */     return this.splitterInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitterInfo(SplitterInfo value)
/*     */   {
/*  82 */     this.splitterInfo = value;
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
/* 108 */     if (this.groupCopies == null) {
/* 109 */       this.groupCopies = new ArrayList();
/*     */     }
/* 111 */     return this.groupCopies;
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
/* 137 */     if (this.volumes == null) {
/* 138 */       this.volumes = new ArrayList();
/*     */     }
/* 140 */     return this.volumes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 150 */     if (!(obj instanceof SplitterView)) {
/* 151 */       return false;
/*     */     }
/* 153 */     SplitterView otherObj = (SplitterView)obj;
/*     */     
/* 155 */     return (this.splitterInfo != null ? this.splitterInfo.equals(otherObj.splitterInfo) : this.splitterInfo == otherObj.splitterInfo) && (this.groupCopies != null ? this.groupCopies.equals(otherObj.groupCopies) : this.groupCopies == otherObj.groupCopies) && (this.volumes != null ? this.volumes.equals(otherObj.volumes) : this.volumes == otherObj.volumes);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 166 */     return (this.splitterInfo != null ? this.splitterInfo.hashCode() : 0) ^ (this.groupCopies != null ? this.groupCopies.hashCode() : 0) ^ (this.volumes != null ? this.volumes.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 177 */     return "SplitterView [splitterInfo=" + this.splitterInfo + ", " + "groupCopies=" + this.groupCopies + ", " + "volumes=" + this.volumes + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SplitterView.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */