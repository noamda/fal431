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
/*     */ @XmlType(name="AccountState", propOrder={"licensesState"})
/*     */ public class AccountState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<LicenseState> licensesState;
/*     */   
/*     */   public AccountState() {}
/*     */   
/*     */   public AccountState(List<LicenseState> licensesState)
/*     */   {
/*  48 */     this.licensesState = licensesState;
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
/*     */   public List<LicenseState> getLicensesState()
/*     */   {
/*  74 */     if (this.licensesState == null) {
/*  75 */       this.licensesState = new ArrayList();
/*     */     }
/*  77 */     return this.licensesState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof AccountState)) {
/*  88 */       return false;
/*     */     }
/*  90 */     AccountState otherObj = (AccountState)obj;
/*     */     
/*  92 */     return this.licensesState == otherObj.licensesState ? true : this.licensesState != null ? this.licensesState.equals(otherObj.licensesState) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.licensesState != null ? this.licensesState.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "AccountState [licensesState=" + this.licensesState + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AccountState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */