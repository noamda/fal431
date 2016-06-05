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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="TransactionStatus", propOrder={"completedStage", "eta", "progressPercentage", "stage", "state", "title", "totalStages"})
/*     */ public class TransactionStatus
/*     */ {
/*     */   protected String completedStage;
/*     */   protected RecoverPointTimeStamp eta;
/*     */   protected Integer progressPercentage;
/*     */   protected Integer stage;
/*     */   protected ExecutionState state;
/*     */   protected String title;
/*     */   protected Integer totalStages;
/*     */   
/*     */   public TransactionStatus() {}
/*     */   
/*     */   public TransactionStatus(String completedStage, RecoverPointTimeStamp eta, Integer progressPercentage, Integer stage, ExecutionState state, String title, Integer totalStages)
/*     */   {
/*  62 */     this.completedStage = completedStage;
/*  63 */     this.eta = eta;
/*  64 */     this.progressPercentage = progressPercentage;
/*  65 */     this.stage = stage;
/*  66 */     this.state = state;
/*  67 */     this.title = title;
/*  68 */     this.totalStages = totalStages;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getCompletedStage()
/*     */   {
/*  80 */     return this.completedStage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCompletedStage(String value)
/*     */   {
/*  92 */     this.completedStage = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointTimeStamp getEta()
/*     */   {
/* 104 */     return this.eta;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEta(RecoverPointTimeStamp value)
/*     */   {
/* 116 */     this.eta = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Integer getProgressPercentage()
/*     */   {
/* 128 */     return this.progressPercentage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProgressPercentage(Integer value)
/*     */   {
/* 140 */     this.progressPercentage = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Integer getStage()
/*     */   {
/* 152 */     return this.stage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStage(Integer value)
/*     */   {
/* 164 */     this.stage = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ExecutionState getState()
/*     */   {
/* 176 */     return this.state;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setState(ExecutionState value)
/*     */   {
/* 188 */     this.state = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getTitle()
/*     */   {
/* 200 */     return this.title;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTitle(String value)
/*     */   {
/* 212 */     this.title = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Integer getTotalStages()
/*     */   {
/* 224 */     return this.totalStages;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTotalStages(Integer value)
/*     */   {
/* 236 */     this.totalStages = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 246 */     if (!(obj instanceof TransactionStatus)) {
/* 247 */       return false;
/*     */     }
/* 249 */     TransactionStatus otherObj = (TransactionStatus)obj;
/*     */     
/* 251 */     return (this.completedStage != null ? this.completedStage.equals(otherObj.completedStage) : this.completedStage == otherObj.completedStage) && (this.eta != null ? this.eta.equals(otherObj.eta) : this.eta == otherObj.eta) && (this.progressPercentage != null ? this.progressPercentage.equals(otherObj.progressPercentage) : this.progressPercentage == otherObj.progressPercentage) && (this.stage != null ? this.stage.equals(otherObj.stage) : this.stage == otherObj.stage) && (this.state != null ? this.state.equals(otherObj.state) : this.state == otherObj.state) && (this.title != null ? this.title.equals(otherObj.title) : this.title == otherObj.title) && (this.totalStages != null ? this.totalStages.equals(otherObj.totalStages) : this.totalStages == otherObj.totalStages);
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
/*     */   public int hashCode()
/*     */   {
/* 266 */     return (this.completedStage != null ? this.completedStage.hashCode() : 0) ^ (this.eta != null ? this.eta.hashCode() : 0) ^ (this.progressPercentage != null ? this.progressPercentage.hashCode() : 0) ^ (this.stage != null ? this.stage.hashCode() : 0) ^ (this.state != null ? this.state.hashCode() : 0) ^ (this.title != null ? this.title.hashCode() : 0) ^ (this.totalStages != null ? this.totalStages.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 281 */     return "TransactionStatus [completedStage=" + this.completedStage + ", " + "eta=" + this.eta + ", " + "progressPercentage=" + this.progressPercentage + ", " + "stage=" + this.stage + ", " + "state=" + this.state + ", " + "title=" + this.title + ", " + "totalStages=" + this.totalStages + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\TransactionStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */