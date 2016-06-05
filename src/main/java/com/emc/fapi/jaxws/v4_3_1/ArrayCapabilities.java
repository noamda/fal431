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
/*     */ @XmlType(name="ArrayCapabilities", propOrder={"arrayCapabilities"})
/*     */ public class ArrayCapabilities
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ArrayCapability> arrayCapabilities;
/*     */   
/*     */   public ArrayCapabilities() {}
/*     */   
/*     */   public ArrayCapabilities(List<ArrayCapability> arrayCapabilities)
/*     */   {
/*  48 */     this.arrayCapabilities = arrayCapabilities;
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
/*     */   public List<ArrayCapability> getArrayCapabilities()
/*     */   {
/*  74 */     if (this.arrayCapabilities == null) {
/*  75 */       this.arrayCapabilities = new ArrayList();
/*     */     }
/*  77 */     return this.arrayCapabilities;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof ArrayCapabilities)) {
/*  88 */       return false;
/*     */     }
/*  90 */     ArrayCapabilities otherObj = (ArrayCapabilities)obj;
/*     */     
/*  92 */     return this.arrayCapabilities == otherObj.arrayCapabilities ? true : this.arrayCapabilities != null ? this.arrayCapabilities.equals(otherObj.arrayCapabilities) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.arrayCapabilities != null ? this.arrayCapabilities.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "ArrayCapabilities [arrayCapabilities=" + this.arrayCapabilities + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayCapabilities.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */