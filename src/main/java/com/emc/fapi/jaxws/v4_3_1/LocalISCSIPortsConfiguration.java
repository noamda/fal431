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
/*     */ @XmlType(name="LocalISCSIPortsConfiguration", propOrder={"portsInformation"})
/*     */ public class LocalISCSIPortsConfiguration
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<LocalISCSIPortInformation> portsInformation;
/*     */   
/*     */   public LocalISCSIPortsConfiguration() {}
/*     */   
/*     */   public LocalISCSIPortsConfiguration(List<LocalISCSIPortInformation> portsInformation)
/*     */   {
/*  48 */     this.portsInformation = portsInformation;
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
/*     */   public List<LocalISCSIPortInformation> getPortsInformation()
/*     */   {
/*  74 */     if (this.portsInformation == null) {
/*  75 */       this.portsInformation = new ArrayList();
/*     */     }
/*  77 */     return this.portsInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof LocalISCSIPortsConfiguration)) {
/*  88 */       return false;
/*     */     }
/*  90 */     LocalISCSIPortsConfiguration otherObj = (LocalISCSIPortsConfiguration)obj;
/*     */     
/*  92 */     return this.portsInformation == otherObj.portsInformation ? true : this.portsInformation != null ? this.portsInformation.equals(otherObj.portsInformation) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.portsInformation != null ? this.portsInformation.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "LocalISCSIPortsConfiguration [portsInformation=" + this.portsInformation + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\LocalISCSIPortsConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */