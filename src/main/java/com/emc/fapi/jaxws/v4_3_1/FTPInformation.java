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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="FTPInformation", propOrder={"server", "port", "username", "password", "location", "filename"})
/*     */ public class FTPInformation
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected String server;
/*     */   protected int port;
/*     */   @XmlElement(required=true)
/*     */   protected String username;
/*     */   @XmlElement(required=true)
/*     */   protected byte[] password;
/*     */   protected String location;
/*     */   protected String filename;
/*     */   
/*     */   public FTPInformation() {}
/*     */   
/*     */   public FTPInformation(String server, int port, String username, byte[] password, String location, String filename)
/*     */   {
/*  63 */     this.server = server;
/*  64 */     this.port = port;
/*  65 */     this.username = username;
/*  66 */     this.password = password;
/*  67 */     this.location = location;
/*  68 */     this.filename = filename;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getServer()
/*     */   {
/*  80 */     return this.server;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setServer(String value)
/*     */   {
/*  92 */     this.server = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getPort()
/*     */   {
/* 100 */     return this.port;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPort(int value)
/*     */   {
/* 108 */     this.port = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getUsername()
/*     */   {
/* 120 */     return this.username;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUsername(String value)
/*     */   {
/* 132 */     this.username = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public byte[] getPassword()
/*     */   {
/* 143 */     return this.password;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPassword(byte[] value)
/*     */   {
/* 154 */     this.password = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getLocation()
/*     */   {
/* 166 */     return this.location;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLocation(String value)
/*     */   {
/* 178 */     this.location = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getFilename()
/*     */   {
/* 190 */     return this.filename;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFilename(String value)
/*     */   {
/* 202 */     this.filename = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 212 */     if (!(obj instanceof FTPInformation)) {
/* 213 */       return false;
/*     */     }
/* 215 */     FTPInformation otherObj = (FTPInformation)obj;
/*     */     
/* 217 */     return (this.server != null ? this.server.equals(otherObj.server) : this.server == otherObj.server) && (this.port == otherObj.port) && (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username) && (this.password != null ? this.password.equals(otherObj.password) : this.password == otherObj.password) && (this.location != null ? this.location.equals(otherObj.location) : this.location == otherObj.location) && (this.filename != null ? this.filename.equals(otherObj.filename) : this.filename == otherObj.filename);
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
/* 231 */     return (this.server != null ? this.server.hashCode() : 0) ^ this.port ^ (this.username != null ? this.username.hashCode() : 0) ^ (this.password != null ? this.password.hashCode() : 0) ^ (this.location != null ? this.location.hashCode() : 0) ^ (this.filename != null ? this.filename.hashCode() : 0);
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
/* 245 */     return "FTPInformation [server=" + this.server + ", " + "port=" + this.port + ", " + "username=" + this.username + ", " + "password=" + this.password + ", " + "location=" + this.location + ", " + "filename=" + this.filename + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FTPInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */