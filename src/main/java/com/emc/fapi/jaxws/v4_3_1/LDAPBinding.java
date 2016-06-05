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
/*     */ @XmlType(name="LDAPBinding", propOrder={"bindDistinguishedName", "password", "passwordConfigured"})
/*     */ public class LDAPBinding
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected String bindDistinguishedName;
/*     */   protected byte[] password;
/*     */   protected boolean passwordConfigured;
/*     */   
/*     */   public LDAPBinding() {}
/*     */   
/*     */   public LDAPBinding(String bindDistinguishedName, byte[] password, boolean passwordConfigured)
/*     */   {
/*  52 */     this.bindDistinguishedName = bindDistinguishedName;
/*  53 */     this.password = password;
/*  54 */     this.passwordConfigured = passwordConfigured;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getBindDistinguishedName()
/*     */   {
/*  66 */     return this.bindDistinguishedName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setBindDistinguishedName(String value)
/*     */   {
/*  78 */     this.bindDistinguishedName = value;
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
/*  89 */     return this.password;
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
/* 100 */     this.password = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isPasswordConfigured()
/*     */   {
/* 108 */     return this.passwordConfigured;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPasswordConfigured(boolean value)
/*     */   {
/* 116 */     this.passwordConfigured = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 126 */     if (!(obj instanceof LDAPBinding)) {
/* 127 */       return false;
/*     */     }
/* 129 */     LDAPBinding otherObj = (LDAPBinding)obj;
/*     */     
/* 131 */     return (this.bindDistinguishedName != null ? this.bindDistinguishedName.equals(otherObj.bindDistinguishedName) : this.bindDistinguishedName == otherObj.bindDistinguishedName) && (this.password != null ? this.password.equals(otherObj.password) : this.password == otherObj.password) && (this.passwordConfigured == otherObj.passwordConfigured);
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
/* 142 */     return (this.bindDistinguishedName != null ? this.bindDistinguishedName.hashCode() : 0) ^ (this.password != null ? this.password.hashCode() : 0) ^ (this.passwordConfigured ? 1 : 0);
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
/* 153 */     return "LDAPBinding [bindDistinguishedName=" + this.bindDistinguishedName + ", " + "password=" + this.password + ", " + "passwordConfigured=" + this.passwordConfigured + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\LDAPBinding.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */