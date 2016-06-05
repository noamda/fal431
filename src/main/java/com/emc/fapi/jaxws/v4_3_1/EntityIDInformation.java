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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="entityIDInformation", propOrder={"entities", "pathParamName"})
/*     */ public class EntityIDInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<EntityInformation> entities;
/*     */   protected String pathParamName;
/*     */   
/*     */   public EntityIDInformation() {}
/*     */   
/*     */   public EntityIDInformation(List<EntityInformation> entities, String pathParamName)
/*     */   {
/*  58 */     this.entities = entities;
/*  59 */     this.pathParamName = pathParamName;
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
/*     */   public List<EntityInformation> getEntities()
/*     */   {
/*  85 */     if (this.entities == null) {
/*  86 */       this.entities = new ArrayList();
/*     */     }
/*  88 */     return this.entities;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getPathParamName()
/*     */   {
/* 100 */     return this.pathParamName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPathParamName(String value)
/*     */   {
/* 112 */     this.pathParamName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 122 */     if (!(obj instanceof EntityIDInformation)) {
/* 123 */       return false;
/*     */     }
/* 125 */     EntityIDInformation otherObj = (EntityIDInformation)obj;
/*     */     
/* 127 */     return (this.entities != null ? this.entities.equals(otherObj.entities) : this.entities == otherObj.entities) && (this.pathParamName != null ? this.pathParamName.equals(otherObj.pathParamName) : this.pathParamName == otherObj.pathParamName);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 137 */     return (this.entities != null ? this.entities.hashCode() : 0) ^ (this.pathParamName != null ? this.pathParamName.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 147 */     return "EntityIDInformation [entities=" + this.entities + ", " + "pathParamName=" + this.pathParamName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EntityIDInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */