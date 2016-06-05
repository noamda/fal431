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
/*     */ @XmlType(name="ProtectionWindowsInfo", propOrder={"currentProtectionWindow", "predictedProtectionWindow"})
/*     */ public class ProtectionWindowsInfo
/*     */ {
/*     */   protected ProtectionWindowInfo currentProtectionWindow;
/*     */   protected ProtectionWindowInfo predictedProtectionWindow;
/*     */   
/*     */   public ProtectionWindowsInfo() {}
/*     */   
/*     */   public ProtectionWindowsInfo(ProtectionWindowInfo currentProtectionWindow, ProtectionWindowInfo predictedProtectionWindow)
/*     */   {
/*  47 */     this.currentProtectionWindow = currentProtectionWindow;
/*  48 */     this.predictedProtectionWindow = predictedProtectionWindow;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ProtectionWindowInfo getCurrentProtectionWindow()
/*     */   {
/*  60 */     return this.currentProtectionWindow;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCurrentProtectionWindow(ProtectionWindowInfo value)
/*     */   {
/*  72 */     this.currentProtectionWindow = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ProtectionWindowInfo getPredictedProtectionWindow()
/*     */   {
/*  84 */     return this.predictedProtectionWindow;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPredictedProtectionWindow(ProtectionWindowInfo value)
/*     */   {
/*  96 */     this.predictedProtectionWindow = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof ProtectionWindowsInfo)) {
/* 107 */       return false;
/*     */     }
/* 109 */     ProtectionWindowsInfo otherObj = (ProtectionWindowsInfo)obj;
/*     */     
/* 111 */     return (this.currentProtectionWindow != null ? this.currentProtectionWindow.equals(otherObj.currentProtectionWindow) : this.currentProtectionWindow == otherObj.currentProtectionWindow) && (this.predictedProtectionWindow != null ? this.predictedProtectionWindow.equals(otherObj.predictedProtectionWindow) : this.predictedProtectionWindow == otherObj.predictedProtectionWindow);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.currentProtectionWindow != null ? this.currentProtectionWindow.hashCode() : 0) ^ (this.predictedProtectionWindow != null ? this.predictedProtectionWindow.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "ProtectionWindowsInfo [currentProtectionWindow=" + this.currentProtectionWindow + ", " + "predictedProtectionWindow=" + this.predictedProtectionWindow + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ProtectionWindowsInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */