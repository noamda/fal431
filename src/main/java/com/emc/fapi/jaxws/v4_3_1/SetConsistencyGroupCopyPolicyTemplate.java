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
/*     */ @XmlType(name="setConsistencyGroupCopyPolicyTemplate", propOrder={"template", "newTemplateName"})
/*     */ public class SetConsistencyGroupCopyPolicyTemplate
/*     */ {
/*     */   protected ConsistencyGroupCopyPolicyTemplate template;
/*     */   protected String newTemplateName;
/*     */   
/*     */   public SetConsistencyGroupCopyPolicyTemplate() {}
/*     */   
/*     */   public SetConsistencyGroupCopyPolicyTemplate(ConsistencyGroupCopyPolicyTemplate template, String newTemplateName)
/*     */   {
/*  47 */     this.template = template;
/*  48 */     this.newTemplateName = newTemplateName;
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
/*  60 */     return this.template;
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
/*  72 */     this.template = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getNewTemplateName()
/*     */   {
/*  84 */     return this.newTemplateName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNewTemplateName(String value)
/*     */   {
/*  96 */     this.newTemplateName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof SetConsistencyGroupCopyPolicyTemplate)) {
/* 107 */       return false;
/*     */     }
/* 109 */     SetConsistencyGroupCopyPolicyTemplate otherObj = (SetConsistencyGroupCopyPolicyTemplate)obj;
/*     */     
/* 111 */     return (this.template != null ? this.template.equals(otherObj.template) : this.template == otherObj.template) && (this.newTemplateName != null ? this.newTemplateName.equals(otherObj.newTemplateName) : this.newTemplateName == otherObj.newTemplateName);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.template != null ? this.template.hashCode() : 0) ^ (this.newTemplateName != null ? this.newTemplateName.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "SetConsistencyGroupCopyPolicyTemplate [template=" + this.template + ", " + "newTemplateName=" + this.newTemplateName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetConsistencyGroupCopyPolicyTemplate.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */