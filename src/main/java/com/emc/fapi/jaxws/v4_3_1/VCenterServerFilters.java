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
/*     */ @XmlType(name="VCenterServerFilters", propOrder={"vcenterServer", "filters", "filterUnknownLuns"})
/*     */ public class VCenterServerFilters
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected VCenterServerUID vcenterServer;
/*     */   @XmlElement(required=true)
/*     */   protected List<VCenterServerFilter> filters;
/*     */   protected boolean filterUnknownLuns;
/*     */   
/*     */   public VCenterServerFilters() {}
/*     */   
/*     */   public VCenterServerFilters(VCenterServerUID vcenterServer, List<VCenterServerFilter> filters, boolean filterUnknownLuns)
/*     */   {
/*  55 */     this.vcenterServer = vcenterServer;
/*  56 */     this.filters = filters;
/*  57 */     this.filterUnknownLuns = filterUnknownLuns;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VCenterServerUID getVcenterServer()
/*     */   {
/*  69 */     return this.vcenterServer;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVcenterServer(VCenterServerUID value)
/*     */   {
/*  81 */     this.vcenterServer = value;
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
/*     */   public List<VCenterServerFilter> getFilters()
/*     */   {
/* 107 */     if (this.filters == null) {
/* 108 */       this.filters = new ArrayList();
/*     */     }
/* 110 */     return this.filters;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isFilterUnknownLuns()
/*     */   {
/* 118 */     return this.filterUnknownLuns;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFilterUnknownLuns(boolean value)
/*     */   {
/* 126 */     this.filterUnknownLuns = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 136 */     if (!(obj instanceof VCenterServerFilters)) {
/* 137 */       return false;
/*     */     }
/* 139 */     VCenterServerFilters otherObj = (VCenterServerFilters)obj;
/*     */     
/* 141 */     return (this.vcenterServer != null ? this.vcenterServer.equals(otherObj.vcenterServer) : this.vcenterServer == otherObj.vcenterServer) && (this.filters != null ? this.filters.equals(otherObj.filters) : this.filters == otherObj.filters) && (this.filterUnknownLuns == otherObj.filterUnknownLuns);
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
/* 152 */     return (this.vcenterServer != null ? this.vcenterServer.hashCode() : 0) ^ (this.filters != null ? this.filters.hashCode() : 0) ^ (this.filterUnknownLuns ? 1 : 0);
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
/* 163 */     return "VCenterServerFilters [vcenterServer=" + this.vcenterServer + ", " + "filters=" + this.filters + ", " + "filterUnknownLuns=" + this.filterUnknownLuns + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VCenterServerFilters.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */