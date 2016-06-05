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
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ISCSIPath.class, name="ISCSIPath"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=FiberChannelPath.class, name="FiberChannelPath"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=DataCommPath.class, name="DataCommPath")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="Path", propOrder={"rpaUID"})
/*     */ @XmlSeeAlso({DataCommPath.class, FiberChannelPath.class, ISCSIPath.class})
/*     */ public abstract class Path
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected RpaUID rpaUID;
/*     */   
/*     */   public Path() {}
/*     */   
/*     */   public Path(RpaUID rpaUID)
/*     */   {
/*  65 */     this.rpaUID = rpaUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpaUID getRpaUID()
/*     */   {
/*  77 */     return this.rpaUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRpaUID(RpaUID value)
/*     */   {
/*  89 */     this.rpaUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  99 */     if (!(obj instanceof Path)) {
/* 100 */       return false;
/*     */     }
/* 102 */     Path otherObj = (Path)obj;
/*     */     
/* 104 */     return this.rpaUID == otherObj.rpaUID ? true : this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return this.rpaUID != null ? this.rpaUID.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 122 */     return "Path [rpaUID=" + this.rpaUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\Path.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */