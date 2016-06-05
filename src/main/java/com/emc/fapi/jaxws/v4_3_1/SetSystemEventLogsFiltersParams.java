/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="setSystemEventLogsFiltersParams", propOrder={"filters"})
/*     */ public class SetSystemEventLogsFiltersParams
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SystemEventLogsFilter> filters;
/*     */   
/*     */   public SetSystemEventLogsFiltersParams() {}
/*     */   
/*     */   public SetSystemEventLogsFiltersParams(List<SystemEventLogsFilter> filters)
/*     */   {
/*  55 */     this.filters = filters;
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
/*  81 */     if (this.filters == null) {
/*  82 */       this.filters = new ArrayList();
/*     */     }
/*  84 */     return this.filters;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  94 */     if (!(obj instanceof SetSystemEventLogsFiltersParams)) {
/*  95 */       return false;
/*     */     }
/*  97 */     SetSystemEventLogsFiltersParams otherObj = (SetSystemEventLogsFiltersParams)obj;
/*     */     
/*  99 */     return this.filters == otherObj.filters ? true : this.filters != null ? this.filters.equals(otherObj.filters) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 108 */     return this.filters != null ? this.filters.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 117 */     return "SetSystemEventLogsFiltersParams [filters=" + this.filters + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetSystemEventLogsFiltersParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */