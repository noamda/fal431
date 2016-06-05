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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VmNetworkPolicy", propOrder={"group", "vmUID", "vmNetworkCustomizationPolicy"})
/*     */ public class VmNetworkPolicy
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupUID group;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VmUID vmUID;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VmNetworkCustomizationPolicy vmNetworkCustomizationPolicy;
/*     */   
/*     */   public VmNetworkPolicy() {}
/*     */   
/*     */   public VmNetworkPolicy(ConsistencyGroupUID group, VmUID vmUID, VmNetworkCustomizationPolicy vmNetworkCustomizationPolicy)
/*     */   {
/*  54 */     this.group = group;
/*  55 */     this.vmUID = vmUID;
/*  56 */     this.vmNetworkCustomizationPolicy = vmNetworkCustomizationPolicy;
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
/*  68 */     return this.group;
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
/*  80 */     this.group = value;
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
/*  92 */     return this.vmUID;
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
/* 104 */     this.vmUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmNetworkCustomizationPolicy getVmNetworkCustomizationPolicy()
/*     */   {
/* 116 */     return this.vmNetworkCustomizationPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmNetworkCustomizationPolicy(VmNetworkCustomizationPolicy value)
/*     */   {
/* 128 */     this.vmNetworkCustomizationPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 138 */     if (!(obj instanceof VmNetworkPolicy)) {
/* 139 */       return false;
/*     */     }
/* 141 */     VmNetworkPolicy otherObj = (VmNetworkPolicy)obj;
/*     */     
/* 143 */     return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.vmUID != null ? this.vmUID.equals(otherObj.vmUID) : this.vmUID == otherObj.vmUID) && (this.vmNetworkCustomizationPolicy != null ? this.vmNetworkCustomizationPolicy.equals(otherObj.vmNetworkCustomizationPolicy) : this.vmNetworkCustomizationPolicy == otherObj.vmNetworkCustomizationPolicy);
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
/* 154 */     return (this.group != null ? this.group.hashCode() : 0) ^ (this.vmUID != null ? this.vmUID.hashCode() : 0) ^ (this.vmNetworkCustomizationPolicy != null ? this.vmNetworkCustomizationPolicy.hashCode() : 0);
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
/* 165 */     return "VmNetworkPolicy [group=" + this.group + ", " + "vmUID=" + this.vmUID + ", " + "vmNetworkCustomizationPolicy=" + this.vmNetworkCustomizationPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmNetworkPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */