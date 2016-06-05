/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSeeAlso;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonSubTypes;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.As;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
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
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ConsistencyGroupCopyPolicyTemplate.class, name="ConsistencyGroupCopyPolicyTemplate"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ConsistencyGroupLinkPolicyTemplate.class, name="ConsistencyGroupLinkPolicyTemplate")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="BasePolicyTemplate", propOrder={"name"})
/*     */ @XmlSeeAlso({ConsistencyGroupCopyPolicyTemplate.class, ConsistencyGroupLinkPolicyTemplate.class})
/*     */ public abstract class BasePolicyTemplate
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected String name;
/*     */   
/*     */   public BasePolicyTemplate() {}
/*     */   
/*     */   public BasePolicyTemplate(String name)
/*     */   {
/*  63 */     this.name = name;
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
/*  75 */     return this.name;
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
/*  87 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  97 */     if (!(obj instanceof BasePolicyTemplate)) {
/*  98 */       return false;
/*     */     }
/* 100 */     BasePolicyTemplate otherObj = (BasePolicyTemplate)obj;
/*     */     
/* 102 */     return this.name == otherObj.name ? true : this.name != null ? this.name.equals(otherObj.name) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 111 */     return this.name != null ? this.name.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 120 */     return "BasePolicyTemplate [name=" + this.name + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\BasePolicyTemplate.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */