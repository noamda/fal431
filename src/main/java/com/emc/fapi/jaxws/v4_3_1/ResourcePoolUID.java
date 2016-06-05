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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ResourcePoolUID", propOrder={"uuid", "storageResourcePoolId", "arrayUid"})
/*     */ public class ResourcePoolUID
/*     */ {
/*     */   protected long uuid;
/*     */   protected String storageResourcePoolId;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected ArrayUID arrayUid;
/*     */   
/*     */   public ResourcePoolUID() {}
/*     */   
/*     */   public ResourcePoolUID(long uuid, String storageResourcePoolId, ArrayUID arrayUid)
/*     */   {
/*  52 */     this.uuid = uuid;
/*  53 */     this.storageResourcePoolId = storageResourcePoolId;
/*  54 */     this.arrayUid = arrayUid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getUuid()
/*     */   {
/*  62 */     return this.uuid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUuid(long value)
/*     */   {
/*  70 */     this.uuid = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getStorageResourcePoolId()
/*     */   {
/*  82 */     return this.storageResourcePoolId;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStorageResourcePoolId(String value)
/*     */   {
/*  94 */     this.storageResourcePoolId = value;
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
/* 106 */     return this.arrayUid;
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
/* 118 */     this.arrayUid = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 128 */     if (!(obj instanceof ResourcePoolUID)) {
/* 129 */       return false;
/*     */     }
/* 131 */     ResourcePoolUID otherObj = (ResourcePoolUID)obj;
/*     */     
/* 133 */     return (this.uuid == otherObj.uuid) && (this.storageResourcePoolId != null ? this.storageResourcePoolId.equals(otherObj.storageResourcePoolId) : this.storageResourcePoolId == otherObj.storageResourcePoolId) && (this.arrayUid != null ? this.arrayUid.equals(otherObj.arrayUid) : this.arrayUid == otherObj.arrayUid);
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
/* 144 */     return (int)this.uuid ^ (this.storageResourcePoolId != null ? this.storageResourcePoolId.hashCode() : 0) ^ (this.arrayUid != null ? this.arrayUid.hashCode() : 0);
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
/* 155 */     return "ResourcePoolUID [uuid=" + this.uuid + ", " + "storageResourcePoolId=" + this.storageResourcePoolId + ", " + "arrayUid=" + this.arrayUid + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ResourcePoolUID.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */