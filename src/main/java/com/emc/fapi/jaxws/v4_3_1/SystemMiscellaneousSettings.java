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
/*     */ @XmlType(name="SystemMiscellaneousSettings", propOrder={"useAutomaticSplitterInfoCollection", "securityLevel", "rpasMultipathMonitoring"})
/*     */ public class SystemMiscellaneousSettings
/*     */ {
/*     */   protected boolean useAutomaticSplitterInfoCollection;
/*     */   @XmlElement(required=true)
/*     */   protected SystemSecurityLevel securityLevel;
/*     */   @XmlElement(required=true)
/*     */   protected List<ClusterRPAMultipathMonitoring> rpasMultipathMonitoring;
/*     */   
/*     */   public SystemMiscellaneousSettings() {}
/*     */   
/*     */   public SystemMiscellaneousSettings(boolean useAutomaticSplitterInfoCollection, SystemSecurityLevel securityLevel, List<ClusterRPAMultipathMonitoring> rpasMultipathMonitoring)
/*     */   {
/*  55 */     this.useAutomaticSplitterInfoCollection = useAutomaticSplitterInfoCollection;
/*  56 */     this.securityLevel = securityLevel;
/*  57 */     this.rpasMultipathMonitoring = rpasMultipathMonitoring;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isUseAutomaticSplitterInfoCollection()
/*     */   {
/*  65 */     return this.useAutomaticSplitterInfoCollection;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUseAutomaticSplitterInfoCollection(boolean value)
/*     */   {
/*  73 */     this.useAutomaticSplitterInfoCollection = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemSecurityLevel getSecurityLevel()
/*     */   {
/*  85 */     return this.securityLevel;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSecurityLevel(SystemSecurityLevel value)
/*     */   {
/*  97 */     this.securityLevel = value;
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
/*     */   public List<ClusterRPAMultipathMonitoring> getRpasMultipathMonitoring()
/*     */   {
/* 123 */     if (this.rpasMultipathMonitoring == null) {
/* 124 */       this.rpasMultipathMonitoring = new ArrayList();
/*     */     }
/* 126 */     return this.rpasMultipathMonitoring;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 136 */     if (!(obj instanceof SystemMiscellaneousSettings)) {
/* 137 */       return false;
/*     */     }
/* 139 */     SystemMiscellaneousSettings otherObj = (SystemMiscellaneousSettings)obj;
/*     */     
/* 141 */     return (this.useAutomaticSplitterInfoCollection == otherObj.useAutomaticSplitterInfoCollection) && (this.securityLevel != null ? this.securityLevel.equals(otherObj.securityLevel) : this.securityLevel == otherObj.securityLevel) && (this.rpasMultipathMonitoring != null ? this.rpasMultipathMonitoring.equals(otherObj.rpasMultipathMonitoring) : this.rpasMultipathMonitoring == otherObj.rpasMultipathMonitoring);
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
/* 152 */     return (this.useAutomaticSplitterInfoCollection ? 1 : 0) ^ (this.securityLevel != null ? this.securityLevel.hashCode() : 0) ^ (this.rpasMultipathMonitoring != null ? this.rpasMultipathMonitoring.hashCode() : 0);
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
/* 163 */     return "SystemMiscellaneousSettings [useAutomaticSplitterInfoCollection=" + this.useAutomaticSplitterInfoCollection + ", " + "securityLevel=" + this.securityLevel + ", " + "rpasMultipathMonitoring=" + this.rpasMultipathMonitoring + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SystemMiscellaneousSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */