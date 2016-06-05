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
/*     */ @XmlType(name="verifyGroupCopySnapshotsWithDefaultTimeout", propOrder={"groupCopy", "state"})
/*     */ public class VerifyGroupCopySnapshotsWithDefaultTimeout
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopy;
/*     */   protected VerifyGroupCopySnapshotsParam state;
/*     */   
/*     */   public VerifyGroupCopySnapshotsWithDefaultTimeout() {}
/*     */   
/*     */   public VerifyGroupCopySnapshotsWithDefaultTimeout(ConsistencyGroupCopyUID groupCopy, VerifyGroupCopySnapshotsParam state)
/*     */   {
/*  47 */     this.groupCopy = groupCopy;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VerifyGroupCopySnapshotsParam getState()
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
/*     */   public void setState(VerifyGroupCopySnapshotsParam value)
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
/* 106 */     if (!(obj instanceof VerifyGroupCopySnapshotsWithDefaultTimeout)) {
/* 107 */       return false;
/*     */     }
/* 109 */     VerifyGroupCopySnapshotsWithDefaultTimeout otherObj = (VerifyGroupCopySnapshotsWithDefaultTimeout)obj;
/*     */     
/* 111 */     return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.state != null ? this.state.equals(otherObj.state) : this.state == otherObj.state);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.state != null ? this.state.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "VerifyGroupCopySnapshotsWithDefaultTimeout [groupCopy=" + this.groupCopy + ", " + "state=" + this.state + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VerifyGroupCopySnapshotsWithDefaultTimeout.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */