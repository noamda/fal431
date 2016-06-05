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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SystemStatus", propOrder={"problems"})
/*     */ public class SystemStatus
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ProblemDescription> problems;
/*     */   
/*     */   public SystemStatus() {}
/*     */   
/*     */   public SystemStatus(List<ProblemDescription> problems)
/*     */   {
/*  48 */     this.problems = problems;
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
/*     */   public List<ProblemDescription> getProblems()
/*     */   {
/*  74 */     if (this.problems == null) {
/*  75 */       this.problems = new ArrayList();
/*     */     }
/*  77 */     return this.problems;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof SystemStatus)) {
/*  88 */       return false;
/*     */     }
/*  90 */     SystemStatus otherObj = (SystemStatus)obj;
/*     */     
/*  92 */     return this.problems == otherObj.problems ? true : this.problems != null ? this.problems.equals(otherObj.problems) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.problems != null ? this.problems.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "SystemStatus [problems=" + this.problems + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SystemStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */