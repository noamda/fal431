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
/*     */ 
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
/*     */ @XmlType(name="CollectLogsParams", propOrder={"timeFrame", "ftpInformation", "includeCoreFiles", "ignoreConnectivityErrors", "rpas", "splitters", "splittersWithoutCredentials", "clariionCredentials", "vplexCredentials", "uniteLogsToOneTar"})
/*     */ public class CollectLogsParams
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected TimeFrame timeFrame;
/*     */   @XmlElement(nillable=true)
/*     */   protected FTPInformation ftpInformation;
/*     */   protected boolean includeCoreFiles;
/*     */   protected boolean ignoreConnectivityErrors;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RpaUID> rpas;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<CollectLogsSplitterParam> splitters;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SplitterUID> splittersWithoutCredentials;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClariionSplitter> clariionCredentials;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VplexSplitter> vplexCredentials;
/*     */   protected boolean uniteLogsToOneTar;
/*     */   
/*     */   public CollectLogsParams() {}
/*     */   
/*     */   public CollectLogsParams(TimeFrame timeFrame, FTPInformation ftpInformation, boolean includeCoreFiles, boolean ignoreConnectivityErrors, List<RpaUID> rpas, List<CollectLogsSplitterParam> splitters, List<SplitterUID> splittersWithoutCredentials, List<ClariionSplitter> clariionCredentials, List<VplexSplitter> vplexCredentials, boolean uniteLogsToOneTar)
/*     */   {
/*  81 */     this.timeFrame = timeFrame;
/*  82 */     this.ftpInformation = ftpInformation;
/*  83 */     this.includeCoreFiles = includeCoreFiles;
/*  84 */     this.ignoreConnectivityErrors = ignoreConnectivityErrors;
/*  85 */     this.rpas = rpas;
/*  86 */     this.splitters = splitters;
/*  87 */     this.splittersWithoutCredentials = splittersWithoutCredentials;
/*  88 */     this.clariionCredentials = clariionCredentials;
/*  89 */     this.vplexCredentials = vplexCredentials;
/*  90 */     this.uniteLogsToOneTar = uniteLogsToOneTar;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public TimeFrame getTimeFrame()
/*     */   {
/* 102 */     return this.timeFrame;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTimeFrame(TimeFrame value)
/*     */   {
/* 114 */     this.timeFrame = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public FTPInformation getFtpInformation()
/*     */   {
/* 126 */     return this.ftpInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFtpInformation(FTPInformation value)
/*     */   {
/* 138 */     this.ftpInformation = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isIncludeCoreFiles()
/*     */   {
/* 146 */     return this.includeCoreFiles;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIncludeCoreFiles(boolean value)
/*     */   {
/* 154 */     this.includeCoreFiles = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isIgnoreConnectivityErrors()
/*     */   {
/* 162 */     return this.ignoreConnectivityErrors;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIgnoreConnectivityErrors(boolean value)
/*     */   {
/* 170 */     this.ignoreConnectivityErrors = value;
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
/*     */   public List<RpaUID> getRpas()
/*     */   {
/* 196 */     if (this.rpas == null) {
/* 197 */       this.rpas = new ArrayList();
/*     */     }
/* 199 */     return this.rpas;
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
/*     */   public List<CollectLogsSplitterParam> getSplitters()
/*     */   {
/* 225 */     if (this.splitters == null) {
/* 226 */       this.splitters = new ArrayList();
/*     */     }
/* 228 */     return this.splitters;
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
/*     */   public List<SplitterUID> getSplittersWithoutCredentials()
/*     */   {
/* 254 */     if (this.splittersWithoutCredentials == null) {
/* 255 */       this.splittersWithoutCredentials = new ArrayList();
/*     */     }
/* 257 */     return this.splittersWithoutCredentials;
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
/*     */   public List<ClariionSplitter> getClariionCredentials()
/*     */   {
/* 283 */     if (this.clariionCredentials == null) {
/* 284 */       this.clariionCredentials = new ArrayList();
/*     */     }
/* 286 */     return this.clariionCredentials;
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
/*     */   public List<VplexSplitter> getVplexCredentials()
/*     */   {
/* 312 */     if (this.vplexCredentials == null) {
/* 313 */       this.vplexCredentials = new ArrayList();
/*     */     }
/* 315 */     return this.vplexCredentials;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isUniteLogsToOneTar()
/*     */   {
/* 323 */     return this.uniteLogsToOneTar;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUniteLogsToOneTar(boolean value)
/*     */   {
/* 331 */     this.uniteLogsToOneTar = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 341 */     if (!(obj instanceof CollectLogsParams)) {
/* 342 */       return false;
/*     */     }
/* 344 */     CollectLogsParams otherObj = (CollectLogsParams)obj;
/*     */     
/* 346 */     return (this.timeFrame != null ? this.timeFrame.equals(otherObj.timeFrame) : this.timeFrame == otherObj.timeFrame) && (this.ftpInformation != null ? this.ftpInformation.equals(otherObj.ftpInformation) : this.ftpInformation == otherObj.ftpInformation) && (this.includeCoreFiles == otherObj.includeCoreFiles) && (this.ignoreConnectivityErrors == otherObj.ignoreConnectivityErrors) && (this.rpas != null ? this.rpas.equals(otherObj.rpas) : this.rpas == otherObj.rpas) && (this.splitters != null ? this.splitters.equals(otherObj.splitters) : this.splitters == otherObj.splitters) && (this.splittersWithoutCredentials != null ? this.splittersWithoutCredentials.equals(otherObj.splittersWithoutCredentials) : this.splittersWithoutCredentials == otherObj.splittersWithoutCredentials) && (this.clariionCredentials != null ? this.clariionCredentials.equals(otherObj.clariionCredentials) : this.clariionCredentials == otherObj.clariionCredentials) && (this.vplexCredentials != null ? this.vplexCredentials.equals(otherObj.vplexCredentials) : this.vplexCredentials == otherObj.vplexCredentials) && (this.uniteLogsToOneTar == otherObj.uniteLogsToOneTar);
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
/*     */   public int hashCode()
/*     */   {
/* 364 */     return (this.timeFrame != null ? this.timeFrame.hashCode() : 0) ^ (this.ftpInformation != null ? this.ftpInformation.hashCode() : 0) ^ (this.includeCoreFiles ? 1 : 0) ^ (this.ignoreConnectivityErrors ? 1 : 0) ^ (this.rpas != null ? this.rpas.hashCode() : 0) ^ (this.splitters != null ? this.splitters.hashCode() : 0) ^ (this.splittersWithoutCredentials != null ? this.splittersWithoutCredentials.hashCode() : 0) ^ (this.clariionCredentials != null ? this.clariionCredentials.hashCode() : 0) ^ (this.vplexCredentials != null ? this.vplexCredentials.hashCode() : 0) ^ (this.uniteLogsToOneTar ? 1 : 0);
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
/*     */   public String toString()
/*     */   {
/* 382 */     return "CollectLogsParams [timeFrame=" + this.timeFrame + ", " + "ftpInformation=" + this.ftpInformation + ", " + "includeCoreFiles=" + this.includeCoreFiles + ", " + "ignoreConnectivityErrors=" + this.ignoreConnectivityErrors + ", " + "rpas=" + this.rpas + ", " + "splitters=" + this.splitters + ", " + "splittersWithoutCredentials=" + this.splittersWithoutCredentials + ", " + "clariionCredentials=" + this.clariionCredentials + ", " + "vplexCredentials=" + this.vplexCredentials + ", " + "uniteLogsToOneTar=" + this.uniteLogsToOneTar + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CollectLogsParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */