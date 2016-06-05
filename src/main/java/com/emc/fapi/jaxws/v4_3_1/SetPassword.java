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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="setPassword", propOrder={"username", "currentPassword", "newPassword"})
/*     */ public class SetPassword
/*     */ {
/*     */   protected String username;
/*     */   @XmlElement(nillable=true)
/*     */   protected byte[] currentPassword;
/*     */   @XmlElement(nillable=true)
/*     */   protected byte[] newPassword;
/*     */   
/*     */   public SetPassword() {}
/*     */   
/*     */   public SetPassword(String username, byte[] currentPassword, byte[] newPassword)
/*     */   {
/*  53 */     this.username = username;
/*  54 */     this.currentPassword = currentPassword;
/*  55 */     this.newPassword = newPassword;
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
/*  67 */     return this.username;
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
/*  79 */     this.username = value;
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
/*  90 */     return this.currentPassword;
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
/* 101 */     this.currentPassword = value;
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
/* 112 */     return this.newPassword;
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
/* 123 */     this.newPassword = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 133 */     if (!(obj instanceof SetPassword)) {
/* 134 */       return false;
/*     */     }
/* 136 */     SetPassword otherObj = (SetPassword)obj;
/*     */     
/* 138 */     return (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username) && (this.currentPassword != null ? this.currentPassword.equals(otherObj.currentPassword) : this.currentPassword == otherObj.currentPassword) && (this.newPassword != null ? this.newPassword.equals(otherObj.newPassword) : this.newPassword == otherObj.newPassword);
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
/* 149 */     return (this.username != null ? this.username.hashCode() : 0) ^ (this.currentPassword != null ? this.currentPassword.hashCode() : 0) ^ (this.newPassword != null ? this.newPassword.hashCode() : 0);
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
/* 160 */     return "SetPassword [username=" + this.username + ", " + "currentPassword=" + this.currentPassword + ", " + "newPassword=" + this.newPassword + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetPassword.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */