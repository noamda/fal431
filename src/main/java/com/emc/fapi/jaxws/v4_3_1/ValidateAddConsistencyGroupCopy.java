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
/*     */ @XmlType(name="validateAddConsistencyGroupCopy", propOrder={"copySettingsParam"})
/*     */ public class ValidateAddConsistencyGroupCopy
/*     */ {
/*     */   protected ConsistencyGroupCopySettingsParam copySettingsParam;
/*     */   
/*     */   public ValidateAddConsistencyGroupCopy() {}
/*     */   
/*     */   public ValidateAddConsistencyGroupCopy(ConsistencyGroupCopySettingsParam copySettingsParam)
/*     */   {
/*  44 */     this.copySettingsParam = copySettingsParam;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopySettingsParam getCopySettingsParam()
/*     */   {
/*  56 */     return this.copySettingsParam;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCopySettingsParam(ConsistencyGroupCopySettingsParam value)
/*     */   {
/*  68 */     this.copySettingsParam = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof ValidateAddConsistencyGroupCopy)) {
/*  79 */       return false;
/*     */     }
/*  81 */     ValidateAddConsistencyGroupCopy otherObj = (ValidateAddConsistencyGroupCopy)obj;
/*     */     
/*  83 */     return this.copySettingsParam == otherObj.copySettingsParam ? true : this.copySettingsParam != null ? this.copySettingsParam.equals(otherObj.copySettingsParam) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.copySettingsParam != null ? this.copySettingsParam.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "ValidateAddConsistencyGroupCopy [copySettingsParam=" + this.copySettingsParam + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateAddConsistencyGroupCopy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */