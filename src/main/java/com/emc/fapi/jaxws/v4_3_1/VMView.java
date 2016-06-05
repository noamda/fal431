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
/*     */ 
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
/*     */ @XmlType(name="VMView", propOrder={"dataStores", "filtered", "ip", "name", "protectingGroupUID", "protectionStatus", "rdmDevices", "template"})
/*     */ public class VMView
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<DataStore> dataStores;
/*     */   protected boolean filtered;
/*     */   protected String ip;
/*     */   protected String name;
/*     */   protected ConsistencyGroupUID protectingGroupUID;
/*     */   protected VmProtectionStatus protectionStatus;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VMVolume> rdmDevices;
/*     */   protected boolean template;
/*     */   
/*     */   public VMView() {}
/*     */   
/*     */   public VMView(List<DataStore> dataStores, boolean filtered, String ip, String name, ConsistencyGroupUID protectingGroupUID, VmProtectionStatus protectionStatus, List<VMVolume> rdmDevices, boolean template)
/*     */   {
/*  70 */     this.dataStores = dataStores;
/*  71 */     this.filtered = filtered;
/*  72 */     this.ip = ip;
/*  73 */     this.name = name;
/*  74 */     this.protectingGroupUID = protectingGroupUID;
/*  75 */     this.protectionStatus = protectionStatus;
/*  76 */     this.rdmDevices = rdmDevices;
/*  77 */     this.template = template;
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
/*     */   public List<DataStore> getDataStores()
/*     */   {
/* 103 */     if (this.dataStores == null) {
/* 104 */       this.dataStores = new ArrayList();
/*     */     }
/* 106 */     return this.dataStores;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isFiltered()
/*     */   {
/* 114 */     return this.filtered;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFiltered(boolean value)
/*     */   {
/* 122 */     this.filtered = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getIp()
/*     */   {
/* 134 */     return this.ip;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIp(String value)
/*     */   {
/* 146 */     this.ip = value;
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
/* 158 */     return this.name;
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
/* 170 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupUID getProtectingGroupUID()
/*     */   {
/* 182 */     return this.protectingGroupUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProtectingGroupUID(ConsistencyGroupUID value)
/*     */   {
/* 194 */     this.protectingGroupUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmProtectionStatus getProtectionStatus()
/*     */   {
/* 206 */     return this.protectionStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProtectionStatus(VmProtectionStatus value)
/*     */   {
/* 218 */     this.protectionStatus = value;
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
/*     */   public List<VMVolume> getRdmDevices()
/*     */   {
/* 244 */     if (this.rdmDevices == null) {
/* 245 */       this.rdmDevices = new ArrayList();
/*     */     }
/* 247 */     return this.rdmDevices;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isTemplate()
/*     */   {
/* 255 */     return this.template;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTemplate(boolean value)
/*     */   {
/* 263 */     this.template = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 273 */     if (!(obj instanceof VMView)) {
/* 274 */       return false;
/*     */     }
/* 276 */     VMView otherObj = (VMView)obj;
/*     */     
/* 278 */     return (this.dataStores != null ? this.dataStores.equals(otherObj.dataStores) : this.dataStores == otherObj.dataStores) && (this.filtered == otherObj.filtered) && (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.protectingGroupUID != null ? this.protectingGroupUID.equals(otherObj.protectingGroupUID) : this.protectingGroupUID == otherObj.protectingGroupUID) && (this.protectionStatus != null ? this.protectionStatus.equals(otherObj.protectionStatus) : this.protectionStatus == otherObj.protectionStatus) && (this.rdmDevices != null ? this.rdmDevices.equals(otherObj.rdmDevices) : this.rdmDevices == otherObj.rdmDevices) && (this.template == otherObj.template);
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
/*     */   public int hashCode()
/*     */   {
/* 294 */     return (this.dataStores != null ? this.dataStores.hashCode() : 0) ^ (this.filtered ? 1 : 0) ^ (this.ip != null ? this.ip.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.protectingGroupUID != null ? this.protectingGroupUID.hashCode() : 0) ^ (this.protectionStatus != null ? this.protectionStatus.hashCode() : 0) ^ (this.rdmDevices != null ? this.rdmDevices.hashCode() : 0) ^ (this.template ? 1 : 0);
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
/*     */   public String toString()
/*     */   {
/* 310 */     return "VMView [dataStores=" + this.dataStores + ", " + "filtered=" + this.filtered + ", " + "ip=" + this.ip + ", " + "name=" + this.name + ", " + "protectingGroupUID=" + this.protectingGroupUID + ", " + "protectionStatus=" + this.protectionStatus + ", " + "rdmDevices=" + this.rdmDevices + ", " + "template=" + this.template + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VMView.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */