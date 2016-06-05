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
/*     */ @XmlType(name="setVCenterServerFilterForUnknownLuns", propOrder={"vCenterServer", "shouldFilterUnknownLuns"})
/*     */ public class SetVCenterServerFilterForUnknownLuns
/*     */ {
/*     */   protected VCenterServerUID vCenterServer;
/*     */   protected boolean shouldFilterUnknownLuns;
/*     */   
/*     */   public SetVCenterServerFilterForUnknownLuns() {}
/*     */   
/*     */   public SetVCenterServerFilterForUnknownLuns(VCenterServerUID vCenterServer, boolean shouldFilterUnknownLuns)
/*     */   {
/*  47 */     this.vCenterServer = vCenterServer;
/*  48 */     this.shouldFilterUnknownLuns = shouldFilterUnknownLuns;
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
/*     */   public boolean isShouldFilterUnknownLuns()
/*     */   {
/*  80 */     return this.shouldFilterUnknownLuns;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setShouldFilterUnknownLuns(boolean value)
/*     */   {
/*  88 */     this.shouldFilterUnknownLuns = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  98 */     if (!(obj instanceof SetVCenterServerFilterForUnknownLuns)) {
/*  99 */       return false;
/*     */     }
/* 101 */     SetVCenterServerFilterForUnknownLuns otherObj = (SetVCenterServerFilterForUnknownLuns)obj;
/*     */     
/* 103 */     return (this.vCenterServer != null ? this.vCenterServer.equals(otherObj.vCenterServer) : this.vCenterServer == otherObj.vCenterServer) && (this.shouldFilterUnknownLuns == otherObj.shouldFilterUnknownLuns);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return (this.vCenterServer != null ? this.vCenterServer.hashCode() : 0) ^ (this.shouldFilterUnknownLuns ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 123 */     return "SetVCenterServerFilterForUnknownLuns [vCenterServer=" + this.vCenterServer + ", " + "shouldFilterUnknownLuns=" + this.shouldFilterUnknownLuns + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetVCenterServerFilterForUnknownLuns.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */