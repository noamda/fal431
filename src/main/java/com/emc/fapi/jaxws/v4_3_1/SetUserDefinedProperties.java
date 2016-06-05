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
/*     */ @XmlType(name="setUserDefinedProperties", propOrder={"userDefinedProperties"})
/*     */ public class SetUserDefinedProperties
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected UserDefinedProperties userDefinedProperties;
/*     */   
/*     */   public SetUserDefinedProperties() {}
/*     */   
/*     */   public SetUserDefinedProperties(UserDefinedProperties userDefinedProperties)
/*     */   {
/*  46 */     this.userDefinedProperties = userDefinedProperties;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public UserDefinedProperties getUserDefinedProperties()
/*     */   {
/*  58 */     return this.userDefinedProperties;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUserDefinedProperties(UserDefinedProperties value)
/*     */   {
/*  70 */     this.userDefinedProperties = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  80 */     if (!(obj instanceof SetUserDefinedProperties)) {
/*  81 */       return false;
/*     */     }
/*  83 */     SetUserDefinedProperties otherObj = (SetUserDefinedProperties)obj;
/*     */     
/*  85 */     return this.userDefinedProperties == otherObj.userDefinedProperties ? true : this.userDefinedProperties != null ? this.userDefinedProperties.equals(otherObj.userDefinedProperties) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  94 */     return this.userDefinedProperties != null ? this.userDefinedProperties.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 103 */     return "SetUserDefinedProperties [userDefinedProperties=" + this.userDefinedProperties + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetUserDefinedProperties.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */