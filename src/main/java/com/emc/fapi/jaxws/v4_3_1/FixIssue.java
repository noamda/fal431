/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="fixIssue", propOrder={"arrayUID", "entities", "issueType"})
/*     */ public class FixIssue
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ArrayUID arrayUID;
/*     */   protected List<Entity> entities;
/*     */   @XmlElement(nillable=true)
/*     */   protected IssueType issueType;
/*     */   
/*     */   public FixIssue() {}
/*     */   
/*     */   public FixIssue(ArrayUID arrayUID, List<Entity> entities, IssueType issueType)
/*     */   {
/*  55 */     this.arrayUID = arrayUID;
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
/*     */   public ArrayUID getArrayUID()
/*     */   {
/*  69 */     return this.arrayUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setArrayUID(ArrayUID value)
/*     */   {
/*  81 */     this.arrayUID = value;
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
/*     */   public List<Entity> getEntities()
/*     */   {
/* 107 */     if (this.entities == null) {
/* 108 */       this.entities = new ArrayList();
/*     */     }
/* 110 */     return this.entities;
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
/* 122 */     return this.issueType;
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
/* 134 */     this.issueType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 144 */     if (!(obj instanceof FixIssue)) {
/* 145 */       return false;
/*     */     }
/* 147 */     FixIssue otherObj = (FixIssue)obj;
/*     */     
/* 149 */     return (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.entities != null ? this.entities.equals(otherObj.entities) : this.entities == otherObj.entities) && (this.issueType != null ? this.issueType.equals(otherObj.issueType) : this.issueType == otherObj.issueType);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 160 */     return (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.entities != null ? this.entities.hashCode() : 0) ^ (this.issueType != null ? this.issueType.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 171 */     return "FixIssue [arrayUID=" + this.arrayUID + ", " + "entities=" + this.entities + ", " + "issueType=" + this.issueType + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FixIssue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */