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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupCopySnapshots", propOrder={"actualJournalCapacity", "averageCompression", "copyUID", "earliest", "journalUsage", "latest", "protectionWindows", "snapshots"})
/*     */ public class ConsistencyGroupCopySnapshots
/*     */ {
/*     */   protected Double actualJournalCapacity;
/*     */   protected Double averageCompression;
/*     */   protected ConsistencyGroupCopyUID copyUID;
/*     */   protected RecoverPointTimeStamp earliest;
/*     */   protected Long journalUsage;
/*     */   protected RecoverPointTimeStamp latest;
/*     */   protected ProtectionWindowsInfo protectionWindows;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<Snapshot> snapshots;
/*     */   
/*     */   public ConsistencyGroupCopySnapshots() {}
/*     */   
/*     */   public ConsistencyGroupCopySnapshots(Double actualJournalCapacity, Double averageCompression, ConsistencyGroupCopyUID copyUID, RecoverPointTimeStamp earliest, Long journalUsage, RecoverPointTimeStamp latest, ProtectionWindowsInfo protectionWindows, List<Snapshot> snapshots)
/*     */   {
/*  69 */     this.actualJournalCapacity = actualJournalCapacity;
/*  70 */     this.averageCompression = averageCompression;
/*  71 */     this.copyUID = copyUID;
/*  72 */     this.earliest = earliest;
/*  73 */     this.journalUsage = journalUsage;
/*  74 */     this.latest = latest;
/*  75 */     this.protectionWindows = protectionWindows;
/*  76 */     this.snapshots = snapshots;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Double getActualJournalCapacity()
/*     */   {
/*  88 */     return this.actualJournalCapacity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setActualJournalCapacity(Double value)
/*     */   {
/* 100 */     this.actualJournalCapacity = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Double getAverageCompression()
/*     */   {
/* 112 */     return this.averageCompression;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAverageCompression(Double value)
/*     */   {
/* 124 */     this.averageCompression = value;
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
/* 136 */     return this.copyUID;
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
/* 148 */     this.copyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointTimeStamp getEarliest()
/*     */   {
/* 160 */     return this.earliest;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEarliest(RecoverPointTimeStamp value)
/*     */   {
/* 172 */     this.earliest = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getJournalUsage()
/*     */   {
/* 184 */     return this.journalUsage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setJournalUsage(Long value)
/*     */   {
/* 196 */     this.journalUsage = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointTimeStamp getLatest()
/*     */   {
/* 208 */     return this.latest;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLatest(RecoverPointTimeStamp value)
/*     */   {
/* 220 */     this.latest = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ProtectionWindowsInfo getProtectionWindows()
/*     */   {
/* 232 */     return this.protectionWindows;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProtectionWindows(ProtectionWindowsInfo value)
/*     */   {
/* 244 */     this.protectionWindows = value;
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
/*     */   public List<Snapshot> getSnapshots()
/*     */   {
/* 270 */     if (this.snapshots == null) {
/* 271 */       this.snapshots = new ArrayList();
/*     */     }
/* 273 */     return this.snapshots;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 283 */     if (!(obj instanceof ConsistencyGroupCopySnapshots)) {
/* 284 */       return false;
/*     */     }
/* 286 */     ConsistencyGroupCopySnapshots otherObj = (ConsistencyGroupCopySnapshots)obj;
/*     */     
/* 288 */     return (this.actualJournalCapacity != null ? this.actualJournalCapacity.equals(otherObj.actualJournalCapacity) : this.actualJournalCapacity == otherObj.actualJournalCapacity) && (this.averageCompression != null ? this.averageCompression.equals(otherObj.averageCompression) : this.averageCompression == otherObj.averageCompression) && (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.earliest != null ? this.earliest.equals(otherObj.earliest) : this.earliest == otherObj.earliest) && (this.journalUsage != null ? this.journalUsage.equals(otherObj.journalUsage) : this.journalUsage == otherObj.journalUsage) && (this.latest != null ? this.latest.equals(otherObj.latest) : this.latest == otherObj.latest) && (this.protectionWindows != null ? this.protectionWindows.equals(otherObj.protectionWindows) : this.protectionWindows == otherObj.protectionWindows) && (this.snapshots != null ? this.snapshots.equals(otherObj.snapshots) : this.snapshots == otherObj.snapshots);
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
/*     */   public int hashCode()
/*     */   {
/* 304 */     return (this.actualJournalCapacity != null ? this.actualJournalCapacity.hashCode() : 0) ^ (this.averageCompression != null ? this.averageCompression.hashCode() : 0) ^ (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.earliest != null ? this.earliest.hashCode() : 0) ^ (this.journalUsage != null ? this.journalUsage.hashCode() : 0) ^ (this.latest != null ? this.latest.hashCode() : 0) ^ (this.protectionWindows != null ? this.protectionWindows.hashCode() : 0) ^ (this.snapshots != null ? this.snapshots.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 320 */     return "ConsistencyGroupCopySnapshots [actualJournalCapacity=" + this.actualJournalCapacity + ", " + "averageCompression=" + this.averageCompression + ", " + "copyUID=" + this.copyUID + ", " + "earliest=" + this.earliest + ", " + "journalUsage=" + this.journalUsage + ", " + "latest=" + this.latest + ", " + "protectionWindows=" + this.protectionWindows + ", " + "snapshots=" + this.snapshots + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupCopySnapshots.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */