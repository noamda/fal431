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
/*     */ @XmlType(name="ConsistencyGroupLinkStatistics", propOrder={"initStatistics", "linkUID", "pipeStatistics"})
/*     */ public class ConsistencyGroupLinkStatistics
/*     */ {
/*     */   protected ConsistencyGroupLinkInitStatistics initStatistics;
/*     */   protected ConsistencyGroupLinkUID linkUID;
/*     */   protected ConsistencyGroupLinkPipeStatistics pipeStatistics;
/*     */   
/*     */   public ConsistencyGroupLinkStatistics() {}
/*     */   
/*     */   public ConsistencyGroupLinkStatistics(ConsistencyGroupLinkInitStatistics initStatistics, ConsistencyGroupLinkUID linkUID, ConsistencyGroupLinkPipeStatistics pipeStatistics)
/*     */   {
/*  50 */     this.initStatistics = initStatistics;
/*  51 */     this.linkUID = linkUID;
/*  52 */     this.pipeStatistics = pipeStatistics;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupLinkInitStatistics getInitStatistics()
/*     */   {
/*  64 */     return this.initStatistics;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setInitStatistics(ConsistencyGroupLinkInitStatistics value)
/*     */   {
/*  76 */     this.initStatistics = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupLinkUID getLinkUID()
/*     */   {
/*  88 */     return this.linkUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLinkUID(ConsistencyGroupLinkUID value)
/*     */   {
/* 100 */     this.linkUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupLinkPipeStatistics getPipeStatistics()
/*     */   {
/* 112 */     return this.pipeStatistics;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPipeStatistics(ConsistencyGroupLinkPipeStatistics value)
/*     */   {
/* 124 */     this.pipeStatistics = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 134 */     if (!(obj instanceof ConsistencyGroupLinkStatistics)) {
/* 135 */       return false;
/*     */     }
/* 137 */     ConsistencyGroupLinkStatistics otherObj = (ConsistencyGroupLinkStatistics)obj;
/*     */     
/* 139 */     return (this.initStatistics != null ? this.initStatistics.equals(otherObj.initStatistics) : this.initStatistics == otherObj.initStatistics) && (this.linkUID != null ? this.linkUID.equals(otherObj.linkUID) : this.linkUID == otherObj.linkUID) && (this.pipeStatistics != null ? this.pipeStatistics.equals(otherObj.pipeStatistics) : this.pipeStatistics == otherObj.pipeStatistics);
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
/* 150 */     return (this.initStatistics != null ? this.initStatistics.hashCode() : 0) ^ (this.linkUID != null ? this.linkUID.hashCode() : 0) ^ (this.pipeStatistics != null ? this.pipeStatistics.hashCode() : 0);
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
/* 161 */     return "ConsistencyGroupLinkStatistics [initStatistics=" + this.initStatistics + ", " + "linkUID=" + this.linkUID + ", " + "pipeStatistics=" + this.pipeStatistics + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupLinkStatistics.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */