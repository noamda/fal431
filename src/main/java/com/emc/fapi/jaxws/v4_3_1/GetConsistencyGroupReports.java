/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getConsistencyGroupReports", propOrder={"reportsUIDs"})
/*     */ public class GetConsistencyGroupReports
/*     */ {
/*     */   protected List<ReportUID> reportsUIDs;
/*     */   
/*     */   public GetConsistencyGroupReports() {}
/*     */   
/*     */   public GetConsistencyGroupReports(List<ReportUID> reportsUIDs)
/*     */   {
/*  46 */     this.reportsUIDs = reportsUIDs;
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
/*     */   public List<ReportUID> getReportsUIDs()
/*     */   {
/*  72 */     if (this.reportsUIDs == null) {
/*  73 */       this.reportsUIDs = new ArrayList();
/*     */     }
/*  75 */     return this.reportsUIDs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  85 */     if (!(obj instanceof GetConsistencyGroupReports)) {
/*  86 */       return false;
/*     */     }
/*  88 */     GetConsistencyGroupReports otherObj = (GetConsistencyGroupReports)obj;
/*     */     
/*  90 */     return this.reportsUIDs == otherObj.reportsUIDs ? true : this.reportsUIDs != null ? this.reportsUIDs.equals(otherObj.reportsUIDs) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  99 */     return this.reportsUIDs != null ? this.reportsUIDs.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 108 */     return "GetConsistencyGroupReports [reportsUIDs=" + this.reportsUIDs + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetConsistencyGroupReports.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */