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
/*     */ @XmlType(name="checkConnectivityToExternalHost", propOrder={"hostParams"})
/*     */ public class CheckConnectivityToExternalHost
/*     */ {
/*     */   protected ExternalHostParams hostParams;
/*     */   
/*     */   public CheckConnectivityToExternalHost() {}
/*     */   
/*     */   public CheckConnectivityToExternalHost(ExternalHostParams hostParams)
/*     */   {
/*  44 */     this.hostParams = hostParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ExternalHostParams getHostParams()
/*     */   {
/*  56 */     return this.hostParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHostParams(ExternalHostParams value)
/*     */   {
/*  68 */     this.hostParams = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof CheckConnectivityToExternalHost)) {
/*  79 */       return false;
/*     */     }
/*  81 */     CheckConnectivityToExternalHost otherObj = (CheckConnectivityToExternalHost)obj;
/*     */     
/*  83 */     return this.hostParams == otherObj.hostParams ? true : this.hostParams != null ? this.hostParams.equals(otherObj.hostParams) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.hostParams != null ? this.hostParams.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "CheckConnectivityToExternalHost [hostParams=" + this.hostParams + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CheckConnectivityToExternalHost.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */