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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="FullConsistencyGroupPolicy", propOrder={"groupUID", "groupPolicy", "groupName", "productionCopies", "copiesPolicies", "linksPolicies", "vmReplicationSetsPolicies"})
/*     */ public class FullConsistencyGroupPolicy
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupUID groupUID;
/*     */   protected ConsistencyGroupPolicy groupPolicy;
/*     */   @XmlElement(required=true)
/*     */   protected String groupName;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyUID> productionCopies;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<FullConsistencyGroupCopyPolicy> copiesPolicies;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<FullConsistencyGroupLinkPolicy> linksPolicies;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<FullVmReplicationSetPolicy> vmReplicationSetsPolicies;
/*     */   
/*     */   public FullConsistencyGroupPolicy() {}
/*     */   
/*     */   public FullConsistencyGroupPolicy(ConsistencyGroupUID groupUID, ConsistencyGroupPolicy groupPolicy, String groupName, List<ConsistencyGroupCopyUID> productionCopies, List<FullConsistencyGroupCopyPolicy> copiesPolicies, List<FullConsistencyGroupLinkPolicy> linksPolicies, List<FullVmReplicationSetPolicy> vmReplicationSetsPolicies)
/*     */   {
/*  71 */     this.groupUID = groupUID;
/*  72 */     this.groupPolicy = groupPolicy;
/*  73 */     this.groupName = groupName;
/*  74 */     this.productionCopies = productionCopies;
/*  75 */     this.copiesPolicies = copiesPolicies;
/*  76 */     this.linksPolicies = linksPolicies;
/*  77 */     this.vmReplicationSetsPolicies = vmReplicationSetsPolicies;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupUID getGroupUID()
/*     */   {
/*  89 */     return this.groupUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupUID(ConsistencyGroupUID value)
/*     */   {
/* 101 */     this.groupUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupPolicy getGroupPolicy()
/*     */   {
/* 113 */     return this.groupPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupPolicy(ConsistencyGroupPolicy value)
/*     */   {
/* 125 */     this.groupPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getGroupName()
/*     */   {
/* 137 */     return this.groupName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupName(String value)
/*     */   {
/* 149 */     this.groupName = value;
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
/*     */   public List<ConsistencyGroupCopyUID> getProductionCopies()
/*     */   {
/* 175 */     if (this.productionCopies == null) {
/* 176 */       this.productionCopies = new ArrayList();
/*     */     }
/* 178 */     return this.productionCopies;
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
/*     */   public List<FullConsistencyGroupCopyPolicy> getCopiesPolicies()
/*     */   {
/* 204 */     if (this.copiesPolicies == null) {
/* 205 */       this.copiesPolicies = new ArrayList();
/*     */     }
/* 207 */     return this.copiesPolicies;
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
/*     */   public List<FullConsistencyGroupLinkPolicy> getLinksPolicies()
/*     */   {
/* 233 */     if (this.linksPolicies == null) {
/* 234 */       this.linksPolicies = new ArrayList();
/*     */     }
/* 236 */     return this.linksPolicies;
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
/*     */   public List<FullVmReplicationSetPolicy> getVmReplicationSetsPolicies()
/*     */   {
/* 262 */     if (this.vmReplicationSetsPolicies == null) {
/* 263 */       this.vmReplicationSetsPolicies = new ArrayList();
/*     */     }
/* 265 */     return this.vmReplicationSetsPolicies;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 275 */     if (!(obj instanceof FullConsistencyGroupPolicy)) {
/* 276 */       return false;
/*     */     }
/* 278 */     FullConsistencyGroupPolicy otherObj = (FullConsistencyGroupPolicy)obj;
/*     */     
/* 280 */     return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.groupPolicy != null ? this.groupPolicy.equals(otherObj.groupPolicy) : this.groupPolicy == otherObj.groupPolicy) && (this.groupName != null ? this.groupName.equals(otherObj.groupName) : this.groupName == otherObj.groupName) && (this.productionCopies != null ? this.productionCopies.equals(otherObj.productionCopies) : this.productionCopies == otherObj.productionCopies) && (this.copiesPolicies != null ? this.copiesPolicies.equals(otherObj.copiesPolicies) : this.copiesPolicies == otherObj.copiesPolicies) && (this.linksPolicies != null ? this.linksPolicies.equals(otherObj.linksPolicies) : this.linksPolicies == otherObj.linksPolicies) && (this.vmReplicationSetsPolicies != null ? this.vmReplicationSetsPolicies.equals(otherObj.vmReplicationSetsPolicies) : this.vmReplicationSetsPolicies == otherObj.vmReplicationSetsPolicies);
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
/*     */   public int hashCode()
/*     */   {
/* 295 */     return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.groupPolicy != null ? this.groupPolicy.hashCode() : 0) ^ (this.groupName != null ? this.groupName.hashCode() : 0) ^ (this.productionCopies != null ? this.productionCopies.hashCode() : 0) ^ (this.copiesPolicies != null ? this.copiesPolicies.hashCode() : 0) ^ (this.linksPolicies != null ? this.linksPolicies.hashCode() : 0) ^ (this.vmReplicationSetsPolicies != null ? this.vmReplicationSetsPolicies.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 310 */     return "FullConsistencyGroupPolicy [groupUID=" + this.groupUID + ", " + "groupPolicy=" + this.groupPolicy + ", " + "groupName=" + this.groupName + ", " + "productionCopies=" + this.productionCopies + ", " + "copiesPolicies=" + this.copiesPolicies + ", " + "linksPolicies=" + this.linksPolicies + ", " + "vmReplicationSetsPolicies=" + this.vmReplicationSetsPolicies + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FullConsistencyGroupPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */