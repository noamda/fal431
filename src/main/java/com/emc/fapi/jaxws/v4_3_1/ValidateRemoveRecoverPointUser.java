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
/*     */ @XmlType(name="validateRemoveRecoverPointUser", propOrder={"user"})
/*     */ public class ValidateRemoveRecoverPointUser
/*     */ {
/*     */   protected RecoverPointUser user;
/*     */   
/*     */   public ValidateRemoveRecoverPointUser() {}
/*     */   
/*     */   public ValidateRemoveRecoverPointUser(RecoverPointUser user)
/*     */   {
/*  44 */     this.user = user;
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
/*  56 */     return this.user;
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
/*  68 */     this.user = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof ValidateRemoveRecoverPointUser)) {
/*  79 */       return false;
/*     */     }
/*  81 */     ValidateRemoveRecoverPointUser otherObj = (ValidateRemoveRecoverPointUser)obj;
/*     */     
/*  83 */     return this.user == otherObj.user ? true : this.user != null ? this.user.equals(otherObj.user) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.user != null ? this.user.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "ValidateRemoveRecoverPointUser [user=" + this.user + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateRemoveRecoverPointUser.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */