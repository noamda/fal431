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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="FileSystemUID", propOrder={"id", "vnxUID"})
/*     */ public class FileSystemUID
/*     */ {
/*     */   protected long id;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VnxUID vnxUID;
/*     */   
/*     */   public FileSystemUID() {}
/*     */   
/*     */   public FileSystemUID(long id, VnxUID vnxUID)
/*     */   {
/*  49 */     this.id = id;
/*  50 */     this.vnxUID = vnxUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getId()
/*     */   {
/*  58 */     return this.id;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setId(long value)
/*     */   {
/*  66 */     this.id = value;
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
/*  78 */     return this.vnxUID;
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
/*  90 */     this.vnxUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 100 */     if (!(obj instanceof FileSystemUID)) {
/* 101 */       return false;
/*     */     }
/* 103 */     FileSystemUID otherObj = (FileSystemUID)obj;
/*     */     
/* 105 */     return (this.id == otherObj.id) && (this.vnxUID != null ? this.vnxUID.equals(otherObj.vnxUID) : this.vnxUID == otherObj.vnxUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 115 */     return (int)this.id ^ (this.vnxUID != null ? this.vnxUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 125 */     return "FileSystemUID [id=" + this.id + ", " + "vnxUID=" + this.vnxUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FileSystemUID.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */