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
/*     */ @XmlType(name="verifyRPAStateWithDefaultTimeout", propOrder={"rpa", "state"})
/*     */ public class VerifyRPAStateWithDefaultTimeout
/*     */ {
/*     */   protected RpaUID rpa;
/*     */   protected VerifyRPAStateParam state;
/*     */   
/*     */   public VerifyRPAStateWithDefaultTimeout() {}
/*     */   
/*     */   public VerifyRPAStateWithDefaultTimeout(RpaUID rpa, VerifyRPAStateParam state)
/*     */   {
/*  47 */     this.rpa = rpa;
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
/*     */   public RpaUID getRpa()
/*     */   {
/*  60 */     return this.rpa;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRpa(RpaUID value)
/*     */   {
/*  72 */     this.rpa = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VerifyRPAStateParam getState()
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
/*     */   public void setState(VerifyRPAStateParam value)
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
/* 106 */     if (!(obj instanceof VerifyRPAStateWithDefaultTimeout)) {
/* 107 */       return false;
/*     */     }
/* 109 */     VerifyRPAStateWithDefaultTimeout otherObj = (VerifyRPAStateWithDefaultTimeout)obj;
/*     */     
/* 111 */     return (this.rpa != null ? this.rpa.equals(otherObj.rpa) : this.rpa == otherObj.rpa) && (this.state != null ? this.state.equals(otherObj.state) : this.state == otherObj.state);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.rpa != null ? this.rpa.hashCode() : 0) ^ (this.state != null ? this.state.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "VerifyRPAStateWithDefaultTimeout [rpa=" + this.rpa + ", " + "state=" + this.state + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VerifyRPAStateWithDefaultTimeout.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */