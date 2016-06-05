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
/*     */ @XmlType(name="VolumePath", propOrder={"volume", "path"})
/*     */ public class VolumePath
/*     */ {
/*     */   protected long volume;
/*     */   @XmlElement(nillable=true)
/*     */   protected Path path;
/*     */   
/*     */   public VolumePath() {}
/*     */   
/*     */   public VolumePath(long volume, Path path)
/*     */   {
/*  49 */     this.volume = volume;
/*  50 */     this.path = path;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getVolume()
/*     */   {
/*  58 */     return this.volume;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolume(long value)
/*     */   {
/*  66 */     this.volume = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Path getPath()
/*     */   {
/*  78 */     return this.path;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPath(Path value)
/*     */   {
/*  90 */     this.path = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 100 */     if (!(obj instanceof VolumePath)) {
/* 101 */       return false;
/*     */     }
/* 103 */     VolumePath otherObj = (VolumePath)obj;
/*     */     
/* 105 */     return (this.volume == otherObj.volume) && (this.path != null ? this.path.equals(otherObj.path) : this.path == otherObj.path);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 115 */     return (int)this.volume ^ (this.path != null ? this.path.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 125 */     return "VolumePath [volume=" + this.volume + ", " + "path=" + this.path + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VolumePath.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */