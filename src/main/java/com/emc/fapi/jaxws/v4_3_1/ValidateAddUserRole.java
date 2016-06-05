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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="validateAddUserRole", propOrder={"role"})
/*     */ public class ValidateAddUserRole
/*     */ {
/*     */   protected UserRole role;
/*     */   
/*     */   public ValidateAddUserRole() {}
/*     */   
/*     */   public ValidateAddUserRole(UserRole role)
/*     */   {
/*  44 */     this.role = role;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public UserRole getRole()
/*     */   {
/*  56 */     return this.role;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRole(UserRole value)
/*     */   {
/*  68 */     this.role = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof ValidateAddUserRole)) {
/*  79 */       return false;
/*     */     }
/*  81 */     ValidateAddUserRole otherObj = (ValidateAddUserRole)obj;
/*     */     
/*  83 */     return this.role == otherObj.role ? true : this.role != null ? this.role.equals(otherObj.role) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.role != null ? this.role.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "ValidateAddUserRole [role=" + this.role + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateAddUserRole.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */