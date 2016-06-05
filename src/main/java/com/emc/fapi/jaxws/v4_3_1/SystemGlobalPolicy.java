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
/*     */ @XmlType(name="SystemGlobalPolicy", propOrder={"advancedActionRegulationEnabled", "numberOfCommunicationStreams", "shouldCollectLongTermStatistics"})
/*     */ public class SystemGlobalPolicy
/*     */ {
/*     */   protected boolean advancedActionRegulationEnabled;
/*     */   protected int numberOfCommunicationStreams;
/*     */   protected boolean shouldCollectLongTermStatistics;
/*     */   
/*     */   public SystemGlobalPolicy() {}
/*     */   
/*     */   public SystemGlobalPolicy(boolean advancedActionRegulationEnabled, int numberOfCommunicationStreams, boolean shouldCollectLongTermStatistics)
/*     */   {
/*  50 */     this.advancedActionRegulationEnabled = advancedActionRegulationEnabled;
/*  51 */     this.numberOfCommunicationStreams = numberOfCommunicationStreams;
/*  52 */     this.shouldCollectLongTermStatistics = shouldCollectLongTermStatistics;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isAdvancedActionRegulationEnabled()
/*     */   {
/*  60 */     return this.advancedActionRegulationEnabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAdvancedActionRegulationEnabled(boolean value)
/*     */   {
/*  68 */     this.advancedActionRegulationEnabled = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getNumberOfCommunicationStreams()
/*     */   {
/*  76 */     return this.numberOfCommunicationStreams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNumberOfCommunicationStreams(int value)
/*     */   {
/*  84 */     this.numberOfCommunicationStreams = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isShouldCollectLongTermStatistics()
/*     */   {
/*  92 */     return this.shouldCollectLongTermStatistics;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setShouldCollectLongTermStatistics(boolean value)
/*     */   {
/* 100 */     this.shouldCollectLongTermStatistics = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 110 */     if (!(obj instanceof SystemGlobalPolicy)) {
/* 111 */       return false;
/*     */     }
/* 113 */     SystemGlobalPolicy otherObj = (SystemGlobalPolicy)obj;
/*     */     
/* 115 */     return (this.advancedActionRegulationEnabled == otherObj.advancedActionRegulationEnabled) && (this.numberOfCommunicationStreams == otherObj.numberOfCommunicationStreams) && (this.shouldCollectLongTermStatistics == otherObj.shouldCollectLongTermStatistics);
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
/* 126 */     return (this.advancedActionRegulationEnabled ? 1 : 0) ^ this.numberOfCommunicationStreams ^ (this.shouldCollectLongTermStatistics ? 1 : 0);
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
/* 137 */     return "SystemGlobalPolicy [advancedActionRegulationEnabled=" + this.advancedActionRegulationEnabled + ", " + "numberOfCommunicationStreams=" + this.numberOfCommunicationStreams + ", " + "shouldCollectLongTermStatistics=" + this.shouldCollectLongTermStatistics + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SystemGlobalPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */