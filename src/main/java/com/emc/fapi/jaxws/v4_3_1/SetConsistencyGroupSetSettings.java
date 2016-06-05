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
/*     */ @XmlType(name="setConsistencyGroupSetSettings", propOrder={"groupSetSettings"})
/*     */ public class SetConsistencyGroupSetSettings
/*     */ {
/*     */   protected ConsistencyGroupSetSettings groupSetSettings;
/*     */   
/*     */   public SetConsistencyGroupSetSettings() {}
/*     */   
/*     */   public SetConsistencyGroupSetSettings(ConsistencyGroupSetSettings groupSetSettings)
/*     */   {
/*  44 */     this.groupSetSettings = groupSetSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupSetSettings getGroupSetSettings()
/*     */   {
/*  56 */     return this.groupSetSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupSetSettings(ConsistencyGroupSetSettings value)
/*     */   {
/*  68 */     this.groupSetSettings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof SetConsistencyGroupSetSettings)) {
/*  79 */       return false;
/*     */     }
/*  81 */     SetConsistencyGroupSetSettings otherObj = (SetConsistencyGroupSetSettings)obj;
/*     */     
/*  83 */     return this.groupSetSettings == otherObj.groupSetSettings ? true : this.groupSetSettings != null ? this.groupSetSettings.equals(otherObj.groupSetSettings) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.groupSetSettings != null ? this.groupSetSettings.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "SetConsistencyGroupSetSettings [groupSetSettings=" + this.groupSetSettings + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetConsistencyGroupSetSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */