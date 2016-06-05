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
/*     */ @XmlType(name="renameSystemEventLogsFilter", propOrder={"filter", "newName"})
/*     */ public class RenameSystemEventLogsFilter
/*     */ {
/*     */   protected SystemEventLogsFilterUID filter;
/*     */   protected String newName;
/*     */   
/*     */   public RenameSystemEventLogsFilter() {}
/*     */   
/*     */   public RenameSystemEventLogsFilter(SystemEventLogsFilterUID filter, String newName)
/*     */   {
/*  47 */     this.filter = filter;
/*  48 */     this.newName = newName;
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
/*  60 */     return this.filter;
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
/*  72 */     this.filter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getNewName()
/*     */   {
/*  84 */     return this.newName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNewName(String value)
/*     */   {
/*  96 */     this.newName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof RenameSystemEventLogsFilter)) {
/* 107 */       return false;
/*     */     }
/* 109 */     RenameSystemEventLogsFilter otherObj = (RenameSystemEventLogsFilter)obj;
/*     */     
/* 111 */     return (this.filter != null ? this.filter.equals(otherObj.filter) : this.filter == otherObj.filter) && (this.newName != null ? this.newName.equals(otherObj.newName) : this.newName == otherObj.newName);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.filter != null ? this.filter.hashCode() : 0) ^ (this.newName != null ? this.newName.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "RenameSystemEventLogsFilter [filter=" + this.filter + ", " + "newName=" + this.newName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RenameSystemEventLogsFilter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */