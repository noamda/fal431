/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonTypeName;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("ConsistencyGroupCopyPolicyTemplate")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupCopyPolicyTemplate", propOrder={"policy"})
/*     */ public class ConsistencyGroupCopyPolicyTemplate
/*     */   extends BasePolicyTemplate
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupCopyPolicy policy;
/*     */   
/*     */   public ConsistencyGroupCopyPolicyTemplate() {}
/*     */   
/*     */   public ConsistencyGroupCopyPolicyTemplate(ConsistencyGroupCopyPolicy policy)
/*     */   {
/*  56 */     this.policy = policy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyPolicy getPolicy()
/*     */   {
/*  68 */     return this.policy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPolicy(ConsistencyGroupCopyPolicy value)
/*     */   {
/*  80 */     this.policy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof ConsistencyGroupCopyPolicyTemplate)) {
/*  91 */       return false;
/*     */     }
/*  93 */     ConsistencyGroupCopyPolicyTemplate otherObj = (ConsistencyGroupCopyPolicyTemplate)obj;
/*     */     
/*  95 */     return (super.equals(obj)) && (this.policy != null ? this.policy.equals(otherObj.policy) : this.policy == otherObj.policy);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return super.hashCode() ^ (this.policy != null ? this.policy.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "ConsistencyGroupCopyPolicyTemplate [super=" + super.toString() + ", " + "policy=" + this.policy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupCopyPolicyTemplate.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */