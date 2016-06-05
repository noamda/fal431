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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="createBookmarkForGroupSetSubset", propOrder={"groupSetSubset", "bookmarkName", "consolidationPolicy", "consistencyType"})
/*     */ public class CreateBookmarkForGroupSetSubset
/*     */ {
/*     */   protected ConsistencyGroupSetSubset groupSetSubset;
/*     */   protected String bookmarkName;
/*     */   protected BookmarkConsolidationPolicy consolidationPolicy;
/*     */   protected SnapshotConsistencyType consistencyType;
/*     */   
/*     */   public CreateBookmarkForGroupSetSubset() {}
/*     */   
/*     */   public CreateBookmarkForGroupSetSubset(ConsistencyGroupSetSubset groupSetSubset, String bookmarkName, BookmarkConsolidationPolicy consolidationPolicy, SnapshotConsistencyType consistencyType)
/*     */   {
/*  53 */     this.groupSetSubset = groupSetSubset;
/*  54 */     this.bookmarkName = bookmarkName;
/*  55 */     this.consolidationPolicy = consolidationPolicy;
/*  56 */     this.consistencyType = consistencyType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupSetSubset getGroupSetSubset()
/*     */   {
/*  68 */     return this.groupSetSubset;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupSetSubset(ConsistencyGroupSetSubset value)
/*     */   {
/*  80 */     this.groupSetSubset = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getBookmarkName()
/*     */   {
/*  92 */     return this.bookmarkName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setBookmarkName(String value)
/*     */   {
/* 104 */     this.bookmarkName = value;
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
/* 116 */     return this.consolidationPolicy;
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
/* 128 */     this.consolidationPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SnapshotConsistencyType getConsistencyType()
/*     */   {
/* 140 */     return this.consistencyType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConsistencyType(SnapshotConsistencyType value)
/*     */   {
/* 152 */     this.consistencyType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 162 */     if (!(obj instanceof CreateBookmarkForGroupSetSubset)) {
/* 163 */       return false;
/*     */     }
/* 165 */     CreateBookmarkForGroupSetSubset otherObj = (CreateBookmarkForGroupSetSubset)obj;
/*     */     
/* 167 */     return (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset) && (this.bookmarkName != null ? this.bookmarkName.equals(otherObj.bookmarkName) : this.bookmarkName == otherObj.bookmarkName) && (this.consolidationPolicy != null ? this.consolidationPolicy.equals(otherObj.consolidationPolicy) : this.consolidationPolicy == otherObj.consolidationPolicy) && (this.consistencyType != null ? this.consistencyType.equals(otherObj.consistencyType) : this.consistencyType == otherObj.consistencyType);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 179 */     return (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0) ^ (this.bookmarkName != null ? this.bookmarkName.hashCode() : 0) ^ (this.consolidationPolicy != null ? this.consolidationPolicy.hashCode() : 0) ^ (this.consistencyType != null ? this.consistencyType.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 191 */     return "CreateBookmarkForGroupSetSubset [groupSetSubset=" + this.groupSetSubset + ", " + "bookmarkName=" + this.bookmarkName + ", " + "consolidationPolicy=" + this.consolidationPolicy + ", " + "consistencyType=" + this.consistencyType + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CreateBookmarkForGroupSetSubset.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */