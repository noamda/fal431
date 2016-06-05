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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getAvailableVMsForReplication", propOrder={"replicationTarget"})
/*     */ public class GetAvailableVMsForReplication
/*     */ {
/*     */   protected VmReplicationTarget replicationTarget;
/*     */   
/*     */   public GetAvailableVMsForReplication() {}
/*     */   
/*     */   public GetAvailableVMsForReplication(VmReplicationTarget replicationTarget)
/*     */   {
/*  44 */     this.replicationTarget = replicationTarget;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmReplicationTarget getReplicationTarget()
/*     */   {
/*  56 */     return this.replicationTarget;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReplicationTarget(VmReplicationTarget value)
/*     */   {
/*  68 */     this.replicationTarget = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof GetAvailableVMsForReplication)) {
/*  79 */       return false;
/*     */     }
/*  81 */     GetAvailableVMsForReplication otherObj = (GetAvailableVMsForReplication)obj;
/*     */     
/*  83 */     return this.replicationTarget == otherObj.replicationTarget ? true : this.replicationTarget != null ? this.replicationTarget.equals(otherObj.replicationTarget) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.replicationTarget != null ? this.replicationTarget.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "GetAvailableVMsForReplication [replicationTarget=" + this.replicationTarget + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetAvailableVMsForReplication.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */