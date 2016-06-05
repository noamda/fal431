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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="CallHomeEvent", propOrder={"id", "name", "description", "systemDefined", "disabledUntil", "script"})
/*     */ public class CallHomeEvent
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected CallHomeEventUID id;
/*     */   @XmlElement(required=true)
/*     */   protected String name;
/*     */   @XmlElement(required=true)
/*     */   protected String description;
/*     */   protected boolean systemDefined;
/*     */   protected RecoverPointTimeStamp disabledUntil;
/*     */   @XmlElement(required=true)
/*     */   protected String script;
/*     */   
/*     */   public CallHomeEvent() {}
/*     */   
/*     */   public CallHomeEvent(CallHomeEventUID id, String name, String description, boolean systemDefined, RecoverPointTimeStamp disabledUntil, String script)
/*     */   {
/*  64 */     this.id = id;
/*  65 */     this.name = name;
/*  66 */     this.description = description;
/*  67 */     this.systemDefined = systemDefined;
/*  68 */     this.disabledUntil = disabledUntil;
/*  69 */     this.script = script;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public CallHomeEventUID getId()
/*     */   {
/*  81 */     return this.id;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setId(CallHomeEventUID value)
/*     */   {
/*  93 */     this.id = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getName()
/*     */   {
/* 105 */     return this.name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setName(String value)
/*     */   {
/* 117 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDescription()
/*     */   {
/* 129 */     return this.description;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDescription(String value)
/*     */   {
/* 141 */     this.description = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isSystemDefined()
/*     */   {
/* 149 */     return this.systemDefined;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSystemDefined(boolean value)
/*     */   {
/* 157 */     this.systemDefined = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointTimeStamp getDisabledUntil()
/*     */   {
/* 169 */     return this.disabledUntil;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDisabledUntil(RecoverPointTimeStamp value)
/*     */   {
/* 181 */     this.disabledUntil = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getScript()
/*     */   {
/* 193 */     return this.script;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setScript(String value)
/*     */   {
/* 205 */     this.script = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 215 */     if (!(obj instanceof CallHomeEvent)) {
/* 216 */       return false;
/*     */     }
/* 218 */     CallHomeEvent otherObj = (CallHomeEvent)obj;
/*     */     
/* 220 */     return (this.id != null ? this.id.equals(otherObj.id) : this.id == otherObj.id) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.description != null ? this.description.equals(otherObj.description) : this.description == otherObj.description) && (this.systemDefined == otherObj.systemDefined) && (this.disabledUntil != null ? this.disabledUntil.equals(otherObj.disabledUntil) : this.disabledUntil == otherObj.disabledUntil) && (this.script != null ? this.script.equals(otherObj.script) : this.script == otherObj.script);
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
/*     */   public int hashCode()
/*     */   {
/* 234 */     return (this.id != null ? this.id.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.description != null ? this.description.hashCode() : 0) ^ (this.systemDefined ? 1 : 0) ^ (this.disabledUntil != null ? this.disabledUntil.hashCode() : 0) ^ (this.script != null ? this.script.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 248 */     return "CallHomeEvent [id=" + this.id + ", " + "name=" + this.name + ", " + "description=" + this.description + ", " + "systemDefined=" + this.systemDefined + ", " + "disabledUntil=" + this.disabledUntil + ", " + "script=" + this.script + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CallHomeEvent.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */