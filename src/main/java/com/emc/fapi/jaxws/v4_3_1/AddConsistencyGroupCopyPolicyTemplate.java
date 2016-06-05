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
/*     */ @XmlType(name="addConsistencyGroupCopyPolicyTemplate", propOrder={"template"})
/*     */ public class AddConsistencyGroupCopyPolicyTemplate
/*     */ {
/*     */   protected ConsistencyGroupCopyPolicyTemplate template;
/*     */   
/*     */   public AddConsistencyGroupCopyPolicyTemplate() {}
/*     */   
/*     */   public AddConsistencyGroupCopyPolicyTemplate(ConsistencyGroupCopyPolicyTemplate template)
/*     */   {
/*  44 */     this.template = template;
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
/*  56 */     return this.template;
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
/*  68 */     this.template = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof AddConsistencyGroupCopyPolicyTemplate)) {
/*  79 */       return false;
/*     */     }
/*  81 */     AddConsistencyGroupCopyPolicyTemplate otherObj = (AddConsistencyGroupCopyPolicyTemplate)obj;
/*     */     
/*  83 */     return this.template == otherObj.template ? true : this.template != null ? this.template.equals(otherObj.template) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.template != null ? this.template.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "AddConsistencyGroupCopyPolicyTemplate [template=" + this.template + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AddConsistencyGroupCopyPolicyTemplate.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */