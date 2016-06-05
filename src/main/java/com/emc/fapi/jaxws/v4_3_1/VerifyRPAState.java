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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="verifyRPAState", propOrder={"rpa", "state", "timeoutInSeconds"})
/*     */ public class VerifyRPAState
/*     */ {
/*     */   protected RpaUID rpa;
/*     */   protected VerifyRPAStateParam state;
/*     */   protected long timeoutInSeconds;
/*     */   
/*     */   public VerifyRPAState() {}
/*     */   
/*     */   public VerifyRPAState(RpaUID rpa, VerifyRPAStateParam state, long timeoutInSeconds)
/*     */   {
/*  50 */     this.rpa = rpa;
/*  51 */     this.state = state;
/*  52 */     this.timeoutInSeconds = timeoutInSeconds;
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
/*  64 */     return this.rpa;
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
/*  76 */     this.rpa = value;
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
/*  88 */     return this.state;
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
/* 100 */     this.state = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getTimeoutInSeconds()
/*     */   {
/* 108 */     return this.timeoutInSeconds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTimeoutInSeconds(long value)
/*     */   {
/* 116 */     this.timeoutInSeconds = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 126 */     if (!(obj instanceof VerifyRPAState)) {
/* 127 */       return false;
/*     */     }
/* 129 */     VerifyRPAState otherObj = (VerifyRPAState)obj;
/*     */     
/* 131 */     return (this.rpa != null ? this.rpa.equals(otherObj.rpa) : this.rpa == otherObj.rpa) && (this.state != null ? this.state.equals(otherObj.state) : this.state == otherObj.state) && (this.timeoutInSeconds == otherObj.timeoutInSeconds);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 142 */     return (this.rpa != null ? this.rpa.hashCode() : 0) ^ (this.state != null ? this.state.hashCode() : 0) ^ (int)this.timeoutInSeconds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 153 */     return "VerifyRPAState [rpa=" + this.rpa + ", " + "state=" + this.state + ", " + "timeoutInSeconds=" + this.timeoutInSeconds + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VerifyRPAState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */