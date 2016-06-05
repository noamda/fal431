/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlSeeAlso;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonSubTypes;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.As;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
/*     */ import org.codehaus.jackson.annotate.JsonTypeName;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("ArrayBasedSplitterSettings")
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ClariionSplitterSettings.class, name="ClariionSplitterSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=SymmetrixSplitterSettings.class, name="SymmetrixSplitterSettings")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ArrayBasedSplitterSettings", propOrder={"autoRegisterRPAsInitiators"})
/*     */ @XmlSeeAlso({SymmetrixSplitterSettings.class, ClariionSplitterSettings.class})
/*     */ public abstract class ArrayBasedSplitterSettings
/*     */   extends SplitterSettings
/*     */ {
/*     */   protected boolean autoRegisterRPAsInitiators;
/*     */   
/*     */   public ArrayBasedSplitterSettings() {}
/*     */   
/*     */   public ArrayBasedSplitterSettings(boolean autoRegisterRPAsInitiators)
/*     */   {
/*  71 */     this.autoRegisterRPAsInitiators = autoRegisterRPAsInitiators;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isAutoRegisterRPAsInitiators()
/*     */   {
/*  79 */     return this.autoRegisterRPAsInitiators;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAutoRegisterRPAsInitiators(boolean value)
/*     */   {
/*  87 */     this.autoRegisterRPAsInitiators = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  97 */     if (!(obj instanceof ArrayBasedSplitterSettings)) {
/*  98 */       return false;
/*     */     }
/* 100 */     ArrayBasedSplitterSettings otherObj = (ArrayBasedSplitterSettings)obj;
/*     */     
/* 102 */     return (super.equals(obj)) && (this.autoRegisterRPAsInitiators == otherObj.autoRegisterRPAsInitiators);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 112 */     return super.hashCode() ^ (this.autoRegisterRPAsInitiators ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 122 */     return "ArrayBasedSplitterSettings [super=" + super.toString() + ", " + "autoRegisterRPAsInitiators=" + this.autoRegisterRPAsInitiators + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayBasedSplitterSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */