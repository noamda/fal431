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
/*     */ @JsonTypeName("ConsistencyGroupLinkPolicyTemplate")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupLinkPolicyTemplate", propOrder={"policy"})
/*     */ public class ConsistencyGroupLinkPolicyTemplate
/*     */   extends BasePolicyTemplate
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupLinkPolicy policy;
/*     */   
/*     */   public ConsistencyGroupLinkPolicyTemplate() {}
/*     */   
/*     */   public ConsistencyGroupLinkPolicyTemplate(ConsistencyGroupLinkPolicy policy)
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
/*     */   public ConsistencyGroupLinkPolicy getPolicy()
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
/*     */   public void setPolicy(ConsistencyGroupLinkPolicy value)
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
/*  90 */     if (!(obj instanceof ConsistencyGroupLinkPolicyTemplate)) {
/*  91 */       return false;
/*     */     }
/*  93 */     ConsistencyGroupLinkPolicyTemplate otherObj = (ConsistencyGroupLinkPolicyTemplate)obj;
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
/* 115 */     return "ConsistencyGroupLinkPolicyTemplate [super=" + super.toString() + ", " + "policy=" + this.policy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupLinkPolicyTemplate.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */