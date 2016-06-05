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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getEventLogsWithLargerUID", propOrder={"eventUID"})
/*     */ public class GetEventLogsWithLargerUID
/*     */ {
/*     */   protected SystemEventUID eventUID;
/*     */   
/*     */   public GetEventLogsWithLargerUID() {}
/*     */   
/*     */   public GetEventLogsWithLargerUID(SystemEventUID eventUID)
/*     */   {
/*  44 */     this.eventUID = eventUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemEventUID getEventUID()
/*     */   {
/*  56 */     return this.eventUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEventUID(SystemEventUID value)
/*     */   {
/*  68 */     this.eventUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof GetEventLogsWithLargerUID)) {
/*  79 */       return false;
/*     */     }
/*  81 */     GetEventLogsWithLargerUID otherObj = (GetEventLogsWithLargerUID)obj;
/*     */     
/*  83 */     return this.eventUID == otherObj.eventUID ? true : this.eventUID != null ? this.eventUID.equals(otherObj.eventUID) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.eventUID != null ? this.eventUID.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "GetEventLogsWithLargerUID [eventUID=" + this.eventUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetEventLogsWithLargerUID.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */