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
/*     */ @XmlType(name="validateEditUserRole", propOrder={"oldRoleName", "newRole"})
/*     */ public class ValidateEditUserRole
/*     */ {
/*     */   protected String oldRoleName;
/*     */   protected UserRole newRole;
/*     */   
/*     */   public ValidateEditUserRole() {}
/*     */   
/*     */   public ValidateEditUserRole(String oldRoleName, UserRole newRole)
/*     */   {
/*  47 */     this.oldRoleName = oldRoleName;
/*  48 */     this.newRole = newRole;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getOldRoleName()
/*     */   {
/*  60 */     return this.oldRoleName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setOldRoleName(String value)
/*     */   {
/*  72 */     this.oldRoleName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public UserRole getNewRole()
/*     */   {
/*  84 */     return this.newRole;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNewRole(UserRole value)
/*     */   {
/*  96 */     this.newRole = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof ValidateEditUserRole)) {
/* 107 */       return false;
/*     */     }
/* 109 */     ValidateEditUserRole otherObj = (ValidateEditUserRole)obj;
/*     */     
/* 111 */     return (this.oldRoleName != null ? this.oldRoleName.equals(otherObj.oldRoleName) : this.oldRoleName == otherObj.oldRoleName) && (this.newRole != null ? this.newRole.equals(otherObj.newRole) : this.newRole == otherObj.newRole);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.oldRoleName != null ? this.oldRoleName.hashCode() : 0) ^ (this.newRole != null ? this.newRole.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "ValidateEditUserRole [oldRoleName=" + this.oldRoleName + ", " + "newRole=" + this.newRole + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateEditUserRole.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */