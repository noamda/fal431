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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConnectionInfo", propOrder={"message", "status"})
/*     */ public class ConnectionInfo
/*     */ {
/*     */   protected String message;
/*     */   protected ConnectionStatus status;
/*     */   
/*     */   public ConnectionInfo() {}
/*     */   
/*     */   public ConnectionInfo(String message, ConnectionStatus status)
/*     */   {
/*  47 */     this.message = message;
/*  48 */     this.status = status;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getMessage()
/*     */   {
/*  60 */     return this.message;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMessage(String value)
/*     */   {
/*  72 */     this.message = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConnectionStatus getStatus()
/*     */   {
/*  84 */     return this.status;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStatus(ConnectionStatus value)
/*     */   {
/*  96 */     this.status = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof ConnectionInfo)) {
/* 107 */       return false;
/*     */     }
/* 109 */     ConnectionInfo otherObj = (ConnectionInfo)obj;
/*     */     
/* 111 */     return (this.message != null ? this.message.equals(otherObj.message) : this.message == otherObj.message) && (this.status != null ? this.status.equals(otherObj.status) : this.status == otherObj.status);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.message != null ? this.message.hashCode() : 0) ^ (this.status != null ? this.status.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "ConnectionInfo [message=" + this.message + ", " + "status=" + this.status + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConnectionInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */