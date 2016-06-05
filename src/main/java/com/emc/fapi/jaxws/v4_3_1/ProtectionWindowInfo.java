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
/*     */ @XmlType(name="ProtectionWindowInfo", propOrder={"protectionWindowInMicroSeconds", "status"})
/*     */ public class ProtectionWindowInfo
/*     */ {
/*     */   protected long protectionWindowInMicroSeconds;
/*     */   protected ProtectionWindowStatus status;
/*     */   
/*     */   public ProtectionWindowInfo() {}
/*     */   
/*     */   public ProtectionWindowInfo(long protectionWindowInMicroSeconds, ProtectionWindowStatus status)
/*     */   {
/*  47 */     this.protectionWindowInMicroSeconds = protectionWindowInMicroSeconds;
/*  48 */     this.status = status;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getProtectionWindowInMicroSeconds()
/*     */   {
/*  56 */     return this.protectionWindowInMicroSeconds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProtectionWindowInMicroSeconds(long value)
/*     */   {
/*  64 */     this.protectionWindowInMicroSeconds = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ProtectionWindowStatus getStatus()
/*     */   {
/*  76 */     return this.status;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStatus(ProtectionWindowStatus value)
/*     */   {
/*  88 */     this.status = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  98 */     if (!(obj instanceof ProtectionWindowInfo)) {
/*  99 */       return false;
/*     */     }
/* 101 */     ProtectionWindowInfo otherObj = (ProtectionWindowInfo)obj;
/*     */     
/* 103 */     return (this.protectionWindowInMicroSeconds == otherObj.protectionWindowInMicroSeconds) && (this.status != null ? this.status.equals(otherObj.status) : this.status == otherObj.status);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return (int)this.protectionWindowInMicroSeconds ^ (this.status != null ? this.status.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 123 */     return "ProtectionWindowInfo [protectionWindowInMicroSeconds=" + this.protectionWindowInMicroSeconds + ", " + "status=" + this.status + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ProtectionWindowInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */