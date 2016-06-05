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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getVCCertificateInformation", propOrder={"cluster", "ip", "port"})
/*     */ public class GetVCCertificateInformation
/*     */ {
/*     */   protected ClusterUID cluster;
/*     */   protected String ip;
/*     */   protected int port;
/*     */   
/*     */   public GetVCCertificateInformation() {}
/*     */   
/*     */   public GetVCCertificateInformation(ClusterUID cluster, String ip, int port)
/*     */   {
/*  50 */     this.cluster = cluster;
/*  51 */     this.ip = ip;
/*  52 */     this.port = port;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getCluster()
/*     */   {
/*  64 */     return this.cluster;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCluster(ClusterUID value)
/*     */   {
/*  76 */     this.cluster = value;
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
/*  88 */     return this.ip;
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
/* 100 */     this.ip = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getPort()
/*     */   {
/* 108 */     return this.port;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPort(int value)
/*     */   {
/* 116 */     this.port = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 126 */     if (!(obj instanceof GetVCCertificateInformation)) {
/* 127 */       return false;
/*     */     }
/* 129 */     GetVCCertificateInformation otherObj = (GetVCCertificateInformation)obj;
/*     */     
/* 131 */     return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip) && (this.port == otherObj.port);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 142 */     return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.ip != null ? this.ip.hashCode() : 0) ^ this.port;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 153 */     return "GetVCCertificateInformation [cluster=" + this.cluster + ", " + "ip=" + this.ip + ", " + "port=" + this.port + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetVCCertificateInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */