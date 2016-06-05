/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSeeAlso;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonSubTypes;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.As;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=VCenterServerESXFilter.class, name="VCenterServerESXFilter"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=VCenterServerLunFilter.class, name="VCenterServerLunFilter"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=VCenterServerVMFilter.class, name="VCenterServerVMFilter")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VCenterServerFilter", propOrder={"filterType", "filteredEntityName"})
/*     */ @XmlSeeAlso({VCenterServerVMFilter.class, VCenterServerESXFilter.class, VCenterServerLunFilter.class})
/*     */ public abstract class VCenterServerFilter
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected VCenterServerFilterType filterType;
/*     */   @XmlElement(required=true)
/*     */   protected String filteredEntityName;
/*     */   
/*     */   public VCenterServerFilter() {}
/*     */   
/*     */   public VCenterServerFilter(VCenterServerFilterType filterType, String filteredEntityName)
/*     */   {
/*  69 */     this.filterType = filterType;
/*  70 */     this.filteredEntityName = filteredEntityName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VCenterServerFilterType getFilterType()
/*     */   {
/*  82 */     return this.filterType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFilterType(VCenterServerFilterType value)
/*     */   {
/*  94 */     this.filterType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getFilteredEntityName()
/*     */   {
/* 106 */     return this.filteredEntityName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFilteredEntityName(String value)
/*     */   {
/* 118 */     this.filteredEntityName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 128 */     if (!(obj instanceof VCenterServerFilter)) {
/* 129 */       return false;
/*     */     }
/* 131 */     VCenterServerFilter otherObj = (VCenterServerFilter)obj;
/*     */     
/* 133 */     return (this.filterType != null ? this.filterType.equals(otherObj.filterType) : this.filterType == otherObj.filterType) && (this.filteredEntityName != null ? this.filteredEntityName.equals(otherObj.filteredEntityName) : this.filteredEntityName == otherObj.filteredEntityName);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 143 */     return (this.filterType != null ? this.filterType.hashCode() : 0) ^ (this.filteredEntityName != null ? this.filteredEntityName.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 153 */     return "VCenterServerFilter [filterType=" + this.filterType + ", " + "filteredEntityName=" + this.filteredEntityName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VCenterServerFilter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */