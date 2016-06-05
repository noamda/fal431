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
/*     */ @XmlType(name="ArrayConnectivityInfo", propOrder={"details", "status"})
/*     */ public class ArrayConnectivityInfo
/*     */ {
/*     */   protected String details;
/*     */   protected ArrayConnectivityStatus status;
/*     */   
/*     */   public ArrayConnectivityInfo() {}
/*     */   
/*     */   public ArrayConnectivityInfo(String details, ArrayConnectivityStatus status)
/*     */   {
/*  47 */     this.details = details;
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
/*     */   public String getDetails()
/*     */   {
/*  60 */     return this.details;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDetails(String value)
/*     */   {
/*  72 */     this.details = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayConnectivityStatus getStatus()
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
/*     */   public void setStatus(ArrayConnectivityStatus value)
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
/* 106 */     if (!(obj instanceof ArrayConnectivityInfo)) {
/* 107 */       return false;
/*     */     }
/* 109 */     ArrayConnectivityInfo otherObj = (ArrayConnectivityInfo)obj;
/*     */     
/* 111 */     return (this.details != null ? this.details.equals(otherObj.details) : this.details == otherObj.details) && (this.status != null ? this.status.equals(otherObj.status) : this.status == otherObj.status);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.details != null ? this.details.hashCode() : 0) ^ (this.status != null ? this.status.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "ArrayConnectivityInfo [details=" + this.details + ", " + "status=" + this.status + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayConnectivityInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */