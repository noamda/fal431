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
/*     */ @XmlType(name="VirtualHardwareReplicationPolicy", propOrder={"provisionPolicy", "hwChangesPolicy"})
/*     */ public class VirtualHardwareReplicationPolicy
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected DiskProvisionPolicy provisionPolicy;
/*     */   @XmlElement(required=true)
/*     */   protected HardwareChangesPolicy hwChangesPolicy;
/*     */   
/*     */   public VirtualHardwareReplicationPolicy() {}
/*     */   
/*     */   public VirtualHardwareReplicationPolicy(DiskProvisionPolicy provisionPolicy, HardwareChangesPolicy hwChangesPolicy)
/*     */   {
/*  50 */     this.provisionPolicy = provisionPolicy;
/*  51 */     this.hwChangesPolicy = hwChangesPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DiskProvisionPolicy getProvisionPolicy()
/*     */   {
/*  63 */     return this.provisionPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProvisionPolicy(DiskProvisionPolicy value)
/*     */   {
/*  75 */     this.provisionPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public HardwareChangesPolicy getHwChangesPolicy()
/*     */   {
/*  87 */     return this.hwChangesPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHwChangesPolicy(HardwareChangesPolicy value)
/*     */   {
/*  99 */     this.hwChangesPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof VirtualHardwareReplicationPolicy)) {
/* 110 */       return false;
/*     */     }
/* 112 */     VirtualHardwareReplicationPolicy otherObj = (VirtualHardwareReplicationPolicy)obj;
/*     */     
/* 114 */     return (this.provisionPolicy != null ? this.provisionPolicy.equals(otherObj.provisionPolicy) : this.provisionPolicy == otherObj.provisionPolicy) && (this.hwChangesPolicy != null ? this.hwChangesPolicy.equals(otherObj.hwChangesPolicy) : this.hwChangesPolicy == otherObj.hwChangesPolicy);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.provisionPolicy != null ? this.provisionPolicy.hashCode() : 0) ^ (this.hwChangesPolicy != null ? this.hwChangesPolicy.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "VirtualHardwareReplicationPolicy [provisionPolicy=" + this.provisionPolicy + ", " + "hwChangesPolicy=" + this.hwChangesPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VirtualHardwareReplicationPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */