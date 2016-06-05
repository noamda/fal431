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
/*     */ @XmlType(name="validateRemoveSystemEventLogsFilter", propOrder={"filter"})
/*     */ public class ValidateRemoveSystemEventLogsFilter
/*     */ {
/*     */   protected SystemEventLogsFilterUID filter;
/*     */   
/*     */   public ValidateRemoveSystemEventLogsFilter() {}
/*     */   
/*     */   public ValidateRemoveSystemEventLogsFilter(SystemEventLogsFilterUID filter)
/*     */   {
/*  44 */     this.filter = filter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemEventLogsFilterUID getFilter()
/*     */   {
/*  56 */     return this.filter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFilter(SystemEventLogsFilterUID value)
/*     */   {
/*  68 */     this.filter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof ValidateRemoveSystemEventLogsFilter)) {
/*  79 */       return false;
/*     */     }
/*  81 */     ValidateRemoveSystemEventLogsFilter otherObj = (ValidateRemoveSystemEventLogsFilter)obj;
/*     */     
/*  83 */     return this.filter == otherObj.filter ? true : this.filter != null ? this.filter.equals(otherObj.filter) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.filter != null ? this.filter.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "ValidateRemoveSystemEventLogsFilter [filter=" + this.filter + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateRemoveSystemEventLogsFilter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */