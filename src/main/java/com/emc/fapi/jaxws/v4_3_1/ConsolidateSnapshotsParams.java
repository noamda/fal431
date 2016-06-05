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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="consolidateSnapshotsParams", propOrder={"end", "start"})
/*     */ public class ConsolidateSnapshotsParams
/*     */ {
/*     */   protected Snapshot end;
/*     */   protected Snapshot start;
/*     */   
/*     */   public ConsolidateSnapshotsParams() {}
/*     */   
/*     */   public ConsolidateSnapshotsParams(Snapshot end, Snapshot start)
/*     */   {
/*  54 */     this.end = end;
/*  55 */     this.start = start;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Snapshot getEnd()
/*     */   {
/*  67 */     return this.end;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEnd(Snapshot value)
/*     */   {
/*  79 */     this.end = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Snapshot getStart()
/*     */   {
/*  91 */     return this.start;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStart(Snapshot value)
/*     */   {
/* 103 */     this.start = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 113 */     if (!(obj instanceof ConsolidateSnapshotsParams)) {
/* 114 */       return false;
/*     */     }
/* 116 */     ConsolidateSnapshotsParams otherObj = (ConsolidateSnapshotsParams)obj;
/*     */     
/* 118 */     return (this.end != null ? this.end.equals(otherObj.end) : this.end == otherObj.end) && (this.start != null ? this.start.equals(otherObj.start) : this.start == otherObj.start);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.end != null ? this.end.hashCode() : 0) ^ (this.start != null ? this.start.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "ConsolidateSnapshotsParams [end=" + this.end + ", " + "start=" + this.start + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsolidateSnapshotsParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */