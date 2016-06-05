/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlSeeAlso;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonSubTypes;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.As;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=CollectLogsRPAResultValue.class, name="CollectLogsRPAResultValue"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=CollectLogsSplitterResultValue.class, name="CollectLogsSplitterResultValue")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="CollectLogsResultValue", propOrder={"message", "success"})
/*     */ @XmlSeeAlso({CollectLogsRPAResultValue.class, CollectLogsSplitterResultValue.class})
/*     */ public class CollectLogsResultValue
/*     */ {
/*     */   protected String message;
/*     */   protected boolean success;
/*     */   
/*     */   public CollectLogsResultValue() {}
/*     */   
/*     */   public CollectLogsResultValue(String message, boolean success)
/*     */   {
/*  64 */     this.message = message;
/*  65 */     this.success = success;
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
/*  77 */     return this.message;
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
/*  89 */     this.message = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isSuccess()
/*     */   {
/*  97 */     return this.success;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSuccess(boolean value)
/*     */   {
/* 105 */     this.success = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 115 */     if (!(obj instanceof CollectLogsResultValue)) {
/* 116 */       return false;
/*     */     }
/* 118 */     CollectLogsResultValue otherObj = (CollectLogsResultValue)obj;
/*     */     
/* 120 */     return (this.message != null ? this.message.equals(otherObj.message) : this.message == otherObj.message) && (this.success == otherObj.success);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 130 */     return (this.message != null ? this.message.hashCode() : 0) ^ (this.success ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 140 */     return "CollectLogsResultValue [message=" + this.message + ", " + "success=" + this.success + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CollectLogsResultValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */