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
/*     */ @XmlType(name="validateStartTransferForGroupSetSubset", propOrder={"groupSetSubset"})
/*     */ public class ValidateStartTransferForGroupSetSubset
/*     */ {
/*     */   protected ConsistencyGroupSetSubset groupSetSubset;
/*     */   
/*     */   public ValidateStartTransferForGroupSetSubset() {}
/*     */   
/*     */   public ValidateStartTransferForGroupSetSubset(ConsistencyGroupSetSubset groupSetSubset)
/*     */   {
/*  44 */     this.groupSetSubset = groupSetSubset;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupSetSubset getGroupSetSubset()
/*     */   {
/*  56 */     return this.groupSetSubset;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupSetSubset(ConsistencyGroupSetSubset value)
/*     */   {
/*  68 */     this.groupSetSubset = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof ValidateStartTransferForGroupSetSubset)) {
/*  79 */       return false;
/*     */     }
/*  81 */     ValidateStartTransferForGroupSetSubset otherObj = (ValidateStartTransferForGroupSetSubset)obj;
/*     */     
/*  83 */     return this.groupSetSubset == otherObj.groupSetSubset ? true : this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "ValidateStartTransferForGroupSetSubset [groupSetSubset=" + this.groupSetSubset + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateStartTransferForGroupSetSubset.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */