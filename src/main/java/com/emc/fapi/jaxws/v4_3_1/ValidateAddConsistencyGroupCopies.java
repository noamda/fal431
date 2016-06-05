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
/*     */ @XmlType(name="validateAddConsistencyGroupCopies", propOrder={"newCopies"})
/*     */ public class ValidateAddConsistencyGroupCopies
/*     */ {
/*     */   protected List<NewConsistencyGroupCopySettingsParam> newCopies;
/*     */   
/*     */   public ValidateAddConsistencyGroupCopies() {}
/*     */   
/*     */   public ValidateAddConsistencyGroupCopies(List<NewConsistencyGroupCopySettingsParam> newCopies)
/*     */   {
/*  46 */     this.newCopies = newCopies;
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
/*     */   public List<NewConsistencyGroupCopySettingsParam> getNewCopies()
/*     */   {
/*  72 */     if (this.newCopies == null) {
/*  73 */       this.newCopies = new ArrayList();
/*     */     }
/*  75 */     return this.newCopies;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  85 */     if (!(obj instanceof ValidateAddConsistencyGroupCopies)) {
/*  86 */       return false;
/*     */     }
/*  88 */     ValidateAddConsistencyGroupCopies otherObj = (ValidateAddConsistencyGroupCopies)obj;
/*     */     
/*  90 */     return this.newCopies == otherObj.newCopies ? true : this.newCopies != null ? this.newCopies.equals(otherObj.newCopies) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  99 */     return this.newCopies != null ? this.newCopies.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 108 */     return "ValidateAddConsistencyGroupCopies [newCopies=" + this.newCopies + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateAddConsistencyGroupCopies.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */