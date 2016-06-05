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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="createBookmarkForGroupSetSubSetParams", propOrder={"bookmarkName", "consistencyType", "consolidationPolicy", "groupSetSubset"})
/*     */ public class CreateBookmarkForGroupSetSubSetParams
/*     */ {
/*     */   protected String bookmarkName;
/*     */   protected SnapshotConsistencyType consistencyType;
/*     */   protected BookmarkConsolidationPolicy consolidationPolicy;
/*     */   protected ConsistencyGroupSetSubset groupSetSubset;
/*     */   
/*     */   public CreateBookmarkForGroupSetSubSetParams() {}
/*     */   
/*     */   public CreateBookmarkForGroupSetSubSetParams(String bookmarkName, SnapshotConsistencyType consistencyType, BookmarkConsolidationPolicy consolidationPolicy, ConsistencyGroupSetSubset groupSetSubset)
/*     */   {
/*  60 */     this.bookmarkName = bookmarkName;
/*  61 */     this.consistencyType = consistencyType;
/*  62 */     this.consolidationPolicy = consolidationPolicy;
/*  63 */     this.groupSetSubset = groupSetSubset;
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
/*  75 */     return this.bookmarkName;
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
/*  87 */     this.bookmarkName = value;
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
/*  99 */     return this.consistencyType;
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
/* 111 */     this.consistencyType = value;
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
/* 123 */     return this.consolidationPolicy;
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
/* 135 */     this.consolidationPolicy = value;
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
/* 147 */     return this.groupSetSubset;
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
/* 159 */     this.groupSetSubset = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 169 */     if (!(obj instanceof CreateBookmarkForGroupSetSubSetParams)) {
/* 170 */       return false;
/*     */     }
/* 172 */     CreateBookmarkForGroupSetSubSetParams otherObj = (CreateBookmarkForGroupSetSubSetParams)obj;
/*     */     
/* 174 */     return (this.bookmarkName != null ? this.bookmarkName.equals(otherObj.bookmarkName) : this.bookmarkName == otherObj.bookmarkName) && (this.consistencyType != null ? this.consistencyType.equals(otherObj.consistencyType) : this.consistencyType == otherObj.consistencyType) && (this.consolidationPolicy != null ? this.consolidationPolicy.equals(otherObj.consolidationPolicy) : this.consolidationPolicy == otherObj.consolidationPolicy) && (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset);
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
/* 186 */     return (this.bookmarkName != null ? this.bookmarkName.hashCode() : 0) ^ (this.consistencyType != null ? this.consistencyType.hashCode() : 0) ^ (this.consolidationPolicy != null ? this.consolidationPolicy.hashCode() : 0) ^ (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0);
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
/* 198 */     return "CreateBookmarkForGroupSetSubSetParams [bookmarkName=" + this.bookmarkName + ", " + "consistencyType=" + this.consistencyType + ", " + "consolidationPolicy=" + this.consolidationPolicy + ", " + "groupSetSubset=" + this.groupSetSubset + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CreateBookmarkForGroupSetSubSetParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */