/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
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
/*     */ @XmlType(name="issueParams", propOrder={"entities", "issueType"})
/*     */ public class IssueParams
/*     */ {
/*     */   protected EntitySet entities;
/*     */   @XmlElement(nillable=true)
/*     */   protected IssueType issueType;
/*     */   
/*     */   public IssueParams() {}
/*     */   
/*     */   public IssueParams(EntitySet entities, IssueType issueType)
/*     */   {
/*  56 */     this.entities = entities;
/*  57 */     this.issueType = issueType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public EntitySet getEntities()
/*     */   {
/*  69 */     return this.entities;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEntities(EntitySet value)
/*     */   {
/*  81 */     this.entities = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public IssueType getIssueType()
/*     */   {
/*  93 */     return this.issueType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIssueType(IssueType value)
/*     */   {
/* 105 */     this.issueType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 115 */     if (!(obj instanceof IssueParams)) {
/* 116 */       return false;
/*     */     }
/* 118 */     IssueParams otherObj = (IssueParams)obj;
/*     */     
/* 120 */     return (this.entities != null ? this.entities.equals(otherObj.entities) : this.entities == otherObj.entities) && (this.issueType != null ? this.issueType.equals(otherObj.issueType) : this.issueType == otherObj.issueType);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 130 */     return (this.entities != null ? this.entities.hashCode() : 0) ^ (this.issueType != null ? this.issueType.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 140 */     return "IssueParams [entities=" + this.entities + ", " + "issueType=" + this.issueType + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\IssueParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */