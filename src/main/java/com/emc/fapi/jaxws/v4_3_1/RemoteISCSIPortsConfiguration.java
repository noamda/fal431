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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="RemoteISCSIPortsConfiguration", propOrder={"name", "portsInformation"})
/*     */ public class RemoteISCSIPortsConfiguration
/*     */ {
/*     */   protected String name;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RemoteISCSIPortInformation> portsInformation;
/*     */   
/*     */   public RemoteISCSIPortsConfiguration() {}
/*     */   
/*     */   public RemoteISCSIPortsConfiguration(String name, List<RemoteISCSIPortInformation> portsInformation)
/*     */   {
/*  51 */     this.name = name;
/*  52 */     this.portsInformation = portsInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getName()
/*     */   {
/*  64 */     return this.name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setName(String value)
/*     */   {
/*  76 */     this.name = value;
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
/*     */   public List<RemoteISCSIPortInformation> getPortsInformation()
/*     */   {
/* 102 */     if (this.portsInformation == null) {
/* 103 */       this.portsInformation = new ArrayList();
/*     */     }
/* 105 */     return this.portsInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 115 */     if (!(obj instanceof RemoteISCSIPortsConfiguration)) {
/* 116 */       return false;
/*     */     }
/* 118 */     RemoteISCSIPortsConfiguration otherObj = (RemoteISCSIPortsConfiguration)obj;
/*     */     
/* 120 */     return (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.portsInformation != null ? this.portsInformation.equals(otherObj.portsInformation) : this.portsInformation == otherObj.portsInformation);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 130 */     return (this.name != null ? this.name.hashCode() : 0) ^ (this.portsInformation != null ? this.portsInformation.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 140 */     return "RemoteISCSIPortsConfiguration [name=" + this.name + ", " + "portsInformation=" + this.portsInformation + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RemoteISCSIPortsConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */