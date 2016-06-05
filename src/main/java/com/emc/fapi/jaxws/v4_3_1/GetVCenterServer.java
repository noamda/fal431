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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getVCenterServer", propOrder={"vCenterServer"})
/*     */ public class GetVCenterServer
/*     */ {
/*     */   protected VCenterServerUID vCenterServer;
/*     */   
/*     */   public GetVCenterServer() {}
/*     */   
/*     */   public GetVCenterServer(VCenterServerUID vCenterServer)
/*     */   {
/*  44 */     this.vCenterServer = vCenterServer;
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
/*  56 */     return this.vCenterServer;
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
/*  68 */     this.vCenterServer = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof GetVCenterServer)) {
/*  79 */       return false;
/*     */     }
/*  81 */     GetVCenterServer otherObj = (GetVCenterServer)obj;
/*     */     
/*  83 */     return this.vCenterServer == otherObj.vCenterServer ? true : this.vCenterServer != null ? this.vCenterServer.equals(otherObj.vCenterServer) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.vCenterServer != null ? this.vCenterServer.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "GetVCenterServer [vCenterServer=" + this.vCenterServer + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetVCenterServer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */