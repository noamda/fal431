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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="Chap", propOrder={"password", "passwordEncrypted", "username"})
/*     */ public class Chap
/*     */ {
/*     */   protected byte[] password;
/*     */   protected boolean passwordEncrypted;
/*     */   protected String username;
/*     */   
/*     */   public Chap() {}
/*     */   
/*     */   public Chap(byte[] password, boolean passwordEncrypted, String username)
/*     */   {
/*  50 */     this.password = password;
/*  51 */     this.passwordEncrypted = passwordEncrypted;
/*  52 */     this.username = username;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public byte[] getPassword()
/*     */   {
/*  63 */     return this.password;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPassword(byte[] value)
/*     */   {
/*  74 */     this.password = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isPasswordEncrypted()
/*     */   {
/*  82 */     return this.passwordEncrypted;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPasswordEncrypted(boolean value)
/*     */   {
/*  90 */     this.passwordEncrypted = value;
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
/* 102 */     return this.username;
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
/* 114 */     this.username = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 124 */     if (!(obj instanceof Chap)) {
/* 125 */       return false;
/*     */     }
/* 127 */     Chap otherObj = (Chap)obj;
/*     */     
/* 129 */     return (this.password != null ? this.password.equals(otherObj.password) : this.password == otherObj.password) && (this.passwordEncrypted == otherObj.passwordEncrypted) && (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username);
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
/* 140 */     return (this.password != null ? this.password.hashCode() : 0) ^ (this.passwordEncrypted ? 1 : 0) ^ (this.username != null ? this.username.hashCode() : 0);
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
/* 151 */     return "Chap [password=" + this.password + ", " + "passwordEncrypted=" + this.passwordEncrypted + ", " + "username=" + this.username + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\Chap.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */