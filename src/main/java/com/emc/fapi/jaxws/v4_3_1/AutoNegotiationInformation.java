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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="AutoNegotiationInformation", propOrder={"enabled", "fullDuplex", "speed"})
/*     */ public class AutoNegotiationInformation
/*     */ {
/*     */   protected boolean enabled;
/*     */   protected boolean fullDuplex;
/*     */   protected int speed;
/*     */   
/*     */   public AutoNegotiationInformation() {}
/*     */   
/*     */   public AutoNegotiationInformation(boolean enabled, boolean fullDuplex, int speed)
/*     */   {
/*  50 */     this.enabled = enabled;
/*  51 */     this.fullDuplex = fullDuplex;
/*  52 */     this.speed = speed;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isEnabled()
/*     */   {
/*  60 */     return this.enabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEnabled(boolean value)
/*     */   {
/*  68 */     this.enabled = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isFullDuplex()
/*     */   {
/*  76 */     return this.fullDuplex;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFullDuplex(boolean value)
/*     */   {
/*  84 */     this.fullDuplex = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getSpeed()
/*     */   {
/*  92 */     return this.speed;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSpeed(int value)
/*     */   {
/* 100 */     this.speed = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 110 */     if (!(obj instanceof AutoNegotiationInformation)) {
/* 111 */       return false;
/*     */     }
/* 113 */     AutoNegotiationInformation otherObj = (AutoNegotiationInformation)obj;
/*     */     
/* 115 */     return (this.enabled == otherObj.enabled) && (this.fullDuplex == otherObj.fullDuplex) && (this.speed == otherObj.speed);
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
/* 126 */     return (this.enabled ? 1 : 0) ^ (this.fullDuplex ? 1 : 0) ^ this.speed;
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
/* 137 */     return "AutoNegotiationInformation [enabled=" + this.enabled + ", " + "fullDuplex=" + this.fullDuplex + ", " + "speed=" + this.speed + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AutoNegotiationInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */