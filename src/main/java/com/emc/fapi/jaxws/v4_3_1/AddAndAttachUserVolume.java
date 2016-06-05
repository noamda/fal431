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
/*     */ @XmlType(name="addAndAttachUserVolume", propOrder={"groupCopy", "replicationSet", "volumeID"})
/*     */ public class AddAndAttachUserVolume
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopy;
/*     */   protected ReplicationSetUID replicationSet;
/*     */   protected DeviceUID volumeID;
/*     */   
/*     */   public AddAndAttachUserVolume() {}
/*     */   
/*     */   public AddAndAttachUserVolume(ConsistencyGroupCopyUID groupCopy, ReplicationSetUID replicationSet, DeviceUID volumeID)
/*     */   {
/*  50 */     this.groupCopy = groupCopy;
/*  51 */     this.replicationSet = replicationSet;
/*  52 */     this.volumeID = volumeID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getGroupCopy()
/*     */   {
/*  64 */     return this.groupCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupCopy(ConsistencyGroupCopyUID value)
/*     */   {
/*  76 */     this.groupCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ReplicationSetUID getReplicationSet()
/*     */   {
/*  88 */     return this.replicationSet;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReplicationSet(ReplicationSetUID value)
/*     */   {
/* 100 */     this.replicationSet = value;
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
/* 112 */     return this.volumeID;
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
/* 124 */     this.volumeID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 134 */     if (!(obj instanceof AddAndAttachUserVolume)) {
/* 135 */       return false;
/*     */     }
/* 137 */     AddAndAttachUserVolume otherObj = (AddAndAttachUserVolume)obj;
/*     */     
/* 139 */     return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.replicationSet != null ? this.replicationSet.equals(otherObj.replicationSet) : this.replicationSet == otherObj.replicationSet) && (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID);
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
/* 150 */     return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.replicationSet != null ? this.replicationSet.hashCode() : 0) ^ (this.volumeID != null ? this.volumeID.hashCode() : 0);
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
/* 161 */     return "AddAndAttachUserVolume [groupCopy=" + this.groupCopy + ", " + "replicationSet=" + this.replicationSet + ", " + "volumeID=" + this.volumeID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AddAndAttachUserVolume.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */