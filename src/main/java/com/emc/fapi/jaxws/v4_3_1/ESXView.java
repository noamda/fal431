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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ESXView", propOrder={"filtered", "ip", "name", "nonVMVolumes", "vmViews"})
/*     */ public class ESXView
/*     */ {
/*     */   protected boolean filtered;
/*     */   protected String ip;
/*     */   protected String name;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VMVolume> nonVMVolumes;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VMView> vmViews;
/*     */   
/*     */   public ESXView() {}
/*     */   
/*     */   public ESXView(boolean filtered, String ip, String name, List<VMVolume> nonVMVolumes, List<VMView> vmViews)
/*     */   {
/*  61 */     this.filtered = filtered;
/*  62 */     this.ip = ip;
/*  63 */     this.name = name;
/*  64 */     this.nonVMVolumes = nonVMVolumes;
/*  65 */     this.vmViews = vmViews;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isFiltered()
/*     */   {
/*  73 */     return this.filtered;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFiltered(boolean value)
/*     */   {
/*  81 */     this.filtered = value;
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
/*  93 */     return this.ip;
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
/* 105 */     this.ip = value;
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
/* 117 */     return this.name;
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
/* 129 */     this.name = value;
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
/*     */   public List<VMVolume> getNonVMVolumes()
/*     */   {
/* 155 */     if (this.nonVMVolumes == null) {
/* 156 */       this.nonVMVolumes = new ArrayList();
/*     */     }
/* 158 */     return this.nonVMVolumes;
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
/*     */   public List<VMView> getVmViews()
/*     */   {
/* 184 */     if (this.vmViews == null) {
/* 185 */       this.vmViews = new ArrayList();
/*     */     }
/* 187 */     return this.vmViews;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 197 */     if (!(obj instanceof ESXView)) {
/* 198 */       return false;
/*     */     }
/* 200 */     ESXView otherObj = (ESXView)obj;
/*     */     
/* 202 */     return (this.filtered == otherObj.filtered) && (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.nonVMVolumes != null ? this.nonVMVolumes.equals(otherObj.nonVMVolumes) : this.nonVMVolumes == otherObj.nonVMVolumes) && (this.vmViews != null ? this.vmViews.equals(otherObj.vmViews) : this.vmViews == otherObj.vmViews);
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
/* 215 */     return (this.filtered ? 1 : 0) ^ (this.ip != null ? this.ip.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.nonVMVolumes != null ? this.nonVMVolumes.hashCode() : 0) ^ (this.vmViews != null ? this.vmViews.hashCode() : 0);
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
/* 228 */     return "ESXView [filtered=" + this.filtered + ", " + "ip=" + this.ip + ", " + "name=" + this.name + ", " + "nonVMVolumes=" + this.nonVMVolumes + ", " + "vmViews=" + this.vmViews + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ESXView.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */