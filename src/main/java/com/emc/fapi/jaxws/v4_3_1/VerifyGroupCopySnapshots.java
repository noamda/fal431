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
/*     */ @XmlType(name="verifyGroupCopySnapshots", propOrder={"groupCopy", "state", "timeoutInSeconds"})
/*     */ public class VerifyGroupCopySnapshots
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopy;
/*     */   protected VerifyGroupCopySnapshotsParam state;
/*     */   protected long timeoutInSeconds;
/*     */   
/*     */   public VerifyGroupCopySnapshots() {}
/*     */   
/*     */   public VerifyGroupCopySnapshots(ConsistencyGroupCopyUID groupCopy, VerifyGroupCopySnapshotsParam state, long timeoutInSeconds)
/*     */   {
/*  50 */     this.groupCopy = groupCopy;
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
/*     */   public ConsistencyGroupCopyUID getGroupCopy()
/*     */   {
/*  64 */     return this.groupCopy;
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
/*  76 */     this.groupCopy = value;
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
/*     */   public void setState(VerifyGroupCopySnapshotsParam value)
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
/* 126 */     if (!(obj instanceof VerifyGroupCopySnapshots)) {
/* 127 */       return false;
/*     */     }
/* 129 */     VerifyGroupCopySnapshots otherObj = (VerifyGroupCopySnapshots)obj;
/*     */     
/* 131 */     return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.state != null ? this.state.equals(otherObj.state) : this.state == otherObj.state) && (this.timeoutInSeconds == otherObj.timeoutInSeconds);
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
/* 142 */     return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.state != null ? this.state.hashCode() : 0) ^ (int)this.timeoutInSeconds;
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
/* 153 */     return "VerifyGroupCopySnapshots [groupCopy=" + this.groupCopy + ", " + "state=" + this.state + ", " + "timeoutInSeconds=" + this.timeoutInSeconds + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VerifyGroupCopySnapshots.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */