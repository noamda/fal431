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
/*     */ @XmlType(name="FullVmReplicationPolicy", propOrder={"vmUID", "vmReplicationPolicy"})
/*     */ public class FullVmReplicationPolicy
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VmUID vmUID;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VmReplicationPolicy vmReplicationPolicy;
/*     */   
/*     */   public FullVmReplicationPolicy() {}
/*     */   
/*     */   public FullVmReplicationPolicy(VmUID vmUID, VmReplicationPolicy vmReplicationPolicy)
/*     */   {
/*  50 */     this.vmUID = vmUID;
/*  51 */     this.vmReplicationPolicy = vmReplicationPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmUID getVmUID()
/*     */   {
/*  63 */     return this.vmUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmUID(VmUID value)
/*     */   {
/*  75 */     this.vmUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmReplicationPolicy getVmReplicationPolicy()
/*     */   {
/*  87 */     return this.vmReplicationPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmReplicationPolicy(VmReplicationPolicy value)
/*     */   {
/*  99 */     this.vmReplicationPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof FullVmReplicationPolicy)) {
/* 110 */       return false;
/*     */     }
/* 112 */     FullVmReplicationPolicy otherObj = (FullVmReplicationPolicy)obj;
/*     */     
/* 114 */     return (this.vmUID != null ? this.vmUID.equals(otherObj.vmUID) : this.vmUID == otherObj.vmUID) && (this.vmReplicationPolicy != null ? this.vmReplicationPolicy.equals(otherObj.vmReplicationPolicy) : this.vmReplicationPolicy == otherObj.vmReplicationPolicy);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.vmUID != null ? this.vmUID.hashCode() : 0) ^ (this.vmReplicationPolicy != null ? this.vmReplicationPolicy.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "FullVmReplicationPolicy [vmUID=" + this.vmUID + ", " + "vmReplicationPolicy=" + this.vmReplicationPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FullVmReplicationPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */