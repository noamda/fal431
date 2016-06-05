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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SymmetrixArrayList", propOrder={"symmetrixIDs"})
/*     */ public class SymmetrixArrayList
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<String> symmetrixIDs;
/*     */   
/*     */   public SymmetrixArrayList() {}
/*     */   
/*     */   public SymmetrixArrayList(List<String> symmetrixIDs)
/*     */   {
/*  48 */     this.symmetrixIDs = symmetrixIDs;
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
/*     */   public List<String> getSymmetrixIDs()
/*     */   {
/*  74 */     if (this.symmetrixIDs == null) {
/*  75 */       this.symmetrixIDs = new ArrayList();
/*     */     }
/*  77 */     return this.symmetrixIDs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof SymmetrixArrayList)) {
/*  88 */       return false;
/*     */     }
/*  90 */     SymmetrixArrayList otherObj = (SymmetrixArrayList)obj;
/*     */     
/*  92 */     return this.symmetrixIDs == otherObj.symmetrixIDs ? true : this.symmetrixIDs != null ? this.symmetrixIDs.equals(otherObj.symmetrixIDs) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.symmetrixIDs != null ? this.symmetrixIDs.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "SymmetrixArrayList [symmetrixIDs=" + this.symmetrixIDs + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SymmetrixArrayList.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */