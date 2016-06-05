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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="FileSystemView", propOrder={"vnxUID", "fileSystemsExtendedInformation", "connectivityStatus", "vdms", "dateMovers", "storagePools"})
/*     */ public class FileSystemView
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected VnxUID vnxUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<FileSystemExtendedInformation> fileSystemsExtendedInformation;
/*     */   @XmlElement(nillable=true)
/*     */   protected ConnectivityStatus connectivityStatus;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<DataMoverView> vdms;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<DataMoverView> dateMovers;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<String> storagePools;
/*     */   
/*     */   public FileSystemView() {}
/*     */   
/*     */   public FileSystemView(VnxUID vnxUID, List<FileSystemExtendedInformation> fileSystemsExtendedInformation, ConnectivityStatus connectivityStatus, List<DataMoverView> vdms, List<DataMoverView> dateMovers, List<String> storagePools)
/*     */   {
/*  68 */     this.vnxUID = vnxUID;
/*  69 */     this.fileSystemsExtendedInformation = fileSystemsExtendedInformation;
/*  70 */     this.connectivityStatus = connectivityStatus;
/*  71 */     this.vdms = vdms;
/*  72 */     this.dateMovers = dateMovers;
/*  73 */     this.storagePools = storagePools;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VnxUID getVnxUID()
/*     */   {
/*  85 */     return this.vnxUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVnxUID(VnxUID value)
/*     */   {
/*  97 */     this.vnxUID = value;
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
/*     */   public List<FileSystemExtendedInformation> getFileSystemsExtendedInformation()
/*     */   {
/* 123 */     if (this.fileSystemsExtendedInformation == null) {
/* 124 */       this.fileSystemsExtendedInformation = new ArrayList();
/*     */     }
/* 126 */     return this.fileSystemsExtendedInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConnectivityStatus getConnectivityStatus()
/*     */   {
/* 138 */     return this.connectivityStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConnectivityStatus(ConnectivityStatus value)
/*     */   {
/* 150 */     this.connectivityStatus = value;
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
/*     */   public List<DataMoverView> getVdms()
/*     */   {
/* 176 */     if (this.vdms == null) {
/* 177 */       this.vdms = new ArrayList();
/*     */     }
/* 179 */     return this.vdms;
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
/*     */   public List<DataMoverView> getDateMovers()
/*     */   {
/* 205 */     if (this.dateMovers == null) {
/* 206 */       this.dateMovers = new ArrayList();
/*     */     }
/* 208 */     return this.dateMovers;
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
/*     */   public List<String> getStoragePools()
/*     */   {
/* 234 */     if (this.storagePools == null) {
/* 235 */       this.storagePools = new ArrayList();
/*     */     }
/* 237 */     return this.storagePools;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 247 */     if (!(obj instanceof FileSystemView)) {
/* 248 */       return false;
/*     */     }
/* 250 */     FileSystemView otherObj = (FileSystemView)obj;
/*     */     
/* 252 */     return (this.vnxUID != null ? this.vnxUID.equals(otherObj.vnxUID) : this.vnxUID == otherObj.vnxUID) && (this.fileSystemsExtendedInformation != null ? this.fileSystemsExtendedInformation.equals(otherObj.fileSystemsExtendedInformation) : this.fileSystemsExtendedInformation == otherObj.fileSystemsExtendedInformation) && (this.connectivityStatus != null ? this.connectivityStatus.equals(otherObj.connectivityStatus) : this.connectivityStatus == otherObj.connectivityStatus) && (this.vdms != null ? this.vdms.equals(otherObj.vdms) : this.vdms == otherObj.vdms) && (this.dateMovers != null ? this.dateMovers.equals(otherObj.dateMovers) : this.dateMovers == otherObj.dateMovers) && (this.storagePools != null ? this.storagePools.equals(otherObj.storagePools) : this.storagePools == otherObj.storagePools);
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
/*     */   public int hashCode()
/*     */   {
/* 266 */     return (this.vnxUID != null ? this.vnxUID.hashCode() : 0) ^ (this.fileSystemsExtendedInformation != null ? this.fileSystemsExtendedInformation.hashCode() : 0) ^ (this.connectivityStatus != null ? this.connectivityStatus.hashCode() : 0) ^ (this.vdms != null ? this.vdms.hashCode() : 0) ^ (this.dateMovers != null ? this.dateMovers.hashCode() : 0) ^ (this.storagePools != null ? this.storagePools.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 280 */     return "FileSystemView [vnxUID=" + this.vnxUID + ", " + "fileSystemsExtendedInformation=" + this.fileSystemsExtendedInformation + ", " + "connectivityStatus=" + this.connectivityStatus + ", " + "vdms=" + this.vdms + ", " + "dateMovers=" + this.dateMovers + ", " + "storagePools=" + this.storagePools + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FileSystemView.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */