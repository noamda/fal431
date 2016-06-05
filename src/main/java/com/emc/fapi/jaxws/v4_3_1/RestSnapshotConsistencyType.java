/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="restSnapshotConsistencyType", propOrder={"restEnum"})
/*     */ public class RestSnapshotConsistencyType
/*     */ {
/*     */   protected SnapshotConsistencyType restEnum;
/*     */   
/*     */   public RestSnapshotConsistencyType() {}
/*     */   
/*     */   public RestSnapshotConsistencyType(SnapshotConsistencyType restEnum)
/*     */   {
/*  51 */     this.restEnum = restEnum;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SnapshotConsistencyType getRestEnum()
/*     */   {
/*  63 */     return this.restEnum;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRestEnum(SnapshotConsistencyType value)
/*     */   {
/*  75 */     this.restEnum = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  85 */     if (!(obj instanceof RestSnapshotConsistencyType)) {
/*  86 */       return false;
/*     */     }
/*  88 */     RestSnapshotConsistencyType otherObj = (RestSnapshotConsistencyType)obj;
/*     */     
/*  90 */     return this.restEnum == otherObj.restEnum ? true : this.restEnum != null ? this.restEnum.equals(otherObj.restEnum) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  99 */     return this.restEnum != null ? this.restEnum.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 108 */     return "RestSnapshotConsistencyType [restEnum=" + this.restEnum + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RestSnapshotConsistencyType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */