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
/*     */ @XmlType(name="setConsistencyGroupCopyPolicyTemplateParams", propOrder={"newName", "template"})
/*     */ public class SetConsistencyGroupCopyPolicyTemplateParams
/*     */ {
/*     */   protected String newName;
/*     */   protected ConsistencyGroupCopyPolicyTemplate template;
/*     */   
/*     */   public SetConsistencyGroupCopyPolicyTemplateParams() {}
/*     */   
/*     */   public SetConsistencyGroupCopyPolicyTemplateParams(String newName, ConsistencyGroupCopyPolicyTemplate template)
/*     */   {
/*  54 */     this.newName = newName;
/*  55 */     this.template = template;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getNewName()
/*     */   {
/*  67 */     return this.newName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNewName(String value)
/*     */   {
/*  79 */     this.newName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyPolicyTemplate getTemplate()
/*     */   {
/*  91 */     return this.template;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTemplate(ConsistencyGroupCopyPolicyTemplate value)
/*     */   {
/* 103 */     this.template = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 113 */     if (!(obj instanceof SetConsistencyGroupCopyPolicyTemplateParams)) {
/* 114 */       return false;
/*     */     }
/* 116 */     SetConsistencyGroupCopyPolicyTemplateParams otherObj = (SetConsistencyGroupCopyPolicyTemplateParams)obj;
/*     */     
/* 118 */     return (this.newName != null ? this.newName.equals(otherObj.newName) : this.newName == otherObj.newName) && (this.template != null ? this.template.equals(otherObj.template) : this.template == otherObj.template);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.newName != null ? this.newName.hashCode() : 0) ^ (this.template != null ? this.template.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "SetConsistencyGroupCopyPolicyTemplateParams [newName=" + this.newName + ", " + "template=" + this.template + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetConsistencyGroupCopyPolicyTemplateParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */