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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="setExternalHostSettings", propOrder={"hostSettings"})
/*     */ public class SetExternalHostSettings
/*     */ {
/*     */   protected ExternalHostSettings hostSettings;
/*     */   
/*     */   public SetExternalHostSettings() {}
/*     */   
/*     */   public SetExternalHostSettings(ExternalHostSettings hostSettings)
/*     */   {
/*  44 */     this.hostSettings = hostSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ExternalHostSettings getHostSettings()
/*     */   {
/*  56 */     return this.hostSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHostSettings(ExternalHostSettings value)
/*     */   {
/*  68 */     this.hostSettings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof SetExternalHostSettings)) {
/*  79 */       return false;
/*     */     }
/*  81 */     SetExternalHostSettings otherObj = (SetExternalHostSettings)obj;
/*     */     
/*  83 */     return this.hostSettings == otherObj.hostSettings ? true : this.hostSettings != null ? this.hostSettings.equals(otherObj.hostSettings) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.hostSettings != null ? this.hostSettings.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "SetExternalHostSettings [hostSettings=" + this.hostSettings + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetExternalHostSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */