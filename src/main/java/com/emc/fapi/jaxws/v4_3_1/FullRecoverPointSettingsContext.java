/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*     */ @JsonTypeName("FullRecoverPointSettingsContext")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="FullRecoverPointSettingsContext", propOrder={"settingsConflictContext"})
/*     */ public class FullRecoverPointSettingsContext
/*     */   extends FunctionalAPIContext
/*     */ {
/*     */   protected long settingsConflictContext;
/*     */   
/*     */   public FullRecoverPointSettingsContext() {}
/*     */   
/*     */   public FullRecoverPointSettingsContext(long settingsConflictContext)
/*     */   {
/*  54 */     this.settingsConflictContext = settingsConflictContext;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getSettingsConflictContext()
/*     */   {
/*  62 */     return this.settingsConflictContext;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSettingsConflictContext(long value)
/*     */   {
/*  70 */     this.settingsConflictContext = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  80 */     if (!(obj instanceof FullRecoverPointSettingsContext)) {
/*  81 */       return false;
/*     */     }
/*  83 */     FullRecoverPointSettingsContext otherObj = (FullRecoverPointSettingsContext)obj;
/*     */     
/*  85 */     return (super.equals(obj)) && (this.settingsConflictContext == otherObj.settingsConflictContext);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  95 */     return super.hashCode() ^ (int)this.settingsConflictContext;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 105 */     return "FullRecoverPointSettingsContext [super=" + super.toString() + ", " + "settingsConflictContext=" + this.settingsConflictContext + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FullRecoverPointSettingsContext.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */