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
/*     */ @XmlType(name="ArrayIRThrottlingPolicyParams", propOrder={"irTrhottlingInfo"})
/*     */ public class ArrayIRThrottlingPolicyParams
/*     */ {
/*     */   @XmlElement(name="iRTrhottlingInfo")
/*     */   protected ArrayIRThrottlingPolicyInfo irTrhottlingInfo;
/*     */   
/*     */   public ArrayIRThrottlingPolicyParams() {}
/*     */   
/*     */   public ArrayIRThrottlingPolicyParams(ArrayIRThrottlingPolicyInfo irTrhottlingInfo)
/*     */   {
/*  46 */     this.irTrhottlingInfo = irTrhottlingInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayIRThrottlingPolicyInfo getIRTrhottlingInfo()
/*     */   {
/*  58 */     return this.irTrhottlingInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIRTrhottlingInfo(ArrayIRThrottlingPolicyInfo value)
/*     */   {
/*  70 */     this.irTrhottlingInfo = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  80 */     if (!(obj instanceof ArrayIRThrottlingPolicyParams)) {
/*  81 */       return false;
/*     */     }
/*  83 */     ArrayIRThrottlingPolicyParams otherObj = (ArrayIRThrottlingPolicyParams)obj;
/*     */     
/*  85 */     return this.irTrhottlingInfo == otherObj.irTrhottlingInfo ? true : this.irTrhottlingInfo != null ? this.irTrhottlingInfo.equals(otherObj.irTrhottlingInfo) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  94 */     return this.irTrhottlingInfo != null ? this.irTrhottlingInfo.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 103 */     return "ArrayIRThrottlingPolicyParams [irTrhottlingInfo=" + this.irTrhottlingInfo + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayIRThrottlingPolicyParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */