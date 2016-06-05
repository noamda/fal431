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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="exportStatisticsParams", propOrder={"fileName", "filter"})
/*     */ public class ExportStatisticsParams
/*     */ {
/*     */   protected String fileName;
/*     */   protected StatisticsFilter filter;
/*     */   
/*     */   public ExportStatisticsParams() {}
/*     */   
/*     */   public ExportStatisticsParams(String fileName, StatisticsFilter filter)
/*     */   {
/*  54 */     this.fileName = fileName;
/*  55 */     this.filter = filter;
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
/*  67 */     return this.fileName;
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
/*  79 */     this.fileName = value;
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
/*  91 */     return this.filter;
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
/* 103 */     this.filter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 113 */     if (!(obj instanceof ExportStatisticsParams)) {
/* 114 */       return false;
/*     */     }
/* 116 */     ExportStatisticsParams otherObj = (ExportStatisticsParams)obj;
/*     */     
/* 118 */     return (this.fileName != null ? this.fileName.equals(otherObj.fileName) : this.fileName == otherObj.fileName) && (this.filter != null ? this.filter.equals(otherObj.filter) : this.filter == otherObj.filter);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.fileName != null ? this.fileName.hashCode() : 0) ^ (this.filter != null ? this.filter.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "ExportStatisticsParams [fileName=" + this.fileName + ", " + "filter=" + this.filter + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ExportStatisticsParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */