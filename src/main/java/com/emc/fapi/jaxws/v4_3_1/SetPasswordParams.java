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
/*     */ @XmlType(name="setPasswordParams", propOrder={"currentPassword", "newPassword", "username"})
/*     */ public class SetPasswordParams
/*     */ {
/*     */   protected byte[] currentPassword;
/*     */   protected byte[] newPassword;
/*     */   protected String username;
/*     */   
/*     */   public SetPasswordParams() {}
/*     */   
/*     */   public SetPasswordParams(byte[] currentPassword, byte[] newPassword, String username)
/*     */   {
/*  57 */     this.currentPassword = currentPassword;
/*  58 */     this.newPassword = newPassword;
/*  59 */     this.username = username;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public byte[] getCurrentPassword()
/*     */   {
/*  70 */     return this.currentPassword;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCurrentPassword(byte[] value)
/*     */   {
/*  81 */     this.currentPassword = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public byte[] getNewPassword()
/*     */   {
/*  92 */     return this.newPassword;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNewPassword(byte[] value)
/*     */   {
/* 103 */     this.newPassword = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getUsername()
/*     */   {
/* 115 */     return this.username;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUsername(String value)
/*     */   {
/* 127 */     this.username = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 137 */     if (!(obj instanceof SetPasswordParams)) {
/* 138 */       return false;
/*     */     }
/* 140 */     SetPasswordParams otherObj = (SetPasswordParams)obj;
/*     */     
/* 142 */     return (this.currentPassword != null ? this.currentPassword.equals(otherObj.currentPassword) : this.currentPassword == otherObj.currentPassword) && (this.newPassword != null ? this.newPassword.equals(otherObj.newPassword) : this.newPassword == otherObj.newPassword) && (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username);
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
/* 153 */     return (this.currentPassword != null ? this.currentPassword.hashCode() : 0) ^ (this.newPassword != null ? this.newPassword.hashCode() : 0) ^ (this.username != null ? this.username.hashCode() : 0);
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
/* 164 */     return "SetPasswordParams [currentPassword=" + this.currentPassword + ", " + "newPassword=" + this.newPassword + ", " + "username=" + this.username + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetPasswordParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */