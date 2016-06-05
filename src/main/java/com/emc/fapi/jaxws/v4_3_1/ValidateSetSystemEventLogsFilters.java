/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="validateSetSystemEventLogsFilters", propOrder={"filters"})
/*     */ public class ValidateSetSystemEventLogsFilters
/*     */ {
/*     */   protected List<SystemEventLogsFilter> filters;
/*     */   
/*     */   public ValidateSetSystemEventLogsFilters() {}
/*     */   
/*     */   public ValidateSetSystemEventLogsFilters(List<SystemEventLogsFilter> filters)
/*     */   {
/*  46 */     this.filters = filters;
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
/*     */   public List<SystemEventLogsFilter> getFilters()
/*     */   {
/*  72 */     if (this.filters == null) {
/*  73 */       this.filters = new ArrayList();
/*     */     }
/*  75 */     return this.filters;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  85 */     if (!(obj instanceof ValidateSetSystemEventLogsFilters)) {
/*  86 */       return false;
/*     */     }
/*  88 */     ValidateSetSystemEventLogsFilters otherObj = (ValidateSetSystemEventLogsFilters)obj;
/*     */     
/*  90 */     return this.filters == otherObj.filters ? true : this.filters != null ? this.filters.equals(otherObj.filters) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  99 */     return this.filters != null ? this.filters.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 108 */     return "ValidateSetSystemEventLogsFilters [filters=" + this.filters + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateSetSystemEventLogsFilters.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */