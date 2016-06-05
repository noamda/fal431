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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VmReplicationPolicy", propOrder={"networkCustomizationPolicy"})
/*     */ public class VmReplicationPolicy
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected VmNetworkCustomizationPolicy networkCustomizationPolicy;
/*     */   
/*     */   public VmReplicationPolicy() {}
/*     */   
/*     */   public VmReplicationPolicy(VmNetworkCustomizationPolicy networkCustomizationPolicy)
/*     */   {
/*  46 */     this.networkCustomizationPolicy = networkCustomizationPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmNetworkCustomizationPolicy getNetworkCustomizationPolicy()
/*     */   {
/*  58 */     return this.networkCustomizationPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNetworkCustomizationPolicy(VmNetworkCustomizationPolicy value)
/*     */   {
/*  70 */     this.networkCustomizationPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  80 */     if (!(obj instanceof VmReplicationPolicy)) {
/*  81 */       return false;
/*     */     }
/*  83 */     VmReplicationPolicy otherObj = (VmReplicationPolicy)obj;
/*     */     
/*  85 */     return this.networkCustomizationPolicy == otherObj.networkCustomizationPolicy ? true : this.networkCustomizationPolicy != null ? this.networkCustomizationPolicy.equals(otherObj.networkCustomizationPolicy) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  94 */     return this.networkCustomizationPolicy != null ? this.networkCustomizationPolicy.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 103 */     return "VmReplicationPolicy [networkCustomizationPolicy=" + this.networkCustomizationPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmReplicationPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */