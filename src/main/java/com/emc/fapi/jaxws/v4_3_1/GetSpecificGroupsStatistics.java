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
/*     */ @XmlType(name="getSpecificGroupsStatistics", propOrder={"groups"})
/*     */ public class GetSpecificGroupsStatistics
/*     */ {
/*     */   protected List<ConsistencyGroupUID> groups;
/*     */   
/*     */   public GetSpecificGroupsStatistics() {}
/*     */   
/*     */   public GetSpecificGroupsStatistics(List<ConsistencyGroupUID> groups)
/*     */   {
/*  46 */     this.groups = groups;
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
/*  72 */     if (this.groups == null) {
/*  73 */       this.groups = new ArrayList();
/*     */     }
/*  75 */     return this.groups;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  85 */     if (!(obj instanceof GetSpecificGroupsStatistics)) {
/*  86 */       return false;
/*     */     }
/*  88 */     GetSpecificGroupsStatistics otherObj = (GetSpecificGroupsStatistics)obj;
/*     */     
/*  90 */     return this.groups == otherObj.groups ? true : this.groups != null ? this.groups.equals(otherObj.groups) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  99 */     return this.groups != null ? this.groups.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 108 */     return "GetSpecificGroupsStatistics [groups=" + this.groups + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetSpecificGroupsStatistics.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */