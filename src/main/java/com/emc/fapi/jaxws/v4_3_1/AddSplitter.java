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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="addSplitter", propOrder={"splitterInfo"})
/*     */ public class AddSplitter
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected SplitterInfo splitterInfo;
/*     */   
/*     */   public AddSplitter() {}
/*     */   
/*     */   public AddSplitter(SplitterInfo splitterInfo)
/*     */   {
/*  46 */     this.splitterInfo = splitterInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitterInfo getSplitterInfo()
/*     */   {
/*  58 */     return this.splitterInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitterInfo(SplitterInfo value)
/*     */   {
/*  70 */     this.splitterInfo = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  80 */     if (!(obj instanceof AddSplitter)) {
/*  81 */       return false;
/*     */     }
/*  83 */     AddSplitter otherObj = (AddSplitter)obj;
/*     */     
/*  85 */     return this.splitterInfo == otherObj.splitterInfo ? true : this.splitterInfo != null ? this.splitterInfo.equals(otherObj.splitterInfo) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  94 */     return this.splitterInfo != null ? this.splitterInfo.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 103 */     return "AddSplitter [splitterInfo=" + this.splitterInfo + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AddSplitter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */