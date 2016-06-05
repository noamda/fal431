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
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=VmStartUpPrompt.class, name="VmStartUpPrompt"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=VmStartUpScript.class, name="VmStartUpScript")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="BaseVmStartUpAction", propOrder={"title", "timeoutSecs"})
/*     */ @XmlSeeAlso({VmStartUpPrompt.class, VmStartUpScript.class})
/*     */ public abstract class BaseVmStartUpAction
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected String title;
/*     */   protected int timeoutSecs;
/*     */   
/*     */   public BaseVmStartUpAction() {}
/*     */   
/*     */   public BaseVmStartUpAction(String title, int timeoutSecs)
/*     */   {
/*  66 */     this.title = title;
/*  67 */     this.timeoutSecs = timeoutSecs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getTitle()
/*     */   {
/*  79 */     return this.title;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTitle(String value)
/*     */   {
/*  91 */     this.title = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getTimeoutSecs()
/*     */   {
/*  99 */     return this.timeoutSecs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTimeoutSecs(int value)
/*     */   {
/* 107 */     this.timeoutSecs = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 117 */     if (!(obj instanceof BaseVmStartUpAction)) {
/* 118 */       return false;
/*     */     }
/* 120 */     BaseVmStartUpAction otherObj = (BaseVmStartUpAction)obj;
/*     */     
/* 122 */     return (this.title != null ? this.title.equals(otherObj.title) : this.title == otherObj.title) && (this.timeoutSecs == otherObj.timeoutSecs);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 132 */     return (this.title != null ? this.title.hashCode() : 0) ^ this.timeoutSecs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 142 */     return "BaseVmStartUpAction [title=" + this.title + ", " + "timeoutSecs=" + this.timeoutSecs + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\BaseVmStartUpAction.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */