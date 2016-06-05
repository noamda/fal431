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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupCopyStatistics", propOrder={"averageIncomingThroughput", "averageIncomingWrites", "copyUID", "incomingThroughput", "incomingWrites", "journalStatistics"})
/*     */ public class ConsistencyGroupCopyStatistics
/*     */ {
/*     */   protected long averageIncomingThroughput;
/*     */   protected long averageIncomingWrites;
/*     */   protected ConsistencyGroupCopyUID copyUID;
/*     */   protected long incomingThroughput;
/*     */   protected long incomingWrites;
/*     */   protected ConsistencyGroupCopyJournalStatistics journalStatistics;
/*     */   
/*     */   public ConsistencyGroupCopyStatistics() {}
/*     */   
/*     */   public ConsistencyGroupCopyStatistics(long averageIncomingThroughput, long averageIncomingWrites, ConsistencyGroupCopyUID copyUID, long incomingThroughput, long incomingWrites, ConsistencyGroupCopyJournalStatistics journalStatistics)
/*     */   {
/*  59 */     this.averageIncomingThroughput = averageIncomingThroughput;
/*  60 */     this.averageIncomingWrites = averageIncomingWrites;
/*  61 */     this.copyUID = copyUID;
/*  62 */     this.incomingThroughput = incomingThroughput;
/*  63 */     this.incomingWrites = incomingWrites;
/*  64 */     this.journalStatistics = journalStatistics;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getAverageIncomingThroughput()
/*     */   {
/*  72 */     return this.averageIncomingThroughput;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAverageIncomingThroughput(long value)
/*     */   {
/*  80 */     this.averageIncomingThroughput = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getAverageIncomingWrites()
/*     */   {
/*  88 */     return this.averageIncomingWrites;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAverageIncomingWrites(long value)
/*     */   {
/*  96 */     this.averageIncomingWrites = value;
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
/* 108 */     return this.copyUID;
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
/* 120 */     this.copyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getIncomingThroughput()
/*     */   {
/* 128 */     return this.incomingThroughput;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIncomingThroughput(long value)
/*     */   {
/* 136 */     this.incomingThroughput = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getIncomingWrites()
/*     */   {
/* 144 */     return this.incomingWrites;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIncomingWrites(long value)
/*     */   {
/* 152 */     this.incomingWrites = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyJournalStatistics getJournalStatistics()
/*     */   {
/* 164 */     return this.journalStatistics;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setJournalStatistics(ConsistencyGroupCopyJournalStatistics value)
/*     */   {
/* 176 */     this.journalStatistics = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 186 */     if (!(obj instanceof ConsistencyGroupCopyStatistics)) {
/* 187 */       return false;
/*     */     }
/* 189 */     ConsistencyGroupCopyStatistics otherObj = (ConsistencyGroupCopyStatistics)obj;
/*     */     
/* 191 */     return (this.averageIncomingThroughput == otherObj.averageIncomingThroughput) && (this.averageIncomingWrites == otherObj.averageIncomingWrites) && (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.incomingThroughput == otherObj.incomingThroughput) && (this.incomingWrites == otherObj.incomingWrites) && (this.journalStatistics != null ? this.journalStatistics.equals(otherObj.journalStatistics) : this.journalStatistics == otherObj.journalStatistics);
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
/* 205 */     return (int)this.averageIncomingThroughput ^ (int)this.averageIncomingWrites ^ (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (int)this.incomingThroughput ^ (int)this.incomingWrites ^ (this.journalStatistics != null ? this.journalStatistics.hashCode() : 0);
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
/* 219 */     return "ConsistencyGroupCopyStatistics [averageIncomingThroughput=" + this.averageIncomingThroughput + ", " + "averageIncomingWrites=" + this.averageIncomingWrites + ", " + "copyUID=" + this.copyUID + ", " + "incomingThroughput=" + this.incomingThroughput + ", " + "incomingWrites=" + this.incomingWrites + ", " + "journalStatistics=" + this.journalStatistics + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupCopyStatistics.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */