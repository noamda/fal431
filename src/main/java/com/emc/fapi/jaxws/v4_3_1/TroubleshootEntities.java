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
/*     */ @XmlType(name="troubleshootEntities", propOrder={"arrayUID", "entities"})
/*     */ public class TroubleshootEntities
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ArrayUID arrayUID;
/*     */   protected List<Entity> entities;
/*     */   
/*     */   public TroubleshootEntities() {}
/*     */   
/*     */   public TroubleshootEntities(ArrayUID arrayUID, List<Entity> entities)
/*     */   {
/*  51 */     this.arrayUID = arrayUID;
/*  52 */     this.entities = entities;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayUID getArrayUID()
/*     */   {
/*  64 */     return this.arrayUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setArrayUID(ArrayUID value)
/*     */   {
/*  76 */     this.arrayUID = value;
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
/*     */   public List<Entity> getEntities()
/*     */   {
/* 102 */     if (this.entities == null) {
/* 103 */       this.entities = new ArrayList();
/*     */     }
/* 105 */     return this.entities;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 115 */     if (!(obj instanceof TroubleshootEntities)) {
/* 116 */       return false;
/*     */     }
/* 118 */     TroubleshootEntities otherObj = (TroubleshootEntities)obj;
/*     */     
/* 120 */     return (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.entities != null ? this.entities.equals(otherObj.entities) : this.entities == otherObj.entities);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 130 */     return (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.entities != null ? this.entities.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 140 */     return "TroubleshootEntities [arrayUID=" + this.arrayUID + ", " + "entities=" + this.entities + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\TroubleshootEntities.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */