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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ArrayConfigRequirement", propOrder={"param", "type"})
/*     */ public class ArrayConfigRequirement
/*     */ {
/*     */   protected String param;
/*     */   protected ConfigParamType type;
/*     */   
/*     */   public ArrayConfigRequirement() {}
/*     */   
/*     */   public ArrayConfigRequirement(String param, ConfigParamType type)
/*     */   {
/*  47 */     this.param = param;
/*  48 */     this.type = type;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getParam()
/*     */   {
/*  60 */     return this.param;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setParam(String value)
/*     */   {
/*  72 */     this.param = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConfigParamType getType()
/*     */   {
/*  84 */     return this.type;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setType(ConfigParamType value)
/*     */   {
/*  96 */     this.type = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof ArrayConfigRequirement)) {
/* 107 */       return false;
/*     */     }
/* 109 */     ArrayConfigRequirement otherObj = (ArrayConfigRequirement)obj;
/*     */     
/* 111 */     return (this.param != null ? this.param.equals(otherObj.param) : this.param == otherObj.param) && (this.type != null ? this.type.equals(otherObj.type) : this.type == otherObj.type);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.param != null ? this.param.hashCode() : 0) ^ (this.type != null ? this.type.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "ArrayConfigRequirement [param=" + this.param + ", " + "type=" + this.type + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayConfigRequirement.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */