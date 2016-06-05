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
/*     */ @XmlType(name="deleteConsistencyGroupReports", propOrder={"reportUID"})
/*     */ public class DeleteConsistencyGroupReports
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ReportUID reportUID;
/*     */   
/*     */   public DeleteConsistencyGroupReports() {}
/*     */   
/*     */   public DeleteConsistencyGroupReports(ReportUID reportUID)
/*     */   {
/*  46 */     this.reportUID = reportUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ReportUID getReportUID()
/*     */   {
/*  58 */     return this.reportUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReportUID(ReportUID value)
/*     */   {
/*  70 */     this.reportUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  80 */     if (!(obj instanceof DeleteConsistencyGroupReports)) {
/*  81 */       return false;
/*     */     }
/*  83 */     DeleteConsistencyGroupReports otherObj = (DeleteConsistencyGroupReports)obj;
/*     */     
/*  85 */     return this.reportUID == otherObj.reportUID ? true : this.reportUID != null ? this.reportUID.equals(otherObj.reportUID) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  94 */     return this.reportUID != null ? this.reportUID.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 103 */     return "DeleteConsistencyGroupReports [reportUID=" + this.reportUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\DeleteConsistencyGroupReports.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */