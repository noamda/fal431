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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="LicenseState", propOrder={"licenseUID", "licenseStatus", "daysUntilExpiration", "clustersUID", "licenseCapacityUnitAndUsed"})
/*     */ public class LicenseState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected LicenseUID licenseUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected LicenseStatus licenseStatus;
/*     */   protected Integer daysUntilExpiration;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterUID> clustersUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected LicenseCapacityUnitAndUsed licenseCapacityUnitAndUsed;
/*     */   
/*     */   public LicenseState() {}
/*     */   
/*     */   public LicenseState(LicenseUID licenseUID, LicenseStatus licenseStatus, Integer daysUntilExpiration, List<ClusterUID> clustersUID, LicenseCapacityUnitAndUsed licenseCapacityUnitAndUsed)
/*     */   {
/*  63 */     this.licenseUID = licenseUID;
/*  64 */     this.licenseStatus = licenseStatus;
/*  65 */     this.daysUntilExpiration = daysUntilExpiration;
/*  66 */     this.clustersUID = clustersUID;
/*  67 */     this.licenseCapacityUnitAndUsed = licenseCapacityUnitAndUsed;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LicenseUID getLicenseUID()
/*     */   {
/*  79 */     return this.licenseUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLicenseUID(LicenseUID value)
/*     */   {
/*  91 */     this.licenseUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LicenseStatus getLicenseStatus()
/*     */   {
/* 103 */     return this.licenseStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLicenseStatus(LicenseStatus value)
/*     */   {
/* 115 */     this.licenseStatus = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Integer getDaysUntilExpiration()
/*     */   {
/* 127 */     return this.daysUntilExpiration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDaysUntilExpiration(Integer value)
/*     */   {
/* 139 */     this.daysUntilExpiration = value;
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
/*     */   public List<ClusterUID> getClustersUID()
/*     */   {
/* 165 */     if (this.clustersUID == null) {
/* 166 */       this.clustersUID = new ArrayList();
/*     */     }
/* 168 */     return this.clustersUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LicenseCapacityUnitAndUsed getLicenseCapacityUnitAndUsed()
/*     */   {
/* 180 */     return this.licenseCapacityUnitAndUsed;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLicenseCapacityUnitAndUsed(LicenseCapacityUnitAndUsed value)
/*     */   {
/* 192 */     this.licenseCapacityUnitAndUsed = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 202 */     if (!(obj instanceof LicenseState)) {
/* 203 */       return false;
/*     */     }
/* 205 */     LicenseState otherObj = (LicenseState)obj;
/*     */     
/* 207 */     return (this.licenseUID != null ? this.licenseUID.equals(otherObj.licenseUID) : this.licenseUID == otherObj.licenseUID) && (this.licenseStatus != null ? this.licenseStatus.equals(otherObj.licenseStatus) : this.licenseStatus == otherObj.licenseStatus) && (this.daysUntilExpiration != null ? this.daysUntilExpiration.equals(otherObj.daysUntilExpiration) : this.daysUntilExpiration == otherObj.daysUntilExpiration) && (this.clustersUID != null ? this.clustersUID.equals(otherObj.clustersUID) : this.clustersUID == otherObj.clustersUID) && (this.licenseCapacityUnitAndUsed != null ? this.licenseCapacityUnitAndUsed.equals(otherObj.licenseCapacityUnitAndUsed) : this.licenseCapacityUnitAndUsed == otherObj.licenseCapacityUnitAndUsed);
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
/*     */   public int hashCode()
/*     */   {
/* 220 */     return (this.licenseUID != null ? this.licenseUID.hashCode() : 0) ^ (this.licenseStatus != null ? this.licenseStatus.hashCode() : 0) ^ (this.daysUntilExpiration != null ? this.daysUntilExpiration.hashCode() : 0) ^ (this.clustersUID != null ? this.clustersUID.hashCode() : 0) ^ (this.licenseCapacityUnitAndUsed != null ? this.licenseCapacityUnitAndUsed.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 233 */     return "LicenseState [licenseUID=" + this.licenseUID + ", " + "licenseStatus=" + this.licenseStatus + ", " + "daysUntilExpiration=" + this.daysUntilExpiration + ", " + "clustersUID=" + this.clustersUID + ", " + "licenseCapacityUnitAndUsed=" + this.licenseCapacityUnitAndUsed + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\LicenseState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */