/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupManagementSettings", propOrder={"managementMode", "recoveryCopy", "expectedActiveCopy", "allowTestingWhileClustersDisconnected", "recoveryImage", "recoveryImageExpiryDate"})
/*     */ public class ConsistencyGroupManagementSettings
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected ManagementMode managementMode;
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupCopyUID recoveryCopy;
/*     */   protected ConsistencyGroupCopyUID expectedActiveCopy;
/*     */   protected boolean allowTestingWhileClustersDisconnected;
/*     */   protected Snapshot recoveryImage;
/*     */   protected RecoverPointTimeStamp recoveryImageExpiryDate;
/*     */   
/*     */   public ConsistencyGroupManagementSettings() {}
/*     */   
/*     */   public ConsistencyGroupManagementSettings(ManagementMode managementMode, ConsistencyGroupCopyUID recoveryCopy, ConsistencyGroupCopyUID expectedActiveCopy, boolean allowTestingWhileClustersDisconnected, Snapshot recoveryImage, RecoverPointTimeStamp recoveryImageExpiryDate)
/*     */   {
/*  62 */     this.managementMode = managementMode;
/*  63 */     this.recoveryCopy = recoveryCopy;
/*  64 */     this.expectedActiveCopy = expectedActiveCopy;
/*  65 */     this.allowTestingWhileClustersDisconnected = allowTestingWhileClustersDisconnected;
/*  66 */     this.recoveryImage = recoveryImage;
/*  67 */     this.recoveryImageExpiryDate = recoveryImageExpiryDate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ManagementMode getManagementMode()
/*     */   {
/*  79 */     return this.managementMode;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setManagementMode(ManagementMode value)
/*     */   {
/*  91 */     this.managementMode = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getRecoveryCopy()
/*     */   {
/* 103 */     return this.recoveryCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRecoveryCopy(ConsistencyGroupCopyUID value)
/*     */   {
/* 115 */     this.recoveryCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getExpectedActiveCopy()
/*     */   {
/* 127 */     return this.expectedActiveCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setExpectedActiveCopy(ConsistencyGroupCopyUID value)
/*     */   {
/* 139 */     this.expectedActiveCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isAllowTestingWhileClustersDisconnected()
/*     */   {
/* 147 */     return this.allowTestingWhileClustersDisconnected;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAllowTestingWhileClustersDisconnected(boolean value)
/*     */   {
/* 155 */     this.allowTestingWhileClustersDisconnected = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Snapshot getRecoveryImage()
/*     */   {
/* 167 */     return this.recoveryImage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRecoveryImage(Snapshot value)
/*     */   {
/* 179 */     this.recoveryImage = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointTimeStamp getRecoveryImageExpiryDate()
/*     */   {
/* 191 */     return this.recoveryImageExpiryDate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRecoveryImageExpiryDate(RecoverPointTimeStamp value)
/*     */   {
/* 203 */     this.recoveryImageExpiryDate = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 213 */     if (!(obj instanceof ConsistencyGroupManagementSettings)) {
/* 214 */       return false;
/*     */     }
/* 216 */     ConsistencyGroupManagementSettings otherObj = (ConsistencyGroupManagementSettings)obj;
/*     */     
/* 218 */     return (this.managementMode != null ? this.managementMode.equals(otherObj.managementMode) : this.managementMode == otherObj.managementMode) && (this.recoveryCopy != null ? this.recoveryCopy.equals(otherObj.recoveryCopy) : this.recoveryCopy == otherObj.recoveryCopy) && (this.expectedActiveCopy != null ? this.expectedActiveCopy.equals(otherObj.expectedActiveCopy) : this.expectedActiveCopy == otherObj.expectedActiveCopy) && (this.allowTestingWhileClustersDisconnected == otherObj.allowTestingWhileClustersDisconnected) && (this.recoveryImage != null ? this.recoveryImage.equals(otherObj.recoveryImage) : this.recoveryImage == otherObj.recoveryImage) && (this.recoveryImageExpiryDate != null ? this.recoveryImageExpiryDate.equals(otherObj.recoveryImageExpiryDate) : this.recoveryImageExpiryDate == otherObj.recoveryImageExpiryDate);
/*     */   }
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
/*     */   public int hashCode()
/*     */   {
/* 232 */     return (this.managementMode != null ? this.managementMode.hashCode() : 0) ^ (this.recoveryCopy != null ? this.recoveryCopy.hashCode() : 0) ^ (this.expectedActiveCopy != null ? this.expectedActiveCopy.hashCode() : 0) ^ (this.allowTestingWhileClustersDisconnected ? 1 : 0) ^ (this.recoveryImage != null ? this.recoveryImage.hashCode() : 0) ^ (this.recoveryImageExpiryDate != null ? this.recoveryImageExpiryDate.hashCode() : 0);
/*     */   }
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
/*     */   public String toString()
/*     */   {
/* 246 */     return "ConsistencyGroupManagementSettings [managementMode=" + this.managementMode + ", " + "recoveryCopy=" + this.recoveryCopy + ", " + "expectedActiveCopy=" + this.expectedActiveCopy + ", " + "allowTestingWhileClustersDisconnected=" + this.allowTestingWhileClustersDisconnected + ", " + "recoveryImage=" + this.recoveryImage + ", " + "recoveryImageExpiryDate=" + this.recoveryImageExpiryDate + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupManagementSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */