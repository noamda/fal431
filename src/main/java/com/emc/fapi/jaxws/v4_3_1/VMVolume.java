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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VMVolume", propOrder={"canonicalName", "volumeID", "groupCopyUID", "replicationSetUID", "filtered"})
/*     */ public class VMVolume
/*     */ {
/*     */   protected String canonicalName;
/*     */   protected DeviceUID volumeID;
/*     */   protected ConsistencyGroupCopyUID groupCopyUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected ReplicationSetUID replicationSetUID;
/*     */   protected boolean filtered;
/*     */   
/*     */   public VMVolume() {}
/*     */   
/*     */   public VMVolume(String canonicalName, DeviceUID volumeID, ConsistencyGroupCopyUID groupCopyUID, ReplicationSetUID replicationSetUID, boolean filtered)
/*     */   {
/*  58 */     this.canonicalName = canonicalName;
/*  59 */     this.volumeID = volumeID;
/*  60 */     this.groupCopyUID = groupCopyUID;
/*  61 */     this.replicationSetUID = replicationSetUID;
/*  62 */     this.filtered = filtered;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getCanonicalName()
/*     */   {
/*  74 */     return this.canonicalName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCanonicalName(String value)
/*     */   {
/*  86 */     this.canonicalName = value;
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
/*  98 */     return this.volumeID;
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
/* 110 */     this.volumeID = value;
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
/* 122 */     return this.groupCopyUID;
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
/* 134 */     this.groupCopyUID = value;
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
/* 146 */     return this.replicationSetUID;
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
/* 158 */     this.replicationSetUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isFiltered()
/*     */   {
/* 166 */     return this.filtered;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFiltered(boolean value)
/*     */   {
/* 174 */     this.filtered = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 184 */     if (!(obj instanceof VMVolume)) {
/* 185 */       return false;
/*     */     }
/* 187 */     VMVolume otherObj = (VMVolume)obj;
/*     */     
/* 189 */     return (this.canonicalName != null ? this.canonicalName.equals(otherObj.canonicalName) : this.canonicalName == otherObj.canonicalName) && (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID) && (this.groupCopyUID != null ? this.groupCopyUID.equals(otherObj.groupCopyUID) : this.groupCopyUID == otherObj.groupCopyUID) && (this.replicationSetUID != null ? this.replicationSetUID.equals(otherObj.replicationSetUID) : this.replicationSetUID == otherObj.replicationSetUID) && (this.filtered == otherObj.filtered);
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
/*     */   public int hashCode()
/*     */   {
/* 202 */     return (this.canonicalName != null ? this.canonicalName.hashCode() : 0) ^ (this.volumeID != null ? this.volumeID.hashCode() : 0) ^ (this.groupCopyUID != null ? this.groupCopyUID.hashCode() : 0) ^ (this.replicationSetUID != null ? this.replicationSetUID.hashCode() : 0) ^ (this.filtered ? 1 : 0);
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
/*     */   public String toString()
/*     */   {
/* 215 */     return "VMVolume [canonicalName=" + this.canonicalName + ", " + "volumeID=" + this.volumeID + ", " + "groupCopyUID=" + this.groupCopyUID + ", " + "replicationSetUID=" + this.replicationSetUID + ", " + "filtered=" + this.filtered + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VMVolume.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */