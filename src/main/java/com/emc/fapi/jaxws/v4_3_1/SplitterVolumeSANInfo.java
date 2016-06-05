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
/*     */ @JsonTypeName("SplitterVolumeSANInfo")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SplitterVolumeSANInfo", propOrder={"sanInfo"})
/*     */ public class SplitterVolumeSANInfo
/*     */   extends SplitterVolume
/*     */ {
/*     */   protected VolumeSANInfo sanInfo;
/*     */   
/*     */   public SplitterVolumeSANInfo() {}
/*     */   
/*     */   public SplitterVolumeSANInfo(VolumeSANInfo sanInfo)
/*     */   {
/*  54 */     this.sanInfo = sanInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VolumeSANInfo getSanInfo()
/*     */   {
/*  66 */     return this.sanInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSanInfo(VolumeSANInfo value)
/*     */   {
/*  78 */     this.sanInfo = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  88 */     if (!(obj instanceof SplitterVolumeSANInfo)) {
/*  89 */       return false;
/*     */     }
/*  91 */     SplitterVolumeSANInfo otherObj = (SplitterVolumeSANInfo)obj;
/*     */     
/*  93 */     return (super.equals(obj)) && (this.sanInfo != null ? this.sanInfo.equals(otherObj.sanInfo) : this.sanInfo == otherObj.sanInfo);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 103 */     return super.hashCode() ^ (this.sanInfo != null ? this.sanInfo.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 113 */     return "SplitterVolumeSANInfo [super=" + super.toString() + ", " + "sanInfo=" + this.sanInfo + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SplitterVolumeSANInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */