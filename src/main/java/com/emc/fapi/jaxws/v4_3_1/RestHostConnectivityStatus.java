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
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="restHostConnectivityStatus", propOrder={"restEnum"})
/*     */ public class RestHostConnectivityStatus
/*     */ {
/*     */   protected HostConnectivityStatus restEnum;
/*     */   
/*     */   public RestHostConnectivityStatus() {}
/*     */   
/*     */   public RestHostConnectivityStatus(HostConnectivityStatus restEnum)
/*     */   {
/*  51 */     this.restEnum = restEnum;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public HostConnectivityStatus getRestEnum()
/*     */   {
/*  63 */     return this.restEnum;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRestEnum(HostConnectivityStatus value)
/*     */   {
/*  75 */     this.restEnum = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  85 */     if (!(obj instanceof RestHostConnectivityStatus)) {
/*  86 */       return false;
/*     */     }
/*  88 */     RestHostConnectivityStatus otherObj = (RestHostConnectivityStatus)obj;
/*     */     
/*  90 */     return this.restEnum == otherObj.restEnum ? true : this.restEnum != null ? this.restEnum.equals(otherObj.restEnum) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  99 */     return this.restEnum != null ? this.restEnum.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 108 */     return "RestHostConnectivityStatus [restEnum=" + this.restEnum + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RestHostConnectivityStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */