/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("AggregatedSplitterSettings")
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=Vnx2ESplitterSettings.class, name="Vnx2eSplitterSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=VplexSplitterSettings.class, name="VplexSplitterSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=EsxSplitterSettings.class, name="EsxSplitterSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=IOFilterSplitterSettings.class, name="IOFilterSplitterSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=SymmetrixV3SplitterSettings.class, name="SymmetrixV3SplitterSettings")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="AggregatedSplitterSettings", propOrder={"singleSplittersInfo", "singleSplitterName"})
/*     */ @XmlSeeAlso({VplexSplitterSettings.class, Vnx2ESplitterSettings.class, IOFilterSplitterSettings.class, SymmetrixV3SplitterSettings.class, EsxSplitterSettings.class})
/*     */ public class AggregatedSplitterSettings
/*     */   extends SplitterSettings
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SplitterInfo> singleSplittersInfo;
/*     */   protected SingleSplitterProcessorName singleSplitterName;
/*     */   
/*     */   public AggregatedSplitterSettings() {}
/*     */   
/*     */   public AggregatedSplitterSettings(List<SplitterInfo> singleSplittersInfo, SingleSplitterProcessorName singleSplitterName)
/*     */   {
/*  84 */     this.singleSplittersInfo = singleSplittersInfo;
/*  85 */     this.singleSplitterName = singleSplitterName;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<SplitterInfo> getSingleSplittersInfo()
/*     */   {
/* 111 */     if (this.singleSplittersInfo == null) {
/* 112 */       this.singleSplittersInfo = new ArrayList();
/*     */     }
/* 114 */     return this.singleSplittersInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SingleSplitterProcessorName getSingleSplitterName()
/*     */   {
/* 126 */     return this.singleSplitterName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSingleSplitterName(SingleSplitterProcessorName value)
/*     */   {
/* 138 */     this.singleSplitterName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 148 */     if (!(obj instanceof AggregatedSplitterSettings)) {
/* 149 */       return false;
/*     */     }
/* 151 */     AggregatedSplitterSettings otherObj = (AggregatedSplitterSettings)obj;
/*     */     
/* 153 */     return (super.equals(obj)) && (this.singleSplittersInfo != null ? this.singleSplittersInfo.equals(otherObj.singleSplittersInfo) : this.singleSplittersInfo == otherObj.singleSplittersInfo) && (this.singleSplitterName != null ? this.singleSplitterName.equals(otherObj.singleSplitterName) : this.singleSplitterName == otherObj.singleSplitterName);
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
/* 164 */     return super.hashCode() ^ (this.singleSplittersInfo != null ? this.singleSplittersInfo.hashCode() : 0) ^ (this.singleSplitterName != null ? this.singleSplitterName.hashCode() : 0);
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
/* 175 */     return "AggregatedSplitterSettings [super=" + super.toString() + ", " + "singleSplittersInfo=" + this.singleSplittersInfo + ", " + "singleSplitterName=" + this.singleSplitterName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AggregatedSplitterSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */