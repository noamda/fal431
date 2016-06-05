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
/*     */ @XmlType(name="ArrayIRThrottlingPolicyInfo", propOrder={"arrayThrottlePolicy", "arraySerialNumber"})
/*     */ public class ArrayIRThrottlingPolicyInfo
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected ArrayIRThrottlingPolicy arrayThrottlePolicy;
/*     */   protected String arraySerialNumber;
/*     */   
/*     */   public ArrayIRThrottlingPolicyInfo() {}
/*     */   
/*     */   public ArrayIRThrottlingPolicyInfo(ArrayIRThrottlingPolicy arrayThrottlePolicy, String arraySerialNumber)
/*     */   {
/*  49 */     this.arrayThrottlePolicy = arrayThrottlePolicy;
/*  50 */     this.arraySerialNumber = arraySerialNumber;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayIRThrottlingPolicy getArrayThrottlePolicy()
/*     */   {
/*  62 */     return this.arrayThrottlePolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setArrayThrottlePolicy(ArrayIRThrottlingPolicy value)
/*     */   {
/*  74 */     this.arrayThrottlePolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getArraySerialNumber()
/*     */   {
/*  86 */     return this.arraySerialNumber;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setArraySerialNumber(String value)
/*     */   {
/*  98 */     this.arraySerialNumber = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 108 */     if (!(obj instanceof ArrayIRThrottlingPolicyInfo)) {
/* 109 */       return false;
/*     */     }
/* 111 */     ArrayIRThrottlingPolicyInfo otherObj = (ArrayIRThrottlingPolicyInfo)obj;
/*     */     
/* 113 */     return (this.arrayThrottlePolicy != null ? this.arrayThrottlePolicy.equals(otherObj.arrayThrottlePolicy) : this.arrayThrottlePolicy == otherObj.arrayThrottlePolicy) && (this.arraySerialNumber != null ? this.arraySerialNumber.equals(otherObj.arraySerialNumber) : this.arraySerialNumber == otherObj.arraySerialNumber);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 123 */     return (this.arrayThrottlePolicy != null ? this.arrayThrottlePolicy.hashCode() : 0) ^ (this.arraySerialNumber != null ? this.arraySerialNumber.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 133 */     return "ArrayIRThrottlingPolicyInfo [arrayThrottlePolicy=" + this.arrayThrottlePolicy + ", " + "arraySerialNumber=" + this.arraySerialNumber + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayIRThrottlingPolicyInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */