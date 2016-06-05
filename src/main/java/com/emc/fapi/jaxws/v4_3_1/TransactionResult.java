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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="TransactionResult", propOrder={"exceptionMessage", "exceptionType", "result"})
/*     */ public class TransactionResult
/*     */ {
/*     */   protected String exceptionMessage;
/*     */   protected String exceptionType;
/*     */   protected Object result;
/*     */   
/*     */   public TransactionResult() {}
/*     */   
/*     */   public TransactionResult(String exceptionMessage, String exceptionType, Object result)
/*     */   {
/*  50 */     this.exceptionMessage = exceptionMessage;
/*  51 */     this.exceptionType = exceptionType;
/*  52 */     this.result = result;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getExceptionMessage()
/*     */   {
/*  64 */     return this.exceptionMessage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setExceptionMessage(String value)
/*     */   {
/*  76 */     this.exceptionMessage = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getExceptionType()
/*     */   {
/*  88 */     return this.exceptionType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setExceptionType(String value)
/*     */   {
/* 100 */     this.exceptionType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Object getResult()
/*     */   {
/* 112 */     return this.result;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setResult(Object value)
/*     */   {
/* 124 */     this.result = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 134 */     if (!(obj instanceof TransactionResult)) {
/* 135 */       return false;
/*     */     }
/* 137 */     TransactionResult otherObj = (TransactionResult)obj;
/*     */     
/* 139 */     return (this.exceptionMessage != null ? this.exceptionMessage.equals(otherObj.exceptionMessage) : this.exceptionMessage == otherObj.exceptionMessage) && (this.exceptionType != null ? this.exceptionType.equals(otherObj.exceptionType) : this.exceptionType == otherObj.exceptionType) && (this.result != null ? this.result.equals(otherObj.result) : this.result == otherObj.result);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 150 */     return (this.exceptionMessage != null ? this.exceptionMessage.hashCode() : 0) ^ (this.exceptionType != null ? this.exceptionType.hashCode() : 0) ^ (this.result != null ? this.result.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 161 */     return "TransactionResult [exceptionMessage=" + this.exceptionMessage + ", " + "exceptionType=" + this.exceptionType + ", " + "result=" + this.result + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\TransactionResult.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */