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
/*     */ @XmlType(name="setConsistencyGroupSettings", propOrder={"settingsParam"})
/*     */ public class SetConsistencyGroupSettings
/*     */ {
/*     */   protected ConsistencyGroupSettingsChangesParam settingsParam;
/*     */   
/*     */   public SetConsistencyGroupSettings() {}
/*     */   
/*     */   public SetConsistencyGroupSettings(ConsistencyGroupSettingsChangesParam settingsParam)
/*     */   {
/*  44 */     this.settingsParam = settingsParam;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupSettingsChangesParam getSettingsParam()
/*     */   {
/*  56 */     return this.settingsParam;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSettingsParam(ConsistencyGroupSettingsChangesParam value)
/*     */   {
/*  68 */     this.settingsParam = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof SetConsistencyGroupSettings)) {
/*  79 */       return false;
/*     */     }
/*  81 */     SetConsistencyGroupSettings otherObj = (SetConsistencyGroupSettings)obj;
/*     */     
/*  83 */     return this.settingsParam == otherObj.settingsParam ? true : this.settingsParam != null ? this.settingsParam.equals(otherObj.settingsParam) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.settingsParam != null ? this.settingsParam.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "SetConsistencyGroupSettings [settingsParam=" + this.settingsParam + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetConsistencyGroupSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */