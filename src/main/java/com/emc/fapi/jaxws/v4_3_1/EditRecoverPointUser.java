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
/*     */ @XmlType(name="editRecoverPointUser", propOrder={"oldUserName", "user"})
/*     */ public class EditRecoverPointUser
/*     */ {
/*     */   protected String oldUserName;
/*     */   protected RecoverPointUser user;
/*     */   
/*     */   public EditRecoverPointUser() {}
/*     */   
/*     */   public EditRecoverPointUser(String oldUserName, RecoverPointUser user)
/*     */   {
/*  47 */     this.oldUserName = oldUserName;
/*  48 */     this.user = user;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getOldUserName()
/*     */   {
/*  60 */     return this.oldUserName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setOldUserName(String value)
/*     */   {
/*  72 */     this.oldUserName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointUser getUser()
/*     */   {
/*  84 */     return this.user;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUser(RecoverPointUser value)
/*     */   {
/*  96 */     this.user = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof EditRecoverPointUser)) {
/* 107 */       return false;
/*     */     }
/* 109 */     EditRecoverPointUser otherObj = (EditRecoverPointUser)obj;
/*     */     
/* 111 */     return (this.oldUserName != null ? this.oldUserName.equals(otherObj.oldUserName) : this.oldUserName == otherObj.oldUserName) && (this.user != null ? this.user.equals(otherObj.user) : this.user == otherObj.user);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.oldUserName != null ? this.oldUserName.hashCode() : 0) ^ (this.user != null ? this.user.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "EditRecoverPointUser [oldUserName=" + this.oldUserName + ", " + "user=" + this.user + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EditRecoverPointUser.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */