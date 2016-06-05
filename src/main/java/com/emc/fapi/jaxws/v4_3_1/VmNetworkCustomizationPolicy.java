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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VmNetworkCustomizationPolicy", propOrder={"globalNetworkPolicy", "nicsPolicies"})
/*     */ public class VmNetworkCustomizationPolicy
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected GlobalNetworkPolicy globalNetworkPolicy;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<NicCustomizationPolicy> nicsPolicies;
/*     */   
/*     */   public VmNetworkCustomizationPolicy() {}
/*     */   
/*     */   public VmNetworkCustomizationPolicy(GlobalNetworkPolicy globalNetworkPolicy, List<NicCustomizationPolicy> nicsPolicies)
/*     */   {
/*  52 */     this.globalNetworkPolicy = globalNetworkPolicy;
/*  53 */     this.nicsPolicies = nicsPolicies;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GlobalNetworkPolicy getGlobalNetworkPolicy()
/*     */   {
/*  65 */     return this.globalNetworkPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGlobalNetworkPolicy(GlobalNetworkPolicy value)
/*     */   {
/*  77 */     this.globalNetworkPolicy = value;
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
/*     */   public List<NicCustomizationPolicy> getNicsPolicies()
/*     */   {
/* 103 */     if (this.nicsPolicies == null) {
/* 104 */       this.nicsPolicies = new ArrayList();
/*     */     }
/* 106 */     return this.nicsPolicies;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 116 */     if (!(obj instanceof VmNetworkCustomizationPolicy)) {
/* 117 */       return false;
/*     */     }
/* 119 */     VmNetworkCustomizationPolicy otherObj = (VmNetworkCustomizationPolicy)obj;
/*     */     
/* 121 */     return (this.globalNetworkPolicy != null ? this.globalNetworkPolicy.equals(otherObj.globalNetworkPolicy) : this.globalNetworkPolicy == otherObj.globalNetworkPolicy) && (this.nicsPolicies != null ? this.nicsPolicies.equals(otherObj.nicsPolicies) : this.nicsPolicies == otherObj.nicsPolicies);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 131 */     return (this.globalNetworkPolicy != null ? this.globalNetworkPolicy.hashCode() : 0) ^ (this.nicsPolicies != null ? this.nicsPolicies.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 141 */     return "VmNetworkCustomizationPolicy [globalNetworkPolicy=" + this.globalNetworkPolicy + ", " + "nicsPolicies=" + this.nicsPolicies + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmNetworkCustomizationPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */