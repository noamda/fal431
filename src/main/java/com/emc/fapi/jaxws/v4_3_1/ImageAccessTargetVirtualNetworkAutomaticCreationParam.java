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
/*     */ @JsonTypeName("ImageAccessTargetVirtualNetworkAutomaticCreationParam")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ImageAccessTargetVirtualNetworkAutomaticCreationParam", propOrder={"sharedNetwork"})
/*     */ public class ImageAccessTargetVirtualNetworkAutomaticCreationParam
/*     */   extends ImageAccessTargetVirtualNetworkParam
/*     */ {
/*     */   protected boolean sharedNetwork;
/*     */   
/*     */   public ImageAccessTargetVirtualNetworkAutomaticCreationParam() {}
/*     */   
/*     */   public ImageAccessTargetVirtualNetworkAutomaticCreationParam(boolean sharedNetwork)
/*     */   {
/*  54 */     this.sharedNetwork = sharedNetwork;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isSharedNetwork()
/*     */   {
/*  62 */     return this.sharedNetwork;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSharedNetwork(boolean value)
/*     */   {
/*  70 */     this.sharedNetwork = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  80 */     if (!(obj instanceof ImageAccessTargetVirtualNetworkAutomaticCreationParam)) {
/*  81 */       return false;
/*     */     }
/*  83 */     ImageAccessTargetVirtualNetworkAutomaticCreationParam otherObj = (ImageAccessTargetVirtualNetworkAutomaticCreationParam)obj;
/*     */     
/*  85 */     return (super.equals(obj)) && (this.sharedNetwork == otherObj.sharedNetwork);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  95 */     return super.hashCode() ^ (this.sharedNetwork ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 105 */     return "ImageAccessTargetVirtualNetworkAutomaticCreationParam [super=" + super.toString() + ", " + "sharedNetwork=" + this.sharedNetwork + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ImageAccessTargetVirtualNetworkAutomaticCreationParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */