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
/*     */ @XmlType(name="getVCenterServerView", propOrder={"vCenterServer", "shouldRescan"})
/*     */ public class GetVCenterServerView
/*     */ {
/*     */   protected VCenterServerUID vCenterServer;
/*     */   protected boolean shouldRescan;
/*     */   
/*     */   public GetVCenterServerView() {}
/*     */   
/*     */   public GetVCenterServerView(VCenterServerUID vCenterServer, boolean shouldRescan)
/*     */   {
/*  47 */     this.vCenterServer = vCenterServer;
/*  48 */     this.shouldRescan = shouldRescan;
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
/*     */   public boolean isShouldRescan()
/*     */   {
/*  80 */     return this.shouldRescan;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setShouldRescan(boolean value)
/*     */   {
/*  88 */     this.shouldRescan = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  98 */     if (!(obj instanceof GetVCenterServerView)) {
/*  99 */       return false;
/*     */     }
/* 101 */     GetVCenterServerView otherObj = (GetVCenterServerView)obj;
/*     */     
/* 103 */     return (this.vCenterServer != null ? this.vCenterServer.equals(otherObj.vCenterServer) : this.vCenterServer == otherObj.vCenterServer) && (this.shouldRescan == otherObj.shouldRescan);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return (this.vCenterServer != null ? this.vCenterServer.hashCode() : 0) ^ (this.shouldRescan ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 123 */     return "GetVCenterServerView [vCenterServer=" + this.vCenterServer + ", " + "shouldRescan=" + this.shouldRescan + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetVCenterServerView.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */