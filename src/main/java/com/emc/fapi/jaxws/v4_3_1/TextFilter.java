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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="TextFilter", propOrder={"allRelevant", "texts"})
/*     */ public class TextFilter
/*     */ {
/*     */   protected boolean allRelevant;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<String> texts;
/*     */   
/*     */   public TextFilter() {}
/*     */   
/*     */   public TextFilter(boolean allRelevant, List<String> texts)
/*     */   {
/*  51 */     this.allRelevant = allRelevant;
/*  52 */     this.texts = texts;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isAllRelevant()
/*     */   {
/*  60 */     return this.allRelevant;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAllRelevant(boolean value)
/*     */   {
/*  68 */     this.allRelevant = value;
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
/*     */   public List<String> getTexts()
/*     */   {
/*  94 */     if (this.texts == null) {
/*  95 */       this.texts = new ArrayList();
/*     */     }
/*  97 */     return this.texts;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 107 */     if (!(obj instanceof TextFilter)) {
/* 108 */       return false;
/*     */     }
/* 110 */     TextFilter otherObj = (TextFilter)obj;
/*     */     
/* 112 */     return (this.allRelevant == otherObj.allRelevant) && (this.texts != null ? this.texts.equals(otherObj.texts) : this.texts == otherObj.texts);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 122 */     return (this.allRelevant ? 1 : 0) ^ (this.texts != null ? this.texts.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 132 */     return "TextFilter [allRelevant=" + this.allRelevant + ", " + "texts=" + this.texts + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\TextFilter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */