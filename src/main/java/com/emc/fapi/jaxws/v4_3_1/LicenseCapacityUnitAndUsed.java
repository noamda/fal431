/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
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
/*     */ @XmlType(name="LicenseCapacityUnitAndUsed", propOrder={"licenseCapacityUnit", "used"})
/*     */ public class LicenseCapacityUnitAndUsed
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected LicenseCapacityUnit licenseCapacityUnit;
/*     */   protected long used;
/*     */   
/*     */   public LicenseCapacityUnitAndUsed() {}
/*     */   
/*     */   public LicenseCapacityUnitAndUsed(LicenseCapacityUnit licenseCapacityUnit, long used)
/*     */   {
/*  49 */     this.licenseCapacityUnit = licenseCapacityUnit;
/*  50 */     this.used = used;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LicenseCapacityUnit getLicenseCapacityUnit()
/*     */   {
/*  62 */     return this.licenseCapacityUnit;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLicenseCapacityUnit(LicenseCapacityUnit value)
/*     */   {
/*  74 */     this.licenseCapacityUnit = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getUsed()
/*     */   {
/*  82 */     return this.used;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUsed(long value)
/*     */   {
/*  90 */     this.used = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 100 */     if (!(obj instanceof LicenseCapacityUnitAndUsed)) {
/* 101 */       return false;
/*     */     }
/* 103 */     LicenseCapacityUnitAndUsed otherObj = (LicenseCapacityUnitAndUsed)obj;
/*     */     
/* 105 */     return (this.licenseCapacityUnit != null ? this.licenseCapacityUnit.equals(otherObj.licenseCapacityUnit) : this.licenseCapacityUnit == otherObj.licenseCapacityUnit) && (this.used == otherObj.used);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 115 */     return (this.licenseCapacityUnit != null ? this.licenseCapacityUnit.hashCode() : 0) ^ (int)this.used;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 125 */     return "LicenseCapacityUnitAndUsed [licenseCapacityUnit=" + this.licenseCapacityUnit + ", " + "used=" + this.used + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\LicenseCapacityUnitAndUsed.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */