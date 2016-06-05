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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getBalanceLoadRecommendationWithGroupsToExclude", propOrder={"groupsToExclude"})
/*     */ public class GetBalanceLoadRecommendationWithGroupsToExclude
/*     */ {
/*     */   protected List<ConsistencyGroupUID> groupsToExclude;
/*     */   
/*     */   public GetBalanceLoadRecommendationWithGroupsToExclude() {}
/*     */   
/*     */   public GetBalanceLoadRecommendationWithGroupsToExclude(List<ConsistencyGroupUID> groupsToExclude)
/*     */   {
/*  46 */     this.groupsToExclude = groupsToExclude;
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
/*     */   public List<ConsistencyGroupUID> getGroupsToExclude()
/*     */   {
/*  72 */     if (this.groupsToExclude == null) {
/*  73 */       this.groupsToExclude = new ArrayList();
/*     */     }
/*  75 */     return this.groupsToExclude;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  85 */     if (!(obj instanceof GetBalanceLoadRecommendationWithGroupsToExclude)) {
/*  86 */       return false;
/*     */     }
/*  88 */     GetBalanceLoadRecommendationWithGroupsToExclude otherObj = (GetBalanceLoadRecommendationWithGroupsToExclude)obj;
/*     */     
/*  90 */     return this.groupsToExclude == otherObj.groupsToExclude ? true : this.groupsToExclude != null ? this.groupsToExclude.equals(otherObj.groupsToExclude) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  99 */     return this.groupsToExclude != null ? this.groupsToExclude.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 108 */     return "GetBalanceLoadRecommendationWithGroupsToExclude [groupsToExclude=" + this.groupsToExclude + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetBalanceLoadRecommendationWithGroupsToExclude.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */