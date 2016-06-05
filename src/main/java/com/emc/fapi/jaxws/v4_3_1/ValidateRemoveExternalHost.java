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
/*     */ @XmlType(name="validateRemoveExternalHost", propOrder={"externalHost"})
/*     */ public class ValidateRemoveExternalHost
/*     */ {
/*     */   protected ExternalHostUID externalHost;
/*     */   
/*     */   public ValidateRemoveExternalHost() {}
/*     */   
/*     */   public ValidateRemoveExternalHost(ExternalHostUID externalHost)
/*     */   {
/*  44 */     this.externalHost = externalHost;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ExternalHostUID getExternalHost()
/*     */   {
/*  56 */     return this.externalHost;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setExternalHost(ExternalHostUID value)
/*     */   {
/*  68 */     this.externalHost = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof ValidateRemoveExternalHost)) {
/*  79 */       return false;
/*     */     }
/*  81 */     ValidateRemoveExternalHost otherObj = (ValidateRemoveExternalHost)obj;
/*     */     
/*  83 */     return this.externalHost == otherObj.externalHost ? true : this.externalHost != null ? this.externalHost.equals(otherObj.externalHost) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.externalHost != null ? this.externalHost.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "ValidateRemoveExternalHost [externalHost=" + this.externalHost + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateRemoveExternalHost.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */