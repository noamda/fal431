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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("VolumeCreationParams")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VolumeCreationParams", propOrder={"volumeSize", "arrayUid", "poolUid", "tieringPolicy", "resourcePoolType"})
/*     */ public class VolumeCreationParams
/*     */   extends BaseVolumeParams
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VolumeSize volumeSize;
/*     */   @XmlElement(nillable=true)
/*     */   protected ArrayUID arrayUid;
/*     */   protected ResourcePoolUID poolUid;
/*     */   protected ArrayResourcePoolTieringPolicy tieringPolicy;
/*     */   protected ArrayResourcePoolType resourcePoolType;
/*     */   
/*     */   public VolumeCreationParams() {}
/*     */   
/*     */   public VolumeCreationParams(VolumeSize volumeSize, ArrayUID arrayUid, ResourcePoolUID poolUid, ArrayResourcePoolTieringPolicy tieringPolicy, ArrayResourcePoolType resourcePoolType)
/*     */   {
/*  69 */     this.volumeSize = volumeSize;
/*  70 */     this.arrayUid = arrayUid;
/*  71 */     this.poolUid = poolUid;
/*  72 */     this.tieringPolicy = tieringPolicy;
/*  73 */     this.resourcePoolType = resourcePoolType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VolumeSize getVolumeSize()
/*     */   {
/*  85 */     return this.volumeSize;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumeSize(VolumeSize value)
/*     */   {
/*  97 */     this.volumeSize = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayUID getArrayUid()
/*     */   {
/* 109 */     return this.arrayUid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setArrayUid(ArrayUID value)
/*     */   {
/* 121 */     this.arrayUid = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ResourcePoolUID getPoolUid()
/*     */   {
/* 133 */     return this.poolUid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPoolUid(ResourcePoolUID value)
/*     */   {
/* 145 */     this.poolUid = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayResourcePoolTieringPolicy getTieringPolicy()
/*     */   {
/* 157 */     return this.tieringPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTieringPolicy(ArrayResourcePoolTieringPolicy value)
/*     */   {
/* 169 */     this.tieringPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayResourcePoolType getResourcePoolType()
/*     */   {
/* 181 */     return this.resourcePoolType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setResourcePoolType(ArrayResourcePoolType value)
/*     */   {
/* 193 */     this.resourcePoolType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 203 */     if (!(obj instanceof VolumeCreationParams)) {
/* 204 */       return false;
/*     */     }
/* 206 */     VolumeCreationParams otherObj = (VolumeCreationParams)obj;
/*     */     
/* 208 */     return (super.equals(obj)) && (this.volumeSize != null ? this.volumeSize.equals(otherObj.volumeSize) : this.volumeSize == otherObj.volumeSize) && (this.arrayUid != null ? this.arrayUid.equals(otherObj.arrayUid) : this.arrayUid == otherObj.arrayUid) && (this.poolUid != null ? this.poolUid.equals(otherObj.poolUid) : this.poolUid == otherObj.poolUid) && (this.tieringPolicy != null ? this.tieringPolicy.equals(otherObj.tieringPolicy) : this.tieringPolicy == otherObj.tieringPolicy) && (this.resourcePoolType != null ? this.resourcePoolType.equals(otherObj.resourcePoolType) : this.resourcePoolType == otherObj.resourcePoolType);
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
/*     */   public int hashCode()
/*     */   {
/* 222 */     return super.hashCode() ^ (this.volumeSize != null ? this.volumeSize.hashCode() : 0) ^ (this.arrayUid != null ? this.arrayUid.hashCode() : 0) ^ (this.poolUid != null ? this.poolUid.hashCode() : 0) ^ (this.tieringPolicy != null ? this.tieringPolicy.hashCode() : 0) ^ (this.resourcePoolType != null ? this.resourcePoolType.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 236 */     return "VolumeCreationParams [super=" + super.toString() + ", " + "volumeSize=" + this.volumeSize + ", " + "arrayUid=" + this.arrayUid + ", " + "poolUid=" + this.poolUid + ", " + "tieringPolicy=" + this.tieringPolicy + ", " + "resourcePoolType=" + this.resourcePoolType + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VolumeCreationParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */