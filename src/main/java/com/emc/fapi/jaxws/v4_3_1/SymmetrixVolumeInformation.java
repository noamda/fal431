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
/*     */ @JsonTypeName("SymmetrixVolumeInformation")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SymmetrixVolumeInformation", propOrder={"tagged"})
/*     */ public class SymmetrixVolumeInformation
/*     */   extends VolumeInformation
/*     */ {
/*     */   protected boolean tagged;
/*     */   
/*     */   public SymmetrixVolumeInformation() {}
/*     */   
/*     */   public SymmetrixVolumeInformation(boolean tagged)
/*     */   {
/*  54 */     this.tagged = tagged;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isTagged()
/*     */   {
/*  62 */     return this.tagged;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTagged(boolean value)
/*     */   {
/*  70 */     this.tagged = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  80 */     if (!(obj instanceof SymmetrixVolumeInformation)) {
/*  81 */       return false;
/*     */     }
/*  83 */     SymmetrixVolumeInformation otherObj = (SymmetrixVolumeInformation)obj;
/*     */     
/*  85 */     return (super.equals(obj)) && (this.tagged == otherObj.tagged);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  95 */     return super.hashCode() ^ (this.tagged ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 105 */     return "SymmetrixVolumeInformation [super=" + super.toString() + ", " + "tagged=" + this.tagged + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SymmetrixVolumeInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */