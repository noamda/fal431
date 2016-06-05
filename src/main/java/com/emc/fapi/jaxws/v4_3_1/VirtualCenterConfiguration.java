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
/*     */ @XmlType(name="VirtualCenterConfiguration", propOrder={"virtualCenterUID", "name", "datacentersConfiguration"})
/*     */ public class VirtualCenterConfiguration
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected VirtualCenterUID virtualCenterUID;
/*     */   protected String name;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<DatacenterConfiguration> datacentersConfiguration;
/*     */   
/*     */   public VirtualCenterConfiguration() {}
/*     */   
/*     */   public VirtualCenterConfiguration(VirtualCenterUID virtualCenterUID, String name, List<DatacenterConfiguration> datacentersConfiguration)
/*     */   {
/*  55 */     this.virtualCenterUID = virtualCenterUID;
/*  56 */     this.name = name;
/*  57 */     this.datacentersConfiguration = datacentersConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualCenterUID getVirtualCenterUID()
/*     */   {
/*  69 */     return this.virtualCenterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVirtualCenterUID(VirtualCenterUID value)
/*     */   {
/*  81 */     this.virtualCenterUID = value;
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
/*  93 */     return this.name;
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
/* 105 */     this.name = value;
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
/*     */   public List<DatacenterConfiguration> getDatacentersConfiguration()
/*     */   {
/* 131 */     if (this.datacentersConfiguration == null) {
/* 132 */       this.datacentersConfiguration = new ArrayList();
/*     */     }
/* 134 */     return this.datacentersConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 144 */     if (!(obj instanceof VirtualCenterConfiguration)) {
/* 145 */       return false;
/*     */     }
/* 147 */     VirtualCenterConfiguration otherObj = (VirtualCenterConfiguration)obj;
/*     */     
/* 149 */     return (this.virtualCenterUID != null ? this.virtualCenterUID.equals(otherObj.virtualCenterUID) : this.virtualCenterUID == otherObj.virtualCenterUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.datacentersConfiguration != null ? this.datacentersConfiguration.equals(otherObj.datacentersConfiguration) : this.datacentersConfiguration == otherObj.datacentersConfiguration);
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
/* 160 */     return (this.virtualCenterUID != null ? this.virtualCenterUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.datacentersConfiguration != null ? this.datacentersConfiguration.hashCode() : 0);
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
/* 171 */     return "VirtualCenterConfiguration [virtualCenterUID=" + this.virtualCenterUID + ", " + "name=" + this.name + ", " + "datacentersConfiguration=" + this.datacentersConfiguration + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VirtualCenterConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */