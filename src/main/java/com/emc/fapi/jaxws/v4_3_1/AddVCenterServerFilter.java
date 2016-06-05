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
/*     */ @XmlType(name="addVCenterServerFilter", propOrder={"vCenterServer", "filter"})
/*     */ public class AddVCenterServerFilter
/*     */ {
/*     */   protected VCenterServerUID vCenterServer;
/*     */   protected VCenterServerFilter filter;
/*     */   
/*     */   public AddVCenterServerFilter() {}
/*     */   
/*     */   public AddVCenterServerFilter(VCenterServerUID vCenterServer, VCenterServerFilter filter)
/*     */   {
/*  47 */     this.vCenterServer = vCenterServer;
/*  48 */     this.filter = filter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VCenterServerUID getVCenterServer()
/*     */   {
/*  60 */     return this.vCenterServer;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVCenterServer(VCenterServerUID value)
/*     */   {
/*  72 */     this.vCenterServer = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VCenterServerFilter getFilter()
/*     */   {
/*  84 */     return this.filter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFilter(VCenterServerFilter value)
/*     */   {
/*  96 */     this.filter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof AddVCenterServerFilter)) {
/* 107 */       return false;
/*     */     }
/* 109 */     AddVCenterServerFilter otherObj = (AddVCenterServerFilter)obj;
/*     */     
/* 111 */     return (this.vCenterServer != null ? this.vCenterServer.equals(otherObj.vCenterServer) : this.vCenterServer == otherObj.vCenterServer) && (this.filter != null ? this.filter.equals(otherObj.filter) : this.filter == otherObj.filter);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.vCenterServer != null ? this.vCenterServer.hashCode() : 0) ^ (this.filter != null ? this.filter.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "AddVCenterServerFilter [vCenterServer=" + this.vCenterServer + ", " + "filter=" + this.filter + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AddVCenterServerFilter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */