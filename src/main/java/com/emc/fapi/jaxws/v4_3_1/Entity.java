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
/*     */ @XmlType(name="Entity", propOrder={"type", "uuid"})
/*     */ public class Entity
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected EntityType type;
/*     */   @XmlElement(required=true)
/*     */   protected String uuid;
/*     */   
/*     */   public Entity() {}
/*     */   
/*     */   public Entity(EntityType type, String uuid)
/*     */   {
/*  50 */     this.type = type;
/*  51 */     this.uuid = uuid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public EntityType getType()
/*     */   {
/*  63 */     return this.type;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setType(EntityType value)
/*     */   {
/*  75 */     this.type = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getUuid()
/*     */   {
/*  87 */     return this.uuid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUuid(String value)
/*     */   {
/*  99 */     this.uuid = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof Entity)) {
/* 110 */       return false;
/*     */     }
/* 112 */     Entity otherObj = (Entity)obj;
/*     */     
/* 114 */     return (this.type != null ? this.type.equals(otherObj.type) : this.type == otherObj.type) && (this.uuid != null ? this.uuid.equals(otherObj.uuid) : this.uuid == otherObj.uuid);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.type != null ? this.type.hashCode() : 0) ^ (this.uuid != null ? this.uuid.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "Entity [type=" + this.type + ", " + "uuid=" + this.uuid + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\Entity.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */