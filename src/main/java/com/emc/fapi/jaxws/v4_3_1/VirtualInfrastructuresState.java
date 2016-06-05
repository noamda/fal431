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
/*     */ @XmlType(name="VirtualInfrastructuresState", propOrder={"vmsState"})
/*     */ public class VirtualInfrastructuresState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VmState> vmsState;
/*     */   
/*     */   public VirtualInfrastructuresState() {}
/*     */   
/*     */   public VirtualInfrastructuresState(List<VmState> vmsState)
/*     */   {
/*  48 */     this.vmsState = vmsState;
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
/*     */   public List<VmState> getVmsState()
/*     */   {
/*  74 */     if (this.vmsState == null) {
/*  75 */       this.vmsState = new ArrayList();
/*     */     }
/*  77 */     return this.vmsState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof VirtualInfrastructuresState)) {
/*  88 */       return false;
/*     */     }
/*  90 */     VirtualInfrastructuresState otherObj = (VirtualInfrastructuresState)obj;
/*     */     
/*  92 */     return this.vmsState == otherObj.vmsState ? true : this.vmsState != null ? this.vmsState.equals(otherObj.vmsState) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.vmsState != null ? this.vmsState.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "VirtualInfrastructuresState [vmsState=" + this.vmsState + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VirtualInfrastructuresState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */