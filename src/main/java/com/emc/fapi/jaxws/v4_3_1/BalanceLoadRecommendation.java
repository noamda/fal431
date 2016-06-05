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
/*     */ @XmlType(name="BalanceLoadRecommendation", propOrder={"groupsRecommendation", "resultEvent", "resultOutput"})
/*     */ public class BalanceLoadRecommendation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupBalanceLoadRecommendation> groupsRecommendation;
/*     */   protected String resultEvent;
/*     */   protected String resultOutput;
/*     */   
/*     */   public BalanceLoadRecommendation() {}
/*     */   
/*     */   public BalanceLoadRecommendation(List<ConsistencyGroupBalanceLoadRecommendation> groupsRecommendation, String resultEvent, String resultOutput)
/*     */   {
/*  54 */     this.groupsRecommendation = groupsRecommendation;
/*  55 */     this.resultEvent = resultEvent;
/*  56 */     this.resultOutput = resultOutput;
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
/*     */   public List<ConsistencyGroupBalanceLoadRecommendation> getGroupsRecommendation()
/*     */   {
/*  82 */     if (this.groupsRecommendation == null) {
/*  83 */       this.groupsRecommendation = new ArrayList();
/*     */     }
/*  85 */     return this.groupsRecommendation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getResultEvent()
/*     */   {
/*  97 */     return this.resultEvent;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setResultEvent(String value)
/*     */   {
/* 109 */     this.resultEvent = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getResultOutput()
/*     */   {
/* 121 */     return this.resultOutput;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setResultOutput(String value)
/*     */   {
/* 133 */     this.resultOutput = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 143 */     if (!(obj instanceof BalanceLoadRecommendation)) {
/* 144 */       return false;
/*     */     }
/* 146 */     BalanceLoadRecommendation otherObj = (BalanceLoadRecommendation)obj;
/*     */     
/* 148 */     return (this.groupsRecommendation != null ? this.groupsRecommendation.equals(otherObj.groupsRecommendation) : this.groupsRecommendation == otherObj.groupsRecommendation) && (this.resultEvent != null ? this.resultEvent.equals(otherObj.resultEvent) : this.resultEvent == otherObj.resultEvent) && (this.resultOutput != null ? this.resultOutput.equals(otherObj.resultOutput) : this.resultOutput == otherObj.resultOutput);
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
/* 159 */     return (this.groupsRecommendation != null ? this.groupsRecommendation.hashCode() : 0) ^ (this.resultEvent != null ? this.resultEvent.hashCode() : 0) ^ (this.resultOutput != null ? this.resultOutput.hashCode() : 0);
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
/* 170 */     return "BalanceLoadRecommendation [groupsRecommendation=" + this.groupsRecommendation + ", " + "resultEvent=" + this.resultEvent + ", " + "resultOutput=" + this.resultOutput + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\BalanceLoadRecommendation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */