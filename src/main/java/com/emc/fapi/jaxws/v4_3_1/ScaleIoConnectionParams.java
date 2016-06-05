/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @JsonTypeName("ScaleIoConnectionParams")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ScaleIoConnectionParams", propOrder={"ipInfos"})
/*     */ public class ScaleIoConnectionParams
/*     */   extends BaseConnectionParams
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<IPInformation> ipInfos;
/*     */   
/*     */   public ScaleIoConnectionParams() {}
/*     */   
/*     */   public ScaleIoConnectionParams(List<IPInformation> ipInfos)
/*     */   {
/*  58 */     this.ipInfos = ipInfos;
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
/*     */   public List<IPInformation> getIpInfos()
/*     */   {
/*  84 */     if (this.ipInfos == null) {
/*  85 */       this.ipInfos = new ArrayList();
/*     */     }
/*  87 */     return this.ipInfos;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  97 */     if (!(obj instanceof ScaleIoConnectionParams)) {
/*  98 */       return false;
/*     */     }
/* 100 */     ScaleIoConnectionParams otherObj = (ScaleIoConnectionParams)obj;
/*     */     
/* 102 */     return (super.equals(obj)) && (this.ipInfos != null ? this.ipInfos.equals(otherObj.ipInfos) : this.ipInfos == otherObj.ipInfos);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 112 */     return super.hashCode() ^ (this.ipInfos != null ? this.ipInfos.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 122 */     return "ScaleIoConnectionParams [super=" + super.toString() + ", " + "ipInfos=" + this.ipInfos + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ScaleIoConnectionParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */