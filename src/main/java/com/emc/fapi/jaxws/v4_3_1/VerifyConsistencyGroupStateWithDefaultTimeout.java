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
/*     */ @XmlType(name="verifyConsistencyGroupStateWithDefaultTimeout", propOrder={"group", "state"})
/*     */ public class VerifyConsistencyGroupStateWithDefaultTimeout
/*     */ {
/*     */   protected ConsistencyGroupUID group;
/*     */   protected VerifyConsistencyGroupStateParam state;
/*     */   
/*     */   public VerifyConsistencyGroupStateWithDefaultTimeout() {}
/*     */   
/*     */   public VerifyConsistencyGroupStateWithDefaultTimeout(ConsistencyGroupUID group, VerifyConsistencyGroupStateParam state)
/*     */   {
/*  47 */     this.group = group;
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
/*     */   public ConsistencyGroupUID getGroup()
/*     */   {
/*  60 */     return this.group;
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
/*  72 */     this.group = value;
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
/*     */   public void setState(VerifyConsistencyGroupStateParam value)
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
/* 106 */     if (!(obj instanceof VerifyConsistencyGroupStateWithDefaultTimeout)) {
/* 107 */       return false;
/*     */     }
/* 109 */     VerifyConsistencyGroupStateWithDefaultTimeout otherObj = (VerifyConsistencyGroupStateWithDefaultTimeout)obj;
/*     */     
/* 111 */     return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.state != null ? this.state.equals(otherObj.state) : this.state == otherObj.state);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.group != null ? this.group.hashCode() : 0) ^ (this.state != null ? this.state.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "VerifyConsistencyGroupStateWithDefaultTimeout [group=" + this.group + ", " + "state=" + this.state + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VerifyConsistencyGroupStateWithDefaultTimeout.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */