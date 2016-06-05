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
/*     */ @XmlType(name="entitiesIDInformation", propOrder={"entities", "rootDisplayName"})
/*     */ public class EntitiesIDInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<EntityIDInformation> entities;
/*     */   protected String rootDisplayName;
/*     */   
/*     */   public EntitiesIDInformation() {}
/*     */   
/*     */   public EntitiesIDInformation(List<EntityIDInformation> entities, String rootDisplayName)
/*     */   {
/*  58 */     this.entities = entities;
/*  59 */     this.rootDisplayName = rootDisplayName;
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
/*     */   public List<EntityIDInformation> getEntities()
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
/*     */   public String getRootDisplayName()
/*     */   {
/* 100 */     return this.rootDisplayName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRootDisplayName(String value)
/*     */   {
/* 112 */     this.rootDisplayName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 122 */     if (!(obj instanceof EntitiesIDInformation)) {
/* 123 */       return false;
/*     */     }
/* 125 */     EntitiesIDInformation otherObj = (EntitiesIDInformation)obj;
/*     */     
/* 127 */     return (this.entities != null ? this.entities.equals(otherObj.entities) : this.entities == otherObj.entities) && (this.rootDisplayName != null ? this.rootDisplayName.equals(otherObj.rootDisplayName) : this.rootDisplayName == otherObj.rootDisplayName);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 137 */     return (this.entities != null ? this.entities.hashCode() : 0) ^ (this.rootDisplayName != null ? this.rootDisplayName.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 147 */     return "EntitiesIDInformation [entities=" + this.entities + ", " + "rootDisplayName=" + this.rootDisplayName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EntitiesIDInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */