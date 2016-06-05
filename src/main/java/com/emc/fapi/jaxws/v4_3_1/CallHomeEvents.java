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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="CallHomeEvents", propOrder={"callHomeEvents"})
/*     */ public class CallHomeEvents
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected List<CallHomeEvent> callHomeEvents;
/*     */   
/*     */   public CallHomeEvents() {}
/*     */   
/*     */   public CallHomeEvents(List<CallHomeEvent> callHomeEvents)
/*     */   {
/*  48 */     this.callHomeEvents = callHomeEvents;
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
/*     */   public List<CallHomeEvent> getCallHomeEvents()
/*     */   {
/*  74 */     if (this.callHomeEvents == null) {
/*  75 */       this.callHomeEvents = new ArrayList();
/*     */     }
/*  77 */     return this.callHomeEvents;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof CallHomeEvents)) {
/*  88 */       return false;
/*     */     }
/*  90 */     CallHomeEvents otherObj = (CallHomeEvents)obj;
/*     */     
/*  92 */     return this.callHomeEvents == otherObj.callHomeEvents ? true : this.callHomeEvents != null ? this.callHomeEvents.equals(otherObj.callHomeEvents) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.callHomeEvents != null ? this.callHomeEvents.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "CallHomeEvents [callHomeEvents=" + this.callHomeEvents + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CallHomeEvents.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */