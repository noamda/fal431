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
/*     */ @XmlType(name="setVCenterServersViewSettings", propOrder={"settings"})
/*     */ public class SetVCenterServersViewSettings
/*     */ {
/*     */   protected VCenterServersViewSettings settings;
/*     */   
/*     */   public SetVCenterServersViewSettings() {}
/*     */   
/*     */   public SetVCenterServersViewSettings(VCenterServersViewSettings settings)
/*     */   {
/*  44 */     this.settings = settings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VCenterServersViewSettings getSettings()
/*     */   {
/*  56 */     return this.settings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSettings(VCenterServersViewSettings value)
/*     */   {
/*  68 */     this.settings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof SetVCenterServersViewSettings)) {
/*  79 */       return false;
/*     */     }
/*  81 */     SetVCenterServersViewSettings otherObj = (SetVCenterServersViewSettings)obj;
/*     */     
/*  83 */     return this.settings == otherObj.settings ? true : this.settings != null ? this.settings.equals(otherObj.settings) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.settings != null ? this.settings.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "SetVCenterServersViewSettings [settings=" + this.settings + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetVCenterServersViewSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */