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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="exportStatistics", propOrder={"filter", "fileName"})
/*     */ public class ExportStatistics
/*     */ {
/*     */   protected StatisticsFilter filter;
/*     */   protected String fileName;
/*     */   
/*     */   public ExportStatistics() {}
/*     */   
/*     */   public ExportStatistics(StatisticsFilter filter, String fileName)
/*     */   {
/*  47 */     this.filter = filter;
/*  48 */     this.fileName = fileName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public StatisticsFilter getFilter()
/*     */   {
/*  60 */     return this.filter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFilter(StatisticsFilter value)
/*     */   {
/*  72 */     this.filter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getFileName()
/*     */   {
/*  84 */     return this.fileName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFileName(String value)
/*     */   {
/*  96 */     this.fileName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof ExportStatistics)) {
/* 107 */       return false;
/*     */     }
/* 109 */     ExportStatistics otherObj = (ExportStatistics)obj;
/*     */     
/* 111 */     return (this.filter != null ? this.filter.equals(otherObj.filter) : this.filter == otherObj.filter) && (this.fileName != null ? this.fileName.equals(otherObj.fileName) : this.fileName == otherObj.fileName);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.filter != null ? this.filter.hashCode() : 0) ^ (this.fileName != null ? this.fileName.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "ExportStatistics [filter=" + this.filter + ", " + "fileName=" + this.fileName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ExportStatistics.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */