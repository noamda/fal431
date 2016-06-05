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
/*     */ 
/*     */ 
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
/*     */ @XmlType(name="createBookmarkParams", propOrder={"bookmarkName", "consistencyType", "consolidationPolicy", "groups"})
/*     */ public class CreateBookmarkParams
/*     */ {
/*     */   protected String bookmarkName;
/*     */   protected SnapshotConsistencyType consistencyType;
/*     */   protected BookmarkConsolidationPolicy consolidationPolicy;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupUID> groups;
/*     */   
/*     */   public CreateBookmarkParams() {}
/*     */   
/*     */   public CreateBookmarkParams(String bookmarkName, SnapshotConsistencyType consistencyType, BookmarkConsolidationPolicy consolidationPolicy, List<ConsistencyGroupUID> groups)
/*     */   {
/*  64 */     this.bookmarkName = bookmarkName;
/*  65 */     this.consistencyType = consistencyType;
/*  66 */     this.consolidationPolicy = consolidationPolicy;
/*  67 */     this.groups = groups;
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
/*  79 */     return this.bookmarkName;
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
/*  91 */     this.bookmarkName = value;
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
/* 103 */     return this.consistencyType;
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
/* 115 */     this.consistencyType = value;
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
/* 127 */     return this.consolidationPolicy;
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
/* 139 */     this.consolidationPolicy = value;
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
/* 165 */     if (this.groups == null) {
/* 166 */       this.groups = new ArrayList();
/*     */     }
/* 168 */     return this.groups;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 178 */     if (!(obj instanceof CreateBookmarkParams)) {
/* 179 */       return false;
/*     */     }
/* 181 */     CreateBookmarkParams otherObj = (CreateBookmarkParams)obj;
/*     */     
/* 183 */     return (this.bookmarkName != null ? this.bookmarkName.equals(otherObj.bookmarkName) : this.bookmarkName == otherObj.bookmarkName) && (this.consistencyType != null ? this.consistencyType.equals(otherObj.consistencyType) : this.consistencyType == otherObj.consistencyType) && (this.consolidationPolicy != null ? this.consolidationPolicy.equals(otherObj.consolidationPolicy) : this.consolidationPolicy == otherObj.consolidationPolicy) && (this.groups != null ? this.groups.equals(otherObj.groups) : this.groups == otherObj.groups);
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
/* 195 */     return (this.bookmarkName != null ? this.bookmarkName.hashCode() : 0) ^ (this.consistencyType != null ? this.consistencyType.hashCode() : 0) ^ (this.consolidationPolicy != null ? this.consolidationPolicy.hashCode() : 0) ^ (this.groups != null ? this.groups.hashCode() : 0);
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
/* 207 */     return "CreateBookmarkParams [bookmarkName=" + this.bookmarkName + ", " + "consistencyType=" + this.consistencyType + ", " + "consolidationPolicy=" + this.consolidationPolicy + ", " + "groups=" + this.groups + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CreateBookmarkParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */