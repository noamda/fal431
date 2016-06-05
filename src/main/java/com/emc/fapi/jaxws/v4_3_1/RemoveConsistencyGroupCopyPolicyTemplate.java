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
/*     */ @XmlType(name="removeConsistencyGroupCopyPolicyTemplate", propOrder={"name"})
/*     */ public class RemoveConsistencyGroupCopyPolicyTemplate
/*     */ {
/*     */   protected String name;
/*     */   
/*     */   public RemoveConsistencyGroupCopyPolicyTemplate() {}
/*     */   
/*     */   public RemoveConsistencyGroupCopyPolicyTemplate(String name)
/*     */   {
/*  44 */     this.name = name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getName()
/*     */   {
/*  56 */     return this.name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setName(String value)
/*     */   {
/*  68 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof RemoveConsistencyGroupCopyPolicyTemplate)) {
/*  79 */       return false;
/*     */     }
/*  81 */     RemoveConsistencyGroupCopyPolicyTemplate otherObj = (RemoveConsistencyGroupCopyPolicyTemplate)obj;
/*     */     
/*  83 */     return this.name == otherObj.name ? true : this.name != null ? this.name.equals(otherObj.name) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.name != null ? this.name.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "RemoveConsistencyGroupCopyPolicyTemplate [name=" + this.name + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RemoveConsistencyGroupCopyPolicyTemplate.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */