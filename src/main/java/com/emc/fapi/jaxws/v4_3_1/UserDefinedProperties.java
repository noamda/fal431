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
/*     */ @XmlType(name="UserDefinedProperties", propOrder={"properties"})
/*     */ public class UserDefinedProperties
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<Property> properties;
/*     */   
/*     */   public UserDefinedProperties() {}
/*     */   
/*     */   public UserDefinedProperties(List<Property> properties)
/*     */   {
/*  48 */     this.properties = properties;
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
/*     */   public List<Property> getProperties()
/*     */   {
/*  74 */     if (this.properties == null) {
/*  75 */       this.properties = new ArrayList();
/*     */     }
/*  77 */     return this.properties;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof UserDefinedProperties)) {
/*  88 */       return false;
/*     */     }
/*  90 */     UserDefinedProperties otherObj = (UserDefinedProperties)obj;
/*     */     
/*  92 */     return this.properties == otherObj.properties ? true : this.properties != null ? this.properties.equals(otherObj.properties) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.properties != null ? this.properties.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "UserDefinedProperties [properties=" + this.properties + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\UserDefinedProperties.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */