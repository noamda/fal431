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
/*     */ @XmlType(name="validateReplicateVms", propOrder={"vms"})
/*     */ public class ValidateReplicateVms
/*     */ {
/*     */   protected ReplicateVmsParam vms;
/*     */   
/*     */   public ValidateReplicateVms() {}
/*     */   
/*     */   public ValidateReplicateVms(ReplicateVmsParam vms)
/*     */   {
/*  44 */     this.vms = vms;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ReplicateVmsParam getVms()
/*     */   {
/*  56 */     return this.vms;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVms(ReplicateVmsParam value)
/*     */   {
/*  68 */     this.vms = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof ValidateReplicateVms)) {
/*  79 */       return false;
/*     */     }
/*  81 */     ValidateReplicateVms otherObj = (ValidateReplicateVms)obj;
/*     */     
/*  83 */     return this.vms == otherObj.vms ? true : this.vms != null ? this.vms.equals(otherObj.vms) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.vms != null ? this.vms.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "ValidateReplicateVms [vms=" + this.vms + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateReplicateVms.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */