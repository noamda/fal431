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
/*     */ @JsonTypeName("ImageAccessTargetVirtualNetworkManualSelectionParam")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ImageAccessTargetVirtualNetworkManualSelectionParam", propOrder={"networkUID"})
/*     */ public class ImageAccessTargetVirtualNetworkManualSelectionParam
/*     */   extends ImageAccessTargetVirtualNetworkParam
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected VirtualNetworkUID networkUID;
/*     */   
/*     */   public ImageAccessTargetVirtualNetworkManualSelectionParam() {}
/*     */   
/*     */   public ImageAccessTargetVirtualNetworkManualSelectionParam(VirtualNetworkUID networkUID)
/*     */   {
/*  56 */     this.networkUID = networkUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualNetworkUID getNetworkUID()
/*     */   {
/*  68 */     return this.networkUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNetworkUID(VirtualNetworkUID value)
/*     */   {
/*  80 */     this.networkUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof ImageAccessTargetVirtualNetworkManualSelectionParam)) {
/*  91 */       return false;
/*     */     }
/*  93 */     ImageAccessTargetVirtualNetworkManualSelectionParam otherObj = (ImageAccessTargetVirtualNetworkManualSelectionParam)obj;
/*     */     
/*  95 */     return (super.equals(obj)) && (this.networkUID != null ? this.networkUID.equals(otherObj.networkUID) : this.networkUID == otherObj.networkUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return super.hashCode() ^ (this.networkUID != null ? this.networkUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "ImageAccessTargetVirtualNetworkManualSelectionParam [super=" + super.toString() + ", " + "networkUID=" + this.networkUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ImageAccessTargetVirtualNetworkManualSelectionParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */