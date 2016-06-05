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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="entityInformation", propOrder={"displayName", "idValue", "subEntities"})
/*     */ public class EntityInformation
/*     */ {
/*     */   protected String displayName;
/*     */   protected String idValue;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<EntityIDInformation> subEntities;
/*     */   
/*     */   public EntityInformation() {}
/*     */   
/*     */   public EntityInformation(String displayName, String idValue, List<EntityIDInformation> subEntities)
/*     */   {
/*  61 */     this.displayName = displayName;
/*  62 */     this.idValue = idValue;
/*  63 */     this.subEntities = subEntities;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDisplayName()
/*     */   {
/*  75 */     return this.displayName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDisplayName(String value)
/*     */   {
/*  87 */     this.displayName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getIdValue()
/*     */   {
/*  99 */     return this.idValue;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIdValue(String value)
/*     */   {
/* 111 */     this.idValue = value;
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
/*     */   public List<EntityIDInformation> getSubEntities()
/*     */   {
/* 137 */     if (this.subEntities == null) {
/* 138 */       this.subEntities = new ArrayList();
/*     */     }
/* 140 */     return this.subEntities;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 150 */     if (!(obj instanceof EntityInformation)) {
/* 151 */       return false;
/*     */     }
/* 153 */     EntityInformation otherObj = (EntityInformation)obj;
/*     */     
/* 155 */     return (this.displayName != null ? this.displayName.equals(otherObj.displayName) : this.displayName == otherObj.displayName) && (this.idValue != null ? this.idValue.equals(otherObj.idValue) : this.idValue == otherObj.idValue) && (this.subEntities != null ? this.subEntities.equals(otherObj.subEntities) : this.subEntities == otherObj.subEntities);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 166 */     return (this.displayName != null ? this.displayName.hashCode() : 0) ^ (this.idValue != null ? this.idValue.hashCode() : 0) ^ (this.subEntities != null ? this.subEntities.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 177 */     return "EntityInformation [displayName=" + this.displayName + ", " + "idValue=" + this.idValue + ", " + "subEntities=" + this.subEntities + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EntityInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */