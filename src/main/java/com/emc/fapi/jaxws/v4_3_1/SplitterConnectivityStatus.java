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
/*     */ @JsonTypeName("SplitterConnectivityStatus")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SplitterConnectivityStatus", propOrder={"splitterUID"})
/*     */ public class SplitterConnectivityStatus
/*     */   extends ClusterEntityConnectivityStatus
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected SplitterUID splitterUID;
/*     */   
/*     */   public SplitterConnectivityStatus() {}
/*     */   
/*     */   public SplitterConnectivityStatus(SplitterUID splitterUID)
/*     */   {
/*  56 */     this.splitterUID = splitterUID;
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
/*  68 */     return this.splitterUID;
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
/*  80 */     this.splitterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof SplitterConnectivityStatus)) {
/*  91 */       return false;
/*     */     }
/*  93 */     SplitterConnectivityStatus otherObj = (SplitterConnectivityStatus)obj;
/*     */     
/*  95 */     return (super.equals(obj)) && (this.splitterUID != null ? this.splitterUID.equals(otherObj.splitterUID) : this.splitterUID == otherObj.splitterUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return super.hashCode() ^ (this.splitterUID != null ? this.splitterUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "SplitterConnectivityStatus [super=" + super.toString() + ", " + "splitterUID=" + this.splitterUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SplitterConnectivityStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */