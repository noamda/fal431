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
/*     */ @XmlType(name="FileSystemExtendedInformation", propOrder={"fileSystemInformation", "storageUsed", "hasProtectedFiles", "mountInformationList", "unmountedShareInformationList"})
/*     */ public class FileSystemExtendedInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected FileSystemInformation fileSystemInformation;
/*     */   protected long storageUsed;
/*     */   protected boolean hasProtectedFiles;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<MountInformation> mountInformationList;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ShareInformation> unmountedShareInformationList;
/*     */   
/*     */   public FileSystemExtendedInformation() {}
/*     */   
/*     */   public FileSystemExtendedInformation(FileSystemInformation fileSystemInformation, long storageUsed, boolean hasProtectedFiles, List<MountInformation> mountInformationList, List<ShareInformation> unmountedShareInformationList)
/*     */   {
/*  62 */     this.fileSystemInformation = fileSystemInformation;
/*  63 */     this.storageUsed = storageUsed;
/*  64 */     this.hasProtectedFiles = hasProtectedFiles;
/*  65 */     this.mountInformationList = mountInformationList;
/*  66 */     this.unmountedShareInformationList = unmountedShareInformationList;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public FileSystemInformation getFileSystemInformation()
/*     */   {
/*  78 */     return this.fileSystemInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFileSystemInformation(FileSystemInformation value)
/*     */   {
/*  90 */     this.fileSystemInformation = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getStorageUsed()
/*     */   {
/*  98 */     return this.storageUsed;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStorageUsed(long value)
/*     */   {
/* 106 */     this.storageUsed = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isHasProtectedFiles()
/*     */   {
/* 114 */     return this.hasProtectedFiles;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHasProtectedFiles(boolean value)
/*     */   {
/* 122 */     this.hasProtectedFiles = value;
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
/*     */   public List<MountInformation> getMountInformationList()
/*     */   {
/* 148 */     if (this.mountInformationList == null) {
/* 149 */       this.mountInformationList = new ArrayList();
/*     */     }
/* 151 */     return this.mountInformationList;
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
/*     */   public List<ShareInformation> getUnmountedShareInformationList()
/*     */   {
/* 177 */     if (this.unmountedShareInformationList == null) {
/* 178 */       this.unmountedShareInformationList = new ArrayList();
/*     */     }
/* 180 */     return this.unmountedShareInformationList;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 190 */     if (!(obj instanceof FileSystemExtendedInformation)) {
/* 191 */       return false;
/*     */     }
/* 193 */     FileSystemExtendedInformation otherObj = (FileSystemExtendedInformation)obj;
/*     */     
/* 195 */     return (this.fileSystemInformation != null ? this.fileSystemInformation.equals(otherObj.fileSystemInformation) : this.fileSystemInformation == otherObj.fileSystemInformation) && (this.storageUsed == otherObj.storageUsed) && (this.hasProtectedFiles == otherObj.hasProtectedFiles) && (this.mountInformationList != null ? this.mountInformationList.equals(otherObj.mountInformationList) : this.mountInformationList == otherObj.mountInformationList) && (this.unmountedShareInformationList != null ? this.unmountedShareInformationList.equals(otherObj.unmountedShareInformationList) : this.unmountedShareInformationList == otherObj.unmountedShareInformationList);
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
/* 208 */     return (this.fileSystemInformation != null ? this.fileSystemInformation.hashCode() : 0) ^ (int)this.storageUsed ^ (this.hasProtectedFiles ? 1 : 0) ^ (this.mountInformationList != null ? this.mountInformationList.hashCode() : 0) ^ (this.unmountedShareInformationList != null ? this.unmountedShareInformationList.hashCode() : 0);
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
/* 221 */     return "FileSystemExtendedInformation [fileSystemInformation=" + this.fileSystemInformation + ", " + "storageUsed=" + this.storageUsed + ", " + "hasProtectedFiles=" + this.hasProtectedFiles + ", " + "mountInformationList=" + this.mountInformationList + ", " + "unmountedShareInformationList=" + this.unmountedShareInformationList + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FileSystemExtendedInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */