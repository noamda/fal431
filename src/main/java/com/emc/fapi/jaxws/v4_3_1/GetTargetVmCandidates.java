/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
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
/*     */ @XmlType(name="getTargetVmCandidates", propOrder={"sourceVmParam", "vmReplicationTarget"})
/*     */ public class GetTargetVmCandidates
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected SourceVmParam sourceVmParam;
/*     */   @XmlElement(nillable=true)
/*     */   protected VmReplicationTarget vmReplicationTarget;
/*     */   
/*     */   public GetTargetVmCandidates() {}
/*     */   
/*     */   public GetTargetVmCandidates(SourceVmParam sourceVmParam, VmReplicationTarget vmReplicationTarget)
/*     */   {
/*  50 */     this.sourceVmParam = sourceVmParam;
/*  51 */     this.vmReplicationTarget = vmReplicationTarget;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SourceVmParam getSourceVmParam()
/*     */   {
/*  63 */     return this.sourceVmParam;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSourceVmParam(SourceVmParam value)
/*     */   {
/*  75 */     this.sourceVmParam = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmReplicationTarget getVmReplicationTarget()
/*     */   {
/*  87 */     return this.vmReplicationTarget;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmReplicationTarget(VmReplicationTarget value)
/*     */   {
/*  99 */     this.vmReplicationTarget = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof GetTargetVmCandidates)) {
/* 110 */       return false;
/*     */     }
/* 112 */     GetTargetVmCandidates otherObj = (GetTargetVmCandidates)obj;
/*     */     
/* 114 */     return (this.sourceVmParam != null ? this.sourceVmParam.equals(otherObj.sourceVmParam) : this.sourceVmParam == otherObj.sourceVmParam) && (this.vmReplicationTarget != null ? this.vmReplicationTarget.equals(otherObj.vmReplicationTarget) : this.vmReplicationTarget == otherObj.vmReplicationTarget);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.sourceVmParam != null ? this.sourceVmParam.hashCode() : 0) ^ (this.vmReplicationTarget != null ? this.vmReplicationTarget.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "GetTargetVmCandidates [sourceVmParam=" + this.sourceVmParam + ", " + "vmReplicationTarget=" + this.vmReplicationTarget + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetTargetVmCandidates.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */