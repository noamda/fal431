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
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=CollectLogsSplitterParamWithCredentials.class, name="CollectLogsSplitterParamWithCredentials")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="CollectLogsSplitterParam", propOrder={"splitterUID"})
/*     */ @XmlSeeAlso({CollectLogsSplitterParamWithCredentials.class})
/*     */ public class CollectLogsSplitterParam
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected SplitterUID splitterUID;
/*     */   
/*     */   public CollectLogsSplitterParam() {}
/*     */   
/*     */   public CollectLogsSplitterParam(SplitterUID splitterUID)
/*     */   {
/*  61 */     this.splitterUID = splitterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitterUID getSplitterUID()
/*     */   {
/*  73 */     return this.splitterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitterUID(SplitterUID value)
/*     */   {
/*  85 */     this.splitterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  95 */     if (!(obj instanceof CollectLogsSplitterParam)) {
/*  96 */       return false;
/*     */     }
/*  98 */     CollectLogsSplitterParam otherObj = (CollectLogsSplitterParam)obj;
/*     */     
/* 100 */     return this.splitterUID == otherObj.splitterUID ? true : this.splitterUID != null ? this.splitterUID.equals(otherObj.splitterUID) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 109 */     return this.splitterUID != null ? this.splitterUID.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 118 */     return "CollectLogsSplitterParam [splitterUID=" + this.splitterUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CollectLogsSplitterParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */