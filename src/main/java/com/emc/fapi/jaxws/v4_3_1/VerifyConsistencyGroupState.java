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
/*     */ @XmlType(name="verifyConsistencyGroupState", propOrder={"group", "state", "timeoutInSeconds"})
/*     */ public class VerifyConsistencyGroupState
/*     */ {
/*     */   protected ConsistencyGroupUID group;
/*     */   protected VerifyConsistencyGroupStateParam state;
/*     */   protected long timeoutInSeconds;
/*     */   
/*     */   public VerifyConsistencyGroupState() {}
/*     */   
/*     */   public VerifyConsistencyGroupState(ConsistencyGroupUID group, VerifyConsistencyGroupStateParam state, long timeoutInSeconds)
/*     */   {
/*  50 */     this.group = group;
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
/*     */   public ConsistencyGroupUID getGroup()
/*     */   {
/*  64 */     return this.group;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroup(ConsistencyGroupUID value)
/*     */   {
/*  76 */     this.group = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VerifyConsistencyGroupStateParam getState()
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
/*     */   public void setState(VerifyConsistencyGroupStateParam value)
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
/* 126 */     if (!(obj instanceof VerifyConsistencyGroupState)) {
/* 127 */       return false;
/*     */     }
/* 129 */     VerifyConsistencyGroupState otherObj = (VerifyConsistencyGroupState)obj;
/*     */     
/* 131 */     return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.state != null ? this.state.equals(otherObj.state) : this.state == otherObj.state) && (this.timeoutInSeconds == otherObj.timeoutInSeconds);
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
/* 142 */     return (this.group != null ? this.group.hashCode() : 0) ^ (this.state != null ? this.state.hashCode() : 0) ^ (int)this.timeoutInSeconds;
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
/* 153 */     return "VerifyConsistencyGroupState [group=" + this.group + ", " + "state=" + this.state + ", " + "timeoutInSeconds=" + this.timeoutInSeconds + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VerifyConsistencyGroupState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */