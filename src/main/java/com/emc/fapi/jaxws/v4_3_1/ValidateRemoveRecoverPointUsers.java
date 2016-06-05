/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="validateRemoveRecoverPointUsers", propOrder={"users"})
/*     */ public class ValidateRemoveRecoverPointUsers
/*     */ {
/*     */   protected List<RecoverPointUser> users;
/*     */   
/*     */   public ValidateRemoveRecoverPointUsers() {}
/*     */   
/*     */   public ValidateRemoveRecoverPointUsers(List<RecoverPointUser> users)
/*     */   {
/*  46 */     this.users = users;
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
/*  72 */     if (this.users == null) {
/*  73 */       this.users = new ArrayList();
/*     */     }
/*  75 */     return this.users;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  85 */     if (!(obj instanceof ValidateRemoveRecoverPointUsers)) {
/*  86 */       return false;
/*     */     }
/*  88 */     ValidateRemoveRecoverPointUsers otherObj = (ValidateRemoveRecoverPointUsers)obj;
/*     */     
/*  90 */     return this.users == otherObj.users ? true : this.users != null ? this.users.equals(otherObj.users) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  99 */     return this.users != null ? this.users.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 108 */     return "ValidateRemoveRecoverPointUsers [users=" + this.users + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateRemoveRecoverPointUsers.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */