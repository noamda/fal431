/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="createBookmark", propOrder={"groups", "bookmarkName", "consolidationPolicy", "consistencyType"})
/*     */ public class CreateBookmark
/*     */ {
/*     */   protected List<ConsistencyGroupUID> groups;
/*     */   protected String bookmarkName;
/*     */   protected BookmarkConsolidationPolicy consolidationPolicy;
/*     */   protected SnapshotConsistencyType consistencyType;
/*     */   
/*     */   public CreateBookmark() {}
/*     */   
/*     */   public CreateBookmark(List<ConsistencyGroupUID> groups, String bookmarkName, BookmarkConsolidationPolicy consolidationPolicy, SnapshotConsistencyType consistencyType)
/*     */   {
/*  55 */     this.groups = groups;
/*  56 */     this.bookmarkName = bookmarkName;
/*  57 */     this.consolidationPolicy = consolidationPolicy;
/*  58 */     this.consistencyType = consistencyType;
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
/*     */   public List<ConsistencyGroupUID> getGroups()
/*     */   {
/*  84 */     if (this.groups == null) {
/*  85 */       this.groups = new ArrayList();
/*     */     }
/*  87 */     return this.groups;
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
/*  99 */     return this.bookmarkName;
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
/* 111 */     this.bookmarkName = value;
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
/*     */   public SnapshotConsistencyType getConsistencyType()
/*     */   {
/* 147 */     return this.consistencyType;
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
/* 159 */     this.consistencyType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 169 */     if (!(obj instanceof CreateBookmark)) {
/* 170 */       return false;
/*     */     }
/* 172 */     CreateBookmark otherObj = (CreateBookmark)obj;
/*     */     
/* 174 */     return (this.groups != null ? this.groups.equals(otherObj.groups) : this.groups == otherObj.groups) && (this.bookmarkName != null ? this.bookmarkName.equals(otherObj.bookmarkName) : this.bookmarkName == otherObj.bookmarkName) && (this.consolidationPolicy != null ? this.consolidationPolicy.equals(otherObj.consolidationPolicy) : this.consolidationPolicy == otherObj.consolidationPolicy) && (this.consistencyType != null ? this.consistencyType.equals(otherObj.consistencyType) : this.consistencyType == otherObj.consistencyType);
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
/* 186 */     return (this.groups != null ? this.groups.hashCode() : 0) ^ (this.bookmarkName != null ? this.bookmarkName.hashCode() : 0) ^ (this.consolidationPolicy != null ? this.consolidationPolicy.hashCode() : 0) ^ (this.consistencyType != null ? this.consistencyType.hashCode() : 0);
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
/* 198 */     return "CreateBookmark [groups=" + this.groups + ", " + "bookmarkName=" + this.bookmarkName + ", " + "consolidationPolicy=" + this.consolidationPolicy + ", " + "consistencyType=" + this.consistencyType + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CreateBookmark.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */