/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="FullVmReplicationSetPolicy", propOrder={"vmReplicationSetUID", "vmReplicationSetPolicy", "vmReplicationPolicies"})
/*     */ public class FullVmReplicationSetPolicy
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VmReplicationSetUID vmReplicationSetUID;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VmReplicationSetPolicy vmReplicationSetPolicy;
/*     */   @XmlElement(required=true)
/*     */   protected List<FullVmReplicationPolicy> vmReplicationPolicies;
/*     */   
/*     */   public FullVmReplicationSetPolicy() {}
/*     */   
/*     */   public FullVmReplicationSetPolicy(VmReplicationSetUID vmReplicationSetUID, VmReplicationSetPolicy vmReplicationSetPolicy, List<FullVmReplicationPolicy> vmReplicationPolicies)
/*     */   {
/*  56 */     this.vmReplicationSetUID = vmReplicationSetUID;
/*  57 */     this.vmReplicationSetPolicy = vmReplicationSetPolicy;
/*  58 */     this.vmReplicationPolicies = vmReplicationPolicies;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmReplicationSetUID getVmReplicationSetUID()
/*     */   {
/*  70 */     return this.vmReplicationSetUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmReplicationSetUID(VmReplicationSetUID value)
/*     */   {
/*  82 */     this.vmReplicationSetUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmReplicationSetPolicy getVmReplicationSetPolicy()
/*     */   {
/*  94 */     return this.vmReplicationSetPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmReplicationSetPolicy(VmReplicationSetPolicy value)
/*     */   {
/* 106 */     this.vmReplicationSetPolicy = value;
/*     */   }
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
/*     */   public List<FullVmReplicationPolicy> getVmReplicationPolicies()
/*     */   {
/* 132 */     if (this.vmReplicationPolicies == null) {
/* 133 */       this.vmReplicationPolicies = new ArrayList();
/*     */     }
/* 135 */     return this.vmReplicationPolicies;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 145 */     if (!(obj instanceof FullVmReplicationSetPolicy)) {
/* 146 */       return false;
/*     */     }
/* 148 */     FullVmReplicationSetPolicy otherObj = (FullVmReplicationSetPolicy)obj;
/*     */     
/* 150 */     return (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.equals(otherObj.vmReplicationSetUID) : this.vmReplicationSetUID == otherObj.vmReplicationSetUID) && (this.vmReplicationSetPolicy != null ? this.vmReplicationSetPolicy.equals(otherObj.vmReplicationSetPolicy) : this.vmReplicationSetPolicy == otherObj.vmReplicationSetPolicy) && (this.vmReplicationPolicies != null ? this.vmReplicationPolicies.equals(otherObj.vmReplicationPolicies) : this.vmReplicationPolicies == otherObj.vmReplicationPolicies);
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
/* 161 */     return (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.hashCode() : 0) ^ (this.vmReplicationSetPolicy != null ? this.vmReplicationSetPolicy.hashCode() : 0) ^ (this.vmReplicationPolicies != null ? this.vmReplicationPolicies.hashCode() : 0);
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
/* 172 */     return "FullVmReplicationSetPolicy [vmReplicationSetUID=" + this.vmReplicationSetUID + ", " + "vmReplicationSetPolicy=" + this.vmReplicationSetPolicy + ", " + "vmReplicationPolicies=" + this.vmReplicationPolicies + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FullVmReplicationSetPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */