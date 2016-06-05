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
/*     */ @XmlType(name="DataMoverView", propOrder={"ipAddresses", "name"})
/*     */ public class DataMoverView
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<String> ipAddresses;
/*     */   protected String name;
/*     */   
/*     */   public DataMoverView() {}
/*     */   
/*     */   public DataMoverView(List<String> ipAddresses, String name)
/*     */   {
/*  51 */     this.ipAddresses = ipAddresses;
/*  52 */     this.name = name;
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
/*     */   public List<String> getIpAddresses()
/*     */   {
/*  78 */     if (this.ipAddresses == null) {
/*  79 */       this.ipAddresses = new ArrayList();
/*     */     }
/*  81 */     return this.ipAddresses;
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
/*  93 */     return this.name;
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
/* 105 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 115 */     if (!(obj instanceof DataMoverView)) {
/* 116 */       return false;
/*     */     }
/* 118 */     DataMoverView otherObj = (DataMoverView)obj;
/*     */     
/* 120 */     return (this.ipAddresses != null ? this.ipAddresses.equals(otherObj.ipAddresses) : this.ipAddresses == otherObj.ipAddresses) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 130 */     return (this.ipAddresses != null ? this.ipAddresses.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 140 */     return "DataMoverView [ipAddresses=" + this.ipAddresses + ", " + "name=" + this.name + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\DataMoverView.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */