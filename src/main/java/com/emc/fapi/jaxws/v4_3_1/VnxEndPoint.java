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
/*     */ @XmlType(name="VnxEndPoint", propOrder={"ip", "port"})
/*     */ public class VnxEndPoint
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected String ip;
/*     */   protected int port;
/*     */   
/*     */   public VnxEndPoint() {}
/*     */   
/*     */   public VnxEndPoint(String ip, int port)
/*     */   {
/*  49 */     this.ip = ip;
/*  50 */     this.port = port;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getIp()
/*     */   {
/*  62 */     return this.ip;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIp(String value)
/*     */   {
/*  74 */     this.ip = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getPort()
/*     */   {
/*  82 */     return this.port;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPort(int value)
/*     */   {
/*  90 */     this.port = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 100 */     if (!(obj instanceof VnxEndPoint)) {
/* 101 */       return false;
/*     */     }
/* 103 */     VnxEndPoint otherObj = (VnxEndPoint)obj;
/*     */     
/* 105 */     return (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip) && (this.port == otherObj.port);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 115 */     return (this.ip != null ? this.ip.hashCode() : 0) ^ this.port;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 125 */     return "VnxEndPoint [ip=" + this.ip + ", " + "port=" + this.port + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VnxEndPoint.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */