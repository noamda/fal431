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
/*     */ @JsonTypeName("DataCommPath")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="DataCommPath", propOrder={"splitterUid"})
/*     */ public class DataCommPath
/*     */   extends Path
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected SplitterUID splitterUid;
/*     */   
/*     */   public DataCommPath() {}
/*     */   
/*     */   public DataCommPath(SplitterUID splitterUid)
/*     */   {
/*  56 */     this.splitterUid = splitterUid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitterUID getSplitterUid()
/*     */   {
/*  68 */     return this.splitterUid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitterUid(SplitterUID value)
/*     */   {
/*  80 */     this.splitterUid = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof DataCommPath)) {
/*  91 */       return false;
/*     */     }
/*  93 */     DataCommPath otherObj = (DataCommPath)obj;
/*     */     
/*  95 */     return (super.equals(obj)) && (this.splitterUid != null ? this.splitterUid.equals(otherObj.splitterUid) : this.splitterUid == otherObj.splitterUid);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return super.hashCode() ^ (this.splitterUid != null ? this.splitterUid.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "DataCommPath [super=" + super.toString() + ", " + "splitterUid=" + this.splitterUid + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\DataCommPath.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */