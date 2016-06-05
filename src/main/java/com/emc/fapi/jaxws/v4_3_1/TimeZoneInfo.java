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
/*     */ @XmlType(name="TimeZoneInfo", propOrder={"offsetInMilliseconds", "timeZone"})
/*     */ public class TimeZoneInfo
/*     */ {
/*     */   protected int offsetInMilliseconds;
/*     */   protected String timeZone;
/*     */   
/*     */   public TimeZoneInfo() {}
/*     */   
/*     */   public TimeZoneInfo(int offsetInMilliseconds, String timeZone)
/*     */   {
/*  47 */     this.offsetInMilliseconds = offsetInMilliseconds;
/*  48 */     this.timeZone = timeZone;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getOffsetInMilliseconds()
/*     */   {
/*  56 */     return this.offsetInMilliseconds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setOffsetInMilliseconds(int value)
/*     */   {
/*  64 */     this.offsetInMilliseconds = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getTimeZone()
/*     */   {
/*  76 */     return this.timeZone;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTimeZone(String value)
/*     */   {
/*  88 */     this.timeZone = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  98 */     if (!(obj instanceof TimeZoneInfo)) {
/*  99 */       return false;
/*     */     }
/* 101 */     TimeZoneInfo otherObj = (TimeZoneInfo)obj;
/*     */     
/* 103 */     return (this.offsetInMilliseconds == otherObj.offsetInMilliseconds) && (this.timeZone != null ? this.timeZone.equals(otherObj.timeZone) : this.timeZone == otherObj.timeZone);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return this.offsetInMilliseconds ^ (this.timeZone != null ? this.timeZone.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 123 */     return "TimeZoneInfo [offsetInMilliseconds=" + this.offsetInMilliseconds + ", " + "timeZone=" + this.timeZone + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\TimeZoneInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */