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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupStatistics", propOrder={"consistencyGroupUID", "consistencyGroupCopyStatistics", "consistencyGroupLinkStatistics"})
/*     */ public class ConsistencyGroupStatistics
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ConsistencyGroupUID consistencyGroupUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyStatistics> consistencyGroupCopyStatistics;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupLinkStatistics> consistencyGroupLinkStatistics;
/*     */   
/*     */   public ConsistencyGroupStatistics() {}
/*     */   
/*     */   public ConsistencyGroupStatistics(ConsistencyGroupUID consistencyGroupUID, List<ConsistencyGroupCopyStatistics> consistencyGroupCopyStatistics, List<ConsistencyGroupLinkStatistics> consistencyGroupLinkStatistics)
/*     */   {
/*  56 */     this.consistencyGroupUID = consistencyGroupUID;
/*  57 */     this.consistencyGroupCopyStatistics = consistencyGroupCopyStatistics;
/*  58 */     this.consistencyGroupLinkStatistics = consistencyGroupLinkStatistics;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupUID getConsistencyGroupUID()
/*     */   {
/*  70 */     return this.consistencyGroupUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConsistencyGroupUID(ConsistencyGroupUID value)
/*     */   {
/*  82 */     this.consistencyGroupUID = value;
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
/*     */   public List<ConsistencyGroupCopyStatistics> getConsistencyGroupCopyStatistics()
/*     */   {
/* 108 */     if (this.consistencyGroupCopyStatistics == null) {
/* 109 */       this.consistencyGroupCopyStatistics = new ArrayList();
/*     */     }
/* 111 */     return this.consistencyGroupCopyStatistics;
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
/*     */   public List<ConsistencyGroupLinkStatistics> getConsistencyGroupLinkStatistics()
/*     */   {
/* 137 */     if (this.consistencyGroupLinkStatistics == null) {
/* 138 */       this.consistencyGroupLinkStatistics = new ArrayList();
/*     */     }
/* 140 */     return this.consistencyGroupLinkStatistics;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 150 */     if (!(obj instanceof ConsistencyGroupStatistics)) {
/* 151 */       return false;
/*     */     }
/* 153 */     ConsistencyGroupStatistics otherObj = (ConsistencyGroupStatistics)obj;
/*     */     
/* 155 */     return (this.consistencyGroupUID != null ? this.consistencyGroupUID.equals(otherObj.consistencyGroupUID) : this.consistencyGroupUID == otherObj.consistencyGroupUID) && (this.consistencyGroupCopyStatistics != null ? this.consistencyGroupCopyStatistics.equals(otherObj.consistencyGroupCopyStatistics) : this.consistencyGroupCopyStatistics == otherObj.consistencyGroupCopyStatistics) && (this.consistencyGroupLinkStatistics != null ? this.consistencyGroupLinkStatistics.equals(otherObj.consistencyGroupLinkStatistics) : this.consistencyGroupLinkStatistics == otherObj.consistencyGroupLinkStatistics);
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
/* 166 */     return (this.consistencyGroupUID != null ? this.consistencyGroupUID.hashCode() : 0) ^ (this.consistencyGroupCopyStatistics != null ? this.consistencyGroupCopyStatistics.hashCode() : 0) ^ (this.consistencyGroupLinkStatistics != null ? this.consistencyGroupLinkStatistics.hashCode() : 0);
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
/* 177 */     return "ConsistencyGroupStatistics [consistencyGroupUID=" + this.consistencyGroupUID + ", " + "consistencyGroupCopyStatistics=" + this.consistencyGroupCopyStatistics + ", " + "consistencyGroupLinkStatistics=" + this.consistencyGroupLinkStatistics + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupStatistics.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */