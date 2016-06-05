/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ReplicateVmsParam", propOrder={"cgName", "productionCopy", "vmReplicationSets", "links", "copies", "startTransfer"})
/*     */ public class ReplicateVmsParam
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected String cgName;
/*     */   @XmlElement(required=true)
/*     */   protected GlobalCopyUID productionCopy;
/*     */   @XmlElement(required=true)
/*     */   protected List<VMReplicationSetParam> vmReplicationSets;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<FullConsistencyGroupLinkPolicy> links;
/*     */   @XmlElement(required=true)
/*     */   protected List<ConsistencyGroupCopyParam> copies;
/*     */   protected boolean startTransfer;
/*     */   
/*     */   public ReplicateVmsParam() {}
/*     */   
/*     */   public ReplicateVmsParam(String cgName, GlobalCopyUID productionCopy, List<VMReplicationSetParam> vmReplicationSets, List<FullConsistencyGroupLinkPolicy> links, List<ConsistencyGroupCopyParam> copies, boolean startTransfer)
/*     */   {
/*  67 */     this.cgName = cgName;
/*  68 */     this.productionCopy = productionCopy;
/*  69 */     this.vmReplicationSets = vmReplicationSets;
/*  70 */     this.links = links;
/*  71 */     this.copies = copies;
/*  72 */     this.startTransfer = startTransfer;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getCgName()
/*     */   {
/*  84 */     return this.cgName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCgName(String value)
/*     */   {
/*  96 */     this.cgName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GlobalCopyUID getProductionCopy()
/*     */   {
/* 108 */     return this.productionCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProductionCopy(GlobalCopyUID value)
/*     */   {
/* 120 */     this.productionCopy = value;
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
/*     */   public List<VMReplicationSetParam> getVmReplicationSets()
/*     */   {
/* 146 */     if (this.vmReplicationSets == null) {
/* 147 */       this.vmReplicationSets = new ArrayList();
/*     */     }
/* 149 */     return this.vmReplicationSets;
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
/*     */   public List<FullConsistencyGroupLinkPolicy> getLinks()
/*     */   {
/* 175 */     if (this.links == null) {
/* 176 */       this.links = new ArrayList();
/*     */     }
/* 178 */     return this.links;
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
/*     */   public List<ConsistencyGroupCopyParam> getCopies()
/*     */   {
/* 204 */     if (this.copies == null) {
/* 205 */       this.copies = new ArrayList();
/*     */     }
/* 207 */     return this.copies;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isStartTransfer()
/*     */   {
/* 215 */     return this.startTransfer;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStartTransfer(boolean value)
/*     */   {
/* 223 */     this.startTransfer = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 233 */     if (!(obj instanceof ReplicateVmsParam)) {
/* 234 */       return false;
/*     */     }
/* 236 */     ReplicateVmsParam otherObj = (ReplicateVmsParam)obj;
/*     */     
/* 238 */     return (this.cgName != null ? this.cgName.equals(otherObj.cgName) : this.cgName == otherObj.cgName) && (this.productionCopy != null ? this.productionCopy.equals(otherObj.productionCopy) : this.productionCopy == otherObj.productionCopy) && (this.vmReplicationSets != null ? this.vmReplicationSets.equals(otherObj.vmReplicationSets) : this.vmReplicationSets == otherObj.vmReplicationSets) && (this.links != null ? this.links.equals(otherObj.links) : this.links == otherObj.links) && (this.copies != null ? this.copies.equals(otherObj.copies) : this.copies == otherObj.copies) && (this.startTransfer == otherObj.startTransfer);
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
/* 252 */     return (this.cgName != null ? this.cgName.hashCode() : 0) ^ (this.productionCopy != null ? this.productionCopy.hashCode() : 0) ^ (this.vmReplicationSets != null ? this.vmReplicationSets.hashCode() : 0) ^ (this.links != null ? this.links.hashCode() : 0) ^ (this.copies != null ? this.copies.hashCode() : 0) ^ (this.startTransfer ? 1 : 0);
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
/* 266 */     return "ReplicateVmsParam [cgName=" + this.cgName + ", " + "productionCopy=" + this.productionCopy + ", " + "vmReplicationSets=" + this.vmReplicationSets + ", " + "links=" + this.links + ", " + "copies=" + this.copies + ", " + "startTransfer=" + this.startTransfer + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ReplicateVmsParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */