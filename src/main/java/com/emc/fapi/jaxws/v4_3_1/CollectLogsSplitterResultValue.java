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
/*     */ @JsonTypeName("CollectLogsSplitterResultValue")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="CollectLogsSplitterResultValue", propOrder={"splitter"})
/*     */ public class CollectLogsSplitterResultValue
/*     */   extends CollectLogsResultValue
/*     */ {
/*     */   protected SplitterUID splitter;
/*     */   
/*     */   public CollectLogsSplitterResultValue() {}
/*     */   
/*     */   public CollectLogsSplitterResultValue(SplitterUID splitter)
/*     */   {
/*  54 */     this.splitter = splitter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitterUID getSplitter()
/*     */   {
/*  66 */     return this.splitter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitter(SplitterUID value)
/*     */   {
/*  78 */     this.splitter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  88 */     if (!(obj instanceof CollectLogsSplitterResultValue)) {
/*  89 */       return false;
/*     */     }
/*  91 */     CollectLogsSplitterResultValue otherObj = (CollectLogsSplitterResultValue)obj;
/*     */     
/*  93 */     return (super.equals(obj)) && (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 103 */     return super.hashCode() ^ (this.splitter != null ? this.splitter.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 113 */     return "CollectLogsSplitterResultValue [super=" + super.toString() + ", " + "splitter=" + this.splitter + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CollectLogsSplitterResultValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */