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
/*     */ @XmlType(name="validateAbortSnapshotsConsolidation", propOrder={"groupCopy"})
/*     */ public class ValidateAbortSnapshotsConsolidation
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopy;
/*     */   
/*     */   public ValidateAbortSnapshotsConsolidation() {}
/*     */   
/*     */   public ValidateAbortSnapshotsConsolidation(ConsistencyGroupCopyUID groupCopy)
/*     */   {
/*  44 */     this.groupCopy = groupCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getGroupCopy()
/*     */   {
/*  56 */     return this.groupCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupCopy(ConsistencyGroupCopyUID value)
/*     */   {
/*  68 */     this.groupCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof ValidateAbortSnapshotsConsolidation)) {
/*  79 */       return false;
/*     */     }
/*  81 */     ValidateAbortSnapshotsConsolidation otherObj = (ValidateAbortSnapshotsConsolidation)obj;
/*     */     
/*  83 */     return this.groupCopy == otherObj.groupCopy ? true : this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.groupCopy != null ? this.groupCopy.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "ValidateAbortSnapshotsConsolidation [groupCopy=" + this.groupCopy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateAbortSnapshotsConsolidation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */