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
/*     */ @XmlType(name="addConsistencyGroupSet", propOrder={"groupSetSettings"})
/*     */ public class AddConsistencyGroupSet
/*     */ {
/*     */   protected ConsistencyGroupSetSettings groupSetSettings;
/*     */   
/*     */   public AddConsistencyGroupSet() {}
/*     */   
/*     */   public AddConsistencyGroupSet(ConsistencyGroupSetSettings groupSetSettings)
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
/*  78 */     if (!(obj instanceof AddConsistencyGroupSet)) {
/*  79 */       return false;
/*     */     }
/*  81 */     AddConsistencyGroupSet otherObj = (AddConsistencyGroupSet)obj;
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
/* 101 */     return "AddConsistencyGroupSet [groupSetSettings=" + this.groupSetSettings + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AddConsistencyGroupSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */