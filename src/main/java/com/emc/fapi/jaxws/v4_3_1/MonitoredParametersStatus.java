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
/*     */ @XmlType(name="MonitoredParametersStatus", propOrder={"parameters"})
/*     */ public class MonitoredParametersStatus
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<MonitoredParameter> parameters;
/*     */   
/*     */   public MonitoredParametersStatus() {}
/*     */   
/*     */   public MonitoredParametersStatus(List<MonitoredParameter> parameters)
/*     */   {
/*  48 */     this.parameters = parameters;
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
/*     */   public List<MonitoredParameter> getParameters()
/*     */   {
/*  74 */     if (this.parameters == null) {
/*  75 */       this.parameters = new ArrayList();
/*     */     }
/*  77 */     return this.parameters;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof MonitoredParametersStatus)) {
/*  88 */       return false;
/*     */     }
/*  90 */     MonitoredParametersStatus otherObj = (MonitoredParametersStatus)obj;
/*     */     
/*  92 */     return this.parameters == otherObj.parameters ? true : this.parameters != null ? this.parameters.equals(otherObj.parameters) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.parameters != null ? this.parameters.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "MonitoredParametersStatus [parameters=" + this.parameters + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\MonitoredParametersStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */