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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupLinkPipeStatistics", propOrder={"averageJournalCompressionRatio", "compressionRatio", "detachData", "detachDataRate", "lag", "numberOfGrids", "outgoingThroughput", "outgoingThroughputPerRPA", "replicationMode", "syncRemoteLink", "deduplicationRatio", "averageDeduplicationRatio"})
/*     */ public class ConsistencyGroupLinkPipeStatistics
/*     */ {
/*     */   protected double averageJournalCompressionRatio;
/*     */   protected double compressionRatio;
/*     */   protected Long detachData;
/*     */   protected Long detachDataRate;
/*     */   protected StatisticsCounters lag;
/*     */   protected int numberOfGrids;
/*     */   protected long outgoingThroughput;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<OutgoingThroughputStatistics> outgoingThroughputPerRPA;
/*     */   @XmlElement(nillable=true)
/*     */   protected ReplicationMode replicationMode;
/*     */   protected boolean syncRemoteLink;
/*     */   protected double deduplicationRatio;
/*     */   protected double averageDeduplicationRatio;
/*     */   
/*     */   public ConsistencyGroupLinkPipeStatistics() {}
/*     */   
/*     */   public ConsistencyGroupLinkPipeStatistics(double averageJournalCompressionRatio, double compressionRatio, Long detachData, Long detachDataRate, StatisticsCounters lag, int numberOfGrids, long outgoingThroughput, List<OutgoingThroughputStatistics> outgoingThroughputPerRPA, ReplicationMode replicationMode, boolean syncRemoteLink, double deduplicationRatio, double averageDeduplicationRatio)
/*     */   {
/*  82 */     this.averageJournalCompressionRatio = averageJournalCompressionRatio;
/*  83 */     this.compressionRatio = compressionRatio;
/*  84 */     this.detachData = detachData;
/*  85 */     this.detachDataRate = detachDataRate;
/*  86 */     this.lag = lag;
/*  87 */     this.numberOfGrids = numberOfGrids;
/*  88 */     this.outgoingThroughput = outgoingThroughput;
/*  89 */     this.outgoingThroughputPerRPA = outgoingThroughputPerRPA;
/*  90 */     this.replicationMode = replicationMode;
/*  91 */     this.syncRemoteLink = syncRemoteLink;
/*  92 */     this.deduplicationRatio = deduplicationRatio;
/*  93 */     this.averageDeduplicationRatio = averageDeduplicationRatio;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public double getAverageJournalCompressionRatio()
/*     */   {
/* 101 */     return this.averageJournalCompressionRatio;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAverageJournalCompressionRatio(double value)
/*     */   {
/* 109 */     this.averageJournalCompressionRatio = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public double getCompressionRatio()
/*     */   {
/* 117 */     return this.compressionRatio;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCompressionRatio(double value)
/*     */   {
/* 125 */     this.compressionRatio = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getDetachData()
/*     */   {
/* 137 */     return this.detachData;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDetachData(Long value)
/*     */   {
/* 149 */     this.detachData = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getDetachDataRate()
/*     */   {
/* 161 */     return this.detachDataRate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDetachDataRate(Long value)
/*     */   {
/* 173 */     this.detachDataRate = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public StatisticsCounters getLag()
/*     */   {
/* 185 */     return this.lag;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLag(StatisticsCounters value)
/*     */   {
/* 197 */     this.lag = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getNumberOfGrids()
/*     */   {
/* 205 */     return this.numberOfGrids;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNumberOfGrids(int value)
/*     */   {
/* 213 */     this.numberOfGrids = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getOutgoingThroughput()
/*     */   {
/* 221 */     return this.outgoingThroughput;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setOutgoingThroughput(long value)
/*     */   {
/* 229 */     this.outgoingThroughput = value;
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
/*     */   public List<OutgoingThroughputStatistics> getOutgoingThroughputPerRPA()
/*     */   {
/* 255 */     if (this.outgoingThroughputPerRPA == null) {
/* 256 */       this.outgoingThroughputPerRPA = new ArrayList();
/*     */     }
/* 258 */     return this.outgoingThroughputPerRPA;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ReplicationMode getReplicationMode()
/*     */   {
/* 270 */     return this.replicationMode;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReplicationMode(ReplicationMode value)
/*     */   {
/* 282 */     this.replicationMode = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isSyncRemoteLink()
/*     */   {
/* 290 */     return this.syncRemoteLink;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSyncRemoteLink(boolean value)
/*     */   {
/* 298 */     this.syncRemoteLink = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public double getDeduplicationRatio()
/*     */   {
/* 306 */     return this.deduplicationRatio;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDeduplicationRatio(double value)
/*     */   {
/* 314 */     this.deduplicationRatio = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public double getAverageDeduplicationRatio()
/*     */   {
/* 322 */     return this.averageDeduplicationRatio;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAverageDeduplicationRatio(double value)
/*     */   {
/* 330 */     this.averageDeduplicationRatio = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 340 */     if (!(obj instanceof ConsistencyGroupLinkPipeStatistics)) {
/* 341 */       return false;
/*     */     }
/* 343 */     ConsistencyGroupLinkPipeStatistics otherObj = (ConsistencyGroupLinkPipeStatistics)obj;
/*     */     
/* 345 */     return (this.averageJournalCompressionRatio == otherObj.averageJournalCompressionRatio) && (this.compressionRatio == otherObj.compressionRatio) && (this.detachData != null ? this.detachData.equals(otherObj.detachData) : this.detachData == otherObj.detachData) && (this.detachDataRate != null ? this.detachDataRate.equals(otherObj.detachDataRate) : this.detachDataRate == otherObj.detachDataRate) && (this.lag != null ? this.lag.equals(otherObj.lag) : this.lag == otherObj.lag) && (this.numberOfGrids == otherObj.numberOfGrids) && (this.outgoingThroughput == otherObj.outgoingThroughput) && (this.outgoingThroughputPerRPA != null ? this.outgoingThroughputPerRPA.equals(otherObj.outgoingThroughputPerRPA) : this.outgoingThroughputPerRPA == otherObj.outgoingThroughputPerRPA) && (this.replicationMode != null ? this.replicationMode.equals(otherObj.replicationMode) : this.replicationMode == otherObj.replicationMode) && (this.syncRemoteLink == otherObj.syncRemoteLink) && (this.deduplicationRatio == otherObj.deduplicationRatio) && (this.averageDeduplicationRatio == otherObj.averageDeduplicationRatio);
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
/*     */   public int hashCode()
/*     */   {
/* 365 */     return (int)this.averageJournalCompressionRatio ^ (int)this.compressionRatio ^ (this.detachData != null ? this.detachData.hashCode() : 0) ^ (this.detachDataRate != null ? this.detachDataRate.hashCode() : 0) ^ (this.lag != null ? this.lag.hashCode() : 0) ^ this.numberOfGrids ^ (int)this.outgoingThroughput ^ (this.outgoingThroughputPerRPA != null ? this.outgoingThroughputPerRPA.hashCode() : 0) ^ (this.replicationMode != null ? this.replicationMode.hashCode() : 0) ^ (this.syncRemoteLink ? 1 : 0) ^ (int)this.deduplicationRatio ^ (int)this.averageDeduplicationRatio;
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
/*     */   public String toString()
/*     */   {
/* 385 */     return "ConsistencyGroupLinkPipeStatistics [averageJournalCompressionRatio=" + this.averageJournalCompressionRatio + ", " + "compressionRatio=" + this.compressionRatio + ", " + "detachData=" + this.detachData + ", " + "detachDataRate=" + this.detachDataRate + ", " + "lag=" + this.lag + ", " + "numberOfGrids=" + this.numberOfGrids + ", " + "outgoingThroughput=" + this.outgoingThroughput + ", " + "outgoingThroughputPerRPA=" + this.outgoingThroughputPerRPA + ", " + "replicationMode=" + this.replicationMode + ", " + "syncRemoteLink=" + this.syncRemoteLink + ", " + "deduplicationRatio=" + this.deduplicationRatio + ", " + "averageDeduplicationRatio=" + this.averageDeduplicationRatio + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupLinkPipeStatistics.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */