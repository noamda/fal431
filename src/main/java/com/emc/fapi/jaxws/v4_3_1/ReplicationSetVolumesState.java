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
/*     */ @XmlType(name="ReplicationSetVolumesState", propOrder={"replicationSetUID", "userVolumesState", "maxPossibleSizeInBytes", "canBeEnlarged"})
/*     */ public class ReplicationSetVolumesState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ReplicationSetUID replicationSetUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<UserVolumeState> userVolumesState;
/*     */   protected long maxPossibleSizeInBytes;
/*     */   protected boolean canBeEnlarged;
/*     */   
/*     */   public ReplicationSetVolumesState() {}
/*     */   
/*     */   public ReplicationSetVolumesState(ReplicationSetUID replicationSetUID, List<UserVolumeState> userVolumesState, long maxPossibleSizeInBytes, boolean canBeEnlarged)
/*     */   {
/*  58 */     this.replicationSetUID = replicationSetUID;
/*  59 */     this.userVolumesState = userVolumesState;
/*  60 */     this.maxPossibleSizeInBytes = maxPossibleSizeInBytes;
/*  61 */     this.canBeEnlarged = canBeEnlarged;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<UserVolumeState> getUserVolumesState()
/*     */   {
/* 111 */     if (this.userVolumesState == null) {
/* 112 */       this.userVolumesState = new ArrayList();
/*     */     }
/* 114 */     return this.userVolumesState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getMaxPossibleSizeInBytes()
/*     */   {
/* 122 */     return this.maxPossibleSizeInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMaxPossibleSizeInBytes(long value)
/*     */   {
/* 130 */     this.maxPossibleSizeInBytes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isCanBeEnlarged()
/*     */   {
/* 138 */     return this.canBeEnlarged;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCanBeEnlarged(boolean value)
/*     */   {
/* 146 */     this.canBeEnlarged = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 156 */     if (!(obj instanceof ReplicationSetVolumesState)) {
/* 157 */       return false;
/*     */     }
/* 159 */     ReplicationSetVolumesState otherObj = (ReplicationSetVolumesState)obj;
/*     */     
/* 161 */     return (this.replicationSetUID != null ? this.replicationSetUID.equals(otherObj.replicationSetUID) : this.replicationSetUID == otherObj.replicationSetUID) && (this.userVolumesState != null ? this.userVolumesState.equals(otherObj.userVolumesState) : this.userVolumesState == otherObj.userVolumesState) && (this.maxPossibleSizeInBytes == otherObj.maxPossibleSizeInBytes) && (this.canBeEnlarged == otherObj.canBeEnlarged);
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
/* 173 */     return (this.replicationSetUID != null ? this.replicationSetUID.hashCode() : 0) ^ (this.userVolumesState != null ? this.userVolumesState.hashCode() : 0) ^ (int)this.maxPossibleSizeInBytes ^ (this.canBeEnlarged ? 1 : 0);
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
/* 185 */     return "ReplicationSetVolumesState [replicationSetUID=" + this.replicationSetUID + ", " + "userVolumesState=" + this.userVolumesState + ", " + "maxPossibleSizeInBytes=" + this.maxPossibleSizeInBytes + ", " + "canBeEnlarged=" + this.canBeEnlarged + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ReplicationSetVolumesState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */