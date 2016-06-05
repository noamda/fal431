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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ArrayResourcePoolInfo", propOrder={"resourcePoolUID", "name", "resourcePoolType", "allocationParams", "usageStats"})
/*     */ public class ArrayResourcePoolInfo
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ResourcePoolUID resourcePoolUID;
/*     */   protected String name;
/*     */   protected ArrayResourcePoolType resourcePoolType;
/*     */   protected ArrayResourcePoolAllocationParams allocationParams;
/*     */   protected ResourcePoolUsageStats usageStats;
/*     */   
/*     */   public ArrayResourcePoolInfo() {}
/*     */   
/*     */   public ArrayResourcePoolInfo(ResourcePoolUID resourcePoolUID, String name, ArrayResourcePoolType resourcePoolType, ArrayResourcePoolAllocationParams allocationParams, ResourcePoolUsageStats usageStats)
/*     */   {
/*  58 */     this.resourcePoolUID = resourcePoolUID;
/*  59 */     this.name = name;
/*  60 */     this.resourcePoolType = resourcePoolType;
/*  61 */     this.allocationParams = allocationParams;
/*  62 */     this.usageStats = usageStats;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ResourcePoolUID getResourcePoolUID()
/*     */   {
/*  74 */     return this.resourcePoolUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setResourcePoolUID(ResourcePoolUID value)
/*     */   {
/*  86 */     this.resourcePoolUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getName()
/*     */   {
/*  98 */     return this.name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setName(String value)
/*     */   {
/* 110 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayResourcePoolType getResourcePoolType()
/*     */   {
/* 122 */     return this.resourcePoolType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setResourcePoolType(ArrayResourcePoolType value)
/*     */   {
/* 134 */     this.resourcePoolType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayResourcePoolAllocationParams getAllocationParams()
/*     */   {
/* 146 */     return this.allocationParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAllocationParams(ArrayResourcePoolAllocationParams value)
/*     */   {
/* 158 */     this.allocationParams = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ResourcePoolUsageStats getUsageStats()
/*     */   {
/* 170 */     return this.usageStats;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUsageStats(ResourcePoolUsageStats value)
/*     */   {
/* 182 */     this.usageStats = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 192 */     if (!(obj instanceof ArrayResourcePoolInfo)) {
/* 193 */       return false;
/*     */     }
/* 195 */     ArrayResourcePoolInfo otherObj = (ArrayResourcePoolInfo)obj;
/*     */     
/* 197 */     return (this.resourcePoolUID != null ? this.resourcePoolUID.equals(otherObj.resourcePoolUID) : this.resourcePoolUID == otherObj.resourcePoolUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.resourcePoolType != null ? this.resourcePoolType.equals(otherObj.resourcePoolType) : this.resourcePoolType == otherObj.resourcePoolType) && (this.allocationParams != null ? this.allocationParams.equals(otherObj.allocationParams) : this.allocationParams == otherObj.allocationParams) && (this.usageStats != null ? this.usageStats.equals(otherObj.usageStats) : this.usageStats == otherObj.usageStats);
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
/*     */   public int hashCode()
/*     */   {
/* 210 */     return (this.resourcePoolUID != null ? this.resourcePoolUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.resourcePoolType != null ? this.resourcePoolType.hashCode() : 0) ^ (this.allocationParams != null ? this.allocationParams.hashCode() : 0) ^ (this.usageStats != null ? this.usageStats.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 223 */     return "ArrayResourcePoolInfo [resourcePoolUID=" + this.resourcePoolUID + ", " + "name=" + this.name + ", " + "resourcePoolType=" + this.resourcePoolType + ", " + "allocationParams=" + this.allocationParams + ", " + "usageStats=" + this.usageStats + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayResourcePoolInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */