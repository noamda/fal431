/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="setBookmarkConsolidationPolicy", propOrder={"groupCopy", "snapshot", "consolidationPolicy"})
/*     */ public class SetBookmarkConsolidationPolicy
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopy;
/*     */   @XmlElement(nillable=true)
/*     */   protected Snapshot snapshot;
/*     */   protected BookmarkConsolidationPolicy consolidationPolicy;
/*     */   
/*     */   public SetBookmarkConsolidationPolicy() {}
/*     */   
/*     */   public SetBookmarkConsolidationPolicy(ConsistencyGroupCopyUID groupCopy, Snapshot snapshot, BookmarkConsolidationPolicy consolidationPolicy)
/*     */   {
/*  52 */     this.groupCopy = groupCopy;
/*  53 */     this.snapshot = snapshot;
/*  54 */     this.consolidationPolicy = consolidationPolicy;
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
/*  66 */     return this.groupCopy;
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
/*  78 */     this.groupCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Snapshot getSnapshot()
/*     */   {
/*  90 */     return this.snapshot;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSnapshot(Snapshot value)
/*     */   {
/* 102 */     this.snapshot = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public BookmarkConsolidationPolicy getConsolidationPolicy()
/*     */   {
/* 114 */     return this.consolidationPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConsolidationPolicy(BookmarkConsolidationPolicy value)
/*     */   {
/* 126 */     this.consolidationPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 136 */     if (!(obj instanceof SetBookmarkConsolidationPolicy)) {
/* 137 */       return false;
/*     */     }
/* 139 */     SetBookmarkConsolidationPolicy otherObj = (SetBookmarkConsolidationPolicy)obj;
/*     */     
/* 141 */     return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.snapshot != null ? this.snapshot.equals(otherObj.snapshot) : this.snapshot == otherObj.snapshot) && (this.consolidationPolicy != null ? this.consolidationPolicy.equals(otherObj.consolidationPolicy) : this.consolidationPolicy == otherObj.consolidationPolicy);
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
/* 152 */     return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.snapshot != null ? this.snapshot.hashCode() : 0) ^ (this.consolidationPolicy != null ? this.consolidationPolicy.hashCode() : 0);
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
/* 163 */     return "SetBookmarkConsolidationPolicy [groupCopy=" + this.groupCopy + ", " + "snapshot=" + this.snapshot + ", " + "consolidationPolicy=" + this.consolidationPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetBookmarkConsolidationPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */