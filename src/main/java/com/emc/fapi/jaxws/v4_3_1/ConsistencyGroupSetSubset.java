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
/*     */ @XmlType(name="ConsistencyGroupSetSubset", propOrder={"groupSetUID", "groupsToExclude"})
/*     */ public class ConsistencyGroupSetSubset
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupSetUID groupSetUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupUID> groupsToExclude;
/*     */   
/*     */   public ConsistencyGroupSetSubset() {}
/*     */   
/*     */   public ConsistencyGroupSetSubset(ConsistencyGroupSetUID groupSetUID, List<ConsistencyGroupUID> groupsToExclude)
/*     */   {
/*  52 */     this.groupSetUID = groupSetUID;
/*  53 */     this.groupsToExclude = groupsToExclude;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupSetUID getGroupSetUID()
/*     */   {
/*  65 */     return this.groupSetUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupSetUID(ConsistencyGroupSetUID value)
/*     */   {
/*  77 */     this.groupSetUID = value;
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
/* 103 */     if (this.groupsToExclude == null) {
/* 104 */       this.groupsToExclude = new ArrayList();
/*     */     }
/* 106 */     return this.groupsToExclude;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 116 */     if (!(obj instanceof ConsistencyGroupSetSubset)) {
/* 117 */       return false;
/*     */     }
/* 119 */     ConsistencyGroupSetSubset otherObj = (ConsistencyGroupSetSubset)obj;
/*     */     
/* 121 */     return (this.groupSetUID != null ? this.groupSetUID.equals(otherObj.groupSetUID) : this.groupSetUID == otherObj.groupSetUID) && (this.groupsToExclude != null ? this.groupsToExclude.equals(otherObj.groupsToExclude) : this.groupsToExclude == otherObj.groupsToExclude);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 131 */     return (this.groupSetUID != null ? this.groupSetUID.hashCode() : 0) ^ (this.groupsToExclude != null ? this.groupsToExclude.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 141 */     return "ConsistencyGroupSetSubset [groupSetUID=" + this.groupSetUID + ", " + "groupsToExclude=" + this.groupsToExclude + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupSetSubset.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */