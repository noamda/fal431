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
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="CollectLogsResult", propOrder={"ftpResult", "linksToLogs", "logsFileName", "rpaResults", "splitterResults"})
/*     */ public class CollectLogsResult
/*     */ {
/*     */   protected CollectLogsResultValue ftpResult;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<CollectLogsLinkToLogsValue> linksToLogs;
/*     */   protected String logsFileName;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<CollectLogsRPAResultValue> rpaResults;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<CollectLogsSplitterResultValue> splitterResults;
/*     */   
/*     */   public CollectLogsResult() {}
/*     */   
/*     */   public CollectLogsResult(CollectLogsResultValue ftpResult, List<CollectLogsLinkToLogsValue> linksToLogs, String logsFileName, List<CollectLogsRPAResultValue> rpaResults, List<CollectLogsSplitterResultValue> splitterResults)
/*     */   {
/*  62 */     this.ftpResult = ftpResult;
/*  63 */     this.linksToLogs = linksToLogs;
/*  64 */     this.logsFileName = logsFileName;
/*  65 */     this.rpaResults = rpaResults;
/*  66 */     this.splitterResults = splitterResults;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public CollectLogsResultValue getFtpResult()
/*     */   {
/*  78 */     return this.ftpResult;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFtpResult(CollectLogsResultValue value)
/*     */   {
/*  90 */     this.ftpResult = value;
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
/*     */   public List<CollectLogsLinkToLogsValue> getLinksToLogs()
/*     */   {
/* 116 */     if (this.linksToLogs == null) {
/* 117 */       this.linksToLogs = new ArrayList();
/*     */     }
/* 119 */     return this.linksToLogs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getLogsFileName()
/*     */   {
/* 131 */     return this.logsFileName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLogsFileName(String value)
/*     */   {
/* 143 */     this.logsFileName = value;
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
/*     */   public List<CollectLogsRPAResultValue> getRpaResults()
/*     */   {
/* 169 */     if (this.rpaResults == null) {
/* 170 */       this.rpaResults = new ArrayList();
/*     */     }
/* 172 */     return this.rpaResults;
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
/*     */   public List<CollectLogsSplitterResultValue> getSplitterResults()
/*     */   {
/* 198 */     if (this.splitterResults == null) {
/* 199 */       this.splitterResults = new ArrayList();
/*     */     }
/* 201 */     return this.splitterResults;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 211 */     if (!(obj instanceof CollectLogsResult)) {
/* 212 */       return false;
/*     */     }
/* 214 */     CollectLogsResult otherObj = (CollectLogsResult)obj;
/*     */     
/* 216 */     return (this.ftpResult != null ? this.ftpResult.equals(otherObj.ftpResult) : this.ftpResult == otherObj.ftpResult) && (this.linksToLogs != null ? this.linksToLogs.equals(otherObj.linksToLogs) : this.linksToLogs == otherObj.linksToLogs) && (this.logsFileName != null ? this.logsFileName.equals(otherObj.logsFileName) : this.logsFileName == otherObj.logsFileName) && (this.rpaResults != null ? this.rpaResults.equals(otherObj.rpaResults) : this.rpaResults == otherObj.rpaResults) && (this.splitterResults != null ? this.splitterResults.equals(otherObj.splitterResults) : this.splitterResults == otherObj.splitterResults);
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
/*     */   public int hashCode()
/*     */   {
/* 229 */     return (this.ftpResult != null ? this.ftpResult.hashCode() : 0) ^ (this.linksToLogs != null ? this.linksToLogs.hashCode() : 0) ^ (this.logsFileName != null ? this.logsFileName.hashCode() : 0) ^ (this.rpaResults != null ? this.rpaResults.hashCode() : 0) ^ (this.splitterResults != null ? this.splitterResults.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 242 */     return "CollectLogsResult [ftpResult=" + this.ftpResult + ", " + "linksToLogs=" + this.linksToLogs + ", " + "logsFileName=" + this.logsFileName + ", " + "rpaResults=" + this.rpaResults + ", " + "splitterResults=" + this.splitterResults + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CollectLogsResult.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */