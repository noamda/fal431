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
/*     */ @XmlType(name="validateSetSystemSecurityLevel", propOrder={"securityLevel"})
/*     */ public class ValidateSetSystemSecurityLevel
/*     */ {
/*     */   protected SystemSecurityLevel securityLevel;
/*     */   
/*     */   public ValidateSetSystemSecurityLevel() {}
/*     */   
/*     */   public ValidateSetSystemSecurityLevel(SystemSecurityLevel securityLevel)
/*     */   {
/*  44 */     this.securityLevel = securityLevel;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemSecurityLevel getSecurityLevel()
/*     */   {
/*  56 */     return this.securityLevel;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSecurityLevel(SystemSecurityLevel value)
/*     */   {
/*  68 */     this.securityLevel = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof ValidateSetSystemSecurityLevel)) {
/*  79 */       return false;
/*     */     }
/*  81 */     ValidateSetSystemSecurityLevel otherObj = (ValidateSetSystemSecurityLevel)obj;
/*     */     
/*  83 */     return this.securityLevel == otherObj.securityLevel ? true : this.securityLevel != null ? this.securityLevel.equals(otherObj.securityLevel) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.securityLevel != null ? this.securityLevel.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "ValidateSetSystemSecurityLevel [securityLevel=" + this.securityLevel + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateSetSystemSecurityLevel.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */