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
/*     */ @XmlType(name="AttachedUserVolumeAccessState", propOrder={"volumeID", "groupCopyUID", "replicationSetUID", "accessState", "visible", "currentDelayExpiryTimeoutInSeconds"})
/*     */ public class AttachedUserVolumeAccessState
/*     */ {
/*     */   protected DeviceUID volumeID;
/*     */   protected ConsistencyGroupCopyUID groupCopyUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected ReplicationSetUID replicationSetUID;
/*     */   protected VolumeAccessState accessState;
/*     */   protected Boolean visible;
/*     */   protected int currentDelayExpiryTimeoutInSeconds;
/*     */   
/*     */   public AttachedUserVolumeAccessState() {}
/*     */   
/*     */   public AttachedUserVolumeAccessState(DeviceUID volumeID, ConsistencyGroupCopyUID groupCopyUID, ReplicationSetUID replicationSetUID, VolumeAccessState accessState, Boolean visible, int currentDelayExpiryTimeoutInSeconds)
/*     */   {
/*  61 */     this.volumeID = volumeID;
/*  62 */     this.groupCopyUID = groupCopyUID;
/*  63 */     this.replicationSetUID = replicationSetUID;
/*  64 */     this.accessState = accessState;
/*  65 */     this.visible = visible;
/*  66 */     this.currentDelayExpiryTimeoutInSeconds = currentDelayExpiryTimeoutInSeconds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DeviceUID getVolumeID()
/*     */   {
/*  78 */     return this.volumeID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumeID(DeviceUID value)
/*     */   {
/*  90 */     this.volumeID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getGroupCopyUID()
/*     */   {
/* 102 */     return this.groupCopyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupCopyUID(ConsistencyGroupCopyUID value)
/*     */   {
/* 114 */     this.groupCopyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ReplicationSetUID getReplicationSetUID()
/*     */   {
/* 126 */     return this.replicationSetUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReplicationSetUID(ReplicationSetUID value)
/*     */   {
/* 138 */     this.replicationSetUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VolumeAccessState getAccessState()
/*     */   {
/* 150 */     return this.accessState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAccessState(VolumeAccessState value)
/*     */   {
/* 162 */     this.accessState = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isVisible()
/*     */   {
/* 174 */     return this.visible;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVisible(Boolean value)
/*     */   {
/* 186 */     this.visible = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getCurrentDelayExpiryTimeoutInSeconds()
/*     */   {
/* 194 */     return this.currentDelayExpiryTimeoutInSeconds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCurrentDelayExpiryTimeoutInSeconds(int value)
/*     */   {
/* 202 */     this.currentDelayExpiryTimeoutInSeconds = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 212 */     if (!(obj instanceof AttachedUserVolumeAccessState)) {
/* 213 */       return false;
/*     */     }
/* 215 */     AttachedUserVolumeAccessState otherObj = (AttachedUserVolumeAccessState)obj;
/*     */     
/* 217 */     return (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID) && (this.groupCopyUID != null ? this.groupCopyUID.equals(otherObj.groupCopyUID) : this.groupCopyUID == otherObj.groupCopyUID) && (this.replicationSetUID != null ? this.replicationSetUID.equals(otherObj.replicationSetUID) : this.replicationSetUID == otherObj.replicationSetUID) && (this.accessState != null ? this.accessState.equals(otherObj.accessState) : this.accessState == otherObj.accessState) && (this.visible != null ? this.visible.equals(otherObj.visible) : this.visible == otherObj.visible) && (this.currentDelayExpiryTimeoutInSeconds == otherObj.currentDelayExpiryTimeoutInSeconds);
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
/* 231 */     return (this.volumeID != null ? this.volumeID.hashCode() : 0) ^ (this.groupCopyUID != null ? this.groupCopyUID.hashCode() : 0) ^ (this.replicationSetUID != null ? this.replicationSetUID.hashCode() : 0) ^ (this.accessState != null ? this.accessState.hashCode() : 0) ^ (this.visible != null ? this.visible.hashCode() : 0) ^ this.currentDelayExpiryTimeoutInSeconds;
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
/* 245 */     return "AttachedUserVolumeAccessState [volumeID=" + this.volumeID + ", " + "groupCopyUID=" + this.groupCopyUID + ", " + "replicationSetUID=" + this.replicationSetUID + ", " + "accessState=" + this.accessState + ", " + "visible=" + this.visible + ", " + "currentDelayExpiryTimeoutInSeconds=" + this.currentDelayExpiryTimeoutInSeconds + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AttachedUserVolumeAccessState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */