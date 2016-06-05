/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="DefaultArrayResourcePoolParams", propOrder={"requiredSizeInBytes", "arrayUid", "tieringPolicy", "poolType"})
/*     */ public class DefaultArrayResourcePoolParams
/*     */ {
/*     */   protected long requiredSizeInBytes;
/*     */   @XmlElement(nillable=true)
/*     */   protected ArrayUID arrayUid;
/*     */   protected ArrayResourcePoolTieringPolicy tieringPolicy;
/*     */   protected ArrayResourcePoolType poolType;
/*     */   
/*     */   public DefaultArrayResourcePoolParams() {}
/*     */   
/*     */   public DefaultArrayResourcePoolParams(long requiredSizeInBytes, ArrayUID arrayUid, ArrayResourcePoolTieringPolicy tieringPolicy, ArrayResourcePoolType poolType)
/*     */   {
/*  55 */     this.requiredSizeInBytes = requiredSizeInBytes;
/*  56 */     this.arrayUid = arrayUid;
/*  57 */     this.tieringPolicy = tieringPolicy;
/*  58 */     this.poolType = poolType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getRequiredSizeInBytes()
/*     */   {
/*  66 */     return this.requiredSizeInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRequiredSizeInBytes(long value)
/*     */   {
/*  74 */     this.requiredSizeInBytes = value;
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
/*  86 */     return this.arrayUid;
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
/*  98 */     this.arrayUid = value;
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
/* 110 */     return this.tieringPolicy;
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
/* 122 */     this.tieringPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayResourcePoolType getPoolType()
/*     */   {
/* 134 */     return this.poolType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPoolType(ArrayResourcePoolType value)
/*     */   {
/* 146 */     this.poolType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 156 */     if (!(obj instanceof DefaultArrayResourcePoolParams)) {
/* 157 */       return false;
/*     */     }
/* 159 */     DefaultArrayResourcePoolParams otherObj = (DefaultArrayResourcePoolParams)obj;
/*     */     
/* 161 */     return (this.requiredSizeInBytes == otherObj.requiredSizeInBytes) && (this.arrayUid != null ? this.arrayUid.equals(otherObj.arrayUid) : this.arrayUid == otherObj.arrayUid) && (this.tieringPolicy != null ? this.tieringPolicy.equals(otherObj.tieringPolicy) : this.tieringPolicy == otherObj.tieringPolicy) && (this.poolType != null ? this.poolType.equals(otherObj.poolType) : this.poolType == otherObj.poolType);
/*     */   }
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
/* 173 */     return (int)this.requiredSizeInBytes ^ (this.arrayUid != null ? this.arrayUid.hashCode() : 0) ^ (this.tieringPolicy != null ? this.tieringPolicy.hashCode() : 0) ^ (this.poolType != null ? this.poolType.hashCode() : 0);
/*     */   }
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
/* 185 */     return "DefaultArrayResourcePoolParams [requiredSizeInBytes=" + this.requiredSizeInBytes + ", " + "arrayUid=" + this.arrayUid + ", " + "tieringPolicy=" + this.tieringPolicy + ", " + "poolType=" + this.poolType + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\DefaultArrayResourcePoolParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */