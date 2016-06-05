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
/*     */ @XmlType(name="setSplitterAutoRegisterRPAsInitiatorsPolicy", propOrder={"splitter", "autoRegisterRPAsInitiatorsPolicy"})
/*     */ public class SetSplitterAutoRegisterRPAsInitiatorsPolicy
/*     */ {
/*     */   protected SplitterUID splitter;
/*     */   protected boolean autoRegisterRPAsInitiatorsPolicy;
/*     */   
/*     */   public SetSplitterAutoRegisterRPAsInitiatorsPolicy() {}
/*     */   
/*     */   public SetSplitterAutoRegisterRPAsInitiatorsPolicy(SplitterUID splitter, boolean autoRegisterRPAsInitiatorsPolicy)
/*     */   {
/*  47 */     this.splitter = splitter;
/*  48 */     this.autoRegisterRPAsInitiatorsPolicy = autoRegisterRPAsInitiatorsPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitterUID getSplitter()
/*     */   {
/*  60 */     return this.splitter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitter(SplitterUID value)
/*     */   {
/*  72 */     this.splitter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isAutoRegisterRPAsInitiatorsPolicy()
/*     */   {
/*  80 */     return this.autoRegisterRPAsInitiatorsPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAutoRegisterRPAsInitiatorsPolicy(boolean value)
/*     */   {
/*  88 */     this.autoRegisterRPAsInitiatorsPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  98 */     if (!(obj instanceof SetSplitterAutoRegisterRPAsInitiatorsPolicy)) {
/*  99 */       return false;
/*     */     }
/* 101 */     SetSplitterAutoRegisterRPAsInitiatorsPolicy otherObj = (SetSplitterAutoRegisterRPAsInitiatorsPolicy)obj;
/*     */     
/* 103 */     return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.autoRegisterRPAsInitiatorsPolicy == otherObj.autoRegisterRPAsInitiatorsPolicy);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.autoRegisterRPAsInitiatorsPolicy ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 123 */     return "SetSplitterAutoRegisterRPAsInitiatorsPolicy [splitter=" + this.splitter + ", " + "autoRegisterRPAsInitiatorsPolicy=" + this.autoRegisterRPAsInitiatorsPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetSplitterAutoRegisterRPAsInitiatorsPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */