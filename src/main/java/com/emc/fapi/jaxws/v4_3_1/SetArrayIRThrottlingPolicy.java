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
/*     */ @XmlType(name="setArrayIRThrottlingPolicy", propOrder={"cluster", "policy"})
/*     */ public class SetArrayIRThrottlingPolicy
/*     */ {
/*     */   protected ClusterUID cluster;
/*     */   protected ArrayIRThrottlingPolicyParams policy;
/*     */   
/*     */   public SetArrayIRThrottlingPolicy() {}
/*     */   
/*     */   public SetArrayIRThrottlingPolicy(ClusterUID cluster, ArrayIRThrottlingPolicyParams policy)
/*     */   {
/*  47 */     this.cluster = cluster;
/*  48 */     this.policy = policy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getCluster()
/*     */   {
/*  60 */     return this.cluster;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCluster(ClusterUID value)
/*     */   {
/*  72 */     this.cluster = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayIRThrottlingPolicyParams getPolicy()
/*     */   {
/*  84 */     return this.policy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPolicy(ArrayIRThrottlingPolicyParams value)
/*     */   {
/*  96 */     this.policy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof SetArrayIRThrottlingPolicy)) {
/* 107 */       return false;
/*     */     }
/* 109 */     SetArrayIRThrottlingPolicy otherObj = (SetArrayIRThrottlingPolicy)obj;
/*     */     
/* 111 */     return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.policy != null ? this.policy.equals(otherObj.policy) : this.policy == otherObj.policy);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.policy != null ? this.policy.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "SetArrayIRThrottlingPolicy [cluster=" + this.cluster + ", " + "policy=" + this.policy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetArrayIRThrottlingPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */