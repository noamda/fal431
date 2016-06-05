/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
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
/*     */ @XmlType(name="setCallHomeEvents", propOrder={"callHomeEvents"})
/*     */ public class SetCallHomeEvents
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected CallHomeEvents callHomeEvents;
/*     */   
/*     */   public SetCallHomeEvents() {}
/*     */   
/*     */   public SetCallHomeEvents(CallHomeEvents callHomeEvents)
/*     */   {
/*  46 */     this.callHomeEvents = callHomeEvents;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public CallHomeEvents getCallHomeEvents()
/*     */   {
/*  58 */     return this.callHomeEvents;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCallHomeEvents(CallHomeEvents value)
/*     */   {
/*  70 */     this.callHomeEvents = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  80 */     if (!(obj instanceof SetCallHomeEvents)) {
/*  81 */       return false;
/*     */     }
/*  83 */     SetCallHomeEvents otherObj = (SetCallHomeEvents)obj;
/*     */     
/*  85 */     return this.callHomeEvents == otherObj.callHomeEvents ? true : this.callHomeEvents != null ? this.callHomeEvents.equals(otherObj.callHomeEvents) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  94 */     return this.callHomeEvents != null ? this.callHomeEvents.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 103 */     return "SetCallHomeEvents [callHomeEvents=" + this.callHomeEvents + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetCallHomeEvents.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */