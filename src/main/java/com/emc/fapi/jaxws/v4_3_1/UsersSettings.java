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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="UsersSettings", propOrder={"usersRoles", "users", "ldapSettings"})
/*     */ public class UsersSettings
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected List<UserRole> usersRoles;
/*     */   @XmlElement(required=true)
/*     */   protected List<RecoverPointUser> users;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected LDAPSettings ldapSettings;
/*     */   
/*     */   public UsersSettings() {}
/*     */   
/*     */   public UsersSettings(List<UserRole> usersRoles, List<RecoverPointUser> users, LDAPSettings ldapSettings)
/*     */   {
/*  56 */     this.usersRoles = usersRoles;
/*  57 */     this.users = users;
/*  58 */     this.ldapSettings = ldapSettings;
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
/*     */   public List<UserRole> getUsersRoles()
/*     */   {
/*  84 */     if (this.usersRoles == null) {
/*  85 */       this.usersRoles = new ArrayList();
/*     */     }
/*  87 */     return this.usersRoles;
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
/*     */   public List<RecoverPointUser> getUsers()
/*     */   {
/* 113 */     if (this.users == null) {
/* 114 */       this.users = new ArrayList();
/*     */     }
/* 116 */     return this.users;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LDAPSettings getLdapSettings()
/*     */   {
/* 128 */     return this.ldapSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLdapSettings(LDAPSettings value)
/*     */   {
/* 140 */     this.ldapSettings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 150 */     if (!(obj instanceof UsersSettings)) {
/* 151 */       return false;
/*     */     }
/* 153 */     UsersSettings otherObj = (UsersSettings)obj;
/*     */     
/* 155 */     return (this.usersRoles != null ? this.usersRoles.equals(otherObj.usersRoles) : this.usersRoles == otherObj.usersRoles) && (this.users != null ? this.users.equals(otherObj.users) : this.users == otherObj.users) && (this.ldapSettings != null ? this.ldapSettings.equals(otherObj.ldapSettings) : this.ldapSettings == otherObj.ldapSettings);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 166 */     return (this.usersRoles != null ? this.usersRoles.hashCode() : 0) ^ (this.users != null ? this.users.hashCode() : 0) ^ (this.ldapSettings != null ? this.ldapSettings.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 177 */     return "UsersSettings [usersRoles=" + this.usersRoles + ", " + "users=" + this.users + ", " + "ldapSettings=" + this.ldapSettings + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\UsersSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */