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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getAvailableArrayResourcePools", propOrder={"arrayUID", "useCache", "filterManaged"})
/*     */ public class GetAvailableArrayResourcePools
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ArrayUID arrayUID;
/*     */   protected boolean useCache;
/*     */   protected boolean filterManaged;
/*     */   
/*     */   public GetAvailableArrayResourcePools() {}
/*     */   
/*     */   public GetAvailableArrayResourcePools(ArrayUID arrayUID, boolean useCache, boolean filterManaged)
/*     */   {
/*  52 */     this.arrayUID = arrayUID;
/*  53 */     this.useCache = useCache;
/*  54 */     this.filterManaged = filterManaged;
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
/*  66 */     return this.arrayUID;
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
/*  78 */     this.arrayUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isUseCache()
/*     */   {
/*  86 */     return this.useCache;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUseCache(boolean value)
/*     */   {
/*  94 */     this.useCache = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isFilterManaged()
/*     */   {
/* 102 */     return this.filterManaged;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFilterManaged(boolean value)
/*     */   {
/* 110 */     this.filterManaged = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 120 */     if (!(obj instanceof GetAvailableArrayResourcePools)) {
/* 121 */       return false;
/*     */     }
/* 123 */     GetAvailableArrayResourcePools otherObj = (GetAvailableArrayResourcePools)obj;
/*     */     
/* 125 */     return (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.useCache == otherObj.useCache) && (this.filterManaged == otherObj.filterManaged);
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
/* 136 */     return (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.useCache ? 1 : 0) ^ (this.filterManaged ? 1 : 0);
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
/* 147 */     return "GetAvailableArrayResourcePools [arrayUID=" + this.arrayUID + ", " + "useCache=" + this.useCache + ", " + "filterManaged=" + this.filterManaged + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetAvailableArrayResourcePools.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */