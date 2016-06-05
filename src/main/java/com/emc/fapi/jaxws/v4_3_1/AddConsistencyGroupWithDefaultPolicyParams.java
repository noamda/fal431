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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="addConsistencyGroupWithDefaultPolicyParams", propOrder={"groupName", "primaryRPA"})
/*     */ public class AddConsistencyGroupWithDefaultPolicyParams
/*     */ {
/*     */   protected String groupName;
/*     */   protected RpaUID primaryRPA;
/*     */   
/*     */   public AddConsistencyGroupWithDefaultPolicyParams() {}
/*     */   
/*     */   public AddConsistencyGroupWithDefaultPolicyParams(String groupName, RpaUID primaryRPA)
/*     */   {
/*  54 */     this.groupName = groupName;
/*  55 */     this.primaryRPA = primaryRPA;
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
/*  67 */     return this.groupName;
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
/*  79 */     this.groupName = value;
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
/*  91 */     return this.primaryRPA;
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
/* 103 */     this.primaryRPA = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 113 */     if (!(obj instanceof AddConsistencyGroupWithDefaultPolicyParams)) {
/* 114 */       return false;
/*     */     }
/* 116 */     AddConsistencyGroupWithDefaultPolicyParams otherObj = (AddConsistencyGroupWithDefaultPolicyParams)obj;
/*     */     
/* 118 */     return (this.groupName != null ? this.groupName.equals(otherObj.groupName) : this.groupName == otherObj.groupName) && (this.primaryRPA != null ? this.primaryRPA.equals(otherObj.primaryRPA) : this.primaryRPA == otherObj.primaryRPA);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.groupName != null ? this.groupName.hashCode() : 0) ^ (this.primaryRPA != null ? this.primaryRPA.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "AddConsistencyGroupWithDefaultPolicyParams [groupName=" + this.groupName + ", " + "primaryRPA=" + this.primaryRPA + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AddConsistencyGroupWithDefaultPolicyParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */