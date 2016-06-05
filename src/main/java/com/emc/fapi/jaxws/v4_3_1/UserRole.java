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
/*     */ @XmlType(name="UserRole", propOrder={"roleName", "permissions"})
/*     */ public class UserRole
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected String roleName;
/*     */   @XmlElement(required=true)
/*     */   protected List<Permission> permissions;
/*     */   
/*     */   public UserRole() {}
/*     */   
/*     */   public UserRole(String roleName, List<Permission> permissions)
/*     */   {
/*  52 */     this.roleName = roleName;
/*  53 */     this.permissions = permissions;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getRoleName()
/*     */   {
/*  65 */     return this.roleName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRoleName(String value)
/*     */   {
/*  77 */     this.roleName = value;
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
/*     */   public List<Permission> getPermissions()
/*     */   {
/* 103 */     if (this.permissions == null) {
/* 104 */       this.permissions = new ArrayList();
/*     */     }
/* 106 */     return this.permissions;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 116 */     if (!(obj instanceof UserRole)) {
/* 117 */       return false;
/*     */     }
/* 119 */     UserRole otherObj = (UserRole)obj;
/*     */     
/* 121 */     return (this.roleName != null ? this.roleName.equals(otherObj.roleName) : this.roleName == otherObj.roleName) && (this.permissions != null ? this.permissions.equals(otherObj.permissions) : this.permissions == otherObj.permissions);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 131 */     return (this.roleName != null ? this.roleName.hashCode() : 0) ^ (this.permissions != null ? this.permissions.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 141 */     return "UserRole [roleName=" + this.roleName + ", " + "permissions=" + this.permissions + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\UserRole.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */