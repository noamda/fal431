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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupSetProblems", propOrder={"errorMessage", "illegalGroups"})
/*     */ public class ConsistencyGroupSetProblems
/*     */ {
/*     */   protected String errorMessage;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupUID> illegalGroups;
/*     */   
/*     */   public ConsistencyGroupSetProblems() {}
/*     */   
/*     */   public ConsistencyGroupSetProblems(String errorMessage, List<ConsistencyGroupUID> illegalGroups)
/*     */   {
/*  51 */     this.errorMessage = errorMessage;
/*  52 */     this.illegalGroups = illegalGroups;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getErrorMessage()
/*     */   {
/*  64 */     return this.errorMessage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setErrorMessage(String value)
/*     */   {
/*  76 */     this.errorMessage = value;
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
/*     */   public List<ConsistencyGroupUID> getIllegalGroups()
/*     */   {
/* 102 */     if (this.illegalGroups == null) {
/* 103 */       this.illegalGroups = new ArrayList();
/*     */     }
/* 105 */     return this.illegalGroups;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 115 */     if (!(obj instanceof ConsistencyGroupSetProblems)) {
/* 116 */       return false;
/*     */     }
/* 118 */     ConsistencyGroupSetProblems otherObj = (ConsistencyGroupSetProblems)obj;
/*     */     
/* 120 */     return (this.errorMessage != null ? this.errorMessage.equals(otherObj.errorMessage) : this.errorMessage == otherObj.errorMessage) && (this.illegalGroups != null ? this.illegalGroups.equals(otherObj.illegalGroups) : this.illegalGroups == otherObj.illegalGroups);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 130 */     return (this.errorMessage != null ? this.errorMessage.hashCode() : 0) ^ (this.illegalGroups != null ? this.illegalGroups.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 140 */     return "ConsistencyGroupSetProblems [errorMessage=" + this.errorMessage + ", " + "illegalGroups=" + this.illegalGroups + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupSetProblems.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */