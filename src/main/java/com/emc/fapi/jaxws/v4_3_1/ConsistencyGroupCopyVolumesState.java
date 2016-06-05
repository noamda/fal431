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
/*     */ @XmlType(name="ConsistencyGroupCopyVolumesState", propOrder={"copyUID", "journalsState"})
/*     */ public class ConsistencyGroupCopyVolumesState
/*     */ {
/*     */   protected ConsistencyGroupCopyUID copyUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<JournalVolumeState> journalsState;
/*     */   
/*     */   public ConsistencyGroupCopyVolumesState() {}
/*     */   
/*     */   public ConsistencyGroupCopyVolumesState(ConsistencyGroupCopyUID copyUID, List<JournalVolumeState> journalsState)
/*     */   {
/*  51 */     this.copyUID = copyUID;
/*  52 */     this.journalsState = journalsState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getCopyUID()
/*     */   {
/*  64 */     return this.copyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCopyUID(ConsistencyGroupCopyUID value)
/*     */   {
/*  76 */     this.copyUID = value;
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
/*     */   public List<JournalVolumeState> getJournalsState()
/*     */   {
/* 102 */     if (this.journalsState == null) {
/* 103 */       this.journalsState = new ArrayList();
/*     */     }
/* 105 */     return this.journalsState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 115 */     if (!(obj instanceof ConsistencyGroupCopyVolumesState)) {
/* 116 */       return false;
/*     */     }
/* 118 */     ConsistencyGroupCopyVolumesState otherObj = (ConsistencyGroupCopyVolumesState)obj;
/*     */     
/* 120 */     return (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.journalsState != null ? this.journalsState.equals(otherObj.journalsState) : this.journalsState == otherObj.journalsState);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 130 */     return (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.journalsState != null ? this.journalsState.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 140 */     return "ConsistencyGroupCopyVolumesState [copyUID=" + this.copyUID + ", " + "journalsState=" + this.journalsState + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupCopyVolumesState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */