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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="Snapshot", propOrder={"snapshotUID", "description", "closingTimeStamp", "sizeInBytes", "uncompressedSizeInBytes", "consolidationInfo", "userSnapshot", "relevantEvent", "consistencyType"})
/*     */ public class Snapshot
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected SnapshotUID snapshotUID;
/*     */   @XmlElement(required=true)
/*     */   protected String description;
/*     */   @XmlElement(required=true)
/*     */   protected RecoverPointTimeStamp closingTimeStamp;
/*     */   protected long sizeInBytes;
/*     */   protected long uncompressedSizeInBytes;
/*     */   protected SnapshotConsolidationInfo consolidationInfo;
/*     */   protected boolean userSnapshot;
/*     */   protected EventLog relevantEvent;
/*     */   protected SnapshotConsistencyType consistencyType;
/*     */   
/*     */   public Snapshot() {}
/*     */   
/*     */   public Snapshot(SnapshotUID snapshotUID, String description, RecoverPointTimeStamp closingTimeStamp, long sizeInBytes, long uncompressedSizeInBytes, SnapshotConsolidationInfo consolidationInfo, boolean userSnapshot, EventLog relevantEvent, SnapshotConsistencyType consistencyType)
/*     */   {
/*  72 */     this.snapshotUID = snapshotUID;
/*  73 */     this.description = description;
/*  74 */     this.closingTimeStamp = closingTimeStamp;
/*  75 */     this.sizeInBytes = sizeInBytes;
/*  76 */     this.uncompressedSizeInBytes = uncompressedSizeInBytes;
/*  77 */     this.consolidationInfo = consolidationInfo;
/*  78 */     this.userSnapshot = userSnapshot;
/*  79 */     this.relevantEvent = relevantEvent;
/*  80 */     this.consistencyType = consistencyType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SnapshotUID getSnapshotUID()
/*     */   {
/*  92 */     return this.snapshotUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSnapshotUID(SnapshotUID value)
/*     */   {
/* 104 */     this.snapshotUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDescription()
/*     */   {
/* 116 */     return this.description;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDescription(String value)
/*     */   {
/* 128 */     this.description = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointTimeStamp getClosingTimeStamp()
/*     */   {
/* 140 */     return this.closingTimeStamp;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setClosingTimeStamp(RecoverPointTimeStamp value)
/*     */   {
/* 152 */     this.closingTimeStamp = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getSizeInBytes()
/*     */   {
/* 160 */     return this.sizeInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSizeInBytes(long value)
/*     */   {
/* 168 */     this.sizeInBytes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getUncompressedSizeInBytes()
/*     */   {
/* 176 */     return this.uncompressedSizeInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUncompressedSizeInBytes(long value)
/*     */   {
/* 184 */     this.uncompressedSizeInBytes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SnapshotConsolidationInfo getConsolidationInfo()
/*     */   {
/* 196 */     return this.consolidationInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConsolidationInfo(SnapshotConsolidationInfo value)
/*     */   {
/* 208 */     this.consolidationInfo = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isUserSnapshot()
/*     */   {
/* 216 */     return this.userSnapshot;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUserSnapshot(boolean value)
/*     */   {
/* 224 */     this.userSnapshot = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public EventLog getRelevantEvent()
/*     */   {
/* 236 */     return this.relevantEvent;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRelevantEvent(EventLog value)
/*     */   {
/* 248 */     this.relevantEvent = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SnapshotConsistencyType getConsistencyType()
/*     */   {
/* 260 */     return this.consistencyType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConsistencyType(SnapshotConsistencyType value)
/*     */   {
/* 272 */     this.consistencyType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 282 */     if (!(obj instanceof Snapshot)) {
/* 283 */       return false;
/*     */     }
/* 285 */     Snapshot otherObj = (Snapshot)obj;
/*     */     
/* 287 */     return (this.snapshotUID != null ? this.snapshotUID.equals(otherObj.snapshotUID) : this.snapshotUID == otherObj.snapshotUID) && (this.description != null ? this.description.equals(otherObj.description) : this.description == otherObj.description) && (this.closingTimeStamp != null ? this.closingTimeStamp.equals(otherObj.closingTimeStamp) : this.closingTimeStamp == otherObj.closingTimeStamp) && (this.sizeInBytes == otherObj.sizeInBytes) && (this.uncompressedSizeInBytes == otherObj.uncompressedSizeInBytes) && (this.consolidationInfo != null ? this.consolidationInfo.equals(otherObj.consolidationInfo) : this.consolidationInfo == otherObj.consolidationInfo) && (this.userSnapshot == otherObj.userSnapshot) && (this.relevantEvent != null ? this.relevantEvent.equals(otherObj.relevantEvent) : this.relevantEvent == otherObj.relevantEvent) && (this.consistencyType != null ? this.consistencyType.equals(otherObj.consistencyType) : this.consistencyType == otherObj.consistencyType);
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
/*     */   public int hashCode()
/*     */   {
/* 304 */     return (this.snapshotUID != null ? this.snapshotUID.hashCode() : 0) ^ (this.description != null ? this.description.hashCode() : 0) ^ (this.closingTimeStamp != null ? this.closingTimeStamp.hashCode() : 0) ^ (int)this.sizeInBytes ^ (int)this.uncompressedSizeInBytes ^ (this.consolidationInfo != null ? this.consolidationInfo.hashCode() : 0) ^ (this.userSnapshot ? 1 : 0) ^ (this.relevantEvent != null ? this.relevantEvent.hashCode() : 0) ^ (this.consistencyType != null ? this.consistencyType.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 321 */     return "Snapshot [snapshotUID=" + this.snapshotUID + ", " + "description=" + this.description + ", " + "closingTimeStamp=" + this.closingTimeStamp + ", " + "sizeInBytes=" + this.sizeInBytes + ", " + "uncompressedSizeInBytes=" + this.uncompressedSizeInBytes + ", " + "consolidationInfo=" + this.consolidationInfo + ", " + "userSnapshot=" + this.userSnapshot + ", " + "relevantEvent=" + this.relevantEvent + ", " + "consistencyType=" + this.consistencyType + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\Snapshot.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */