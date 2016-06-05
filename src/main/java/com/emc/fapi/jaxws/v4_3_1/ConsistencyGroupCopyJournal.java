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
/*     */ @XmlType(name="ConsistencyGroupCopyJournal", propOrder={"grossJournalSize", "journalVolumes"})
/*     */ public class ConsistencyGroupCopyJournal
/*     */ {
/*     */   protected long grossJournalSize;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<JournalVolumeSettings> journalVolumes;
/*     */   
/*     */   public ConsistencyGroupCopyJournal() {}
/*     */   
/*     */   public ConsistencyGroupCopyJournal(long grossJournalSize, List<JournalVolumeSettings> journalVolumes)
/*     */   {
/*  51 */     this.grossJournalSize = grossJournalSize;
/*  52 */     this.journalVolumes = journalVolumes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getGrossJournalSize()
/*     */   {
/*  60 */     return this.grossJournalSize;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGrossJournalSize(long value)
/*     */   {
/*  68 */     this.grossJournalSize = value;
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
/*     */   public List<JournalVolumeSettings> getJournalVolumes()
/*     */   {
/*  94 */     if (this.journalVolumes == null) {
/*  95 */       this.journalVolumes = new ArrayList();
/*     */     }
/*  97 */     return this.journalVolumes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 107 */     if (!(obj instanceof ConsistencyGroupCopyJournal)) {
/* 108 */       return false;
/*     */     }
/* 110 */     ConsistencyGroupCopyJournal otherObj = (ConsistencyGroupCopyJournal)obj;
/*     */     
/* 112 */     return (this.grossJournalSize == otherObj.grossJournalSize) && (this.journalVolumes != null ? this.journalVolumes.equals(otherObj.journalVolumes) : this.journalVolumes == otherObj.journalVolumes);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 122 */     return (int)this.grossJournalSize ^ (this.journalVolumes != null ? this.journalVolumes.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 132 */     return "ConsistencyGroupCopyJournal [grossJournalSize=" + this.grossJournalSize + ", " + "journalVolumes=" + this.journalVolumes + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupCopyJournal.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */