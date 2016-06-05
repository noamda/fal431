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
/*     */ @XmlType(name="TargetVmCandidates", propOrder={"targetVmCandidates"})
/*     */ public class TargetVmCandidates
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<TargetVmCandidate> targetVmCandidates;
/*     */   
/*     */   public TargetVmCandidates() {}
/*     */   
/*     */   public TargetVmCandidates(List<TargetVmCandidate> targetVmCandidates)
/*     */   {
/*  48 */     this.targetVmCandidates = targetVmCandidates;
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
/*     */   public List<TargetVmCandidate> getTargetVmCandidates()
/*     */   {
/*  74 */     if (this.targetVmCandidates == null) {
/*  75 */       this.targetVmCandidates = new ArrayList();
/*     */     }
/*  77 */     return this.targetVmCandidates;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof TargetVmCandidates)) {
/*  88 */       return false;
/*     */     }
/*  90 */     TargetVmCandidates otherObj = (TargetVmCandidates)obj;
/*     */     
/*  92 */     return this.targetVmCandidates == otherObj.targetVmCandidates ? true : this.targetVmCandidates != null ? this.targetVmCandidates.equals(otherObj.targetVmCandidates) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.targetVmCandidates != null ? this.targetVmCandidates.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "TargetVmCandidates [targetVmCandidates=" + this.targetVmCandidates + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\TargetVmCandidates.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */