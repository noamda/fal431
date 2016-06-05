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
/*     */ @XmlType(name="addConsistencyGroupLinkPolicyTemplate", propOrder={"template"})
/*     */ public class AddConsistencyGroupLinkPolicyTemplate
/*     */ {
/*     */   protected ConsistencyGroupLinkPolicyTemplate template;
/*     */   
/*     */   public AddConsistencyGroupLinkPolicyTemplate() {}
/*     */   
/*     */   public AddConsistencyGroupLinkPolicyTemplate(ConsistencyGroupLinkPolicyTemplate template)
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
/*     */   public ConsistencyGroupLinkPolicyTemplate getTemplate()
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
/*     */   public void setTemplate(ConsistencyGroupLinkPolicyTemplate value)
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
/*  78 */     if (!(obj instanceof AddConsistencyGroupLinkPolicyTemplate)) {
/*  79 */       return false;
/*     */     }
/*  81 */     AddConsistencyGroupLinkPolicyTemplate otherObj = (AddConsistencyGroupLinkPolicyTemplate)obj;
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
/* 101 */     return "AddConsistencyGroupLinkPolicyTemplate [template=" + this.template + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AddConsistencyGroupLinkPolicyTemplate.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */