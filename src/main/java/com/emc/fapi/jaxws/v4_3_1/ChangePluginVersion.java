/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*     */ @XmlType(name="changePluginVersion", propOrder={"vcuid", "newVersion"})
/*     */ public class ChangePluginVersion
/*     */ {
/*     */   protected VirtualCenterUID vcuid;
/*     */   protected String newVersion;
/*     */   
/*     */   public ChangePluginVersion() {}
/*     */   
/*     */   public ChangePluginVersion(VirtualCenterUID vcuid, String newVersion)
/*     */   {
/*  47 */     this.vcuid = vcuid;
/*  48 */     this.newVersion = newVersion;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualCenterUID getVcuid()
/*     */   {
/*  60 */     return this.vcuid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVcuid(VirtualCenterUID value)
/*     */   {
/*  72 */     this.vcuid = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getNewVersion()
/*     */   {
/*  84 */     return this.newVersion;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNewVersion(String value)
/*     */   {
/*  96 */     this.newVersion = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof ChangePluginVersion)) {
/* 107 */       return false;
/*     */     }
/* 109 */     ChangePluginVersion otherObj = (ChangePluginVersion)obj;
/*     */     
/* 111 */     return (this.vcuid != null ? this.vcuid.equals(otherObj.vcuid) : this.vcuid == otherObj.vcuid) && (this.newVersion != null ? this.newVersion.equals(otherObj.newVersion) : this.newVersion == otherObj.newVersion);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.vcuid != null ? this.vcuid.hashCode() : 0) ^ (this.newVersion != null ? this.newVersion.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "ChangePluginVersion [vcuid=" + this.vcuid + ", " + "newVersion=" + this.newVersion + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ChangePluginVersion.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */