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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupCopyRoleInfo", propOrder={"role", "sourceCopyUID"})
/*     */ public class ConsistencyGroupCopyRoleInfo
/*     */ {
/*     */   protected ConsistencyGroupCopyRole role;
/*     */   protected ConsistencyGroupCopyUID sourceCopyUID;
/*     */   
/*     */   public ConsistencyGroupCopyRoleInfo() {}
/*     */   
/*     */   public ConsistencyGroupCopyRoleInfo(ConsistencyGroupCopyRole role, ConsistencyGroupCopyUID sourceCopyUID)
/*     */   {
/*  47 */     this.role = role;
/*  48 */     this.sourceCopyUID = sourceCopyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyRole getRole()
/*     */   {
/*  60 */     return this.role;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRole(ConsistencyGroupCopyRole value)
/*     */   {
/*  72 */     this.role = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getSourceCopyUID()
/*     */   {
/*  84 */     return this.sourceCopyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSourceCopyUID(ConsistencyGroupCopyUID value)
/*     */   {
/*  96 */     this.sourceCopyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof ConsistencyGroupCopyRoleInfo)) {
/* 107 */       return false;
/*     */     }
/* 109 */     ConsistencyGroupCopyRoleInfo otherObj = (ConsistencyGroupCopyRoleInfo)obj;
/*     */     
/* 111 */     return (this.role != null ? this.role.equals(otherObj.role) : this.role == otherObj.role) && (this.sourceCopyUID != null ? this.sourceCopyUID.equals(otherObj.sourceCopyUID) : this.sourceCopyUID == otherObj.sourceCopyUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.role != null ? this.role.hashCode() : 0) ^ (this.sourceCopyUID != null ? this.sourceCopyUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "ConsistencyGroupCopyRoleInfo [role=" + this.role + ", " + "sourceCopyUID=" + this.sourceCopyUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupCopyRoleInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */