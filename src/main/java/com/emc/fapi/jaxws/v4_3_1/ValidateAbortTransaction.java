/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
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
/*     */ @XmlType(name="validateAbortTransaction", propOrder={"transactionID"})
/*     */ public class ValidateAbortTransaction
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected TransactionID transactionID;
/*     */   
/*     */   public ValidateAbortTransaction() {}
/*     */   
/*     */   public ValidateAbortTransaction(TransactionID transactionID)
/*     */   {
/*  46 */     this.transactionID = transactionID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public TransactionID getTransactionID()
/*     */   {
/*  58 */     return this.transactionID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTransactionID(TransactionID value)
/*     */   {
/*  70 */     this.transactionID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  80 */     if (!(obj instanceof ValidateAbortTransaction)) {
/*  81 */       return false;
/*     */     }
/*  83 */     ValidateAbortTransaction otherObj = (ValidateAbortTransaction)obj;
/*     */     
/*  85 */     return this.transactionID == otherObj.transactionID ? true : this.transactionID != null ? this.transactionID.equals(otherObj.transactionID) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  94 */     return this.transactionID != null ? this.transactionID.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 103 */     return "ValidateAbortTransaction [transactionID=" + this.transactionID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateAbortTransaction.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */