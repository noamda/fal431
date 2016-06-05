/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ReplicationSetSettings", propOrder={"replicationSetUID", "replicationSetName", "sizeInBytes", "volumes"})
/*     */ public class ReplicationSetSettings
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ReplicationSetUID replicationSetUID;
/*     */   protected String replicationSetName;
/*     */   protected long sizeInBytes;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<UserVolumeSettings> volumes;
/*     */   
/*     */   public ReplicationSetSettings() {}
/*     */   
/*     */   public ReplicationSetSettings(ReplicationSetUID replicationSetUID, String replicationSetName, long sizeInBytes, List<UserVolumeSettings> volumes)
/*     */   {
/*  58 */     this.replicationSetUID = replicationSetUID;
/*  59 */     this.replicationSetName = replicationSetName;
/*  60 */     this.sizeInBytes = sizeInBytes;
/*  61 */     this.volumes = volumes;
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
/*  73 */     return this.replicationSetUID;
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
/*  85 */     this.replicationSetUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getReplicationSetName()
/*     */   {
/*  97 */     return this.replicationSetName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReplicationSetName(String value)
/*     */   {
/* 109 */     this.replicationSetName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getSizeInBytes()
/*     */   {
/* 117 */     return this.sizeInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSizeInBytes(long value)
/*     */   {
/* 125 */     this.sizeInBytes = value;
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
/*     */   public List<UserVolumeSettings> getVolumes()
/*     */   {
/* 151 */     if (this.volumes == null) {
/* 152 */       this.volumes = new ArrayList();
/*     */     }
/* 154 */     return this.volumes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 164 */     if (!(obj instanceof ReplicationSetSettings)) {
/* 165 */       return false;
/*     */     }
/* 167 */     ReplicationSetSettings otherObj = (ReplicationSetSettings)obj;
/*     */     
/* 169 */     return (this.replicationSetUID != null ? this.replicationSetUID.equals(otherObj.replicationSetUID) : this.replicationSetUID == otherObj.replicationSetUID) && (this.replicationSetName != null ? this.replicationSetName.equals(otherObj.replicationSetName) : this.replicationSetName == otherObj.replicationSetName) && (this.sizeInBytes == otherObj.sizeInBytes) && (this.volumes != null ? this.volumes.equals(otherObj.volumes) : this.volumes == otherObj.volumes);
/*     */   }
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
/* 181 */     return (this.replicationSetUID != null ? this.replicationSetUID.hashCode() : 0) ^ (this.replicationSetName != null ? this.replicationSetName.hashCode() : 0) ^ (int)this.sizeInBytes ^ (this.volumes != null ? this.volumes.hashCode() : 0);
/*     */   }
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
/* 193 */     return "ReplicationSetSettings [replicationSetUID=" + this.replicationSetUID + ", " + "replicationSetName=" + this.replicationSetName + ", " + "sizeInBytes=" + this.sizeInBytes + ", " + "volumes=" + this.volumes + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ReplicationSetSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */