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
/*     */ @XmlType(name="VirtualDiskState", propOrder={"capacity", "virtualDiskId", "replicationCapabilities"})
/*     */ public class VirtualDiskState
/*     */ {
/*     */   protected long capacity;
/*     */   @XmlElement(nillable=true)
/*     */   protected VirtualDiskId virtualDiskId;
/*     */   protected VirtualDiskReplicationCapabilities replicationCapabilities;
/*     */   
/*     */   public VirtualDiskState() {}
/*     */   
/*     */   public VirtualDiskState(long capacity, VirtualDiskId virtualDiskId, VirtualDiskReplicationCapabilities replicationCapabilities)
/*     */   {
/*  52 */     this.capacity = capacity;
/*  53 */     this.virtualDiskId = virtualDiskId;
/*  54 */     this.replicationCapabilities = replicationCapabilities;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getCapacity()
/*     */   {
/*  62 */     return this.capacity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCapacity(long value)
/*     */   {
/*  70 */     this.capacity = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualDiskId getVirtualDiskId()
/*     */   {
/*  82 */     return this.virtualDiskId;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVirtualDiskId(VirtualDiskId value)
/*     */   {
/*  94 */     this.virtualDiskId = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualDiskReplicationCapabilities getReplicationCapabilities()
/*     */   {
/* 106 */     return this.replicationCapabilities;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReplicationCapabilities(VirtualDiskReplicationCapabilities value)
/*     */   {
/* 118 */     this.replicationCapabilities = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 128 */     if (!(obj instanceof VirtualDiskState)) {
/* 129 */       return false;
/*     */     }
/* 131 */     VirtualDiskState otherObj = (VirtualDiskState)obj;
/*     */     
/* 133 */     return (this.capacity == otherObj.capacity) && (this.virtualDiskId != null ? this.virtualDiskId.equals(otherObj.virtualDiskId) : this.virtualDiskId == otherObj.virtualDiskId) && (this.replicationCapabilities != null ? this.replicationCapabilities.equals(otherObj.replicationCapabilities) : this.replicationCapabilities == otherObj.replicationCapabilities);
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
/* 144 */     return (int)this.capacity ^ (this.virtualDiskId != null ? this.virtualDiskId.hashCode() : 0) ^ (this.replicationCapabilities != null ? this.replicationCapabilities.hashCode() : 0);
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
/* 155 */     return "VirtualDiskState [capacity=" + this.capacity + ", " + "virtualDiskId=" + this.virtualDiskId + ", " + "replicationCapabilities=" + this.replicationCapabilities + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VirtualDiskState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */