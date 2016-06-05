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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ClusterLicenseReport", propOrder={"activeLicenses", "clusters", "expiredLicenes", "inactiveLicenes"})
/*     */ public class ClusterLicenseReport
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<LicenseSettings> activeLicenses;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterUID> clusters;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<LicenseSettings> expiredLicenes;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<LicenseSettings> inactiveLicenes;
/*     */   
/*     */   public ClusterLicenseReport() {}
/*     */   
/*     */   public ClusterLicenseReport(List<LicenseSettings> activeLicenses, List<ClusterUID> clusters, List<LicenseSettings> expiredLicenes, List<LicenseSettings> inactiveLicenes)
/*     */   {
/*  60 */     this.activeLicenses = activeLicenses;
/*  61 */     this.clusters = clusters;
/*  62 */     this.expiredLicenes = expiredLicenes;
/*  63 */     this.inactiveLicenes = inactiveLicenes;
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
/*     */   public List<LicenseSettings> getActiveLicenses()
/*     */   {
/*  89 */     if (this.activeLicenses == null) {
/*  90 */       this.activeLicenses = new ArrayList();
/*     */     }
/*  92 */     return this.activeLicenses;
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
/*     */   public List<ClusterUID> getClusters()
/*     */   {
/* 118 */     if (this.clusters == null) {
/* 119 */       this.clusters = new ArrayList();
/*     */     }
/* 121 */     return this.clusters;
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
/*     */   public List<LicenseSettings> getExpiredLicenes()
/*     */   {
/* 147 */     if (this.expiredLicenes == null) {
/* 148 */       this.expiredLicenes = new ArrayList();
/*     */     }
/* 150 */     return this.expiredLicenes;
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
/*     */   public List<LicenseSettings> getInactiveLicenes()
/*     */   {
/* 176 */     if (this.inactiveLicenes == null) {
/* 177 */       this.inactiveLicenes = new ArrayList();
/*     */     }
/* 179 */     return this.inactiveLicenes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 189 */     if (!(obj instanceof ClusterLicenseReport)) {
/* 190 */       return false;
/*     */     }
/* 192 */     ClusterLicenseReport otherObj = (ClusterLicenseReport)obj;
/*     */     
/* 194 */     return (this.activeLicenses != null ? this.activeLicenses.equals(otherObj.activeLicenses) : this.activeLicenses == otherObj.activeLicenses) && (this.clusters != null ? this.clusters.equals(otherObj.clusters) : this.clusters == otherObj.clusters) && (this.expiredLicenes != null ? this.expiredLicenes.equals(otherObj.expiredLicenes) : this.expiredLicenes == otherObj.expiredLicenes) && (this.inactiveLicenes != null ? this.inactiveLicenes.equals(otherObj.inactiveLicenes) : this.inactiveLicenes == otherObj.inactiveLicenes);
/*     */   }
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
/* 206 */     return (this.activeLicenses != null ? this.activeLicenses.hashCode() : 0) ^ (this.clusters != null ? this.clusters.hashCode() : 0) ^ (this.expiredLicenes != null ? this.expiredLicenes.hashCode() : 0) ^ (this.inactiveLicenes != null ? this.inactiveLicenes.hashCode() : 0);
/*     */   }
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
/* 218 */     return "ClusterLicenseReport [activeLicenses=" + this.activeLicenses + ", " + "clusters=" + this.clusters + ", " + "expiredLicenes=" + this.expiredLicenes + ", " + "inactiveLicenes=" + this.inactiveLicenes + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClusterLicenseReport.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */