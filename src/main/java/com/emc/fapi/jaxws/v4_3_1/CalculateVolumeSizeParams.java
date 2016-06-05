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
/*     */ @XmlType(name="CalculateVolumeSizeParams", propOrder={"incomingDataRatePerSecond", "requiredProtectionWindow"})
/*     */ public class CalculateVolumeSizeParams
/*     */ {
/*     */   protected long incomingDataRatePerSecond;
/*     */   protected long requiredProtectionWindow;
/*     */   
/*     */   public CalculateVolumeSizeParams() {}
/*     */   
/*     */   public CalculateVolumeSizeParams(long incomingDataRatePerSecond, long requiredProtectionWindow)
/*     */   {
/*  47 */     this.incomingDataRatePerSecond = incomingDataRatePerSecond;
/*  48 */     this.requiredProtectionWindow = requiredProtectionWindow;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getIncomingDataRatePerSecond()
/*     */   {
/*  56 */     return this.incomingDataRatePerSecond;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIncomingDataRatePerSecond(long value)
/*     */   {
/*  64 */     this.incomingDataRatePerSecond = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getRequiredProtectionWindow()
/*     */   {
/*  72 */     return this.requiredProtectionWindow;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRequiredProtectionWindow(long value)
/*     */   {
/*  80 */     this.requiredProtectionWindow = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof CalculateVolumeSizeParams)) {
/*  91 */       return false;
/*     */     }
/*  93 */     CalculateVolumeSizeParams otherObj = (CalculateVolumeSizeParams)obj;
/*     */     
/*  95 */     return (this.incomingDataRatePerSecond == otherObj.incomingDataRatePerSecond) && (this.requiredProtectionWindow == otherObj.requiredProtectionWindow);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return (int)this.incomingDataRatePerSecond ^ (int)this.requiredProtectionWindow;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "CalculateVolumeSizeParams [incomingDataRatePerSecond=" + this.incomingDataRatePerSecond + ", " + "requiredProtectionWindow=" + this.requiredProtectionWindow + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CalculateVolumeSizeParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */