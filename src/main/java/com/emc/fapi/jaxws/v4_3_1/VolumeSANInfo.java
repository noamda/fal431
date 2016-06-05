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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VolumeSANInfo", propOrder={"channel", "lun", "path", "target"})
/*     */ public class VolumeSANInfo
/*     */ {
/*     */   protected Integer channel;
/*     */   protected Integer lun;
/*     */   protected String path;
/*     */   protected Long target;
/*     */   
/*     */   public VolumeSANInfo() {}
/*     */   
/*     */   public VolumeSANInfo(Integer channel, Integer lun, String path, Long target)
/*     */   {
/*  53 */     this.channel = channel;
/*  54 */     this.lun = lun;
/*  55 */     this.path = path;
/*  56 */     this.target = target;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Integer getChannel()
/*     */   {
/*  68 */     return this.channel;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setChannel(Integer value)
/*     */   {
/*  80 */     this.channel = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Integer getLun()
/*     */   {
/*  92 */     return this.lun;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLun(Integer value)
/*     */   {
/* 104 */     this.lun = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getPath()
/*     */   {
/* 116 */     return this.path;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPath(String value)
/*     */   {
/* 128 */     this.path = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getTarget()
/*     */   {
/* 140 */     return this.target;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTarget(Long value)
/*     */   {
/* 152 */     this.target = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 162 */     if (!(obj instanceof VolumeSANInfo)) {
/* 163 */       return false;
/*     */     }
/* 165 */     VolumeSANInfo otherObj = (VolumeSANInfo)obj;
/*     */     
/* 167 */     return (this.channel != null ? this.channel.equals(otherObj.channel) : this.channel == otherObj.channel) && (this.lun != null ? this.lun.equals(otherObj.lun) : this.lun == otherObj.lun) && (this.path != null ? this.path.equals(otherObj.path) : this.path == otherObj.path) && (this.target != null ? this.target.equals(otherObj.target) : this.target == otherObj.target);
/*     */   }
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
/* 179 */     return (this.channel != null ? this.channel.hashCode() : 0) ^ (this.lun != null ? this.lun.hashCode() : 0) ^ (this.path != null ? this.path.hashCode() : 0) ^ (this.target != null ? this.target.hashCode() : 0);
/*     */   }
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
/* 191 */     return "VolumeSANInfo [channel=" + this.channel + ", " + "lun=" + this.lun + ", " + "path=" + this.path + ", " + "target=" + this.target + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VolumeSANInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */