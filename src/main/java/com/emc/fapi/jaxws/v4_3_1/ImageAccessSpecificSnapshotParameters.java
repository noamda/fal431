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
/*     */ 
/*     */ 
/*     */ @JsonTypeName("ImageAccessSpecificSnapshotParameters")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ImageAccessSpecificSnapshotParameters", propOrder={"snapshot", "mode"})
/*     */ public class ImageAccessSpecificSnapshotParameters
/*     */   extends ImageAccessGeneralParameters
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected Snapshot snapshot;
/*     */   @XmlElement(required=true)
/*     */   protected ImageAccessMode mode;
/*     */   
/*     */   public ImageAccessSpecificSnapshotParameters() {}
/*     */   
/*     */   public ImageAccessSpecificSnapshotParameters(Snapshot snapshot, ImageAccessMode mode)
/*     */   {
/*  60 */     this.snapshot = snapshot;
/*  61 */     this.mode = mode;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Snapshot getSnapshot()
/*     */   {
/*  73 */     return this.snapshot;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSnapshot(Snapshot value)
/*     */   {
/*  85 */     this.snapshot = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ImageAccessMode getMode()
/*     */   {
/*  97 */     return this.mode;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMode(ImageAccessMode value)
/*     */   {
/* 109 */     this.mode = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 119 */     if (!(obj instanceof ImageAccessSpecificSnapshotParameters)) {
/* 120 */       return false;
/*     */     }
/* 122 */     ImageAccessSpecificSnapshotParameters otherObj = (ImageAccessSpecificSnapshotParameters)obj;
/*     */     
/* 124 */     return (super.equals(obj)) && (this.snapshot != null ? this.snapshot.equals(otherObj.snapshot) : this.snapshot == otherObj.snapshot) && (this.mode != null ? this.mode.equals(otherObj.mode) : this.mode == otherObj.mode);
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
/* 135 */     return super.hashCode() ^ (this.snapshot != null ? this.snapshot.hashCode() : 0) ^ (this.mode != null ? this.mode.hashCode() : 0);
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
/* 146 */     return "ImageAccessSpecificSnapshotParameters [super=" + super.toString() + ", " + "snapshot=" + this.snapshot + ", " + "mode=" + this.mode + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ImageAccessSpecificSnapshotParameters.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */