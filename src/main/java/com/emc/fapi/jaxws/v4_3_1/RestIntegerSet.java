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
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="restIntegerSet", propOrder={"integerSet"})
/*     */ public class RestIntegerSet
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<Integer> integerSet;
/*     */   
/*     */   public RestIntegerSet() {}
/*     */   
/*     */   public RestIntegerSet(List<Integer> integerSet)
/*     */   {
/*  55 */     this.integerSet = integerSet;
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
/*     */   public List<Integer> getIntegerSet()
/*     */   {
/*  81 */     if (this.integerSet == null) {
/*  82 */       this.integerSet = new ArrayList();
/*     */     }
/*  84 */     return this.integerSet;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  94 */     if (!(obj instanceof RestIntegerSet)) {
/*  95 */       return false;
/*     */     }
/*  97 */     RestIntegerSet otherObj = (RestIntegerSet)obj;
/*     */     
/*  99 */     return this.integerSet == otherObj.integerSet ? true : this.integerSet != null ? this.integerSet.equals(otherObj.integerSet) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 108 */     return this.integerSet != null ? this.integerSet.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 117 */     return "RestIntegerSet [integerSet=" + this.integerSet + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RestIntegerSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */