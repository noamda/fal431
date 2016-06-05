/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
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
/*     */ @JsonTypeName("VmStartUpScript")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VmStartUpScript", propOrder={"numOfRetries", "command"})
/*     */ public class VmStartUpScript
/*     */   extends BaseVmStartUpAction
/*     */ {
/*     */   protected int numOfRetries;
/*     */   @XmlElement(required=true)
/*     */   protected String command;
/*     */   
/*     */   public VmStartUpScript() {}
/*     */   
/*     */   public VmStartUpScript(int numOfRetries, String command)
/*     */   {
/*  59 */     this.numOfRetries = numOfRetries;
/*  60 */     this.command = command;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getNumOfRetries()
/*     */   {
/*  68 */     return this.numOfRetries;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNumOfRetries(int value)
/*     */   {
/*  76 */     this.numOfRetries = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getCommand()
/*     */   {
/*  88 */     return this.command;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCommand(String value)
/*     */   {
/* 100 */     this.command = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 110 */     if (!(obj instanceof VmStartUpScript)) {
/* 111 */       return false;
/*     */     }
/* 113 */     VmStartUpScript otherObj = (VmStartUpScript)obj;
/*     */     
/* 115 */     return (super.equals(obj)) && (this.numOfRetries == otherObj.numOfRetries) && (this.command != null ? this.command.equals(otherObj.command) : this.command == otherObj.command);
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
/* 126 */     return super.hashCode() ^ this.numOfRetries ^ (this.command != null ? this.command.hashCode() : 0);
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
/* 137 */     return "VmStartUpScript [super=" + super.toString() + ", " + "numOfRetries=" + this.numOfRetries + ", " + "command=" + this.command + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmStartUpScript.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */