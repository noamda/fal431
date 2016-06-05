/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonTypeName;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("VCLicenseSettings")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VCLicenseSettings", propOrder={"virtualCenterUid"})
/*     */ public class VCLicenseSettings
/*     */   extends LicenseSettings
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected VirtualCenterUID virtualCenterUid;
/*     */   
/*     */   public VCLicenseSettings() {}
/*     */   
/*     */   public VCLicenseSettings(VirtualCenterUID virtualCenterUid)
/*     */   {
/*  56 */     this.virtualCenterUid = virtualCenterUid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualCenterUID getVirtualCenterUid()
/*     */   {
/*  68 */     return this.virtualCenterUid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVirtualCenterUid(VirtualCenterUID value)
/*     */   {
/*  80 */     this.virtualCenterUid = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof VCLicenseSettings)) {
/*  91 */       return false;
/*     */     }
/*  93 */     VCLicenseSettings otherObj = (VCLicenseSettings)obj;
/*     */     
/*  95 */     return (super.equals(obj)) && (this.virtualCenterUid != null ? this.virtualCenterUid.equals(otherObj.virtualCenterUid) : this.virtualCenterUid == otherObj.virtualCenterUid);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return super.hashCode() ^ (this.virtualCenterUid != null ? this.virtualCenterUid.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "VCLicenseSettings [super=" + super.toString() + ", " + "virtualCenterUid=" + this.virtualCenterUid + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VCLicenseSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */