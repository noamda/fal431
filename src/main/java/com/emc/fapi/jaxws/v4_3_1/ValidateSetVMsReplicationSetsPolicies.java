/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="validateSetVMsReplicationSetsPolicies", propOrder={"group", "vmReplicationSetsPolicies"})
/*     */ public class ValidateSetVMsReplicationSetsPolicies
/*     */ {
/*     */   protected ConsistencyGroupUID group;
/*     */   protected List<FullVmReplicationSetPolicy> vmReplicationSetsPolicies;
/*     */   
/*     */   public ValidateSetVMsReplicationSetsPolicies() {}
/*     */   
/*     */   public ValidateSetVMsReplicationSetsPolicies(ConsistencyGroupUID group, List<FullVmReplicationSetPolicy> vmReplicationSetsPolicies)
/*     */   {
/*  49 */     this.group = group;
/*  50 */     this.vmReplicationSetsPolicies = vmReplicationSetsPolicies;
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
/*  62 */     return this.group;
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
/*  74 */     this.group = value;
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
/*     */   public List<FullVmReplicationSetPolicy> getVmReplicationSetsPolicies()
/*     */   {
/* 100 */     if (this.vmReplicationSetsPolicies == null) {
/* 101 */       this.vmReplicationSetsPolicies = new ArrayList();
/*     */     }
/* 103 */     return this.vmReplicationSetsPolicies;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 113 */     if (!(obj instanceof ValidateSetVMsReplicationSetsPolicies)) {
/* 114 */       return false;
/*     */     }
/* 116 */     ValidateSetVMsReplicationSetsPolicies otherObj = (ValidateSetVMsReplicationSetsPolicies)obj;
/*     */     
/* 118 */     return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.vmReplicationSetsPolicies != null ? this.vmReplicationSetsPolicies.equals(otherObj.vmReplicationSetsPolicies) : this.vmReplicationSetsPolicies == otherObj.vmReplicationSetsPolicies);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.group != null ? this.group.hashCode() : 0) ^ (this.vmReplicationSetsPolicies != null ? this.vmReplicationSetsPolicies.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "ValidateSetVMsReplicationSetsPolicies [group=" + this.group + ", " + "vmReplicationSetsPolicies=" + this.vmReplicationSetsPolicies + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateSetVMsReplicationSetsPolicies.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */