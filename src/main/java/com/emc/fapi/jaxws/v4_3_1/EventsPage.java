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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="eventsPage", propOrder={"content", "pageNumber", "pageSize"})
/*     */ public class EventsPage
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<EventLog> content;
/*     */   protected int pageNumber;
/*     */   protected int pageSize;
/*     */   
/*     */   public EventsPage() {}
/*     */   
/*     */   public EventsPage(List<EventLog> content, int pageNumber, int pageSize)
/*     */   {
/*  61 */     this.content = content;
/*  62 */     this.pageNumber = pageNumber;
/*  63 */     this.pageSize = pageSize;
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
/*     */   public List<EventLog> getContent()
/*     */   {
/*  89 */     if (this.content == null) {
/*  90 */       this.content = new ArrayList();
/*     */     }
/*  92 */     return this.content;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getPageNumber()
/*     */   {
/* 100 */     return this.pageNumber;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPageNumber(int value)
/*     */   {
/* 108 */     this.pageNumber = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getPageSize()
/*     */   {
/* 116 */     return this.pageSize;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPageSize(int value)
/*     */   {
/* 124 */     this.pageSize = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 134 */     if (!(obj instanceof EventsPage)) {
/* 135 */       return false;
/*     */     }
/* 137 */     EventsPage otherObj = (EventsPage)obj;
/*     */     
/* 139 */     return (this.content != null ? this.content.equals(otherObj.content) : this.content == otherObj.content) && (this.pageNumber == otherObj.pageNumber) && (this.pageSize == otherObj.pageSize);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 150 */     return (this.content != null ? this.content.hashCode() : 0) ^ this.pageNumber ^ this.pageSize;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 161 */     return "EventsPage [content=" + this.content + ", " + "pageNumber=" + this.pageNumber + ", " + "pageSize=" + this.pageSize + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EventsPage.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */