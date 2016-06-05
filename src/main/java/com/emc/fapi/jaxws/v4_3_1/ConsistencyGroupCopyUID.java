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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupCopyUID", propOrder={"groupUID", "globalCopyUID"})
/*     */ public class ConsistencyGroupCopyUID
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupUID groupUID;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected GlobalCopyUID globalCopyUID;
/*     */   
/*     */   public ConsistencyGroupCopyUID() {}
/*     */   
/*     */   public ConsistencyGroupCopyUID(ConsistencyGroupUID groupUID, GlobalCopyUID globalCopyUID)
/*     */   {
/*  50 */     this.groupUID = groupUID;
/*  51 */     this.globalCopyUID = globalCopyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupUID getGroupUID()
/*     */   {
/*  63 */     return this.groupUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupUID(ConsistencyGroupUID value)
/*     */   {
/*  75 */     this.groupUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GlobalCopyUID getGlobalCopyUID()
/*     */   {
/*  87 */     return this.globalCopyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGlobalCopyUID(GlobalCopyUID value)
/*     */   {
/*  99 */     this.globalCopyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof ConsistencyGroupCopyUID)) {
/* 110 */       return false;
/*     */     }
/* 112 */     ConsistencyGroupCopyUID otherObj = (ConsistencyGroupCopyUID)obj;
/*     */     
/* 114 */     return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.globalCopyUID != null ? this.globalCopyUID.equals(otherObj.globalCopyUID) : this.globalCopyUID == otherObj.globalCopyUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.globalCopyUID != null ? this.globalCopyUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "ConsistencyGroupCopyUID [groupUID=" + this.groupUID + ", " + "globalCopyUID=" + this.globalCopyUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupCopyUID.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */