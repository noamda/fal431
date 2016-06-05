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
/*     */ @XmlType(name="validateAddConsistencyGroupWithDefaultPolicy", propOrder={"groupName", "primaryRPA"})
/*     */ public class ValidateAddConsistencyGroupWithDefaultPolicy
/*     */ {
/*     */   protected String groupName;
/*     */   protected RpaUID primaryRPA;
/*     */   
/*     */   public ValidateAddConsistencyGroupWithDefaultPolicy() {}
/*     */   
/*     */   public ValidateAddConsistencyGroupWithDefaultPolicy(String groupName, RpaUID primaryRPA)
/*     */   {
/*  47 */     this.groupName = groupName;
/*  48 */     this.primaryRPA = primaryRPA;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getGroupName()
/*     */   {
/*  60 */     return this.groupName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupName(String value)
/*     */   {
/*  72 */     this.groupName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpaUID getPrimaryRPA()
/*     */   {
/*  84 */     return this.primaryRPA;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPrimaryRPA(RpaUID value)
/*     */   {
/*  96 */     this.primaryRPA = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof ValidateAddConsistencyGroupWithDefaultPolicy)) {
/* 107 */       return false;
/*     */     }
/* 109 */     ValidateAddConsistencyGroupWithDefaultPolicy otherObj = (ValidateAddConsistencyGroupWithDefaultPolicy)obj;
/*     */     
/* 111 */     return (this.groupName != null ? this.groupName.equals(otherObj.groupName) : this.groupName == otherObj.groupName) && (this.primaryRPA != null ? this.primaryRPA.equals(otherObj.primaryRPA) : this.primaryRPA == otherObj.primaryRPA);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.groupName != null ? this.groupName.hashCode() : 0) ^ (this.primaryRPA != null ? this.primaryRPA.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "ValidateAddConsistencyGroupWithDefaultPolicy [groupName=" + this.groupName + ", " + "primaryRPA=" + this.primaryRPA + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateAddConsistencyGroupWithDefaultPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */