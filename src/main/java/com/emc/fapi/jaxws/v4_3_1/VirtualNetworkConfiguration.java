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
/*     */ @XmlType(name="VirtualNetworkConfiguration", propOrder={"name", "networkUID"})
/*     */ public class VirtualNetworkConfiguration
/*     */ {
/*     */   protected String name;
/*     */   protected VirtualNetworkUID networkUID;
/*     */   
/*     */   public VirtualNetworkConfiguration() {}
/*     */   
/*     */   public VirtualNetworkConfiguration(String name, VirtualNetworkUID networkUID)
/*     */   {
/*  47 */     this.name = name;
/*  48 */     this.networkUID = networkUID;
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
/*  60 */     return this.name;
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
/*  72 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualNetworkUID getNetworkUID()
/*     */   {
/*  84 */     return this.networkUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNetworkUID(VirtualNetworkUID value)
/*     */   {
/*  96 */     this.networkUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof VirtualNetworkConfiguration)) {
/* 107 */       return false;
/*     */     }
/* 109 */     VirtualNetworkConfiguration otherObj = (VirtualNetworkConfiguration)obj;
/*     */     
/* 111 */     return (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.networkUID != null ? this.networkUID.equals(otherObj.networkUID) : this.networkUID == otherObj.networkUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.name != null ? this.name.hashCode() : 0) ^ (this.networkUID != null ? this.networkUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "VirtualNetworkConfiguration [name=" + this.name + ", " + "networkUID=" + this.networkUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VirtualNetworkConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */