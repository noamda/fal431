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
/*     */ @JsonTypeName("VCenterServerLunFilter")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VCenterServerLunFilter", propOrder={"lunID"})
/*     */ public class VCenterServerLunFilter
/*     */   extends VCenterServerFilter
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected DeviceUID lunID;
/*     */   
/*     */   public VCenterServerLunFilter() {}
/*     */   
/*     */   public VCenterServerLunFilter(DeviceUID lunID)
/*     */   {
/*  56 */     this.lunID = lunID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DeviceUID getLunID()
/*     */   {
/*  68 */     return this.lunID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLunID(DeviceUID value)
/*     */   {
/*  80 */     this.lunID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof VCenterServerLunFilter)) {
/*  91 */       return false;
/*     */     }
/*  93 */     VCenterServerLunFilter otherObj = (VCenterServerLunFilter)obj;
/*     */     
/*  95 */     return (super.equals(obj)) && (this.lunID != null ? this.lunID.equals(otherObj.lunID) : this.lunID == otherObj.lunID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return super.hashCode() ^ (this.lunID != null ? this.lunID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "VCenterServerLunFilter [super=" + super.toString() + ", " + "lunID=" + this.lunID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VCenterServerLunFilter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */