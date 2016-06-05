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
/*     */ @XmlType(name="ActivationSettingsChangesParams", propOrder={"allowAutomaticEnable", "enable", "startTransfer"})
/*     */ public class ActivationSettingsChangesParams
/*     */ {
/*     */   protected Boolean allowAutomaticEnable;
/*     */   protected Boolean enable;
/*     */   protected Boolean startTransfer;
/*     */   
/*     */   public ActivationSettingsChangesParams() {}
/*     */   
/*     */   public ActivationSettingsChangesParams(Boolean allowAutomaticEnable, Boolean enable, Boolean startTransfer)
/*     */   {
/*  50 */     this.allowAutomaticEnable = allowAutomaticEnable;
/*  51 */     this.enable = enable;
/*  52 */     this.startTransfer = startTransfer;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isAllowAutomaticEnable()
/*     */   {
/*  64 */     return this.allowAutomaticEnable;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAllowAutomaticEnable(Boolean value)
/*     */   {
/*  76 */     this.allowAutomaticEnable = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isEnable()
/*     */   {
/*  88 */     return this.enable;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEnable(Boolean value)
/*     */   {
/* 100 */     this.enable = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isStartTransfer()
/*     */   {
/* 112 */     return this.startTransfer;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStartTransfer(Boolean value)
/*     */   {
/* 124 */     this.startTransfer = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 134 */     if (!(obj instanceof ActivationSettingsChangesParams)) {
/* 135 */       return false;
/*     */     }
/* 137 */     ActivationSettingsChangesParams otherObj = (ActivationSettingsChangesParams)obj;
/*     */     
/* 139 */     return (this.allowAutomaticEnable != null ? this.allowAutomaticEnable.equals(otherObj.allowAutomaticEnable) : this.allowAutomaticEnable == otherObj.allowAutomaticEnable) && (this.enable != null ? this.enable.equals(otherObj.enable) : this.enable == otherObj.enable) && (this.startTransfer != null ? this.startTransfer.equals(otherObj.startTransfer) : this.startTransfer == otherObj.startTransfer);
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
/* 150 */     return (this.allowAutomaticEnable != null ? this.allowAutomaticEnable.hashCode() : 0) ^ (this.enable != null ? this.enable.hashCode() : 0) ^ (this.startTransfer != null ? this.startTransfer.hashCode() : 0);
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
/* 161 */     return "ActivationSettingsChangesParams [allowAutomaticEnable=" + this.allowAutomaticEnable + ", " + "enable=" + this.enable + ", " + "startTransfer=" + this.startTransfer + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ActivationSettingsChangesParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */