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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="EntityInfo", propOrder={"entity", "name"})
/*     */ public class EntityInfo
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected Entity entity;
/*     */   protected String name;
/*     */   
/*     */   public EntityInfo() {}
/*     */   
/*     */   public EntityInfo(Entity entity, String name)
/*     */   {
/*  49 */     this.entity = entity;
/*  50 */     this.name = name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Entity getEntity()
/*     */   {
/*  62 */     return this.entity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEntity(Entity value)
/*     */   {
/*  74 */     this.entity = value;
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
/*  86 */     return this.name;
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
/*  98 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 108 */     if (!(obj instanceof EntityInfo)) {
/* 109 */       return false;
/*     */     }
/* 111 */     EntityInfo otherObj = (EntityInfo)obj;
/*     */     
/* 113 */     return (this.entity != null ? this.entity.equals(otherObj.entity) : this.entity == otherObj.entity) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 123 */     return (this.entity != null ? this.entity.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 133 */     return "EntityInfo [entity=" + this.entity + ", " + "name=" + this.name + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EntityInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */