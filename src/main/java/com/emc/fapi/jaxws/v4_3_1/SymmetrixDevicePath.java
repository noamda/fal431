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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SymmetrixDevicePath", propOrder={"device", "lun", "port", "wwn"})
/*     */ public class SymmetrixDevicePath
/*     */ {
/*     */   protected String device;
/*     */   protected long lun;
/*     */   protected int port;
/*     */   @XmlElement(name="WWN")
/*     */   protected long wwn;
/*     */   
/*     */   public SymmetrixDevicePath() {}
/*     */   
/*     */   public SymmetrixDevicePath(String device, long lun, int port, long wwn)
/*     */   {
/*  55 */     this.device = device;
/*  56 */     this.lun = lun;
/*  57 */     this.port = port;
/*  58 */     this.wwn = wwn;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDevice()
/*     */   {
/*  70 */     return this.device;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDevice(String value)
/*     */   {
/*  82 */     this.device = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getLun()
/*     */   {
/*  90 */     return this.lun;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLun(long value)
/*     */   {
/*  98 */     this.lun = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getPort()
/*     */   {
/* 106 */     return this.port;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPort(int value)
/*     */   {
/* 114 */     this.port = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getWWN()
/*     */   {
/* 122 */     return this.wwn;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setWWN(long value)
/*     */   {
/* 130 */     this.wwn = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 140 */     if (!(obj instanceof SymmetrixDevicePath)) {
/* 141 */       return false;
/*     */     }
/* 143 */     SymmetrixDevicePath otherObj = (SymmetrixDevicePath)obj;
/*     */     
/* 145 */     return (this.device != null ? this.device.equals(otherObj.device) : this.device == otherObj.device) && (this.lun == otherObj.lun) && (this.port == otherObj.port) && (this.wwn == otherObj.wwn);
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
/* 157 */     return (this.device != null ? this.device.hashCode() : 0) ^ (int)this.lun ^ this.port ^ (int)this.wwn;
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
/* 169 */     return "SymmetrixDevicePath [device=" + this.device + ", " + "lun=" + this.lun + ", " + "port=" + this.port + ", " + "wwn=" + this.wwn + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SymmetrixDevicePath.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */