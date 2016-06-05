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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ResourcePoolConfiguration", propOrder={"resourcePoolUuid", "name", "childResourcePoolsConfiguration"})
/*     */ public class ResourcePoolConfiguration
/*     */ {
/*     */   protected VirtualResourcePoolUUID resourcePoolUuid;
/*     */   protected String name;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ResourcePoolConfiguration> childResourcePoolsConfiguration;
/*     */   
/*     */   public ResourcePoolConfiguration() {}
/*     */   
/*     */   public ResourcePoolConfiguration(VirtualResourcePoolUUID resourcePoolUuid, String name, List<ResourcePoolConfiguration> childResourcePoolsConfiguration)
/*     */   {
/*  54 */     this.resourcePoolUuid = resourcePoolUuid;
/*  55 */     this.name = name;
/*  56 */     this.childResourcePoolsConfiguration = childResourcePoolsConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualResourcePoolUUID getResourcePoolUuid()
/*     */   {
/*  68 */     return this.resourcePoolUuid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setResourcePoolUuid(VirtualResourcePoolUUID value)
/*     */   {
/*  80 */     this.resourcePoolUuid = value;
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
/*  92 */     return this.name;
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
/* 104 */     this.name = value;
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
/*     */   public List<ResourcePoolConfiguration> getChildResourcePoolsConfiguration()
/*     */   {
/* 130 */     if (this.childResourcePoolsConfiguration == null) {
/* 131 */       this.childResourcePoolsConfiguration = new ArrayList();
/*     */     }
/* 133 */     return this.childResourcePoolsConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 143 */     if (!(obj instanceof ResourcePoolConfiguration)) {
/* 144 */       return false;
/*     */     }
/* 146 */     ResourcePoolConfiguration otherObj = (ResourcePoolConfiguration)obj;
/*     */     
/* 148 */     return (this.resourcePoolUuid != null ? this.resourcePoolUuid.equals(otherObj.resourcePoolUuid) : this.resourcePoolUuid == otherObj.resourcePoolUuid) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.childResourcePoolsConfiguration != null ? this.childResourcePoolsConfiguration.equals(otherObj.childResourcePoolsConfiguration) : this.childResourcePoolsConfiguration == otherObj.childResourcePoolsConfiguration);
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
/* 159 */     return (this.resourcePoolUuid != null ? this.resourcePoolUuid.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.childResourcePoolsConfiguration != null ? this.childResourcePoolsConfiguration.hashCode() : 0);
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
/* 170 */     return "ResourcePoolConfiguration [resourcePoolUuid=" + this.resourcePoolUuid + ", " + "name=" + this.name + ", " + "childResourcePoolsConfiguration=" + this.childResourcePoolsConfiguration + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ResourcePoolConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */