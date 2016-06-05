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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="UserVolumeSettingsChangesParam", propOrder={"newVolumeID", "removedVolumeID", "copyUID"})
/*     */ public class UserVolumeSettingsChangesParam
/*     */ {
/*     */   protected DeviceUID newVolumeID;
/*     */   protected DeviceUID removedVolumeID;
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupCopyUID copyUID;
/*     */   
/*     */   public UserVolumeSettingsChangesParam() {}
/*     */   
/*     */   public UserVolumeSettingsChangesParam(DeviceUID newVolumeID, DeviceUID removedVolumeID, ConsistencyGroupCopyUID copyUID)
/*     */   {
/*  52 */     this.newVolumeID = newVolumeID;
/*  53 */     this.removedVolumeID = removedVolumeID;
/*  54 */     this.copyUID = copyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DeviceUID getNewVolumeID()
/*     */   {
/*  66 */     return this.newVolumeID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNewVolumeID(DeviceUID value)
/*     */   {
/*  78 */     this.newVolumeID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DeviceUID getRemovedVolumeID()
/*     */   {
/*  90 */     return this.removedVolumeID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRemovedVolumeID(DeviceUID value)
/*     */   {
/* 102 */     this.removedVolumeID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getCopyUID()
/*     */   {
/* 114 */     return this.copyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCopyUID(ConsistencyGroupCopyUID value)
/*     */   {
/* 126 */     this.copyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 136 */     if (!(obj instanceof UserVolumeSettingsChangesParam)) {
/* 137 */       return false;
/*     */     }
/* 139 */     UserVolumeSettingsChangesParam otherObj = (UserVolumeSettingsChangesParam)obj;
/*     */     
/* 141 */     return (this.newVolumeID != null ? this.newVolumeID.equals(otherObj.newVolumeID) : this.newVolumeID == otherObj.newVolumeID) && (this.removedVolumeID != null ? this.removedVolumeID.equals(otherObj.removedVolumeID) : this.removedVolumeID == otherObj.removedVolumeID) && (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID);
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
/* 152 */     return (this.newVolumeID != null ? this.newVolumeID.hashCode() : 0) ^ (this.removedVolumeID != null ? this.removedVolumeID.hashCode() : 0) ^ (this.copyUID != null ? this.copyUID.hashCode() : 0);
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
/* 163 */     return "UserVolumeSettingsChangesParam [newVolumeID=" + this.newVolumeID + ", " + "removedVolumeID=" + this.removedVolumeID + ", " + "copyUID=" + this.copyUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\UserVolumeSettingsChangesParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */