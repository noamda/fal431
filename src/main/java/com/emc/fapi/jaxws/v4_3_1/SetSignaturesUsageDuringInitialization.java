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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="setSignaturesUsageDuringInitialization", propOrder={"groupCopy", "useSignatures"})
/*     */ public class SetSignaturesUsageDuringInitialization
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopy;
/*     */   protected boolean useSignatures;
/*     */   
/*     */   public SetSignaturesUsageDuringInitialization() {}
/*     */   
/*     */   public SetSignaturesUsageDuringInitialization(ConsistencyGroupCopyUID groupCopy, boolean useSignatures)
/*     */   {
/*  47 */     this.groupCopy = groupCopy;
/*  48 */     this.useSignatures = useSignatures;
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
/*  60 */     return this.groupCopy;
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
/*  72 */     this.groupCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isUseSignatures()
/*     */   {
/*  80 */     return this.useSignatures;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUseSignatures(boolean value)
/*     */   {
/*  88 */     this.useSignatures = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  98 */     if (!(obj instanceof SetSignaturesUsageDuringInitialization)) {
/*  99 */       return false;
/*     */     }
/* 101 */     SetSignaturesUsageDuringInitialization otherObj = (SetSignaturesUsageDuringInitialization)obj;
/*     */     
/* 103 */     return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.useSignatures == otherObj.useSignatures);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.useSignatures ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 123 */     return "SetSignaturesUsageDuringInitialization [groupCopy=" + this.groupCopy + ", " + "useSignatures=" + this.useSignatures + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetSignaturesUsageDuringInitialization.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */