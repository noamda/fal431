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
/*     */ @XmlType(name="generateCallHomeEvents", propOrder={"script"})
/*     */ public class GenerateCallHomeEvents
/*     */ {
/*     */   protected String script;
/*     */   
/*     */   public GenerateCallHomeEvents() {}
/*     */   
/*     */   public GenerateCallHomeEvents(String script)
/*     */   {
/*  44 */     this.script = script;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getScript()
/*     */   {
/*  56 */     return this.script;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setScript(String value)
/*     */   {
/*  68 */     this.script = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof GenerateCallHomeEvents)) {
/*  79 */       return false;
/*     */     }
/*  81 */     GenerateCallHomeEvents otherObj = (GenerateCallHomeEvents)obj;
/*     */     
/*  83 */     return this.script == otherObj.script ? true : this.script != null ? this.script.equals(otherObj.script) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.script != null ? this.script.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "GenerateCallHomeEvents [script=" + this.script + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GenerateCallHomeEvents.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */