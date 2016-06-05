/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonTypeName;
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
/*     */ 
/*     */ 
/*     */ @JsonTypeName("FunctionalAPIValidationException")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="FunctionalAPIValidationException", propOrder={"message"})
/*     */ public class FunctionalAPIValidationException
/*     */ {
/*     */   protected String message;
/*     */   
/*     */   public FunctionalAPIValidationException() {}
/*     */   
/*     */   public FunctionalAPIValidationException(String message)
/*     */   {
/*  52 */     this.message = message;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getMessage()
/*     */   {
/*  64 */     return this.message;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMessage(String value)
/*     */   {
/*  76 */     this.message = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  86 */     if (!(obj instanceof FunctionalAPIValidationException)) {
/*  87 */       return false;
/*     */     }
/*  89 */     FunctionalAPIValidationException otherObj = (FunctionalAPIValidationException)obj;
/*     */     
/*  91 */     return this.message == otherObj.message ? true : this.message != null ? this.message.equals(otherObj.message) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 100 */     return this.message != null ? this.message.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 109 */     return "FunctionalAPIValidationException [message=" + this.message + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FunctionalAPIValidationException.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */