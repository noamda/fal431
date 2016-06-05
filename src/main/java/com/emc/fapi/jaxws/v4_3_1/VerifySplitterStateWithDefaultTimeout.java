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
/*     */ @XmlType(name="verifySplitterStateWithDefaultTimeout", propOrder={"splitter", "state"})
/*     */ public class VerifySplitterStateWithDefaultTimeout
/*     */ {
/*     */   protected SplitterUID splitter;
/*     */   protected VerifySplitterStateParam state;
/*     */   
/*     */   public VerifySplitterStateWithDefaultTimeout() {}
/*     */   
/*     */   public VerifySplitterStateWithDefaultTimeout(SplitterUID splitter, VerifySplitterStateParam state)
/*     */   {
/*  47 */     this.splitter = splitter;
/*  48 */     this.state = state;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VerifySplitterStateParam getState()
/*     */   {
/*  84 */     return this.state;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setState(VerifySplitterStateParam value)
/*     */   {
/*  96 */     this.state = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof VerifySplitterStateWithDefaultTimeout)) {
/* 107 */       return false;
/*     */     }
/* 109 */     VerifySplitterStateWithDefaultTimeout otherObj = (VerifySplitterStateWithDefaultTimeout)obj;
/*     */     
/* 111 */     return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.state != null ? this.state.equals(otherObj.state) : this.state == otherObj.state);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.state != null ? this.state.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "VerifySplitterStateWithDefaultTimeout [splitter=" + this.splitter + ", " + "state=" + this.state + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VerifySplitterStateWithDefaultTimeout.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */