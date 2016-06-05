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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SystemSettingsConflicts", propOrder={"clustersInfo", "conflictsDescription"})
/*     */ public class SystemSettingsConflicts
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterInfo> clustersInfo;
/*     */   protected String conflictsDescription;
/*     */   
/*     */   public SystemSettingsConflicts() {}
/*     */   
/*     */   public SystemSettingsConflicts(List<ClusterInfo> clustersInfo, String conflictsDescription)
/*     */   {
/*  51 */     this.clustersInfo = clustersInfo;
/*  52 */     this.conflictsDescription = conflictsDescription;
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
/*     */   public List<ClusterInfo> getClustersInfo()
/*     */   {
/*  78 */     if (this.clustersInfo == null) {
/*  79 */       this.clustersInfo = new ArrayList();
/*     */     }
/*  81 */     return this.clustersInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getConflictsDescription()
/*     */   {
/*  93 */     return this.conflictsDescription;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConflictsDescription(String value)
/*     */   {
/* 105 */     this.conflictsDescription = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 115 */     if (!(obj instanceof SystemSettingsConflicts)) {
/* 116 */       return false;
/*     */     }
/* 118 */     SystemSettingsConflicts otherObj = (SystemSettingsConflicts)obj;
/*     */     
/* 120 */     return (this.clustersInfo != null ? this.clustersInfo.equals(otherObj.clustersInfo) : this.clustersInfo == otherObj.clustersInfo) && (this.conflictsDescription != null ? this.conflictsDescription.equals(otherObj.conflictsDescription) : this.conflictsDescription == otherObj.conflictsDescription);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 130 */     return (this.clustersInfo != null ? this.clustersInfo.hashCode() : 0) ^ (this.conflictsDescription != null ? this.conflictsDescription.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 140 */     return "SystemSettingsConflicts [clustersInfo=" + this.clustersInfo + ", " + "conflictsDescription=" + this.conflictsDescription + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SystemSettingsConflicts.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */