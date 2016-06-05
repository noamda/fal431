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
/*     */ @XmlType(name="VCenterServer", propOrder={"vcenterServerUID", "userName", "port", "certificateConfigured"})
/*     */ public class VCenterServer
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected VCenterServerUID vcenterServerUID;
/*     */   protected String userName;
/*     */   protected int port;
/*     */   protected boolean certificateConfigured;
/*     */   
/*     */   public VCenterServer() {}
/*     */   
/*     */   public VCenterServer(VCenterServerUID vcenterServerUID, String userName, int port, boolean certificateConfigured)
/*     */   {
/*  55 */     this.vcenterServerUID = vcenterServerUID;
/*  56 */     this.userName = userName;
/*  57 */     this.port = port;
/*  58 */     this.certificateConfigured = certificateConfigured;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VCenterServerUID getVcenterServerUID()
/*     */   {
/*  70 */     return this.vcenterServerUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVcenterServerUID(VCenterServerUID value)
/*     */   {
/*  82 */     this.vcenterServerUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getUserName()
/*     */   {
/*  94 */     return this.userName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUserName(String value)
/*     */   {
/* 106 */     this.userName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getPort()
/*     */   {
/* 114 */     return this.port;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPort(int value)
/*     */   {
/* 122 */     this.port = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isCertificateConfigured()
/*     */   {
/* 130 */     return this.certificateConfigured;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCertificateConfigured(boolean value)
/*     */   {
/* 138 */     this.certificateConfigured = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 148 */     if (!(obj instanceof VCenterServer)) {
/* 149 */       return false;
/*     */     }
/* 151 */     VCenterServer otherObj = (VCenterServer)obj;
/*     */     
/* 153 */     return (this.vcenterServerUID != null ? this.vcenterServerUID.equals(otherObj.vcenterServerUID) : this.vcenterServerUID == otherObj.vcenterServerUID) && (this.userName != null ? this.userName.equals(otherObj.userName) : this.userName == otherObj.userName) && (this.port == otherObj.port) && (this.certificateConfigured == otherObj.certificateConfigured);
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
/* 165 */     return (this.vcenterServerUID != null ? this.vcenterServerUID.hashCode() : 0) ^ (this.userName != null ? this.userName.hashCode() : 0) ^ this.port ^ (this.certificateConfigured ? 1 : 0);
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
/* 177 */     return "VCenterServer [vcenterServerUID=" + this.vcenterServerUID + ", " + "userName=" + this.userName + ", " + "port=" + this.port + ", " + "certificateConfigured=" + this.certificateConfigured + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VCenterServer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */