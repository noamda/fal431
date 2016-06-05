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
/*     */ @XmlType(name="TrafficStatistics", propOrder={"applicationIncomingWrites", "applicationThroughputStatistics", "connectionsCompressionRatio", "initThroughputStatistics"})
/*     */ public class TrafficStatistics
/*     */ {
/*     */   protected long applicationIncomingWrites;
/*     */   protected InOutThroughputStatistics applicationThroughputStatistics;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConnectionCompressionRatio> connectionsCompressionRatio;
/*     */   protected InOutThroughputStatistics initThroughputStatistics;
/*     */   
/*     */   public TrafficStatistics() {}
/*     */   
/*     */   public TrafficStatistics(long applicationIncomingWrites, InOutThroughputStatistics applicationThroughputStatistics, List<ConnectionCompressionRatio> connectionsCompressionRatio, InOutThroughputStatistics initThroughputStatistics)
/*     */   {
/*  57 */     this.applicationIncomingWrites = applicationIncomingWrites;
/*  58 */     this.applicationThroughputStatistics = applicationThroughputStatistics;
/*  59 */     this.connectionsCompressionRatio = connectionsCompressionRatio;
/*  60 */     this.initThroughputStatistics = initThroughputStatistics;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getApplicationIncomingWrites()
/*     */   {
/*  68 */     return this.applicationIncomingWrites;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setApplicationIncomingWrites(long value)
/*     */   {
/*  76 */     this.applicationIncomingWrites = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public InOutThroughputStatistics getApplicationThroughputStatistics()
/*     */   {
/*  88 */     return this.applicationThroughputStatistics;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setApplicationThroughputStatistics(InOutThroughputStatistics value)
/*     */   {
/* 100 */     this.applicationThroughputStatistics = value;
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
/*     */   public List<ConnectionCompressionRatio> getConnectionsCompressionRatio()
/*     */   {
/* 126 */     if (this.connectionsCompressionRatio == null) {
/* 127 */       this.connectionsCompressionRatio = new ArrayList();
/*     */     }
/* 129 */     return this.connectionsCompressionRatio;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public InOutThroughputStatistics getInitThroughputStatistics()
/*     */   {
/* 141 */     return this.initThroughputStatistics;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setInitThroughputStatistics(InOutThroughputStatistics value)
/*     */   {
/* 153 */     this.initThroughputStatistics = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 163 */     if (!(obj instanceof TrafficStatistics)) {
/* 164 */       return false;
/*     */     }
/* 166 */     TrafficStatistics otherObj = (TrafficStatistics)obj;
/*     */     
/* 168 */     return (this.applicationIncomingWrites == otherObj.applicationIncomingWrites) && (this.applicationThroughputStatistics != null ? this.applicationThroughputStatistics.equals(otherObj.applicationThroughputStatistics) : this.applicationThroughputStatistics == otherObj.applicationThroughputStatistics) && (this.connectionsCompressionRatio != null ? this.connectionsCompressionRatio.equals(otherObj.connectionsCompressionRatio) : this.connectionsCompressionRatio == otherObj.connectionsCompressionRatio) && (this.initThroughputStatistics != null ? this.initThroughputStatistics.equals(otherObj.initThroughputStatistics) : this.initThroughputStatistics == otherObj.initThroughputStatistics);
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
/* 180 */     return (int)this.applicationIncomingWrites ^ (this.applicationThroughputStatistics != null ? this.applicationThroughputStatistics.hashCode() : 0) ^ (this.connectionsCompressionRatio != null ? this.connectionsCompressionRatio.hashCode() : 0) ^ (this.initThroughputStatistics != null ? this.initThroughputStatistics.hashCode() : 0);
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
/* 192 */     return "TrafficStatistics [applicationIncomingWrites=" + this.applicationIncomingWrites + ", " + "applicationThroughputStatistics=" + this.applicationThroughputStatistics + ", " + "connectionsCompressionRatio=" + this.connectionsCompressionRatio + ", " + "initThroughputStatistics=" + this.initThroughputStatistics + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\TrafficStatistics.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */