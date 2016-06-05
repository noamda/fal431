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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("ConsistencyGroupLinkPolicy")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupLinkPolicy", propOrder={"protectionPolicy", "advancedPolicy", "snapshotShippingPolicy"})
/*     */ public class ConsistencyGroupLinkPolicy
/*     */   extends BaseValidatablePolicyTemplateType
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected LinkProtectionPolicy protectionPolicy;
/*     */   @XmlElement(required=true)
/*     */   protected LinkAdvancedPolicy advancedPolicy;
/*     */   @XmlElement(nillable=true)
/*     */   protected SnapshotShippingPolicy snapshotShippingPolicy;
/*     */   
/*     */   public ConsistencyGroupLinkPolicy() {}
/*     */   
/*     */   public ConsistencyGroupLinkPolicy(LinkProtectionPolicy protectionPolicy, LinkAdvancedPolicy advancedPolicy, SnapshotShippingPolicy snapshotShippingPolicy)
/*     */   {
/*  64 */     this.protectionPolicy = protectionPolicy;
/*  65 */     this.advancedPolicy = advancedPolicy;
/*  66 */     this.snapshotShippingPolicy = snapshotShippingPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LinkProtectionPolicy getProtectionPolicy()
/*     */   {
/*  78 */     return this.protectionPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProtectionPolicy(LinkProtectionPolicy value)
/*     */   {
/*  90 */     this.protectionPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LinkAdvancedPolicy getAdvancedPolicy()
/*     */   {
/* 102 */     return this.advancedPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAdvancedPolicy(LinkAdvancedPolicy value)
/*     */   {
/* 114 */     this.advancedPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SnapshotShippingPolicy getSnapshotShippingPolicy()
/*     */   {
/* 126 */     return this.snapshotShippingPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSnapshotShippingPolicy(SnapshotShippingPolicy value)
/*     */   {
/* 138 */     this.snapshotShippingPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 148 */     if (!(obj instanceof ConsistencyGroupLinkPolicy)) {
/* 149 */       return false;
/*     */     }
/* 151 */     ConsistencyGroupLinkPolicy otherObj = (ConsistencyGroupLinkPolicy)obj;
/*     */     
/* 153 */     return (super.equals(obj)) && (this.protectionPolicy != null ? this.protectionPolicy.equals(otherObj.protectionPolicy) : this.protectionPolicy == otherObj.protectionPolicy) && (this.advancedPolicy != null ? this.advancedPolicy.equals(otherObj.advancedPolicy) : this.advancedPolicy == otherObj.advancedPolicy) && (this.snapshotShippingPolicy != null ? this.snapshotShippingPolicy.equals(otherObj.snapshotShippingPolicy) : this.snapshotShippingPolicy == otherObj.snapshotShippingPolicy);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 165 */     return super.hashCode() ^ (this.protectionPolicy != null ? this.protectionPolicy.hashCode() : 0) ^ (this.advancedPolicy != null ? this.advancedPolicy.hashCode() : 0) ^ (this.snapshotShippingPolicy != null ? this.snapshotShippingPolicy.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 177 */     return "ConsistencyGroupLinkPolicy [super=" + super.toString() + ", " + "protectionPolicy=" + this.protectionPolicy + ", " + "advancedPolicy=" + this.advancedPolicy + ", " + "snapshotShippingPolicy=" + this.snapshotShippingPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupLinkPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */