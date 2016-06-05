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
/*     */ @XmlType(name="BottlenecksDetectionResult", propOrder={"result"})
/*     */ public class BottlenecksDetectionResult
/*     */ {
/*     */   protected String result;
/*     */   
/*     */   public BottlenecksDetectionResult() {}
/*     */   
/*     */   public BottlenecksDetectionResult(String result)
/*     */   {
/*  44 */     this.result = result;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getResult()
/*     */   {
/*  56 */     return this.result;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setResult(String value)
/*     */   {
/*  68 */     this.result = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof BottlenecksDetectionResult)) {
/*  79 */       return false;
/*     */     }
/*  81 */     BottlenecksDetectionResult otherObj = (BottlenecksDetectionResult)obj;
/*     */     
/*  83 */     return this.result == otherObj.result ? true : this.result != null ? this.result.equals(otherObj.result) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.result != null ? this.result.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "BottlenecksDetectionResult [result=" + this.result + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\BottlenecksDetectionResult.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */