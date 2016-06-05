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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ArrayIRThrottlingPolicy", propOrder={"throttleType", "customValue"})
/*     */ public class ArrayIRThrottlingPolicy
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected IrThrottleType throttleType;
/*     */   protected Long customValue;
/*     */   
/*     */   public ArrayIRThrottlingPolicy() {}
/*     */   
/*     */   public ArrayIRThrottlingPolicy(IrThrottleType throttleType, Long customValue)
/*     */   {
/*  49 */     this.throttleType = throttleType;
/*  50 */     this.customValue = customValue;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public IrThrottleType getThrottleType()
/*     */   {
/*  62 */     return this.throttleType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setThrottleType(IrThrottleType value)
/*     */   {
/*  74 */     this.throttleType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getCustomValue()
/*     */   {
/*  86 */     return this.customValue;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCustomValue(Long value)
/*     */   {
/*  98 */     this.customValue = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 108 */     if (!(obj instanceof ArrayIRThrottlingPolicy)) {
/* 109 */       return false;
/*     */     }
/* 111 */     ArrayIRThrottlingPolicy otherObj = (ArrayIRThrottlingPolicy)obj;
/*     */     
/* 113 */     return (this.throttleType != null ? this.throttleType.equals(otherObj.throttleType) : this.throttleType == otherObj.throttleType) && (this.customValue != null ? this.customValue.equals(otherObj.customValue) : this.customValue == otherObj.customValue);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 123 */     return (this.throttleType != null ? this.throttleType.hashCode() : 0) ^ (this.customValue != null ? this.customValue.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 133 */     return "ArrayIRThrottlingPolicy [throttleType=" + this.throttleType + ", " + "customValue=" + this.customValue + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayIRThrottlingPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */