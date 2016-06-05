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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="validateConsolidateSnapshots", propOrder={"groupCopy", "start", "end"})
/*     */ public class ValidateConsolidateSnapshots
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopy;
/*     */   protected Snapshot start;
/*     */   protected Snapshot end;
/*     */   
/*     */   public ValidateConsolidateSnapshots() {}
/*     */   
/*     */   public ValidateConsolidateSnapshots(ConsistencyGroupCopyUID groupCopy, Snapshot start, Snapshot end)
/*     */   {
/*  50 */     this.groupCopy = groupCopy;
/*  51 */     this.start = start;
/*  52 */     this.end = end;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getGroupCopy()
/*     */   {
/*  64 */     return this.groupCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupCopy(ConsistencyGroupCopyUID value)
/*     */   {
/*  76 */     this.groupCopy = value;
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
/*  88 */     return this.start;
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
/* 100 */     this.start = value;
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
/* 112 */     return this.end;
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
/* 124 */     this.end = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 134 */     if (!(obj instanceof ValidateConsolidateSnapshots)) {
/* 135 */       return false;
/*     */     }
/* 137 */     ValidateConsolidateSnapshots otherObj = (ValidateConsolidateSnapshots)obj;
/*     */     
/* 139 */     return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.start != null ? this.start.equals(otherObj.start) : this.start == otherObj.start) && (this.end != null ? this.end.equals(otherObj.end) : this.end == otherObj.end);
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
/* 150 */     return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.start != null ? this.start.hashCode() : 0) ^ (this.end != null ? this.end.hashCode() : 0);
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
/* 161 */     return "ValidateConsolidateSnapshots [groupCopy=" + this.groupCopy + ", " + "start=" + this.start + ", " + "end=" + this.end + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateConsolidateSnapshots.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */