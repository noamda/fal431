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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="consistencyGroupStatisticsSet", propOrder={"innerSet"})
/*     */ public class ConsistencyGroupStatisticsSet
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupStatistics> innerSet;
/*     */   
/*     */   public ConsistencyGroupStatisticsSet() {}
/*     */   
/*     */   public ConsistencyGroupStatisticsSet(List<ConsistencyGroupStatistics> innerSet)
/*     */   {
/*  55 */     this.innerSet = innerSet;
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
/*     */   public List<ConsistencyGroupStatistics> getInnerSet()
/*     */   {
/*  81 */     if (this.innerSet == null) {
/*  82 */       this.innerSet = new ArrayList();
/*     */     }
/*  84 */     return this.innerSet;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  94 */     if (!(obj instanceof ConsistencyGroupStatisticsSet)) {
/*  95 */       return false;
/*     */     }
/*  97 */     ConsistencyGroupStatisticsSet otherObj = (ConsistencyGroupStatisticsSet)obj;
/*     */     
/*  99 */     return this.innerSet == otherObj.innerSet ? true : this.innerSet != null ? this.innerSet.equals(otherObj.innerSet) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 108 */     return this.innerSet != null ? this.innerSet.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 117 */     return "ConsistencyGroupStatisticsSet [innerSet=" + this.innerSet + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupStatisticsSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */