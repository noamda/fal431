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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="FileSystemInformation", propOrder={"fileSystemUID", "volumes", "name", "defaultMountPath", "defaultDataMover", "size", "vdm"})
/*     */ public class FileSystemInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected FileSystemUID fileSystemUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<DeviceUID> volumes;
/*     */   protected String name;
/*     */   protected String defaultMountPath;
/*     */   protected String defaultDataMover;
/*     */   protected long size;
/*     */   protected boolean vdm;
/*     */   
/*     */   public FileSystemInformation() {}
/*     */   
/*     */   public FileSystemInformation(FileSystemUID fileSystemUID, List<DeviceUID> volumes, String name, String defaultMountPath, String defaultDataMover, long size, boolean vdm)
/*     */   {
/*  67 */     this.fileSystemUID = fileSystemUID;
/*  68 */     this.volumes = volumes;
/*  69 */     this.name = name;
/*  70 */     this.defaultMountPath = defaultMountPath;
/*  71 */     this.defaultDataMover = defaultDataMover;
/*  72 */     this.size = size;
/*  73 */     this.vdm = vdm;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public FileSystemUID getFileSystemUID()
/*     */   {
/*  85 */     return this.fileSystemUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFileSystemUID(FileSystemUID value)
/*     */   {
/*  97 */     this.fileSystemUID = value;
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
/*     */   public List<DeviceUID> getVolumes()
/*     */   {
/* 123 */     if (this.volumes == null) {
/* 124 */       this.volumes = new ArrayList();
/*     */     }
/* 126 */     return this.volumes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getName()
/*     */   {
/* 138 */     return this.name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setName(String value)
/*     */   {
/* 150 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDefaultMountPath()
/*     */   {
/* 162 */     return this.defaultMountPath;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDefaultMountPath(String value)
/*     */   {
/* 174 */     this.defaultMountPath = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDefaultDataMover()
/*     */   {
/* 186 */     return this.defaultDataMover;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDefaultDataMover(String value)
/*     */   {
/* 198 */     this.defaultDataMover = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getSize()
/*     */   {
/* 206 */     return this.size;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSize(long value)
/*     */   {
/* 214 */     this.size = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isVdm()
/*     */   {
/* 222 */     return this.vdm;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVdm(boolean value)
/*     */   {
/* 230 */     this.vdm = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 240 */     if (!(obj instanceof FileSystemInformation)) {
/* 241 */       return false;
/*     */     }
/* 243 */     FileSystemInformation otherObj = (FileSystemInformation)obj;
/*     */     
/* 245 */     return (this.fileSystemUID != null ? this.fileSystemUID.equals(otherObj.fileSystemUID) : this.fileSystemUID == otherObj.fileSystemUID) && (this.volumes != null ? this.volumes.equals(otherObj.volumes) : this.volumes == otherObj.volumes) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.defaultMountPath != null ? this.defaultMountPath.equals(otherObj.defaultMountPath) : this.defaultMountPath == otherObj.defaultMountPath) && (this.defaultDataMover != null ? this.defaultDataMover.equals(otherObj.defaultDataMover) : this.defaultDataMover == otherObj.defaultDataMover) && (this.size == otherObj.size) && (this.vdm == otherObj.vdm);
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
/*     */   public int hashCode()
/*     */   {
/* 260 */     return (this.fileSystemUID != null ? this.fileSystemUID.hashCode() : 0) ^ (this.volumes != null ? this.volumes.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.defaultMountPath != null ? this.defaultMountPath.hashCode() : 0) ^ (this.defaultDataMover != null ? this.defaultDataMover.hashCode() : 0) ^ (int)this.size ^ (this.vdm ? 1 : 0);
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
/*     */   public String toString()
/*     */   {
/* 275 */     return "FileSystemInformation [fileSystemUID=" + this.fileSystemUID + ", " + "volumes=" + this.volumes + ", " + "name=" + this.name + ", " + "defaultMountPath=" + this.defaultMountPath + ", " + "defaultDataMover=" + this.defaultDataMover + ", " + "size=" + this.size + ", " + "vdm=" + this.vdm + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FileSystemInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */